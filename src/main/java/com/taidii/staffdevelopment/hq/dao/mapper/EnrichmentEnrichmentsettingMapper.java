package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsetting;
import com.taidii.staffdevelopment.hq.entity.EnrichmentEnrichmentsettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentEnrichmentsettingMapper {
    long countByExample(EnrichmentEnrichmentsettingExample example);

    int deleteByExample(EnrichmentEnrichmentsettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentEnrichmentsetting record);

    int insertSelective(EnrichmentEnrichmentsetting record);

    List<EnrichmentEnrichmentsetting> selectByExample(EnrichmentEnrichmentsettingExample example);

    EnrichmentEnrichmentsetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentEnrichmentsetting record, @Param("example") EnrichmentEnrichmentsettingExample example);

    int updateByExample(@Param("record") EnrichmentEnrichmentsetting record, @Param("example") EnrichmentEnrichmentsettingExample example);

    int updateByPrimaryKeySelective(EnrichmentEnrichmentsetting record);

    int updateByPrimaryKey(EnrichmentEnrichmentsetting record);
}