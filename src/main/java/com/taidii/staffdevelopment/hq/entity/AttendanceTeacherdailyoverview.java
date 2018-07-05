package com.taidii.staffdevelopment.hq.entity;

import java.util.Date;

public class AttendanceTeacherdailyoverview {
    private Integer id;

    private Integer teacherId;

    private Date overviewDate;

    private Integer verify;

    private Integer overtimeIn;

    private Integer overtimeOut;

    private Integer overtimeIn2;

    private Integer overtimeOut2;

    private String remark;

    private Integer verifyAttendance;

    private Integer verifyById;

    private Date verifyAt;

    private Integer verifyLevel2ById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Date getOverviewDate() {
        return overviewDate;
    }

    public void setOverviewDate(Date overviewDate) {
        this.overviewDate = overviewDate;
    }

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    public Integer getOvertimeIn() {
        return overtimeIn;
    }

    public void setOvertimeIn(Integer overtimeIn) {
        this.overtimeIn = overtimeIn;
    }

    public Integer getOvertimeOut() {
        return overtimeOut;
    }

    public void setOvertimeOut(Integer overtimeOut) {
        this.overtimeOut = overtimeOut;
    }

    public Integer getOvertimeIn2() {
        return overtimeIn2;
    }

    public void setOvertimeIn2(Integer overtimeIn2) {
        this.overtimeIn2 = overtimeIn2;
    }

    public Integer getOvertimeOut2() {
        return overtimeOut2;
    }

    public void setOvertimeOut2(Integer overtimeOut2) {
        this.overtimeOut2 = overtimeOut2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getVerifyAttendance() {
        return verifyAttendance;
    }

    public void setVerifyAttendance(Integer verifyAttendance) {
        this.verifyAttendance = verifyAttendance;
    }

    public Integer getVerifyById() {
        return verifyById;
    }

    public void setVerifyById(Integer verifyById) {
        this.verifyById = verifyById;
    }

    public Date getVerifyAt() {
        return verifyAt;
    }

    public void setVerifyAt(Date verifyAt) {
        this.verifyAt = verifyAt;
    }

    public Integer getVerifyLevel2ById() {
        return verifyLevel2ById;
    }

    public void setVerifyLevel2ById(Integer verifyLevel2ById) {
        this.verifyLevel2ById = verifyLevel2ById;
    }
}