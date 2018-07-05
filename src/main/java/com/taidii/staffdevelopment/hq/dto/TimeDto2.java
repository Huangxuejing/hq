package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.List;

public class TimeDto2 implements Serializable{
	private static final long serialVersionUID = 1396641465754475261L;
	
	private String dateFrom;
	private String dateTo;
	private List<TimeDto> time;
	
	@Override
	public String toString() {
		return "TimeDto2 [dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", time=" + time + "]";
	}
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public List<TimeDto> getTime() {
		return time;
	}
	public void setTime(List<TimeDto> time) {
		this.time = time;
	}
	
	
}
