package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduleHqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentKlassscheduleHqMapper {
    long countByExample(EnrichmentKlassscheduleHqExample example);

    int deleteByExample(EnrichmentKlassscheduleHqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentKlassscheduleHq record);

    int insertSelective(EnrichmentKlassscheduleHq record);

    List<EnrichmentKlassscheduleHq> selectByExample(EnrichmentKlassscheduleHqExample example);

    EnrichmentKlassscheduleHq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentKlassscheduleHq record, @Param("example") EnrichmentKlassscheduleHqExample example);

    int updateByExample(@Param("record") EnrichmentKlassscheduleHq record, @Param("example") EnrichmentKlassscheduleHqExample example);

    int updateByPrimaryKeySelective(EnrichmentKlassscheduleHq record);

    int updateByPrimaryKey(EnrichmentKlassscheduleHq record);
}