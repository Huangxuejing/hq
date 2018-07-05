package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;

public class TimeDto implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 0,1,2,3,4,5,6分别表示星期一----星期日
	 */
	private Integer reapeat;
	/**
	 * 一天的开课时间
	 */
	private String starTime;
	/**
	 * 一天课程的结束时间
	 */
	private String endTime;

	public TimeDto() {
	}

	public TimeDto(Integer reapeat, String starTime, String endTime) {
		super();
		this.reapeat = reapeat;
		this.starTime = starTime;
		this.endTime = endTime;
	}

	public Integer getReapeat() {
		return reapeat;
	}

	public void setReapeat(Integer reapeat) {
		this.reapeat = reapeat;
	}

	public String getStarTime() {
		return starTime;
	}

	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}
