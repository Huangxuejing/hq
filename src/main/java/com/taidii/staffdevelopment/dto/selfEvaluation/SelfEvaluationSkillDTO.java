package com.taidii.staffdevelopment.dto.selfEvaluation;

import java.io.Serializable;
import java.util.List;

/**
 * @description:老师自评能力类
 * @projectName:staff-development
 * @className:SelfEvaluationSkillDTO.java
 * @author:wentao
 * @createTime:2018年6月13日 上午11:24:44
 * @version 1.0.1
 */
public class SelfEvaluationSkillDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;											//
	private Integer dutyLevelSkillId;						//学校规定能力id
	private String name;										//能力名称
	private Integer depth;										//级别 1 = 2 =3
	private String guidingQuestion;						//指导方向
	private String evidence;									//能力描述
	private Integer raing;										//评分
	private String selfEvaluationPlanId;					//计划id
	private Integer targetScore;								//计划得分
	private Boolean haveHistory;							//是否含有历史
	private List<SelfEvaluationSkillDTO> child;		//子集
	
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
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public String getGuidingQuestion() {
		return guidingQuestion;
	}
	public void setGuidingQuestion(String guidingQuestion) {
		this.guidingQuestion = guidingQuestion;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public Integer getRaing() {
		return raing;
	}
	public void setRaing(Integer raing) {
		this.raing = raing;
	}
	public List<SelfEvaluationSkillDTO> getChild() {
		return child;
	}
	public void setChild(List<SelfEvaluationSkillDTO> child) {
		this.child = child;
	}
	public Integer getDutyLevelSkillId() {
		return dutyLevelSkillId;
	}
	public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
		this.dutyLevelSkillId = dutyLevelSkillId;
	}
	public String getSelfEvaluationPlanId() {
		return selfEvaluationPlanId;
	}
	public void setSelfEvaluationPlanId(String selfEvaluationPlanId) {
		this.selfEvaluationPlanId = selfEvaluationPlanId;
	}
	public Boolean getHaveHistory() {
		return haveHistory;
	}
	public void setHaveHistory(Boolean haveHistory) {
		this.haveHistory = haveHistory;
	}
	public Integer getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(Integer targetScore) {
		this.targetScore = targetScore;
	}
}
