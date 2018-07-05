package com.taidii.staffdevelopment.hq.dao.mapper.custom;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface AttendanceTeacherdailyoverviewMapper2 {
	/**
	 * 获取今天签到的教师
	 * @param ids
	 * @param date
	 * @return
	 */
    List<Integer> selectOverTeacherByIds(@Param(value="ids")List<Integer> ids,@Param(value="date")Date date);
}