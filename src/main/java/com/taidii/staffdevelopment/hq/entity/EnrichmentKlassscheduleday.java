package com.taidii.staffdevelopment.hq.entity;

import java.util.Date;

public class EnrichmentKlassscheduleday {
    private Integer id;

    private Date date;

    private Integer klassscheduleId;

    private Integer teacherId;

    private Integer assistantId;

    private Integer roomId;

    private Boolean verified;

    private Date verifyTime;

    private Integer verifiedById;

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

    public Integer getKlassscheduleId() {
        return klassscheduleId;
    }

    public void setKlassscheduleId(Integer klassscheduleId) {
        this.klassscheduleId = klassscheduleId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(Integer assistantId) {
        this.assistantId = assistantId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getVerifiedById() {
        return verifiedById;
    }

    public void setVerifiedById(Integer verifiedById) {
        this.verifiedById = verifiedById;
    }
}