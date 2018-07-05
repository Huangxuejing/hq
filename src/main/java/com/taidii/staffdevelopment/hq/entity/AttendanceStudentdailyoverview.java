package com.taidii.staffdevelopment.hq.entity;

import java.util.Date;

public class AttendanceStudentdailyoverview {
    private Integer id;

    private Integer studentId;

    private Date overviewDate;

    private Integer klassId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getOverviewDate() {
        return overviewDate;
    }

    public void setOverviewDate(Date overviewDate) {
        this.overviewDate = overviewDate;
    }

    public Integer getKlassId() {
        return klassId;
    }

    public void setKlassId(Integer klassId) {
        this.klassId = klassId;
    }
}