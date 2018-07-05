package com.taidii.staffdevelopment.entity;

/**
 * @description:用户课程表
 * @projectName:staff-development
 * @className:DevelopUserCourse.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:22:57
 * @version 1.0.1
 */
public class DevelopUserCourse extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
    private Integer courseId;
    private Integer planTotalTrainingHour;
    private Integer completedTrainingHour;
    private Double courseFee;
    private Double grant;
    private Double absenteePayroll;
    private Integer status;
    private Integer selfEvaluationId;
    private String attachment;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(Double courseFee) {
        this.courseFee = courseFee;
    }

    public Double getGrant() {
        return grant;
    }

    public void setGrant(Double grant) {
        this.grant = grant;
    }

    public Double getAbsenteePayroll() {
        return absenteePayroll;
    }

    public void setAbsenteePayroll(Double absenteePayroll) {
        this.absenteePayroll = absenteePayroll;
    }

	public Integer getPlanTotalTrainingHour() {
		return planTotalTrainingHour;
	}

	public void setPlanTotalTrainingHour(Integer planTotalTrainingHour) {
		this.planTotalTrainingHour = planTotalTrainingHour;
	}

	public Integer getCompletedTrainingHour() {
		return completedTrainingHour;
	}

	public void setCompletedTrainingHour(Integer completedTrainingHour) {
		this.completedTrainingHour = completedTrainingHour;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
    public Integer getSelfEvaluationId() {
        return selfEvaluationId;
    }
    
    public void setSelfEvaluationId(Integer selfEvaluationId) {
        this.selfEvaluationId = selfEvaluationId;
    }
    
    public String getAttachment() {
        return attachment;
    }
    
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}