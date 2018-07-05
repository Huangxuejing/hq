package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @description:自评计划列表DTO
 * @projectName:staff-development
 * @className:SelfEvaluationPlanDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午11:39:17
 * @version 1.0.1
 */
public class SelfEvaluationPlanDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;							//计划id
	private Integer dutyLevelSkillId;			//能力id
	private String name;						//计划名称
	private String actionPlan;					//计划
	private String targetCompleteDate;			//计划完成时间
	private Integer depth;						//深度
	private String areaOfImprovement;	//

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
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Integer getDutyLevelSkillId() {
		return dutyLevelSkillId;
	}

	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}

	public String getAreaOfImprovement() {
		return areaOfImprovement;
	}

	public void setAreaOfImprovement(String areaOfImprovement) {
		this.areaOfImprovement = areaOfImprovement;
	}
}
