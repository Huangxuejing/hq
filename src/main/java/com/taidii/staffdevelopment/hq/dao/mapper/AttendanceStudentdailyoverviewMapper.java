package com.taidii.staffdevelopment.hq.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.hq.entity.AttendanceStudentdailyoverview;
import com.taidii.staffdevelopment.hq.entity.AttendanceStudentdailyoverviewExample;

public interface AttendanceStudentdailyoverviewMapper {
    long countByExample(AttendanceStudentdailyoverviewExample example);

    int deleteByExample(AttendanceStudentdailyoverviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttendanceStudentdailyoverview record);

    int insertSelective(AttendanceStudentdailyoverview record);

    List<AttendanceStudentdailyoverview> selectByExample(AttendanceStudentdailyoverviewExample example);

    AttendanceStudentdailyoverview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttendanceStudentdailyoverview record, @Param("example") AttendanceStudentdailyoverviewExample example);

    int updateByExample(@Param("record") AttendanceStudentdailyoverview record, @Param("example") AttendanceStudentdailyoverviewExample example);

    int updateByPrimaryKeySelective(AttendanceStudentdailyoverview record);

    int updateByPrimaryKey(AttendanceStudentdailyoverview record);
}