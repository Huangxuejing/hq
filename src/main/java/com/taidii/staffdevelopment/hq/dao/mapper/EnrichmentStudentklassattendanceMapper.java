package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassattendance;
import com.taidii.staffdevelopment.hq.entity.EnrichmentStudentklassattendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnrichmentStudentklassattendanceMapper {
    long countByExample(EnrichmentStudentklassattendanceExample example);

    int deleteByExample(EnrichmentStudentklassattendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EnrichmentStudentklassattendance record);

    int insertSelective(EnrichmentStudentklassattendance record);

    List<EnrichmentStudentklassattendance> selectByExample(EnrichmentStudentklassattendanceExample example);

    EnrichmentStudentklassattendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EnrichmentStudentklassattendance record, @Param("example") EnrichmentStudentklassattendanceExample example);

    int updateByExample(@Param("record") EnrichmentStudentklassattendance record, @Param("example") EnrichmentStudentklassattendanceExample example);

    int updateByPrimaryKeySelective(EnrichmentStudentklassattendance record);

    int updateByPrimaryKey(EnrichmentStudentklassattendance record);
}