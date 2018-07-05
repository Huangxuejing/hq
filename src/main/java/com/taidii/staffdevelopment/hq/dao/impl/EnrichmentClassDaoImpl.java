package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.dao.IEnrichmentClassDao;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentCourseMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentKlassscheduleHqMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentKlassscheduleMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentKlassscheduletimeMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.EnrichmentRoomMapper;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentKlassscheduleHqMapper2;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentKlassscheduletimeMapper2;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrichmentStudentklassMapper2;
import com.taidii.staffdevelopment.hq.dto.EnrichmentKlassscheduletimeDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHqExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletimeExample;
import com.taidii.staffdevelopment.hq.entity.EnrichmentRoom;
import com.taidii.staffdevelopment.util.ListUtils;

@Service
public class EnrichmentClassDaoImpl implements IEnrichmentClassDao{
	@Autowired
	EnrichmentKlassscheduleMapper enrichmentKlassscheduleMapper;
	@Autowired
	EnrichmentKlassscheduletimeMapper enrichmentKlassscheduletimeMapper;
	@Autowired
	EnrichmentKlassscheduletimeMapper2 enrichmentKlassscheduletimeMapper2;
	@Autowired
	EnrichmentKlassscheduleHqMapper enrichmentKlassscheduleHqMapper;
	@Autowired
	EnrichmentKlassscheduleHqMapper2 enrichmentKlassscheduleHqMapper2;
	@Autowired
	EnrichmentRoomMapper enrichmentRoomMapper;
	@Autowired
	EnrichmentStudentklassMapper2 enrichmentStudentklassMapper2;
	@Autowired
	EnrichmentCourseMapper enrichmentCourseMapper;
	@Override
	public Integer insertEnrichmentClass(EnrichmentKlassschedule ekd) {
		return enrichmentKlassscheduleMapper.insertSelective(ekd);
	}

	@Override
	public Integer insertEnrichmentClassTime(List<EnrichmentKlassscheduletime> ektList) {
		Integer num=0;
		if(ListUtils.isNotEmpty(ektList)){
			for(EnrichmentKlassscheduletime time:ektList){
				//int count=enrichmentKlassscheduletimeMapper2.insertEnrichmentKlassscheduletime(time);
				int count=enrichmentKlassscheduletimeMapper.insertSelective(time);
				num+=count;
			}
		}
		return num;
	}

	@Override
	public Integer insertEnrichmentClassHq(List<Integer> centersID,EnrichmentKlassscheduleHq eq) {
		Integer count=0;
		if(ListUtils.isNotEmpty(centersID)){
			for(Integer centerId:centersID){
				eq.setCenterId(centerId);
				Integer num=enrichmentKlassscheduleHqMapper.insertSelective(eq);
				count+=num;
			}
		}
		return count;
	}

	@Override
	public EnrichmentKlassschedule selectEnrichmentKlassscheduleByPrimaryId(Integer classId) {
		return enrichmentKlassscheduleMapper.selectByPrimaryKey(classId);
	}
	
	@Override
	public List<EnrichmentKlassscheduletimeDto> selectEnrichmentKlassscheduleTimeByClassId(Integer classId) {
		return enrichmentStudentklassMapper2.selectByClassId(classId);
	}

	@Override
	public EnrichmentRoom selectEnrichmentRoomByPrimaryId(Integer roomId) {
		return enrichmentRoomMapper.selectByPrimaryKey(roomId);
	}

	@Override
	public Integer delEnrichmentClassTimeByClassId(Integer classId) {
		EnrichmentKlassscheduletimeExample t=new EnrichmentKlassscheduletimeExample();
		t.createCriteria().andKlassscheduleIdEqualTo(classId);
		return enrichmentKlassscheduletimeMapper.deleteByExample(t);
	}

	@Override
	public Integer delEnrichmentClassHqByClassId(Integer classId) {
		EnrichmentKlassscheduleHqExample e=new EnrichmentKlassscheduleHqExample();
		e.createCriteria().andKlassscheduleIdEqualTo(classId);
		return enrichmentKlassscheduleHqMapper.deleteByExample(e);
	}

	@Override
	public Integer delEnrichmentKlassscheduleByPrimaryId(Integer classId) {
		return enrichmentKlassscheduleMapper.deleteByPrimaryKey(classId);
	}

	@Override
	public Integer updateClassByPrimaryId(EnrichmentKlassschedule ekd) {
		return enrichmentKlassscheduleMapper.updateByPrimaryKeySelective(ekd);
	}
	
	@Override
	public List<EnrichmentKlassschedule> selectEnrichmentKlassscheduleByDateFromAndDateTo(Date dateFrom, Date dateTo,Integer centerId) {
		return enrichmentStudentklassMapper2.selectEnrichmentKlassscheduleByDateFromAndDateTo(dateFrom,dateTo,centerId);
	}

	@Override
	public EnrichmentCourse selectClassCourseByPrimaryKey(Integer courseId) {
		return enrichmentCourseMapper.selectByPrimaryKey(courseId);
	}

	@Override
	public Integer getRoomByClassId(Integer classId) {
		return enrichmentKlassscheduletimeMapper2.getRoomByClassId(classId);
	}

	@Override
	public Integer insertEnrichmentClasstime(EnrichmentKlassscheduletime ekt) {
		return enrichmentKlassscheduletimeMapper.insertSelective(ekt);
	}

	@Override
	public List<EnrichmentKlassschedule> selectEnrichmentKlassscheduleByExample(EnrichmentKlassschedule importClasses) {
		EnrichmentKlassscheduleExample e=new EnrichmentKlassscheduleExample();
		e.createCriteria().andHqIdEqualTo(importClasses.getHqId()).andCenterIdEqualTo(importClasses.getCenterId()).andKlassnameEqualTo(importClasses.getKlassname()).
		andCourseIdEqualTo(importClasses.getCourseId()).andLevelIdEqualTo(importClasses.getLevelId()).andTypeEqualTo(importClasses.getType()).andRoomIdEqualTo(importClasses.getRoomId())
		.andRemarksEqualTo(importClasses.getRemarks());
		return enrichmentKlassscheduleMapper.selectByExample(e);
	}

	@Override
	public List<OptionDTO> selectCentersByHqAndClass(Integer classId, Integer hqId) {
		return enrichmentKlassscheduleHqMapper2.selectCentersInfoByHqAndClass(hqId, classId);
	}
}