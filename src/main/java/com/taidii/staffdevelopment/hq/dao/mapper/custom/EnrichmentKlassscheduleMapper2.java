package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.List;
import java.util.Map;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.hq.dto.ClassListDto;
import com.taidii.staffdevelopment.hq.dto.ClassSchedule2Dto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.dto.ClassScheduleDto;
import com.taidii.staffdevelopment.hq.dto.ItemListDto;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleExample;

@Mapper
public interface EnrichmentKlassscheduleMapper2 extends BaseMapper<EnrichmentKlassschedule,EnrichmentKlassscheduleExample> {
    List<ClassSchedule2Dto> getClassSchedule(@Param("classId") Integer classId);

    List<ClassSchedule2Dto> getClassSchedule2(@Param("hqId") Integer hqId,@Param("classId") Integer classId);

    List<ItemListDto> getItemList(@Param("hqId") Integer hqId);

    List<ClassListDto> getClassListByCenter(Map<String,Object> map);

    List<ClassListDto> getClassListByHq(Map<String,Object> map);

    List<Integer> getStartYear();
}