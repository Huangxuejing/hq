package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class TargetScoreDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	@NotNull
	private Integer dutyLevelSkillId;
	private Integer targetScore;
	
	public Integer getDutyLevelSkillId() {
		return dutyLevelSkillId;
	}
	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}
	public Integer getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(Integer targetScore) {
		this.targetScore = targetScore;
	}
}
