package com.taidii.staffdevelopment.hq.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.IAccountsPrincipalDao;
import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.IAuthUserDao;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.ICourseDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentTeacherCourseDao;
import com.taidii.staffdevelopment.hq.dto.CourseAddDto;
import com.taidii.staffdevelopment.hq.entity.AuthUser;
import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentTeachercourse;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.IGetCourseService;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class GetCourseServiceImpl implements IGetCourseService{
	@Autowired
	ICenterDao centerDao;
	@Autowired
	ICourseDao courseDao;
	@Autowired
	IAccountsPrincipalDao accountsPrincipalDao;
	@Autowired
	IEnrichmentTeacherCourseDao enrichmentTeacherCourseDao;
	@Autowired
	IAccountsTeacherDao accountsTeacherDao;
	@Autowired
	IAuthUserDao userDao;
	@Override
	public List<OptionDTO> getAllCourse(Integer centerId,Integer userId) throws Exception {
		List<OptionDTO> odList=new ArrayList<OptionDTO>();
		List<HqHqaccount> hqAccountList=centerDao.selectCentersByUserId(userId);
		List<EnrichmentCourse> ecList=new ArrayList<EnrichmentCourse>();
		List<EnrichmentCourseHq> eqList=new ArrayList<EnrichmentCourseHq>();
		Integer hqId=-1;
		if(ListUtils.isNotEmpty(hqAccountList)){
			hqId=hqAccountList.get(0).getHqId();
		}
		//HQ创建的课程
		if(-1==centerId){
			if(-1!=hqId){
				//就是查询HQ创建的课程
				//ecList=enrichmentCourseDao.selectCourseByHqId(hqId);
				eqList=courseDao.selectCourseByHqId(hqId);
				// 根据id去重
				eqList=this.isDistinct(eqList);
			}
		}else{
			//查询centers和HQ创建这个center课程创建的课程
			ecList=courseDao.selectCourseByCenterId(centerId);
			//查询HQ给整个center创建的课程
			//eqList=courseDao.selectCourseByHqIdAndCenterId(hqId,centerId);
			
		}
		if(ListUtils.isNotEmpty(eqList)){
			for(EnrichmentCourseHq eh:eqList){
				OptionDTO o=this.setOptionDTO(eh);
				odList.add(o);
			}
		}
		if(ListUtils.isNotEmpty(ecList)){
			for(EnrichmentCourse e:ecList){
				OptionDTO o=this.setOptionDTO(e);
				odList.add(o);
			}
		}
		return odList;
	}
	/**
	 * 
	 * @description:
	 * @param eh
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午4:43:53
	 */
	private OptionDTO setOptionDTO(EnrichmentCourseHq eh) {
		OptionDTO o=new OptionDTO();
		o.setId(eh.getCourseId());
		EnrichmentCourse rcCourse=courseDao.selectCourseByPrimaryId(eh.getCourseId());
		o.setName(rcCourse.getName());
		return o;
	}
	/**
	 * 
	 * @description:除重复
	 * @param eqList
	 * @author:王涛
	 * @createTime:2018年6月20日 下午4:35:37
	 */
	private List<EnrichmentCourseHq> isDistinct(List<EnrichmentCourseHq> eqList) {
		for  ( int  i  =   0 ; i  <  eqList.size()  -   1 ; i ++ )  {       
		      for  ( int  j  =  eqList.size()  -   1 ; j  >  i; j -- )  {       
		           if  (eqList.get(j).getCourseId().equals(eqList.get(i).getCourseId()))  {       
		        	   eqList.remove(j);       
		            }        
		        }        
		      }        
		    return eqList;
	}
	/**
	 * 
	 * @description:给OptionDTO 赋值
	 * @param e
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 上午11:37:05
	 */
	private OptionDTO setOptionDTO(EnrichmentCourse e) {
		OptionDTO o=new OptionDTO();
		o.setId(e.getId());
		o.setName(e.getName());
		return o;
	}
	
	/**
	 * 
	 * @description:根据课程ID 查询出该课程的信息
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午1:53:05
	 */
	@Override
	public CourseAddDto getCourseInfo(Integer courseId,Integer type,Integer userId) {
		List<OptionDTO> levels=new ArrayList<OptionDTO>();
		CourseAddDto courseAddDto=new CourseAddDto();
		if(type!=-1){
			//通过userID查询centerId
			//Integer centerId=accountsPrincipalDao.getCenterIdByUserId(userId);
			//是center作用域进行回显
			courseAddDto=this.setCourseAddDto(courseId,courseAddDto);
		}else{
			//all作用域下进行回显
			courseAddDto=this.setCourseAddDtoAll(courseId,courseAddDto);
		}
		List<EnrichmentCourselevel> ecl=courseDao.selectCourseLevelByCourseId(courseId);
		if(ListUtils.isNotEmpty(ecl)){
			for(EnrichmentCourselevel level:ecl){
				OptionDTO o=new OptionDTO();
				o.setId(level.getId());
				o.setName(level.getName());
				levels.add(o);
			}
			courseAddDto.setCourseLevels(levels);
		}
		
		
		return courseAddDto;
	}
	/**
	 * 
	 * @description:all 作用域
	 * @param courseId 课程ID
	 * @param courseAddDto 赋值的对象
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午5:02:00
	 */
	private CourseAddDto setCourseAddDtoAll(Integer courseId,CourseAddDto courseAddDto) {
		List<OptionDTO> applyTo=new ArrayList<OptionDTO>();
		List<EnrichmentCourseHq> ehList=new ArrayList<EnrichmentCourseHq>();
		ehList=courseDao.selectCourseHqByCourseId(courseId);
		if(ListUtils.isNotEmpty(ehList)){
			courseAddDto.setCourseName(courseDao.selectCourseByPrimaryId(courseId).getName());
			for(EnrichmentCourseHq h:ehList){
				OptionDTO o=new OptionDTO();
				o.setId(h.getCenterId());
				o.setName(h.getCenterName());
				applyTo.add(o);
			}
			courseAddDto.setApplyTo(applyTo);
		}
		return courseAddDto;
	}
	/**
	 * 
	 * @description:center作用域下进行的回显
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月20日 下午4:57:28
	 */
	private CourseAddDto setCourseAddDto(Integer courseId,CourseAddDto courseAddDto) {
		List<OptionDTO> applyTo=new ArrayList<OptionDTO>();
		List<OptionDTO> teacher=new ArrayList<OptionDTO>();
		
		OptionDTO o=new OptionDTO();
		EnrichmentCourse ec=courseDao.selectCourseByExample(courseId).get(0);
		CentersCenter ccCenter=centerDao.selectCentersByPrimaryId(ec.getCenterId());
		if(null!=ec && null!=ccCenter){
			courseAddDto.setCourseName(ec.getName());
			o.setId(ec.getCenterId());
			o.setName(ccCenter.getName());
			applyTo.add(o);
			courseAddDto.setApplyTo(applyTo);
			courseAddDto.setCapcity(ec.getMakeupNum());
			courseAddDto.setApply(true==ec.getApplyToAllCourse()?1:0);
			List<EnrichmentTeachercourse> teacherCourses=new ArrayList<EnrichmentTeachercourse>();
			teacherCourses=enrichmentTeacherCourseDao.selectTeachersByCourseId(courseId);
			if(ListUtils.isNotEmpty(teacherCourses)){
				for(EnrichmentTeachercourse e:teacherCourses){
					OptionDTO t=new OptionDTO();
					t.setId(e.getTeacherId());
					Integer userId=accountsTeacherDao.selectAccountTeacherByPrimaryId(e.getTeacherId()).getUserId();
					AuthUser authUser=userDao.selectAuthUserByPrimaryKey(0!=userId?userId:0);
					String teacherName="";
					if(null!=authUser){
						teacherName=authUser.getFirstName()+" "+authUser.getLastName();
					}
					t.setName(teacherName);
					teacher.add(t);
				}
			}
			courseAddDto.setTeacher(teacher);
			return courseAddDto;
		}else{
			return null;
		}
	}
}
