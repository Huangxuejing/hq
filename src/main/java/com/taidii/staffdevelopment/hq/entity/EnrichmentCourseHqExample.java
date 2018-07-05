package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnrichmentCourseHqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentCourseHqExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andHqIdIsNull() {
            addCriterion("hq_id is null");
            return (Criteria) this;
        }

        public Criteria andHqIdIsNotNull() {
            addCriterion("hq_id is not null");
            return (Criteria) this;
        }

        public Criteria andHqIdEqualTo(Integer value) {
            addCriterion("hq_id =", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdNotEqualTo(Integer value) {
            addCriterion("hq_id <>", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdGreaterThan(Integer value) {
            addCriterion("hq_id >", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hq_id >=", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdLessThan(Integer value) {
            addCriterion("hq_id <", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdLessThanOrEqualTo(Integer value) {
            addCriterion("hq_id <=", value, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdIn(List<Integer> values) {
            addCriterion("hq_id in", values, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdNotIn(List<Integer> values) {
            addCriterion("hq_id not in", values, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdBetween(Integer value1, Integer value2) {
            addCriterion("hq_id between", value1, value2, "hqId");
            return (Criteria) this;
        }

        public Criteria andHqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hq_id not between", value1, value2, "hqId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNull() {
            addCriterion("center_id is null");
            return (Criteria) this;
        }

        public Criteria andCenterIdIsNotNull() {
            addCriterion("center_id is not null");
            return (Criteria) this;
        }

        public Criteria andCenterIdEqualTo(Integer value) {
            addCriterion("center_id =", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotEqualTo(Integer value) {
            addCriterion("center_id <>", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThan(Integer value) {
            addCriterion("center_id >", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("center_id >=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThan(Integer value) {
            addCriterion("center_id <", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("center_id <=", value, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdIn(List<Integer> values) {
            addCriterion("center_id in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotIn(List<Integer> values) {
            addCriterion("center_id not in", values, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdBetween(Integer value1, Integer value2) {
            addCriterion("center_id between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("center_id not between", value1, value2, "centerId");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNull() {
            addCriterion("center_name is null");
            return (Criteria) this;
        }

        public Criteria andCenterNameIsNotNull() {
            addCriterion("center_name is not null");
            return (Criteria) this;
        }

        public Criteria andCenterNameEqualTo(String value) {
            addCriterion("center_name =", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotEqualTo(String value) {
            addCriterion("center_name <>", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThan(String value) {
            addCriterion("center_name >", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("center_name >=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThan(String value) {
            addCriterion("center_name <", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLessThanOrEqualTo(String value) {
            addCriterion("center_name <=", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameLike(String value) {
            addCriterion("center_name like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotLike(String value) {
            addCriterion("center_name not like", value, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameIn(List<String> values) {
            addCriterion("center_name in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotIn(List<String> values) {
            addCriterion("center_name not in", values, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameBetween(String value1, String value2) {
            addCriterion("center_name between", value1, value2, "centerName");
            return (Criteria) this;
        }

        public Criteria andCenterNameNotBetween(String value1, String value2) {
            addCriterion("center_name not between", value1, value2, "centerName");
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