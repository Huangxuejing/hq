package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IAttendanceTeacherDao;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.AttendanceTeacherdailyoverviewMapper2;

@Service
public class AttendanceTeacherDaoImpl implements IAttendanceTeacherDao{

	@Autowired
	AttendanceTeacherdailyoverviewMapper2 attendanceTeacherdailyoverviewMapper2;
	
	@Override
	public List<Integer> getAttendanceTeacher(List<Integer> ids,Date date) {
		List<Integer> newIids=attendanceTeacherdailyoverviewMapper2.selectOverTeacherByIds(ids, date);
		return newIids;
	}

}
