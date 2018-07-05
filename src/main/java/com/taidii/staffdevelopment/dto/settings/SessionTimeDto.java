package com.taidii.staffdevelopment.dto.settings;

import java.util.Date;

public class SessionTimeDto {

    private Integer id;
    private Integer term;
    private Boolean slag;
    private Boolean elag;
    private Boolean tlag;
    private String startTime;
    private String endTime;
    private String teacherEndTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTerm() {
        return term;
    }

    public Boolean getSlag() {
        return slag;
    }

    public void setSlag(Boolean slag) {
        this.slag = slag;
    }

    public Boolean getElag() {
        return elag;
    }

    public void setElag(Boolean elag) {
        this.elag = elag;
    }

    public Boolean getTlag() {
        return tlag;
    }

    public void setTlag(Boolean tlag) {
        this.tlag = tlag;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTeacherEndTime() {
        return teacherEndTime;
    }

    public void setTeacherEndTime(String teacherEndTime) {
        this.teacherEndTime = teacherEndTime;
    }
}
