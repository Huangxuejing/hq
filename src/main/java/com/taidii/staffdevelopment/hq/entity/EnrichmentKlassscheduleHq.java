package com.taidii.staffdevelopment.hq.entity;

import java.util.Date;

public class EnrichmentKlassscheduleHq {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer centerId;

    private Integer hqId;

    private Integer klassscheduleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Integer getHqId() {
        return hqId;
    }

    public void setHqId(Integer hqId) {
        this.hqId = hqId;
    }

    public Integer getKlassscheduleId() {
        return klassscheduleId;
    }

    public void setKlassscheduleId(Integer klassscheduleId) {
        this.klassscheduleId = klassscheduleId;
    }
}