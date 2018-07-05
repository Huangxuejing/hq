package com.taidii.staffdevelopment.entity;

/**
 * @description:自评成就表
 * @projectName:staff-development
 * @className:DevelopSelfEvaluationReflection.java
 * @author:wentao
 * @createTime:2018年6月12日 下午4:21:00
 * @version 1.0.1
 */
public class DevelopSelfEvaluationReflection extends BaseEntity{

	private static final long serialVersionUID = 1L;
	private Integer selfEvaluationId;
    private String strengthsOrAchievements;
    private String evidence;
    private String time;

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
        this.strengthsOrAchievements = strengthsOrAchievements == null ? null : strengthsOrAchievements.trim();
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}