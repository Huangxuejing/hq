package com.taidii.staffdevelopment.entity;

/**
 * @description:自评能力表
 * @projectName:staff-development
 * @className:DevelopSelfEvaluationSkill.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:21:56
 * @version 1.0.1
 */
public class DevelopSelfEvaluationSkill extends BaseEntity{

	private static final long serialVersionUID = 1L;
	private Integer selfEvaluationId;
    private Integer dutyLevelSkillId;
    private String evidence;
    private Integer score;
    

    public Integer getSelfEvaluationId() {
        return selfEvaluationId;
    }

    public void setSelfEvaluationId(Integer selfEvaluationId) {
        this.selfEvaluationId = selfEvaluationId;
    }

    public Integer getDutyLevelSkillId() {
        return dutyLevelSkillId;
    }

    public void setDutyLevelSkillId(Integer dutyLevelSkillId) {
        this.dutyLevelSkillId = dutyLevelSkillId;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}