package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletime;
import com.taidii.staffdevelopment.hq.entity.EnrichmentKlassscheduletimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentKlassscheduletimeMapper {
    long countByExample(EnrichmentKlassscheduletimeExample example);

    int deleteByExample(EnrichmentKlassscheduletimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentKlassscheduletime record);

    int insertSelective(EnrichmentKlassscheduletime record);

    List<EnrichmentKlassscheduletime> selectByExample(EnrichmentKlassscheduletimeExample example);

    EnrichmentKlassscheduletime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentKlassscheduletime record, @Param("example") EnrichmentKlassscheduletimeExample example);

    int updateByExample(@Param("record") EnrichmentKlassscheduletime record, @Param("example") EnrichmentKlassscheduletimeExample example);

    int updateByPrimaryKeySelective(EnrichmentKlassscheduletime record);

    int updateByPrimaryKey(EnrichmentKlassscheduletime record);
}