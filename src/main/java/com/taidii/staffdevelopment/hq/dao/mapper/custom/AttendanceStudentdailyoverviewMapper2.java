package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AttendanceStudentdailyoverviewMapper2 {
	/**
	 * 获取签到的学生数
	 * @param ids
	 * @param date
	 * @return
	 */
    Integer selectOverStudentByIds(@Param(value="ids")List<Integer> ids,@Param(value="date")Date date);
}