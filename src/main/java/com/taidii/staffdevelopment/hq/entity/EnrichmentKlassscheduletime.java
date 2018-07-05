package com.taidii.staffdevelopment.hq.entity;

import java.util.Date;

public class EnrichmentKlassscheduletime {
    private Integer id;

    private Integer klassscheduleId;

    private Integer repeat;

    private Date startTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKlassscheduleId() {
        return klassscheduleId;
    }

    public void setKlassscheduleId(Integer klassscheduleId) {
        this.klassscheduleId = klassscheduleId;
    }
    
	public Integer getRepeat() {
		return repeat;
	}

	public void setRepeat(Integer repeat) {
		this.repeat = repeat;
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
}