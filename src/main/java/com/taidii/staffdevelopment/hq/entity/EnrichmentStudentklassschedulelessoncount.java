package com.taidii.staffdevelopment.hq.entity;

public class EnrichmentStudentklassschedulelessoncount {
    private Integer id;

    private Integer centerId;

    private Integer studentId;

    private Integer childId;

    private Integer klassscheduleId;

    private Integer totalLessons;

    private Integer leftLessons;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getKlassscheduleId() {
        return klassscheduleId;
    }

    public void setKlassscheduleId(Integer klassscheduleId) {
        this.klassscheduleId = klassscheduleId;
    }

    public Integer getTotalLessons() {
        return totalLessons;
    }

    public void setTotalLessons(Integer totalLessons) {
        this.totalLessons = totalLessons;
    }

    public Integer getLeftLessons() {
        return leftLessons;
    }

    public void setLeftLessons(Integer leftLessons) {
        this.leftLessons = leftLessons;
    }
}