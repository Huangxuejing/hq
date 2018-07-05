package com.taidii.staffdevelopment.hq.dao;

import java.util.Date;
import java.util.List;

public interface IAttendanceTeacherDao {
	/**
	 * 根据用户id获取当天的签到人数
	 * @author 孟娜
	 * @param ids
	 * @return
	 */
	List<Integer> getAttendanceTeacher(List<Integer> ids,Date date);
}
