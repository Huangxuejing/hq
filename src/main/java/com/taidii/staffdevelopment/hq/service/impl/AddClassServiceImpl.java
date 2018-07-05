package com.taidii.staffdevelopment.hq.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.IAuthUserDao;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.ICourseDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentClassDao;
import com.taidii.staffdevelopment.hq.dto.ClassAddDTO;
import com.taidii.staffdevelopment.hq.dto.EnrichmentKlassscheduletimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AuthUser;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.entity.HqHqaccount;
import com.taidii.staffdevelopment.hq.service.IAddClassService;
import com.taidii.staffdevelopment.util.DateUtils;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class AddClassServiceImpl implements IAddClassService{
	private Logger logger = LoggerFactory.getLogger(AddClassServiceImpl.class);
	@Autowired
	ICenterDao centerDao;
	@Autowired
	ICourseDao courseDao;
	@Autowired
	IEnrichmentClassDao enrichmentClassDao;
	@Autowired
	IAccountsTeacherDao teacherDao;
	@Autowired
	IAuthUserDao authUserDao;
	
	@Override
	public void saveClass(ClassAddDTO cad, Integer userId, Integer type,Integer courseId,Integer centerId) throws Exception {
		List<EnrichmentKlassscheduletime> ektList=new ArrayList<EnrichmentKlassscheduletime>();
		List<HqHqaccount> hqAccountList=centerDao.selectCentersByUserId(userId);
		Integer hqId=-1;
		if(ListUtils.isNotEmpty(hqAccountList)){
			hqId=hqAccountList.get(0).getHqId();
		}
		if(type==-1){
			//HQ 给整个课程创建班级，查看整个课程设涉及到哪些center
			List<EnrichmentCourseHq> courseHqList=courseDao.selectCourseHqByCourseId(courseId);
			if(ListUtils.isNotEmpty(courseHqList)){
				EnrichmentKlassschedule ekd=new EnrichmentKlassschedule();
				//入EnrichmentKlassschedule表
				ekd=this.setEnrichmentKlassschedule(hqId,cad,userId,courseId,courseHqList.get(0).getCenterId(),type);
				Integer num=enrichmentClassDao.insertEnrichmentClass(ekd);
				if(null==num || 0==num){
					throw new Exception("Add class failure [EnrichmentKlassschedule]");
				}
				
				//入EnrichmentKlassscheduleTime表
				ektList=this.setEnrichmentKlassscheduletime(ekd.getId(),cad);
				Integer count=enrichmentClassDao.insertEnrichmentClassTime(ektList);
				if(null==count || 0==count){
					//throw new Exception("添加班级失败[EnrichmentKlassscheduletime]");
					logger.info("Add class failure [EnrichmentKlassscheduletime],No ClassTime");
				}
				/**
				* 入EnrichmentKlassscheduleHq表
				*/
				List<Integer> centersID=new ArrayList<Integer>();
				for(EnrichmentCourseHq ch:courseHqList){
					centersID.add(ch.getCenterId());
				}
				EnrichmentKlassscheduleHq eq=this.setEnrichmentKlassscheduleHq(ekd.getId(),hqId);
				Integer numClassHq=enrichmentClassDao.insertEnrichmentClassHq(centersID,eq);
				if(null==numClassHq || 0==numClassHq){
					throw new Exception("Add class failure [EnrichmentKlassscheduleHq]");
				}
			}
			
		}else{
			//给center添加班级,查询出center
			//Integer centerId=accountsPrincipalDao.getCenterIdByUserId(userId);
			if(0!= centerId || -1!=centerId){
				EnrichmentKlassschedule ekd=new EnrichmentKlassschedule();
				ekd=this.setEnrichmentKlassschedule(hqId,cad,userId,courseId,centerId,type);
				Integer num=enrichmentClassDao.insertEnrichmentClass(ekd);
				if(null==num || 0==num){
					throw new Exception("Add class failure [EnrichmentKlassschedule]");
				}
				ektList=this.setEnrichmentKlassscheduletime(ekd.getId(),cad);
				Integer count=enrichmentClassDao.insertEnrichmentClassTime(ektList);
				if(null==count || 0==count){
					//throw new Exception("添加班级失败[EnrichmentKlassscheduletime]");
					logger.info("Add class failure [EnrichmentKlassscheduletime],No ClassTime");
				}
			}
		}
	}
	
	/**
	 * 
	 * @description:编辑保存服务
	 * @param cad
	 * @param userId
	 * @param classId
	 * @throws ParseException
	 * @author:王涛
	 * @createTime:2018年6月22日 下午3:14:46
	 */
	@Override
	public void editSaveClass(ClassAddDTO cad, Integer userId,Integer classId) throws ParseException {
		EnrichmentKlassschedule ekd=this.setEnrichmentKlassschedule(cad,userId,classId);
		if(null!=ekd){
			Integer countClass=enrichmentClassDao.updateClassByPrimaryId(ekd);
			if(null==countClass || 0==countClass){
				logger.error("编辑保存中，更新班级失败");
			}
		}
		
		List<EnrichmentKlassscheduletime> ektList=new ArrayList<EnrichmentKlassscheduletime>();
		//删除klass_time表中的数据
		enrichmentClassDao.delEnrichmentClassTimeByClassId(classId);
		ektList=this.setEnrichmentKlassscheduletime(classId,cad);
		if(ListUtils.isNotEmpty(ektList)){
			//入库class_time
			Integer count=enrichmentClassDao.insertEnrichmentClassTime(ektList);
			if(0==count){
				logger.info("班级编辑保存时,课程排课时间入库失败");
			}
		}
	}
	
	
	/**
	 * 
	 * @description:EnrichmentKlassscheduleHq 入库
	 * @param id
	 * @param centersID
	 * @param hqId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:03:50
	 */
	private EnrichmentKlassscheduleHq setEnrichmentKlassscheduleHq(Integer classId,Integer hqId) {
		EnrichmentKlassscheduleHq eq=new EnrichmentKlassscheduleHq();
		eq.setId(null);
		eq.setCreateTime(new Date());
		eq.setUpdateTime(eq.getCreateTime());
		eq.setHqId(hqId);
		eq.setKlassscheduleId(classId);
		return eq;
	}

	/**
	 * 
	 * @description:添加klassScheduleTime表
	 * @param id
	 * @param cad
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月21日 下午6:25:44
	 */
	private List<EnrichmentKlassscheduletime> setEnrichmentKlassscheduletime(Integer id, ClassAddDTO cad) throws ParseException {
		List<EnrichmentKlassscheduletime> ektList=new ArrayList<EnrichmentKlassscheduletime>();
		List<TimeDto> classStart=cad.getClassStart();
		if(CollectionUtils.isNotEmpty(classStart)){
			for(TimeDto t:classStart){
				EnrichmentKlassscheduletime ekt=new EnrichmentKlassscheduletime();
				ekt.setId(null);
				ekt.setKlassscheduleId(id);
				ekt.setRepeat(t.getReapeat());
				ekt.setStartTime(DateUtils.stringToDate(t.getStarTime(), DateUtils.HHMM));
				ekt.setEndTime(DateUtils.stringToDate(t.getEndTime(),DateUtils.HHMM));
				ektList.add(ekt);
			}
		}
		return ektList;
	}

	/**
	 * 
	 * @description:EnrichmentKlassschedule 赋值
	 * @param hqId
	 * @param cad
	 * @param userId
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @param ch 
	 * @createTime:2018年6月21日 下午6:02:17
	 */
	private EnrichmentKlassschedule setEnrichmentKlassschedule(Integer hqId,ClassAddDTO cad, 
			Integer userId, Integer courseId,Integer centerId,Integer type) {
		EnrichmentKlassschedule ekd=new EnrichmentKlassschedule();
		ekd.setId(null);
		ekd.setCenterId(centerId);
		ekd.setKlassname(cad.getClassName());
		ekd.setCourseId(courseId);
		ekd.setLevelId(cad.getCourseLevel().getId());
		ekd.setType(cad.getPayType());
		ekd.setUnitPrice(cad.getTuitionStandard());
		ekd.setNumberOfClass(0);
		if(type!=-1){
			ekd.setHqId(0);
			if(null!=cad.getTeacher()){
				ekd.setTeacherId(cad.getTeacher().getId());
			}
			if(null!=cad.getAsistantTeacher()){
				ekd.setAssistantId(cad.getAsistantTeacher().getId());
			}
			if(null!=cad.getRoom()){
				ekd.setRoomId(cad.getRoom().getId());
			}
			ekd.setRemarks("center创建班级");
		}else{
			ekd.setHqId(1);
			ekd.setRemarks("HQ创建班级");
		}
		ekd.setCapacity(null==cad.getCapaCity()?0:cad.getCapaCity());
		ekd.setDateFrom(cad.getDateFrom());
		ekd.setDateTo(cad.getDateTo());
		ekd.setDatePending(cad.getDatePending());
		ekd.setCreatedDate(new Date());
		ekd.setCreatedById(userId);
		ekd.setLastUpdate(ekd.getCreatedDate());
		ekd.setLastUpdateById(userId);
		return ekd;
	}
	
	/**
	 * 
	 * @description:编辑回显接口
	 * @param classId
	 * @param type
	 * @return
	 * @author:王涛
	 * @throws Exception 
	 * @createTime:2018年6月22日 上午10:28:37
	 */
	@Override
	public ClassAddDTO editClass(Integer classId, Integer type) throws Exception {
		ClassAddDTO cad=new ClassAddDTO();
		OptionDTO course=new OptionDTO();
		OptionDTO courseLevel=new OptionDTO();
		OptionDTO room=new OptionDTO();
		OptionDTO teacher=new OptionDTO();
		List<TimeDto> classStart=new ArrayList<TimeDto>();
		OptionDTO asistantTeacher=new OptionDTO();
		
		EnrichmentKlassschedule ekd=enrichmentClassDao.selectEnrichmentKlassscheduleByPrimaryId(classId);
		if(null==ekd){
			throw new Exception("class ["+classId+"],not find");
		}
		EnrichmentCourse enrichmentCourse=courseDao.selectCourseByPrimaryId(ekd.getCourseId());
		if(null==enrichmentCourse){
			throw new Exception("not find the course");
		}
		course=this.setOptionDto(ekd.getCourseId(),enrichmentCourse.getName());
		EnrichmentCourselevel level=courseDao.selectCourseLevelByPrimaryId(ekd.getLevelId());
		if(null!=level){
			courseLevel=this.setOptionDto(level.getId(), level.getName());
		}
		List<EnrichmentKlassscheduletimeDto> ekt=enrichmentClassDao.selectEnrichmentKlassscheduleTimeByClassId(classId);
		if(ListUtils.isNotEmpty(ekt)){
			//获取时间
			classStart=this.setTimeDto(ekt);
		}
		if(null!=ekd.getRoomId()){
			EnrichmentRoom er=enrichmentClassDao.selectEnrichmentRoomByPrimaryId(ekd.getRoomId());
			if(null!=er){
				room=this.setOptionDto(er.getId(), er.getName());
			}
		}
		if(null!=ekd.getTeacherId()){
			AccountsTeacher aTeacher=teacherDao.selectAccountTeacherByPrimaryId(ekd.getTeacherId());
			AccountsTeacher asistant=teacherDao.selectAccountTeacherByPrimaryId(ekd.getAssistantId());
			AuthUser au=new AuthUser();
			AuthUser au1=new AuthUser();
			if(null !=aTeacher){
				au=authUserDao.selectAuthUserByPrimaryKey(aTeacher.getUserId());
			}
			if(null!=asistant){
				au1=authUserDao.selectAuthUserByPrimaryKey(asistant.getUserId());
			}
			if(null!=au){
				teacher=this.setOptionDto(ekd.getTeacherId(), au.getFirstName());
			}
			if(null!=au1){
				asistantTeacher=this.setOptionDto(ekd.getAssistantId(),au1.getFirstName());
			}
		}
		cad=this.setClassAddDTO(ekd,course,courseLevel,room,teacher,classStart,asistantTeacher);
		return cad;
	}
	
	/**
	 * 
	 * @description: 给ClassAddDTO 赋值
	 * @param ekd
	 * @param course
	 * @param courseLevel
	 * @param room
	 * @param teacher
	 * @param classStart
	 * @param asistantTeacher
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:40:34
	 */
	private ClassAddDTO setClassAddDTO(EnrichmentKlassschedule ekd,OptionDTO course, OptionDTO courseLevel, OptionDTO room,
			OptionDTO teacher, List<TimeDto> classStart,
			OptionDTO asistantTeacher) {
		ClassAddDTO cad=new ClassAddDTO();
		cad.setCourse(course);
		cad.setCourseLevel(courseLevel);
		cad.setClassName(ekd.getKlassname());
		cad.setPayType(ekd.getType());
		cad.setTuitionStandard(ekd.getUnitPrice());
		cad.setDateFrom(ekd.getDateFrom());
		cad.setDateTo(ekd.getDateTo());
		cad.setDatePending(ekd.getDatePending());
		cad.setClassStart(classStart);
		cad.setTotalLesson(ekd.getNumberOfClass());
		cad.setRoom(room);
		cad.setCapaCity(ekd.getCapacity());
		cad.setTeacher(teacher);
		cad.setAsistantTeacher(asistantTeacher);
		return cad;
	}

	/**
	 * 
	 * @description:时间排课程信息
	 * @param ekt
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:59:19
	 */
	private List<TimeDto> setTimeDto(List<EnrichmentKlassscheduletimeDto> ekt) {
		List<TimeDto> timeList=new ArrayList<TimeDto>();
		for(EnrichmentKlassscheduletimeDto time:ekt){
			TimeDto t=new TimeDto();
			t.setReapeat(time.getReapeat());
			t.setStarTime(DateUtils.dateToString(time.getStartTime(), DateUtils.HHMM));
			t.setEndTime(DateUtils.dateToString(time.getEndTime(),DateUtils.HHMM));
			timeList.add(t);
		}
		return timeList;
	}

	/**
	 * 
	 * @description:Option赋值
	 * @param courseId
	 * @param name
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:42:50
	 */
	private OptionDTO setOptionDto(Integer id, String name) {
		OptionDTO o=new OptionDTO();
		o.setId(id);
		o.setName(name);
		return o;
	}
	
	/**
	 * 
	 * @description:根据班级ID 删除这个班级的信息
	 * @param classId
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:55:48
	 */
	@Override
	public void deleteClass(Integer classId,boolean isEditSave) {
		//是编辑保存接口，则删除time表和class表
		if(!isEditSave){
			//enrichment_klassschedule_hq 删除
			Integer countClassHq=enrichmentClassDao.delEnrichmentClassHqByClassId(classId);
			if(0==countClassHq){
				logger.info("班级删除中,删除HQ创建班级成功");
			}
		}
		//enrichment_klassscheduletime 删除
		Integer numTime=enrichmentClassDao.delEnrichmentClassTimeByClassId(classId);
		if(0==numTime){
			logger.info("班级删除中,删除排课时间成功");
		}
		//删除 enrichment_klassschedule
		Integer countClass=enrichmentClassDao.delEnrichmentKlassscheduleByPrimaryId(classId);
		if(0==countClass){
			logger.info("班级删除中,删除班级成功");
		}
	}

	/**
	 * 
	 * @description:编辑保存中EnrichmentKlassschedule  赋值
	 * @param cad
	 * @param userId
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午2:34:45
	 */
	private EnrichmentKlassschedule setEnrichmentKlassschedule(ClassAddDTO cad,Integer userId, Integer classId) {
		EnrichmentKlassschedule klass=new EnrichmentKlassschedule();
		klass.setId(classId);
		klass.setCourseId(cad.getCourse().getId());
		klass.setKlassname(cad.getClassName());
		klass.setLevelId(cad.getCourseLevel().getId());
		klass.setUnitPrice(cad.getTuitionStandard());
		klass.setDateFrom(cad.getDateFrom());
		klass.setDatePending(cad.getDatePending());
		klass.setCapacity(cad.getCapaCity());
		klass.setCreatedById(userId);
		klass.setLastUpdate(klass.getCreatedDate());
		klass.setLastUpdateById(userId);
		if(null!=cad.getRoom()){
			klass.setRoomId(cad.getRoom().getId());
		}
		if(null!=cad.getTeacher()){
			klass.setTeacherId(cad.getTeacher().getId());
		}
		if(null!=cad.getAsistantTeacher()){
			klass.setAssistantId(cad.getAsistantTeacher().getId());
		}
		return klass;
	}

	@Override
	public List<OptionDTO> selectHQCreatClassCenter(Integer classId,Integer userId) {
		List<HqHqaccount> hqAccountList=centerDao.selectCentersByUserId(userId);
		List<OptionDTO> centerIds=new ArrayList<OptionDTO>();
		Integer hqId=-1;
		if(ListUtils.isNotEmpty(hqAccountList)){
			hqId=hqAccountList.get(0).getHqId();
		}
		if(hqId!=-1){
			centerIds=enrichmentClassDao.selectCentersByHqAndClass(classId,hqId);
		}
		return centerIds;
	}
}
