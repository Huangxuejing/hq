package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassschedule;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassscheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentStudentklassscheduleMapper {
    long countByExample(EnrichmentStudentklassscheduleExample example);

    int deleteByExample(EnrichmentStudentklassscheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentStudentklassschedule record);

    int insertSelective(EnrichmentStudentklassschedule record);

    List<EnrichmentStudentklassschedule> selectByExample(EnrichmentStudentklassscheduleExample example);

    EnrichmentStudentklassschedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentStudentklassschedule record, @Param("example") EnrichmentStudentklassscheduleExample example);

    int updateByExample(@Param("record") EnrichmentStudentklassschedule record, @Param("example") EnrichmentStudentklassscheduleExample example);

    int updateByPrimaryKeySelective(EnrichmentStudentklassschedule record);

    int updateByPrimaryKey(EnrichmentStudentklassschedule record);
}