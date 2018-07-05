package com.taidii.staffdevelopment.dto.training;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.util.ExcelColumn;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * course dto
 * @author GongYu
 * @date 2018/6/15
 */
public class CourseDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	@ExcelColumn("Course Name")
    @NotEmpty(message = "Course Name Can Not Empty")
    private String name;
    
    @ExcelColumn("Awarding Organization")
    private String awardingOrganization;
    
    
    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT+8", locale = "en")
    @ExcelColumn("Course Start")
    private Date startTime;
    
    @ExcelColumn("Training Hours")
    private Integer trainingHours;
    
    @ExcelColumn(value = "Staffs Attending", usedBy = "exportCourseList")
    private List<OptionDTO> members;
    
    @ExcelColumn("Fee")
    private Double courseFee;
    
    private Integer feeType;
    
    @ExcelColumn("Grant")
    private Double grant;
    
    @ExcelColumn("Absentee Payroll")
    private Double absenteePayroll;
    
    private Integer dutyLevelSkillId;
    
    private String dutyLevelSkillCode;
    
    private Integer schoolId;
    
    private Integer status;
    
    private String attachment;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAwardingOrganization() {
        return awardingOrganization;
    }
    
    public void setAwardingOrganization(String awardingOrganization) {
        this.awardingOrganization = awardingOrganization;
    }
    
    public Date getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
    
    public Integer getFeeType() {
        return feeType;
    }
    
    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
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
    
    public List<OptionDTO> getMembers() {
        return members;
    }
    
    public void setMembers(List<OptionDTO> members) {
        this.members = members;
    }
    
    public Integer getSchoolId() {
        return schoolId;
    }
    
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getDutyLevelSkillCode() {
        return dutyLevelSkillCode;
    }
    
    public void setDutyLevelSkillCode(String dutyLevelSkillCode) {
        this.dutyLevelSkillCode = dutyLevelSkillCode;
    }
    
    public String getAttachment() {
        return attachment;
    }
    
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
