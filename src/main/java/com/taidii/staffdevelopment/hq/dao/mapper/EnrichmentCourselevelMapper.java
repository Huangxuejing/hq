package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevel;
import com.taidii.staffdevelopment.hq.entity.EnrichmentCourselevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentCourselevelMapper {
    long countByExample(EnrichmentCourselevelExample example);

    int deleteByExample(EnrichmentCourselevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentCourselevel record);

    int insertSelective(EnrichmentCourselevel record);

    List<EnrichmentCourselevel> selectByExample(EnrichmentCourselevelExample example);

    EnrichmentCourselevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentCourselevel record, @Param("example") EnrichmentCourselevelExample example);

    int updateByExample(@Param("record") EnrichmentCourselevel record, @Param("example") EnrichmentCourselevelExample example);

    int updateByPrimaryKeySelective(EnrichmentCourselevel record);

    int updateByPrimaryKey(EnrichmentCourselevel record);
}