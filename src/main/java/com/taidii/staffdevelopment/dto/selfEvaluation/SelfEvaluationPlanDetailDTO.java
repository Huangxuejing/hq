package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;

/**
 * @description:自评计划中间dto
 * @projectName:staff-development
 * @className:SelfEvaluationPlanDetailDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 下午3:54:49
 * @version 1.0.1
 */
public class SelfEvaluationPlanDetailDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer parentId;					//自评计划二级能力id
	private String parentName;				//自评计划二级能力name
	private Integer id;							//计划id
	private Integer dutyLevelSkillId;			//能力id
	private String name;						//计划名称
	private String actionPlan;				//计划
	private String targetCompleteDate;	//计划完成时间
	private String areaOfImprovement;
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
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

	public String getAreaOfImprovement() {
		return areaOfImprovement;
	}

	public void setAreaOfImprovement(String areaOfImprovement) {
		this.areaOfImprovement = areaOfImprovement;
	}

	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}
}
