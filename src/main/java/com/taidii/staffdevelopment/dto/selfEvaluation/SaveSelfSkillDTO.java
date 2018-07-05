package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @description:保存能力描述或评论DTO
 * @projectName:staff-development
 * @className:SaveSkillEvidenceDTO.java
 * @author:wentao
 * @createTime:2018年6月14日 上午8:49:55
 * @version 1.0.1
 */
public class SaveSelfSkillDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer selfEvaluationId;		//自评id
	@NotNull
	private Integer dutyLevelSkillId;		//学校规定职业能力id
	private Integer selfSkillId;				//用户职业能力id
	@Length(max=500)
	private String evidence;					//能力描述
	
	private Integer score;						//评分
	
	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}
	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public Integer getDutyLevelSkillId() {
		return dutyLevelSkillId;
	}
	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}
	public Integer getSelfSkillId() {
		return selfSkillId;
	}
	public void setSelfSkillId(Integer selfSkillId) {
		this.selfSkillId = selfSkillId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}
