package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import org.apache.ibatis.annotations.Mapper;

import com.taidii.staffdevelopment.dao.mapper.BaseMapper;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletimeExample;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EnrichmentKlassscheduletimeMapper2 extends BaseMapper<EnrichmentKlassscheduletime,EnrichmentKlassscheduletimeExample>{
	/**
	 * 
	 * @description:入库操作enrichmentKlassscheduletime
	 * @param time
	 * @return
	 * @author:王涛
	 * @createTime:2018年6月27日 下午4:22:04
	 */
	int insertEnrichmentKlassscheduletime(EnrichmentKlassscheduletime time);

	Integer getRoomByClassId(@Param("id") Integer classId);
	

}
