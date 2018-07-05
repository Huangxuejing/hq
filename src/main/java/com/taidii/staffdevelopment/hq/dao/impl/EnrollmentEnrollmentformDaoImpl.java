package com.taidii.staffdevelopment.hq.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taidii.staffdevelopment.hq.dao.IEnrollmentEnrollmentformDao;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.AttendanceStudentdailyoverviewMapper2;
import com.taidii.staffdevelopment.hq.dao.mapper.custom.EnrollmentEnrollmentformMapper2;
@Service
public class EnrollmentEnrollmentformDaoImpl implements IEnrollmentEnrollmentformDao{

	@Autowired
	private EnrollmentEnrollmentformMapper2 enrollmentEnrollmentformMapper2;
	
	@Autowired
	private AttendanceStudentdailyoverviewMapper2 attendanceStudentdailyoverviewMapper2;
	
	@Override
	public Integer getStatusStudent(List<Integer> ids, Integer status,String date) {
		Integer students=0;
		//当月
		if(status==2&&date!=null) {
			students=enrollmentEnrollmentformMapper2.getNewEnrollStudent(ids);
		}else {//离园
			students=enrollmentEnrollmentformMapper2.getWithdrStudent(ids);
		}
		return students;
	}

	@Override
	public List<Integer> getNowTotalStudent(List<Integer> ids) {
		return enrollmentEnrollmentformMapper2.getNowTotalStudent(ids);
	}

	@Override
	public Integer getAttendanceStudent(List<Integer> ids, Date date) {
		Integer student=0;
		student = attendanceStudentdailyoverviewMapper2.selectOverStudentByIds(ids, date);
		return student;
	}

}
