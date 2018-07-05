package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHq;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseHqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentCourseHqMapper {
    long countByExample(EnrichmentCourseHqExample example);

    int deleteByExample(EnrichmentCourseHqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentCourseHq record);

    int insertSelective(EnrichmentCourseHq record);

    List<EnrichmentCourseHq> selectByExample(EnrichmentCourseHqExample example);

    EnrichmentCourseHq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentCourseHq record, @Param("example") EnrichmentCourseHqExample example);

    int updateByExample(@Param("record") EnrichmentCourseHq record, @Param("example") EnrichmentCourseHqExample example);

    int updateByPrimaryKeySelective(EnrichmentCourseHq record);

    int updateByPrimaryKey(EnrichmentCourseHq record);
}