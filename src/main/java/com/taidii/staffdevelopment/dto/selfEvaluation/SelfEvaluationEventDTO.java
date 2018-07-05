package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @description:自评成就
 * @projectName:staff-development
 * @className:SelfEvaluationEventDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午11:31:19
 * @version 1.0.1
 */
public class SelfEvaluationEventDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;										//
	private String strengthsOrAchievements;	//特长或成就
	private String evidence;								//描述
	private String date;										//成就时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStrengthsOrAchievements() {
		return strengthsOrAchievements;
	}
	public void setStrengthsOrAchievements(String strengthsOrAchievements) {
		this.strengthsOrAchievements = strengthsOrAchievements;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
