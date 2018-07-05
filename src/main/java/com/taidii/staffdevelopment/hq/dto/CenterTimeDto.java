package com.taidii.staffdevelopment.hq.dto;

import java.io.Serializable;
import java.util.List;

public class CenterTimeDto implements Serializable{

	private static final long serialVersionUID = -1969061273456765512L;
	/**
	 * centerId
	 */
	private Integer id;
	/**
	 * center名称
	 */
	private String name;
	
	private List<TimeDto> time;
	
	public CenterTimeDto() {
	}

	public CenterTimeDto(Integer id, String name, List<TimeDto> time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TimeDto> getTime() {
		return time;
	}

	public void setTime(List<TimeDto> time) {
		this.time = time;
	}
}
