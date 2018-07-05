package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/20 15:09
 */
public class TeacherInfoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String teacherName;
	private Integer dutyLevelId;
	private String dutyName;
	private Integer year;
	private String yearDutyName;
	// 训练课时
	private Integer trainHours;
	// 角色类型
	private String roleType;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getDutyLevelId() {
		return dutyLevelId;
	}

	public void setDutyLevelId(Integer dutyLevelId) {
		this.dutyLevelId = dutyLevelId;
	}

	public String getDutyName() {
		return dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public Integer getTrainHours() {
		return trainHours;
	}

	public void setTrainHours(Integer trainHours) {
		this.trainHours = trainHours;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getYearDutyName() {
		return yearDutyName;
	}

	public void setYearDutyName(String yearDutyName) {
		this.yearDutyName = yearDutyName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
}
