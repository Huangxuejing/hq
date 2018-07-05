package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @description:保存自评成就或能力
 * @projectName:staff-development
 * @className:SaveSelfAchievementsDTO.java
 * @author:wentao
 * @createTime:2018年6月14日 上午11:25:57
 * @version 1.0.1
 */
public class SaveSelfAchievementsDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;							//成就id
	@NotNull
	private Integer selfEvaluationId;		//自评id
	@Length(max=500)
	private String strengthsOrAchievements;	//成就
	@Length(max=500)
	private String evidence;					//描述
	@Length(max=100)
	private String time;							//时间
	
	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}
	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
