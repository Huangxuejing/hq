package com.taidii.staffdevelopment.dto.training;

import java.io.Serializable;

public class CourseConfirmDTO implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
    private Integer courseId;
    private Integer userId;
    private String attachment;
    private Integer attendance;
    private Double grant;
    
    private Double payroll;
    
    private Integer status;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getCourseId() {
        return courseId;
    }
    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
    
    public Integer getUserId() {
        return userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public String getAttachment() {
        return attachment;
    }
    
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
    
    public Integer getAttendance() {
        return attendance;
    }
    
    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
    }
    
    public Double getGrant() {
        return grant;
    }
    
    public void setGrant(Double grant) {
        this.grant = grant;
    }
    
    public Double getPayroll() {
        return payroll;
    }
    
    public void setPayroll(Double payroll) {
        this.payroll = payroll;
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
}
