package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class AddPlanDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer selfEvaluationId;
	@Valid
	private List<TargetScoreDTO> scoreList;
	
	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}
	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
	}
	public List<TargetScoreDTO> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<TargetScoreDTO> scoreList) {
		this.scoreList = scoreList;
	}
}
