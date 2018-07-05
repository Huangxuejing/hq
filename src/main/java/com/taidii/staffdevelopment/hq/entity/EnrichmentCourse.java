package com.taidii.staffdevelopment.hq.entity;

public class EnrichmentCourse {
    private Integer id;

    private Integer centerId;

    private String name;

    private String description;

    private Integer makeupNum;

    private Boolean applyToAllCourse;

    private Integer type;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMakeupNum() {
        return makeupNum;
    }

    public void setMakeupNum(Integer makeupNum) {
        this.makeupNum = makeupNum;
    }

    public Boolean getApplyToAllCourse() {
        return applyToAllCourse;
    }

    public void setApplyToAllCourse(Boolean applyToAllCourse) {
        this.applyToAllCourse = applyToAllCourse;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}