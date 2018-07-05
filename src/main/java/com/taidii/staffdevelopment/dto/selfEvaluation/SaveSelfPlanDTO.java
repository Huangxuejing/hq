package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @description:新增计划DTO
 * @projectName:staff-development
 * @className:SaveSelfPlanDTO.java
 * @author:wentao
 * @createTime:2018年6月14日 下午1:53:57
 * @version 1.0.1
 */
public class SaveSelfPlanDTO implements Serializable{

	private static final long serialVersionUID = 1L;
		
	private Integer id;
	@NotNull
	private Integer selfEvaluationId;				//自评id
	@NotNull
	private Integer dutyLevelSkillId;			//自评能力id
	@Length(max=500)
	private String actionPlan;						//计划
	@Length(max=100)
	private String targetCompleteDate;			//计划完成时间
	@Length(max=500)
	private String areaOfImprovement;			//计划
	
	public Integer getSelfEvaluationId() {
		return selfEvaluationId;
	}
	public void setSelfEvaluationId(Integer selfEvaluationId) {
		this.selfEvaluationId = selfEvaluationId;
	}
	public String getActionPlan() {
		return actionPlan;
	}
	public void setActionPlan(String actionPlan) {
		this.actionPlan = actionPlan;
	}
	public String getTargetCompleteDate() {
		return targetCompleteDate;
	}
	public void setTargetCompleteDate(String targetCompleteDate) {
		this.targetCompleteDate = targetCompleteDate;
	}
	public Integer getDutyLevelSkillId() {
		return dutyLevelSkillId;
	}
	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaOfImprovement() {
		return areaOfImprovement;
	}
	public void setAreaOfImprovement(String areaOfImprovement) {
		this.areaOfImprovement = areaOfImprovement;
	}
}
