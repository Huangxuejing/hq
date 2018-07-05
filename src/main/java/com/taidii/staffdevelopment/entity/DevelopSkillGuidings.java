package com.taidii.staffdevelopment.entity;

public class DevelopSkillGuidings extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private Integer skillId;            //职业能力id
    private Integer dutyLevelId;        //职业等级id
    private String guidingQuestions;    //指导方向

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getDutyLevelId() {
        return dutyLevelId;
    }

    public void setDutyLevelId(Integer dutyLevelId) {
        this.dutyLevelId = dutyLevelId;
    }

    public String getGuidingQuestions() {
        return guidingQuestions;
    }

    public void setGuidingQuestions(String guidingQuestions) {
        this.guidingQuestions = guidingQuestions == null ? null : guidingQuestions.trim();
    }
}