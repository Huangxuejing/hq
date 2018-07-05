package com.taidii.staffdevelopment.hq.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.taidii.staffdevelopment.hq.entity.AttendanceTeacherdailyoverview;
import com.taidii.staffdevelopment.hq.entity.AttendanceTeacherdailyoverviewExample;

public interface AttendanceTeacherdailyoverviewMapper {
    long countByExample(AttendanceTeacherdailyoverviewExample example);

    int deleteByExample(AttendanceTeacherdailyoverviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AttendanceTeacherdailyoverview record);

    int insertSelective(AttendanceTeacherdailyoverview record);

    List<AttendanceTeacherdailyoverview> selectByExample(AttendanceTeacherdailyoverviewExample example);

    AttendanceTeacherdailyoverview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AttendanceTeacherdailyoverview record, @Param("example") AttendanceTeacherdailyoverviewExample example);

    int updateByExample(@Param("record") AttendanceTeacherdailyoverview record, @Param("example") AttendanceTeacherdailyoverviewExample example);

    int updateByPrimaryKeySelective(AttendanceTeacherdailyoverview record);

    int updateByPrimaryKey(AttendanceTeacherdailyoverview record);
}