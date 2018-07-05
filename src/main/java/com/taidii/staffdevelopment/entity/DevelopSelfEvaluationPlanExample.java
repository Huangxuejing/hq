package com.taidii.staffdevelopment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevelopSelfEvaluationPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevelopSelfEvaluationPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNull() {
            addCriterion("gmt_modify is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIsNotNull() {
            addCriterion("gmt_modify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifyEqualTo(Date value) {
            addCriterion("gmt_modify =", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotEqualTo(Date value) {
            addCriterion("gmt_modify <>", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThan(Date value) {
            addCriterion("gmt_modify >", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modify >=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThan(Date value) {
            addCriterion("gmt_modify <", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modify <=", value, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyIn(List<Date> values) {
            addCriterion("gmt_modify in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotIn(List<Date> values) {
            addCriterion("gmt_modify not in", values, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyBetween(Date value1, Date value2) {
            addCriterion("gmt_modify between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andGmtModifyNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modify not between", value1, value2, "gmtModify");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdIsNull() {
            addCriterion("self_evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdIsNotNull() {
            addCriterion("self_evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdEqualTo(Integer value) {
            addCriterion("self_evaluation_id =", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdNotEqualTo(Integer value) {
            addCriterion("self_evaluation_id <>", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdGreaterThan(Integer value) {
            addCriterion("self_evaluation_id >", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("self_evaluation_id >=", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdLessThan(Integer value) {
            addCriterion("self_evaluation_id <", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("self_evaluation_id <=", value, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdIn(List<Integer> values) {
            addCriterion("self_evaluation_id in", values, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdNotIn(List<Integer> values) {
            addCriterion("self_evaluation_id not in", values, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("self_evaluation_id between", value1, value2, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("self_evaluation_id not between", value1, value2, "selfEvaluationId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdIsNull() {
            addCriterion("duty_level_skill_id is null");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdIsNotNull() {
            addCriterion("duty_level_skill_id is not null");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdEqualTo(Integer value) {
            addCriterion("duty_level_skill_id =", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdNotEqualTo(Integer value) {
            addCriterion("duty_level_skill_id <>", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdGreaterThan(Integer value) {
            addCriterion("duty_level_skill_id >", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("duty_level_skill_id >=", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdLessThan(Integer value) {
            addCriterion("duty_level_skill_id <", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdLessThanOrEqualTo(Integer value) {
            addCriterion("duty_level_skill_id <=", value, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdIn(List<Integer> values) {
            addCriterion("duty_level_skill_id in", values, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdNotIn(List<Integer> values) {
            addCriterion("duty_level_skill_id not in", values, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdBetween(Integer value1, Integer value2) {
            addCriterion("duty_level_skill_id between", value1, value2, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andDutyLevelSkillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("duty_level_skill_id not between", value1, value2, "dutyLevelSkillId");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementIsNull() {
            addCriterion("area_of_improvement is null");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementIsNotNull() {
            addCriterion("area_of_improvement is not null");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementEqualTo(String value) {
            addCriterion("area_of_improvement =", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementNotEqualTo(String value) {
            addCriterion("area_of_improvement <>", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementGreaterThan(String value) {
            addCriterion("area_of_improvement >", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementGreaterThanOrEqualTo(String value) {
            addCriterion("area_of_improvement >=", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementLessThan(String value) {
            addCriterion("area_of_improvement <", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementLessThanOrEqualTo(String value) {
            addCriterion("area_of_improvement <=", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementLike(String value) {
            addCriterion("area_of_improvement like", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementNotLike(String value) {
            addCriterion("area_of_improvement not like", value, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementIn(List<String> values) {
            addCriterion("area_of_improvement in", values, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementNotIn(List<String> values) {
            addCriterion("area_of_improvement not in", values, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementBetween(String value1, String value2) {
            addCriterion("area_of_improvement between", value1, value2, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andAreaOfImprovementNotBetween(String value1, String value2) {
            addCriterion("area_of_improvement not between", value1, value2, "areaOfImprovement");
            return (Criteria) this;
        }

        public Criteria andActionPlanIsNull() {
            addCriterion("action_plan is null");
            return (Criteria) this;
        }

        public Criteria andActionPlanIsNotNull() {
            addCriterion("action_plan is not null");
            return (Criteria) this;
        }

        public Criteria andActionPlanEqualTo(String value) {
            addCriterion("action_plan =", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanNotEqualTo(String value) {
            addCriterion("action_plan <>", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanGreaterThan(String value) {
            addCriterion("action_plan >", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanGreaterThanOrEqualTo(String value) {
            addCriterion("action_plan >=", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanLessThan(String value) {
            addCriterion("action_plan <", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanLessThanOrEqualTo(String value) {
            addCriterion("action_plan <=", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanLike(String value) {
            addCriterion("action_plan like", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanNotLike(String value) {
            addCriterion("action_plan not like", value, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanIn(List<String> values) {
            addCriterion("action_plan in", values, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanNotIn(List<String> values) {
            addCriterion("action_plan not in", values, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanBetween(String value1, String value2) {
            addCriterion("action_plan between", value1, value2, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andActionPlanNotBetween(String value1, String value2) {
            addCriterion("action_plan not between", value1, value2, "actionPlan");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateIsNull() {
            addCriterion("target_complete_date is null");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateIsNotNull() {
            addCriterion("target_complete_date is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateEqualTo(String value) {
            addCriterion("target_complete_date =", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateNotEqualTo(String value) {
            addCriterion("target_complete_date <>", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateGreaterThan(String value) {
            addCriterion("target_complete_date >", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateGreaterThanOrEqualTo(String value) {
            addCriterion("target_complete_date >=", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateLessThan(String value) {
            addCriterion("target_complete_date <", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateLessThanOrEqualTo(String value) {
            addCriterion("target_complete_date <=", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateLike(String value) {
            addCriterion("target_complete_date like", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateNotLike(String value) {
            addCriterion("target_complete_date not like", value, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateIn(List<String> values) {
            addCriterion("target_complete_date in", values, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateNotIn(List<String> values) {
            addCriterion("target_complete_date not in", values, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateBetween(String value1, String value2) {
            addCriterion("target_complete_date between", value1, value2, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetCompleteDateNotBetween(String value1, String value2) {
            addCriterion("target_complete_date not between", value1, value2, "targetCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEvidenceIsNull() {
            addCriterion("evidence is null");
            return (Criteria) this;
        }

        public Criteria andEvidenceIsNotNull() {
            addCriterion("evidence is not null");
            return (Criteria) this;
        }

        public Criteria andEvidenceEqualTo(String value) {
            addCriterion("evidence =", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotEqualTo(String value) {
            addCriterion("evidence <>", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceGreaterThan(String value) {
            addCriterion("evidence >", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("evidence >=", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLessThan(String value) {
            addCriterion("evidence <", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLessThanOrEqualTo(String value) {
            addCriterion("evidence <=", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLike(String value) {
            addCriterion("evidence like", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotLike(String value) {
            addCriterion("evidence not like", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceIn(List<String> values) {
            addCriterion("evidence in", values, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotIn(List<String> values) {
            addCriterion("evidence not in", values, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceBetween(String value1, String value2) {
            addCriterion("evidence between", value1, value2, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotBetween(String value1, String value2) {
            addCriterion("evidence not between", value1, value2, "evidence");
            return (Criteria) this;
        }

        public Criteria andLastRatingIsNull() {
            addCriterion("last_rating is null");
            return (Criteria) this;
        }

        public Criteria andLastRatingIsNotNull() {
            addCriterion("last_rating is not null");
            return (Criteria) this;
        }

        public Criteria andLastRatingEqualTo(Date value) {
            addCriterion("last_rating =", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingNotEqualTo(Date value) {
            addCriterion("last_rating <>", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingGreaterThan(Date value) {
            addCriterion("last_rating >", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingGreaterThanOrEqualTo(Date value) {
            addCriterion("last_rating >=", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingLessThan(Date value) {
            addCriterion("last_rating <", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingLessThanOrEqualTo(Date value) {
            addCriterion("last_rating <=", value, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingIn(List<Date> values) {
            addCriterion("last_rating in", values, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingNotIn(List<Date> values) {
            addCriterion("last_rating not in", values, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingBetween(Date value1, Date value2) {
            addCriterion("last_rating between", value1, value2, "lastRating");
            return (Criteria) this;
        }

        public Criteria andLastRatingNotBetween(Date value1, Date value2) {
            addCriterion("last_rating not between", value1, value2, "lastRating");
            return (Criteria) this;
        }

        public Criteria andReviewDataIsNull() {
            addCriterion("review_data is null");
            return (Criteria) this;
        }

        public Criteria andReviewDataIsNotNull() {
            addCriterion("review_data is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDataEqualTo(Date value) {
            addCriterion("review_data =", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataNotEqualTo(Date value) {
            addCriterion("review_data <>", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataGreaterThan(Date value) {
            addCriterion("review_data >", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataGreaterThanOrEqualTo(Date value) {
            addCriterion("review_data >=", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataLessThan(Date value) {
            addCriterion("review_data <", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataLessThanOrEqualTo(Date value) {
            addCriterion("review_data <=", value, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataIn(List<Date> values) {
            addCriterion("review_data in", values, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataNotIn(List<Date> values) {
            addCriterion("review_data not in", values, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataBetween(Date value1, Date value2) {
            addCriterion("review_data between", value1, value2, "reviewData");
            return (Criteria) this;
        }

        public Criteria andReviewDataNotBetween(Date value1, Date value2) {
            addCriterion("review_data not between", value1, value2, "reviewData");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateIsNull() {
            addCriterion("mark_complete_date is null");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateIsNotNull() {
            addCriterion("mark_complete_date is not null");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateEqualTo(Date value) {
            addCriterion("mark_complete_date =", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateNotEqualTo(Date value) {
            addCriterion("mark_complete_date <>", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateGreaterThan(Date value) {
            addCriterion("mark_complete_date >", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mark_complete_date >=", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateLessThan(Date value) {
            addCriterion("mark_complete_date <", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateLessThanOrEqualTo(Date value) {
            addCriterion("mark_complete_date <=", value, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateIn(List<Date> values) {
            addCriterion("mark_complete_date in", values, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateNotIn(List<Date> values) {
            addCriterion("mark_complete_date not in", values, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateBetween(Date value1, Date value2) {
            addCriterion("mark_complete_date between", value1, value2, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andMarkCompleteDateNotBetween(Date value1, Date value2) {
            addCriterion("mark_complete_date not between", value1, value2, "markCompleteDate");
            return (Criteria) this;
        }

        public Criteria andTargetScoreIsNull() {
            addCriterion("target_score is null");
            return (Criteria) this;
        }

        public Criteria andTargetScoreIsNotNull() {
            addCriterion("target_score is not null");
            return (Criteria) this;
        }

        public Criteria andTargetScoreEqualTo(Integer value) {
            addCriterion("target_score =", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreNotEqualTo(Integer value) {
            addCriterion("target_score <>", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreGreaterThan(Integer value) {
            addCriterion("target_score >", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_score >=", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreLessThan(Integer value) {
            addCriterion("target_score <", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreLessThanOrEqualTo(Integer value) {
            addCriterion("target_score <=", value, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreIn(List<Integer> values) {
            addCriterion("target_score in", values, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreNotIn(List<Integer> values) {
            addCriterion("target_score not in", values, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreBetween(Integer value1, Integer value2) {
            addCriterion("target_score between", value1, value2, "targetScore");
            return (Criteria) this;
        }

        public Criteria andTargetScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("target_score not between", value1, value2, "targetScore");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateIsNull() {
            addCriterion("more_review_date is null");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateIsNotNull() {
            addCriterion("more_review_date is not null");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateEqualTo(String value) {
            addCriterion("more_review_date =", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateNotEqualTo(String value) {
            addCriterion("more_review_date <>", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateGreaterThan(String value) {
            addCriterion("more_review_date >", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateGreaterThanOrEqualTo(String value) {
            addCriterion("more_review_date >=", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateLessThan(String value) {
            addCriterion("more_review_date <", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateLessThanOrEqualTo(String value) {
            addCriterion("more_review_date <=", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateLike(String value) {
            addCriterion("more_review_date like", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateNotLike(String value) {
            addCriterion("more_review_date not like", value, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateIn(List<String> values) {
            addCriterion("more_review_date in", values, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateNotIn(List<String> values) {
            addCriterion("more_review_date not in", values, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateBetween(String value1, String value2) {
            addCriterion("more_review_date between", value1, value2, "moreReviewDate");
            return (Criteria) this;
        }

        public Criteria andMoreReviewDateNotBetween(String value1, String value2) {
            addCriterion("more_review_date not between", value1, value2, "moreReviewDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}