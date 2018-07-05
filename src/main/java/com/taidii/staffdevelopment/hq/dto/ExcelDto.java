package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;

public class ExcelDto implements Serializable{
	private static final long serialVersionUID = 843404005596822801L;
	
	private String level;
	private String className;
	/**
	 * 付款方式   type:0 按期   1 按课时  2 按学期  3 按月 
	 */
	private String type;
	private String date;
	/**
	 * 0,1,2,3,4,5,6  对应星期一----星期日
	 */
	private Integer repeat;
	private String startTime;
	private String endTime;
	private String classRoom;
	
	public Integer getRepeat() {
		return repeat;
	}
	public void setRepeat(Integer repeat) {
		this.repeat = repeat;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
}
