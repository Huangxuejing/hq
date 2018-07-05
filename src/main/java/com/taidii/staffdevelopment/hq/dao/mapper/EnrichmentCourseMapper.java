package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentCourse;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentCourseMapper {
    long countByExample(EnrichmentCourseExample example);

    int deleteByExample(EnrichmentCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentCourse record);

    int insertSelective(EnrichmentCourse record);

    List<EnrichmentCourse> selectByExample(EnrichmentCourseExample example);

    EnrichmentCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentCourse record, @Param("example") EnrichmentCourseExample example);

    int updateByExample(@Param("record") EnrichmentCourse record, @Param("example") EnrichmentCourseExample example);

    int updateByPrimaryKeySelective(EnrichmentCourse record);

    int updateByPrimaryKey(EnrichmentCourse record);
}