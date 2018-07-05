package com.taidii.staffdevelopment.entity;

import java.util.Date;

public class DevelopSelfEvaluationPlan  extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Integer selfEvaluationId;
    private Integer dutyLevelSkillId;
    private String areaOfImprovement;
    private String actionPlan;
    private String targetCompleteDate;
    private String courseId;
    private Integer status;
    private String evidence;
    private Date lastRating;
    private Date reviewData;
    private Date markCompleteDate;
    private Integer targetScore;
    private String moreReviewDate;


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

    public String getAreaOfImprovement() {
        return areaOfImprovement;
    }

    public void setAreaOfImprovement(String areaOfImprovement) {
        this.areaOfImprovement = areaOfImprovement == null ? null : areaOfImprovement.trim();
    }

    public String getActionPlan() {
        return actionPlan;
    }

    public void setActionPlan(String actionPlan) {
        this.actionPlan = actionPlan == null ? null : actionPlan.trim();
    }

    public String getTargetCompleteDate() {
        return targetCompleteDate;
    }

    public void setTargetCompleteDate(String targetCompleteDate) {
        this.targetCompleteDate = targetCompleteDate == null ? null : targetCompleteDate.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public Date getLastRating() {
        return lastRating;
    }

    public void setLastRating(Date lastRating) {
        this.lastRating = lastRating;
    }

    public Date getReviewData() {
        return reviewData;
    }

    public void setReviewData(Date reviewData) {
        this.reviewData = reviewData;
    }

    public Date getMarkCompleteDate() {
        return markCompleteDate;
    }

    public void setMarkCompleteDate(Date markCompleteDate) {
        this.markCompleteDate = markCompleteDate;
    }

    public Integer getTargetScore() {
        return targetScore;
    }

    public void setTargetScore(Integer targetScore) {
        this.targetScore = targetScore;
    }

    public String getMoreReviewDate() {
        return moreReviewDate;
    }

    public void setMoreReviewDate(String moreReviewDate) {
        this.moreReviewDate = moreReviewDate == null ? null : moreReviewDate.trim();
    }
}