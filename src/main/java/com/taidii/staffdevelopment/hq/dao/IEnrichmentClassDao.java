package com.taidii.staffdevelopment.hq.dao;

import java.util.Date;
import java.util.List;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dto.EnrichmentKlassscheduletimeDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;

public interface IEnrichmentClassDao {
	/**
	 * 
	 * @description:入库 EnrichmentKlassschedule
	 * @param ekd
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午6:19:30
	 */
	public Integer insertEnrichmentClass(EnrichmentKlassschedule ekd);
	/**
	 * 
	 * @description:EnrichmentKlassscheduletime 入库
	 * @param ektList
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月21日 下午6:39:53
	 */
	public Integer insertEnrichmentClassTime(List<EnrichmentKlassscheduletime> ektList);
	
	/**
	 * 
	 * @description:EnrichmentKlassscheduleHq 入库操作
	 * @param centersID
	 * @param eq
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:06:23
	 */
	public Integer insertEnrichmentClassHq(List<Integer> centersID,EnrichmentKlassscheduleHq eq);
	/**
	 * 
	 * @description:通过Klassscheid  获取EnrichmentKlassschedule
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:31:09
	 */
	public EnrichmentKlassschedule selectEnrichmentKlassscheduleByPrimaryId(Integer classId);
	/**
	 * 
	 * @description:通过classID 查询出课程设置时间
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午10:33:42
	 */
	public List<EnrichmentKlassscheduletimeDto> selectEnrichmentKlassscheduleTimeByClassId(Integer classId);
	/**
	 * 
	 * @description:通过主键ID 查询教室
	 * @param roomId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 上午11:20:12
	 */
	public EnrichmentRoom selectEnrichmentRoomByPrimaryId(Integer roomId);
	/**
	 * 
	 * @description:通过classId删除 Enrichment_klassschedule_time
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午1:41:04
	 */
	public Integer delEnrichmentClassTimeByClassId(Integer classId);
	/**
	 * 
	 * @description:通过classID 删除掉EnrichmentClassHQ 表
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午1:44:27
	 */
	public Integer delEnrichmentClassHqByClassId(Integer classId);
	/**
	 * 
	 * @description:通过主键ID 删除class表中的数据
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月22日 下午1:47:10
	 */
	public Integer delEnrichmentKlassscheduleByPrimaryId(Integer classId);
	/**
	 * 
	 * @description:更新class表中变化的数据
	 * @param ekd
	 * @author:王涛
	 * @createTime:2018年6月22日 下午2:48:12
	 */
	public Integer updateClassByPrimaryId(EnrichmentKlassschedule ekd);
	/**
	 * 
	 * @description:查询出dateFrom~dateTo  时间内的的EnrichmentKlassschedule
	 * @param dateFrom
	 * @param dateTo
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 上午9:24:25
	 */
	public List<EnrichmentKlassschedule> selectEnrichmentKlassscheduleByDateFromAndDateTo(Date dateFrom, Date dateTo,Integer centerId);
	/**
	 * 
	 * @description:通过主键ID 查询这个课程
	 * @param courseId
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月25日 上午11:47:10
	 */
	public EnrichmentCourse selectClassCourseByPrimaryKey(Integer courseId);
	/**
	 * 
	 * @description:单个对象入库，EnrichmentKlassscheduletime
	 * @param ekt
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月28日 上午11:36:25
	 */
	public Integer insertEnrichmentClasstime(EnrichmentKlassscheduletime ekt);
	/**
	 * 
	 * @description:对象查找
	 * @param importClasses
	 * @author:王涛
	 * @return 
	 * @createTime:2018年6月28日 下午5:41:38
	 */
	public List<EnrichmentKlassschedule> selectEnrichmentKlassscheduleByExample(
			EnrichmentKlassschedule importClasses);


	/**
	 * 判断是否存在修改班级老师和教室
	 * @param classId
	 * @return
	 */
	Integer getRoomByClassId(Integer classId);
	/**
	 * 
	 * @description:通过HQ和class 查询出这个HQ创建的班级涉及到的机构
	 * @param classId
	 * @param hqId
	 * @return
	 * @author:王涛
	 * @createTime:2018年7月3日 上午9:23:01
	 */
	public List<OptionDTO> selectCentersByHqAndClass(Integer classId, Integer hqId);
}
