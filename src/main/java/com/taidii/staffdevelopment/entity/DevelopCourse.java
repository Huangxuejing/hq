package com.taidii.staffdevelopment.entity;

import java.util.Date;

/**
 * @description:课程表
 * @projectName:staff-development
 * @className:DevelopCourse.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:13:30
 * @version 1.0.1
 */
public class DevelopCourse extends BaseEntity{
	
	private static final long serialVersionUID = 6130421703494613769L;
    private String name;							//
    private String awardingOrganization;	//
    private Date startTime;						//
    private Integer trainingHours;				//
    private Double courseFee;					//
    private Integer feeType;						//
    private Double grant;							//
    private Double absenteePayroll;			//
    private Integer dutyLevelSkillId;			//
    private Integer status;							//
    private Integer year;							//
    private Integer schoolId;						//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAwardingOrganization() {
        return awardingOrganization;
    }

    public void setAwardingOrganization(String awardingOrganization) {
        this.awardingOrganization = awardingOrganization == null ? null : awardingOrganization.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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

    public Integer getDutyLevelSkillId() {
        return dutyLevelSkillId;
    }

    public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
        this.dutyLevelSkillId = dutyLevelSkillId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

	public Integer getTrainingHours() {
		return trainingHours;
	}

	public void setTrainingHours(Integer trainingHours) {
		this.trainingHours = trainingHours;
	}

	public Integer getFeeType() {
		return feeType;
	}

	public void setFeeType(Integer feeType) {
		this.feeType = feeType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        DevelopCourse course = (DevelopCourse) o;
        
        if (!name.equals(course.name)) return false;
        if (awardingOrganization != null ? !awardingOrganization.equals(course.awardingOrganization) : course.awardingOrganization != null)
            return false;
        if (startTime != null ? !startTime.equals(course.startTime) : course.startTime != null) return false;
        if (trainingHours != null ? !trainingHours.equals(course.trainingHours) : course.trainingHours != null)
            return false;
        if (courseFee != null ? !courseFee.equals(course.courseFee) : course.courseFee != null) return false;
        if (feeType != null ? !feeType.equals(course.feeType) : course.feeType != null) return false;
        if (grant != null ? !grant.equals(course.grant) : course.grant != null) return false;
        if (absenteePayroll != null ? !absenteePayroll.equals(course.absenteePayroll) : course.absenteePayroll != null)
            return false;
        if (dutyLevelSkillId != null ? !dutyLevelSkillId.equals(course.dutyLevelSkillId) : course.dutyLevelSkillId != null)
            return false;
        if (status != null ? !status.equals(course.status) : course.status != null) return false;
        if (year != null ? !year.equals(course.year) : course.year != null) return false;
        return schoolId != null ? schoolId.equals(course.schoolId) : course.schoolId == null;
    }
    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (awardingOrganization != null ? awardingOrganization.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (trainingHours != null ? trainingHours.hashCode() : 0);
        result = 31 * result + (courseFee != null ? courseFee.hashCode() : 0);
        result = 31 * result + (feeType != null ? feeType.hashCode() : 0);
        result = 31 * result + (grant != null ? grant.hashCode() : 0);
        result = 31 * result + (absenteePayroll != null ? absenteePayroll.hashCode() : 0);
        result = 31 * result + (dutyLevelSkillId != null ? dutyLevelSkillId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        return result;
    }
}