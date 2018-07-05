package com.taidii.staffdevelopment.dto;

import java.io.Serializable;

public class HomePageCountDTO implements Serializable{
	private static final long serialVersionUID = -3161599565482956970L;
	
	//员工总数
	private Integer TotalStaff;
	
	//员工出勤率
	private String StaffAttendanceRate;
	
	//当月未偿还总额
	private Double OutStandingAmount;
	
	//当月未偿还
	private Double OutStandingAmountTheMonth;
	
	//学生总人数
	private Integer TotalStudent;
	
	//学生出勤率
	private String StudentAttendanceRate;
	
	//当月新生人数
	private Integer NewStudentCount;
	
	//学生离开人数
	private Integer LeaveStudentCount;

	public Integer getTotalStaff() {
		return TotalStaff;
	}

	public void setTotalStaff(Integer totalStaff) {
		TotalStaff = totalStaff;
	}

	public String getStaffAttendanceRate() {
		return StaffAttendanceRate;
	}

	public void setStaffAttendanceRate(String staffAttendanceRate) {
		StaffAttendanceRate = staffAttendanceRate;
	}

	public Double getOutStandingAmount() {
		return OutStandingAmount;
	}

	public void setOutStandingAmount(Double outStandingAmount) {
		OutStandingAmount = outStandingAmount;
	}

	public Double getOutStandingAmountTheMonth() {
		return OutStandingAmountTheMonth;
	}

	public void setOutStandingAmountTheMonth(Double outStandingAmountTheMonth) {
		OutStandingAmountTheMonth = outStandingAmountTheMonth;
	}

	public Integer getTotalStudent() {
		return TotalStudent;
	}

	public void setTotalStudent(Integer i) {
		TotalStudent = i;
	}

	public String getStudentAttendanceRate() {
		return StudentAttendanceRate;
	}

	public void setStudentAttendanceRate(String studentAttendanceRate) {
		StudentAttendanceRate = studentAttendanceRate;
	}

	public Integer getNewStudentCount() {
		return NewStudentCount;
	}

	public void setNewStudentCount(Integer newStudentCount) {
		NewStudentCount = newStudentCount;
	}

	public Integer getLeaveStudentCount() {
		return LeaveStudentCount;
	}

	public void setLeaveStudentCount(Integer leaveStudentCount) {
		LeaveStudentCount = leaveStudentCount;
	}
	
	
}
