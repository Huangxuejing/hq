package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.sql.Time;

public class EnrichmentKlassscheduletimeDto implements Serializable{

	private static final long serialVersionUID = -2144920555842225955L;
	
	private Integer id;
	/**
	 * enrichment_klassschedule 主键ID
	 */
	private Integer klassscheduleId;
	private Integer reapeat;
	private Time startTime;
	private Time endTime;
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
	public Integer getReapeat() {
		return reapeat;
	}
	public void setReapeat(Integer reapeat) {
		this.reapeat = reapeat;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
}
