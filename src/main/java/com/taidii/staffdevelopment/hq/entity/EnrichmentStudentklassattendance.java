package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EnrichmentStudentklassattendance {
    private Integer id;

    private Integer centerId;

    private Date date;

    private Integer studentklassId;

    private Integer signIn;

    private Integer studentId;

    private Integer childId;

    private Integer klassscheduleId;

    private Date recordedOn;

    private BigDecimal temperature;

    private BigDecimal weight;

    private Integer pickUpId;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStudentklassId() {
        return studentklassId;
    }

    public void setStudentklassId(Integer studentklassId) {
        this.studentklassId = studentklassId;
    }

    public Integer getSignIn() {
        return signIn;
    }

    public void setSignIn(Integer signIn) {
        this.signIn = signIn;
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

    public Date getRecordedOn() {
        return recordedOn;
    }

    public void setRecordedOn(Date recordedOn) {
        this.recordedOn = recordedOn;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPickUpId() {
        return pickUpId;
    }

    public void setPickUpId(Integer pickUpId) {
        this.pickUpId = pickUpId;
    }
}