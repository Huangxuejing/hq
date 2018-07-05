package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EnrichmentStudentklass {
    private Integer id;

    private Date date;

    private Integer studentklassscheduleId;

    private Integer rescheduleType;

    private Integer studentKlassId;

    private String remarks;

    private Integer studentId;

    private Integer childId;

    private Integer klassscheduleId;

    private BigDecimal unitPrice;

    private Boolean isPaid;

    private Integer type;

    private Boolean isTryClass;

    private Date startTime;

    private Date endTime;

    private Integer rescheduleFromId;

    private Boolean isFreeClass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStudentklassscheduleId() {
        return studentklassscheduleId;
    }

    public void setStudentklassscheduleId(Integer studentklassscheduleId) {
        this.studentklassscheduleId = studentklassscheduleId;
    }

    public Integer getRescheduleType() {
        return rescheduleType;
    }

    public void setRescheduleType(Integer rescheduleType) {
        this.rescheduleType = rescheduleType;
    }

    public Integer getStudentKlassId() {
        return studentKlassId;
    }

    public void setStudentKlassId(Integer studentKlassId) {
        this.studentKlassId = studentKlassId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getIsTryClass() {
        return isTryClass;
    }

    public void setIsTryClass(Boolean isTryClass) {
        this.isTryClass = isTryClass;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getRescheduleFromId() {
        return rescheduleFromId;
    }

    public void setRescheduleFromId(Integer rescheduleFromId) {
        this.rescheduleFromId = rescheduleFromId;
    }

    public Boolean getIsFreeClass() {
        return isFreeClass;
    }

    public void setIsFreeClass(Boolean isFreeClass) {
        this.isFreeClass = isFreeClass;
    }
}