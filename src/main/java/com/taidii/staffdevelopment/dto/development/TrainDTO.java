package com.taidii.staffdevelopment.dto.development;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.dto.development
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/21 14:54
 */
public class TrainDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private Integer selfEvaluationId;
	private Integer skillId;
	private String course;
	private String organization;
	private Date courseStartDate;
	private Integer trainingHours;
	private Double courseFee;
	private Integer centreId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}

	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public Integer getTrainingHours() {
		return trainingHours;
	}

	public void setTrainingHours(Integer trainingHours) {
		this.trainingHours = trainingHours;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

	public Integer getCentreId() {
		return centreId;
	}

	public void setCentreId(Integer centreId) {
		this.centreId = centreId;
	}

}
