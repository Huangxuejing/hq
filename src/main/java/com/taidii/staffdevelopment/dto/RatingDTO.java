package com.taidii.staffdevelopment.dto;

import java.io.Serializable;

/**
 * @description:评分DTO
 * @projectName:staff-development
 * @className:RatingDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 下午4:54:37
 * @version 1.0.1
 */
public class RatingDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;			//
	private Integer score;		//对应分数
	private String name;		//对应级别名称
	private String rateKeys;	//对应级别要求
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRateKeys() {
		return rateKeys;
	}

	public void setRateKeys(String rateKeys) {
		this.rateKeys = rateKeys;
	}
}
