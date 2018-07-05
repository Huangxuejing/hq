package com.taidii.staffdevelopment.hq.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.constant.RepeatConstant;
import com.taidii.staffdevelopment.hq.dao.IAccountsTeacherDao;
import com.taidii.staffdevelopment.hq.dao.IAuthUserDao;
import com.taidii.staffdevelopment.hq.dao.ICenterDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentClassDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentEnrichmentSettingDao;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentTeacherCourseDao;
import com.taidii.staffdevelopment.hq.dto.CenterTimeDto;
import com.taidii.staffdevelopment.hq.dto.EnrichmentKlassscheduletimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto;
import com.taidii.staffdevelopment.hq.dto.TimeDto2;
import com.taidii.staffdevelopment.hq.entity.AccountsTeacher;
import com.taidii.staffdevelopment.hq.entity.AuthUser;
import com.taidii.staffdevelopment.hq.entity.CentersCenter;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsetting;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.hq.service.ICenterService;
import com.taidii.staffdevelopment.hq.service.ICenterTimeService;
import com.taidii.staffdevelopment.util.DateUtils;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class CenterTimeServiceImpl implements ICenterTimeService{
	@Autowired
	private ICenterService centerService;
	@Autowired
	private ICenterDao centerDao;
	@Autowired
	private IEnrichmentEnrichmentSettingDao enrichmentEnrichmentSettingDao;
	@Autowired
	private IEnrichmentClassDao enrichmentClassDao;
	@Autowired
	private IEnrichmentTeacherCourseDao enrichmentTeacherCourseDao;
	@Autowired
	private IAuthUserDao userDao;
	@Autowired
	private IAccountsTeacherDao teacherDao;
	
	@Override
	public List<CenterTimeDto> getTimeOnAddCourse(Integer centerId,Integer userId) throws Exception {
		List<CenterTimeDto> ctd=new ArrayList<CenterTimeDto>();
		List<OptionDTO> centerList=new ArrayList<OptionDTO>();
		if(null==centerId || -1==centerId){
			/**
			 * HQ下所有的centers集合
			 */
			centerList=centerService.getCenters(userId);
		}else{
			/**
			 * 这个center视角
			 */
			OptionDTO od=new OptionDTO();
			CentersCenter center=centerDao.selectCentersByPrimaryId(centerId);
			if(center!=null){
				od.setId(centerId);
				od.setName(center.getName());
				centerList.add(od);
			}
		}
		//centerList存储的是所有的center信息，无论是HQ视野还是center视野
		if(ListUtils.isNotEmpty(centerList)){
			ctd=this.setCenterTimeDtoList(centerList);
		}
		return ctd;
	}
	
	/**
	 * 
	 * @description:获取所有的center的时间信息
	 * @param centerList
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 上午11:57:47
	 */
	private List<CenterTimeDto> setCenterTimeDtoList(List<OptionDTO> centerList) {
		List<CenterTimeDto> ctd=new ArrayList<CenterTimeDto>();
		List<TimeDto> time=new ArrayList<TimeDto>();
		List<EnrichmentEnrichmentsetting> setting=new ArrayList<EnrichmentEnrichmentsetting>();
		
		for(OptionDTO o:centerList){
			CenterTimeDto cTimeDto=new CenterTimeDto();
			cTimeDto.setId(o.getId());
			cTimeDto.setName(o.getName());
			setting=enrichmentEnrichmentSettingDao.selectEnrichmentEnrichmentSettingByCenterId(o.getId());
			time=this.setTimeDtoList(setting);
			cTimeDto.setTime(time);
			ctd.add(cTimeDto);
		}
		return ctd;
	}
	
	/**
	 * 
	 * @description:赋值 List<TimeDto>
	 * @param setting List<EnrichmentEnrichmentsetting>
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午2:24:20
	 */
	private List<TimeDto> setTimeDtoList(List<EnrichmentEnrichmentsetting> setting) {
		List<TimeDto> t=new ArrayList<TimeDto>();
		TimeDto td=new TimeDto();
		if(ListUtils.isNotEmpty(setting)){
			EnrichmentEnrichmentsetting es=setting.get(0);
			td.setReapeat(RepeatConstant.REPEAT_MONDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getMondayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getMondayEndTime()));
			t.add(td);
			td=new TimeDto(); 
			td.setReapeat(RepeatConstant.REPEAT_TUESDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getTuesdayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getTuesdayEndTime()));
			t.add(td);
			td=new TimeDto();
			td.setReapeat(RepeatConstant.REPEAT_WEDNESDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getWednesdayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getWednesdayEndTime()));
			t.add(td);
			td=new TimeDto();
			td.setReapeat(RepeatConstant.REPEAT_THURSDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getThursdayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getThursdayEndTime()));
			t.add(td);
			td=new TimeDto();
			td.setReapeat(RepeatConstant.REPEAT_FRIDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getFridayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getFridayEndTime()));
			t.add(td);
			td=new TimeDto();
			td.setReapeat(RepeatConstant.REPEAT_SATURDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getSaturdayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getSaturdayEndTime()));
			t.add(td);
			td=new TimeDto();
			td.setReapeat(RepeatConstant.REPEAT_SUNDAY);
			td.setStarTime(DateUtils.dateToStringHms(es.getSundayStartTime()));
			td.setEndTime(DateUtils.dateToStringHms(es.getSundayEndTime()));
			t.add(td);
		}
		return t;
	}
	
	/**
	 * 
	 * @description:检查教室是否被使用
	 * @param times
	 * @param dateFrom
	 * @param str teacher 或者 room
	 * @param dateTo
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月25日 上午9:16:48
	 */
	@Override
	public String checkOutRoom(TimeDto2 times,Integer id,Integer centerId) throws Exception {
		/**
		 * 存储的是center创建的班级，且在DateFrom~DateTo之间
		 */
		List<EnrichmentKlassschedule> klassCenter=new ArrayList<EnrichmentKlassschedule>();
		String str="";
		List<EnrichmentKlassschedule> classList=new ArrayList<EnrichmentKlassschedule>();
		classList=enrichmentClassDao.selectEnrichmentKlassscheduleByDateFromAndDateTo(DateUtils.stringToDate(times.getDateFrom(), DateUtils.YYYYMMdd),
				DateUtils.stringToDate(times.getDateTo(),DateUtils.YYYYMMdd),centerId);
		if(CollectionUtils.isNotEmpty(classList)){
			//排除掉HQ创建班级,且是这个班级
			for(EnrichmentKlassschedule klass:classList){
				if(klass.getHqId()!=1 && id.intValue()==klass.getRoomId().intValue()){
					klassCenter.add(klass);
				}
			}
		}
		List<TimeDto> tdList=times.getTime();
		/**
		 * 存储的是center创建的班级ID，且在DateFrom~DateTo之间
		 */
		List<Integer> ids=new ArrayList<Integer>();
		if(ListUtils.isNotEmpty(klassCenter)){
			for(EnrichmentKlassschedule ek:klassCenter){
				ids.add(ek.getId());
			}
		}
		if(null==tdList){
			throw new Exception("Please set ClassTime");
		}
		EnrichmentRoom rooom=enrichmentClassDao.selectEnrichmentRoomByPrimaryId(id);
		/**
		 * enrichment_klassscheduletime 查询DateFrom~DateTo之间的排课时间
		 */
		List<EnrichmentKlassscheduletimeDto> classtime=new ArrayList<EnrichmentKlassscheduletimeDto>();
		
		for(EnrichmentKlassschedule klass:klassCenter){
			classtime=enrichmentClassDao.selectEnrichmentKlassscheduleTimeByClassId(klass.getId());
			EnrichmentCourse course=new EnrichmentCourse();
			course=enrichmentClassDao.selectClassCourseByPrimaryKey(klass.getCourseId());
			if(ListUtils.isNotEmpty(classtime)){
				if(this.isUseRoom(tdList,classtime)){
					str="Room["+rooom.getName()+"],was used by course["+course.getName()+"]";
					return str;
				}else{
					continue;
				}
			}
		}
		str="success";
		return str;
	}
	/**
	 * 
	 * @description:查询tdList 时间段内，这个roomid是否正在被使用
	 * @param roomId
	 * @param tdList
	 * @param classtime
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月25日 上午11:10:15
	 */
	private boolean isUseRoom(List<TimeDto> tdList,List<EnrichmentKlassscheduletimeDto> classtime) throws ParseException {
		for(TimeDto td:tdList){
			for(EnrichmentKlassscheduletimeDto time:classtime){
				//如果设置的排课是星期一
				if(td.getReapeat().intValue()==time.getReapeat().intValue()){
					//查询这个星期一下的排课时间，这个room是否冲突
					//Time startTimeSet=Time.valueOf(td.getStarTime());
					Date startTimeSet=DateUtils.stringToDate(td.getStarTime(), DateUtils.HHMM);
					//Time endTimeSet=Time.valueOf(td.getEndTime());
					Date endTimeSet=DateUtils.stringToDate(td.getEndTime(), DateUtils.HHMM);
					
					Date startTime=time.getStartTime();
					Date endTime=time.getEndTime();
					
					String str=this.isQuJianNei(startTimeSet,endTimeSet,startTime,endTime);
					if("true".equals(str)){
						//"true",在区间内，说明教室在使用
						return true;
					}
					if("false".equals(str)){
						continue;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @description:判断前两个时间与后面两个时间是否存在交际
	 * @param startTimeSet
	 * @param endTimeSet
	 * @param startTime
	 * @param endTime
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月25日 上午11:22:10
	 */
	public String isQuJianNei(Date startTimeSet, Date endTimeSet,Date startTime, Date endTime) throws ParseException {
		if(DateUtils.isBeforeDate(endTime, startTimeSet)){
			//非区间内
			return "false";
		}
		if(DateUtils.isBeforeDate(endTimeSet, startTime)){
			//非区间内
			return "false";
		}
		return "true";
	}
	
	/**
	 * 
	 * @description:返回没有被使用的老师
	 * @param times
	 * @param teacherId
	 * @param string
	 * @return
	 * @author:王涛
	 * @throws ParseException 
	 * @createTime:2018年6月25日 下午3:37:27
	 */
	@Override
	public List<OptionDTO> checkOutTeacher(TimeDto2 times,Integer courseId,Integer centerId,Integer userID) throws Exception {
		/**
		 * 存储的是center创建的班级且是这个课程下，且在DateFrom~DateTo之间
		 */
		List<EnrichmentKlassschedule> klassCenter=new ArrayList<EnrichmentKlassschedule>();
		List<EnrichmentKlassschedule> classList=new ArrayList<EnrichmentKlassschedule>();
		/**
		 * 这个中心下的这个时间之类的所有的创建的班级
		 */
		classList=enrichmentClassDao.selectEnrichmentKlassscheduleByDateFromAndDateTo(DateUtils.stringToDate(times.getDateFrom(), DateUtils.YYYYMMdd),
				DateUtils.stringToDate(times.getDateTo(),DateUtils.YYYYMMdd),centerId);
		if(ListUtils.isNotEmpty(classList)){
			//排除掉HQ创建班级,且是这个班级
			for(EnrichmentKlassschedule klass:classList){
				if(klass.getHqId()!=1 && courseId.intValue()==klass.getCourseId().intValue()){
					klassCenter.add(klass);
				}
			}
		}
		List<TimeDto> tdList=times.getTime();
		/**
		 * 存储的是center创建的班级ID，且在DateFrom~DateTo之间
		 */
		List<Integer> ids=new ArrayList<Integer>();
		if(ListUtils.isNotEmpty(klassCenter)){
			for(EnrichmentKlassschedule ek:klassCenter){
				ids.add(ek.getId());
			}
		}
		if(null==tdList){
			throw new Exception("Please set class Time");
		}
		
		List<EnrichmentKlassscheduletimeDto> classtime=new ArrayList<EnrichmentKlassscheduletimeDto>();
		
		/**
		 * 存储的是时间段类被使用的班级
		 */
		List<EnrichmentKlassschedule> useClass=new ArrayList<EnrichmentKlassschedule>();
		for(EnrichmentKlassschedule klass:klassCenter){
			/**
			 * 查询 这些班级的课程时间排期
			 */
			classtime=enrichmentClassDao.selectEnrichmentKlassscheduleTimeByClassId(klass.getId());
			if(ListUtils.isNotEmpty(classtime)){
				if(this.isUseRoom(tdList,classtime)){
					useClass.add(klass);
				}else{
					continue;
				}
			}
		}
		
		/**
		 * 存储未被使用的teacherIDS
		 */
		List<Integer> useTeacher=new ArrayList<Integer>();
		//useClass 这个list 存储的是被使用的班级及其老师
		List<Integer> teacherIds=enrichmentTeacherCourseDao.selectTeachersByCourseIdCenterId(courseId, centerId);
		
		if(ListUtils.isNotEmpty(useClass)){
			for(Integer teacherId:teacherIds){
				for(EnrichmentKlassschedule ek:useClass){
					if(ek.getTeacherId().intValue()==teacherId.intValue()){
						useTeacher.add(teacherId);
					}
				}
			}
		}
		teacherIds.removeAll(useTeacher);
		List<OptionDTO> idss=new ArrayList<OptionDTO>();
		idss=this.setOptionDTO(teacherIds,userID);
		return idss;
	}
	
	/**
	 * 
	 * @description:
	 * @param teacherIds
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 下午5:46:26
	 */
	private List<OptionDTO> setOptionDTO(List<Integer> teacherIds,Integer userID) {
		List<OptionDTO> idss=new ArrayList<OptionDTO>();
		for(Integer id:teacherIds){
			OptionDTO o=new OptionDTO();
			o.setId(id);
			AccountsTeacher accountsTeacher=teacherDao.selectAccountTeacherByPrimaryId(id);
			if(null!=accountsTeacher){
				AuthUser au=userDao.selectAuthUserByPrimaryKey(accountsTeacher.getUserId());
				if(null!=au){
					o.setName(au.getFirstName()+" "+au.getLastName());
				}
			}else{
				continue;
			}
			idss.add(o);
		}
		return idss;
	}
}
