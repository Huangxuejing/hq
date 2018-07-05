package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassschedulelessoncount;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassschedulelessoncountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentStudentklassschedulelessoncountMapper {
    long countByExample(EnrichmentStudentklassschedulelessoncountExample example);

    int deleteByExample(EnrichmentStudentklassschedulelessoncountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentStudentklassschedulelessoncount record);

    int insertSelective(EnrichmentStudentklassschedulelessoncount record);

    List<EnrichmentStudentklassschedulelessoncount> selectByExample(EnrichmentStudentklassschedulelessoncountExample example);

    EnrichmentStudentklassschedulelessoncount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentStudentklassschedulelessoncount record, @Param("example") EnrichmentStudentklassschedulelessoncountExample example);

    int updateByExample(@Param("record") EnrichmentStudentklassschedulelessoncount record, @Param("example") EnrichmentStudentklassschedulelessoncountExample example);

    int updateByPrimaryKeySelective(EnrichmentStudentklassschedulelessoncount record);

    int updateByPrimaryKey(EnrichmentStudentklassschedulelessoncount record);
}