package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleday;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduledayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentKlassscheduledayMapper {
    long countByExample(EnrichmentKlassscheduledayExample example);

    int deleteByExample(EnrichmentKlassscheduledayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentKlassscheduleday record);

    int insertSelective(EnrichmentKlassscheduleday record);

    List<EnrichmentKlassscheduleday> selectByExample(EnrichmentKlassscheduledayExample example);

    EnrichmentKlassscheduleday selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentKlassscheduleday record, @Param("example") EnrichmentKlassscheduledayExample example);

    int updateByExample(@Param("record") EnrichmentKlassscheduleday record, @Param("example") EnrichmentKlassscheduledayExample example);

    int updateByPrimaryKeySelective(EnrichmentKlassscheduleday record);

    int updateByPrimaryKey(EnrichmentKlassscheduleday record);
}