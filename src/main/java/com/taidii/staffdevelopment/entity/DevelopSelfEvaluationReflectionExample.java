package com.taidii.staffdevelopment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevelopSelfEvaluationReflectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevelopSelfEvaluationReflectionExample() {
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

        public Criteria andStrengthsOrAchievementsIsNull() {
            addCriterion("strengths_or_achievements is null");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsIsNotNull() {
            addCriterion("strengths_or_achievements is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsEqualTo(String value) {
            addCriterion("strengths_or_achievements =", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsNotEqualTo(String value) {
            addCriterion("strengths_or_achievements <>", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsGreaterThan(String value) {
            addCriterion("strengths_or_achievements >", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsGreaterThanOrEqualTo(String value) {
            addCriterion("strengths_or_achievements >=", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsLessThan(String value) {
            addCriterion("strengths_or_achievements <", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsLessThanOrEqualTo(String value) {
            addCriterion("strengths_or_achievements <=", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsLike(String value) {
            addCriterion("strengths_or_achievements like", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsNotLike(String value) {
            addCriterion("strengths_or_achievements not like", value, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsIn(List<String> values) {
            addCriterion("strengths_or_achievements in", values, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsNotIn(List<String> values) {
            addCriterion("strengths_or_achievements not in", values, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsBetween(String value1, String value2) {
            addCriterion("strengths_or_achievements between", value1, value2, "strengthsOrAchievements");
            return (Criteria) this;
        }

        public Criteria andStrengthsOrAchievementsNotBetween(String value1, String value2) {
            addCriterion("strengths_or_achievements not between", value1, value2, "strengthsOrAchievements");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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