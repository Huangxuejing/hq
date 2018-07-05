package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.ICourseDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentTeacherCourseDao;
import com.taidii.staffdevelopment.hq.dao.IProductBundleDao;
import com.taidii.staffdevelopment.hq.dto.CourseAddDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentProductbundlecourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourse;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.IAddCourseService;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class AddCourseServiceImpl implements IAddCourseService{
	private Logger logger = LoggerFactory.getLogger(AddCourseServiceImpl.class);
	
	@Autowired
	ICenterDao centerDao;
	@Autowired
	ICourseDao courseDao;
	@Autowired
	IEnrichmentTeacherCourseDao enrichmentTeachercourseDao;
	@Autowired
	IProductBundleDao pbDao;
	@Override
	public String addCourse(CourseAddDto cad, Integer userId,Integer type,Integer centerId) throws Exception {
		List<HqHqaccount> hqAccountList=centerDao.selectCentersByUserId(userId);
		Integer hqId=-1;
		if(ListUtils.isNotEmpty(hqAccountList)){
			hqId=hqAccountList.get(0).getHqId();
		}
		EnrichmentCourse ec=new EnrichmentCourse();
		//入course表 写dao
		ec=this.setEnrichmentCourse(hqId,cad,type,centerId);
		Integer num=courseDao.insertEcrichmentCourse(ec);
		if(null==num || 0==num){
			throw new Exception("School entry course, failure");
		}
		
		//入level表 写dao
		List<EnrichmentCourselevel> eclCourselevels=this.setEnrichmentCourselevel(ec.getId(),cad.getCourseLevels());
		courseDao.insertEcrichmentCourseLevel(eclCourselevels);
		
//		if(null==numLevel || 0==numLevel){
//			throw new Exception("学校录入课程级别["+cad.getCourseLevels()+"]失败");
//		}
		
		//如果是hq作用域创建的课程，则入enrichment_course_hq
		if(type==-1){
			List<OptionDTO> applyTo=cad.getApplyTo();
			if( hqId!=-1 && null!=ec){
				//enrichmentcoursehq 入库操作
				for(OptionDTO od:applyTo){
					EnrichmentCourseHq ech=this.setEnrichmentCourseHq(hqId, od,ec.getId());
					int numHqCourse=courseDao.insertEcrichmentCourseHq(ech);
					if(0==numHqCourse){
						throw new Exception("HQ entry course,failure");
					}
				}
			}
		}else{
			//center创建的课程  需要入 enrichment_teacher_course表
			List<EnrichmentTeachercourse> teacherCourseList=this.setTeacherCourse(ec.getId(),cad);
		//	Integer numTeacherCourse=0;
			if(ListUtils.isNotEmpty(teacherCourseList)){
				enrichmentTeachercourseDao.insertEnrichmentTeachercourse(teacherCourseList);
			}
//			if(0==numTeacherCourse){
//				throw new Exception("学校录入课程老师失败");
//			}
		}
		return "success";
	}
	/**
	 * 
	 * @description:EnrichmentTeachercourse 赋值
	 * @param id
	 * @param cad
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月26日 上午9:42:36
	 */
	private List<EnrichmentTeachercourse> setTeacherCourse(Integer id,CourseAddDto cad) {
		List<EnrichmentTeachercourse> teacherCourseList=new ArrayList<EnrichmentTeachercourse>();
		if(ListUtils.isNotEmpty(cad.getTeacher())){
			for(OptionDTO o:cad.getTeacher()){
				EnrichmentTeachercourse teacher=new EnrichmentTeachercourse();
				teacher.setId(null);
				teacher.setCourseId(id);
				teacher.setTeacherId(o.getId());
				teacherCourseList.add(teacher);
			}
		}
		return teacherCourseList;
	}
	/**
	 * 
	 * @description:
	 * @param hqId
	 * @param od
	 * @param id
	 * @return
	 * @author:王涛
	 * @param cad 
	 * @createTime:2018年6月20日 下午3:07:15
	 */
	private EnrichmentCourseHq setEnrichmentCourseHq(Integer hqId,OptionDTO od, Integer id) {
		EnrichmentCourseHq ech=new EnrichmentCourseHq();
		ech.setId(null);
		ech.setCourseId(id);
		ech.setCreateTime(new Date());
		ech.setUpdateTime(ech.getCreateTime());
		ech.setCenterId(od.getId());
		ech.setCenterName(od.getName());
		ech.setHqId(hqId);
		return ech;
	}

	/**
	 * 
	 * @description:给EnrichmentCourselevel 赋值
	 * @param id 课程ID 
	 * @param courseLevels 课程级别
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午9:25:27
	 */
	private List<EnrichmentCourselevel> setEnrichmentCourselevel(Integer id,List<OptionDTO> courseLevels) {
		List<EnrichmentCourselevel> levels=new ArrayList<EnrichmentCourselevel>();
		for(OptionDTO level:courseLevels){
			EnrichmentCourselevel ecl=new EnrichmentCourselevel();
			ecl.setId(null);
			ecl.setName(level.getName());
			ecl.setCourseId(id);
			levels.add(ecl);
		}
		return levels;
	}
	/**
	 * 
	 * @description:赋值EnrichmentCourse对象
	 * @param od OptionDTO id=centerId  name=center name
	 * @param hqId CourseAddDto
	 * @param cad
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午9:23:01
	 */
	private EnrichmentCourse setEnrichmentCourse(Integer hqId,CourseAddDto cad,Integer type,Integer centerId) {
		EnrichmentCourse ec=new EnrichmentCourse();
		if(type==-1){
			ec.setId(null);
			ec.setCenterId(cad.getApplyTo().get(0).getId());
			ec.setName(cad.getCourseName());
			ec.setApplyToAllCourse(false);
			ec.setType(1);
		}else{
			ec.setId(null);
			ec.setCenterId(centerId);
			ec.setName(cad.getCourseName());
			if(cad.getApply().intValue()==0){
				ec.setApplyToAllCourse(false);
			}
			if(cad.getApply().intValue()==1){
				ec.setApplyToAllCourse(true);
			}
			ec.setMakeupNum(cad.getCapcity());
			ec.setType(0);
		}
		return ec;
	}
	
	@Override
	public void deleteCourseByCourseId(Integer courseId) throws Exception {
		List<EnrichmentProductbundlecourse> pList=new ArrayList<EnrichmentProductbundlecourse>();
		pList=pbDao.selectProductBundleCourse(courseId);
		if(CollectionUtils.isNotEmpty(pList)){
			throw new Exception("course was used,not edited");
		}
		//删除courseLevel
		Integer numCourseLevel=courseDao.delLevelByCourseId(courseId);
		if(null==numCourseLevel || 0==numCourseLevel){
			logger.info("表中没有该课程["+courseId+"]等级");
		}
		//删除teacherCourse
		Integer numTeacherCourse=enrichmentTeachercourseDao.deleteTeacherCourseByCourseId(courseId);
		if(null==numTeacherCourse || 0==numTeacherCourse){
			logger.info("表中没有设置老师教导该课程["+courseId+"]");
		}
		//删除course
		Integer numCourse=courseDao.delByCourseId(courseId);
		if(null==numCourse || 0==numCourse){
			logger.info("表中没有该课程["+courseId+"]");
		}
		//删除course_hq表数据
		Integer numCourseHq=courseDao.delCourseHqByCourseId(courseId);
		if(null==numCourseHq || 0==numCourseHq){
			logger.info("course_hq表中没有该课程["+courseId+"]");
		}
	}
}
