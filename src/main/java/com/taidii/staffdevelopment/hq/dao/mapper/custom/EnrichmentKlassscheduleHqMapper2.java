package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHqExample;

@Mapper
public interface EnrichmentKlassscheduleHqMapper2 extends BaseMapper<EnrichmentKlassscheduleHq,EnrichmentKlassscheduleHqExample> {
	/**
	 * 
	 * @description:查询HQ创建的班级的涉及到的所有机构的信息，id，name
	 * @param hqId
	 * @param classId
	 * @return
	 * @author:王涛
	 * @createTime:2018年7月3日 上午9:27:50
	 */
	List<OptionDTO> selectCentersInfoByHqAndClass(@Param("hqId") Integer hqId,@Param("classId") Integer classId);

}
