package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.List;

public class EnrichmentStudentklassschedulelessoncountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentStudentklassschedulelessoncountExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNull() {
            addCriterion("child_id is null");
            return (Criteria) this;
        }

        public Criteria andChildIdIsNotNull() {
            addCriterion("child_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildIdEqualTo(Integer value) {
            addCriterion("child_id =", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotEqualTo(Integer value) {
            addCriterion("child_id <>", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThan(Integer value) {
            addCriterion("child_id >", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_id >=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThan(Integer value) {
            addCriterion("child_id <", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdLessThanOrEqualTo(Integer value) {
            addCriterion("child_id <=", value, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdIn(List<Integer> values) {
            addCriterion("child_id in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotIn(List<Integer> values) {
            addCriterion("child_id not in", values, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdBetween(Integer value1, Integer value2) {
            addCriterion("child_id between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andChildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("child_id not between", value1, value2, "childId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdIsNull() {
            addCriterion("klassschedule_id is null");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdIsNotNull() {
            addCriterion("klassschedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdEqualTo(Integer value) {
            addCriterion("klassschedule_id =", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdNotEqualTo(Integer value) {
            addCriterion("klassschedule_id <>", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdGreaterThan(Integer value) {
            addCriterion("klassschedule_id >", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("klassschedule_id >=", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdLessThan(Integer value) {
            addCriterion("klassschedule_id <", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("klassschedule_id <=", value, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdIn(List<Integer> values) {
            addCriterion("klassschedule_id in", values, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdNotIn(List<Integer> values) {
            addCriterion("klassschedule_id not in", values, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("klassschedule_id between", value1, value2, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andKlassscheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("klassschedule_id not between", value1, value2, "klassscheduleId");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIsNull() {
            addCriterion("total_lessons is null");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIsNotNull() {
            addCriterion("total_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsEqualTo(Integer value) {
            addCriterion("total_lessons =", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotEqualTo(Integer value) {
            addCriterion("total_lessons <>", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsGreaterThan(Integer value) {
            addCriterion("total_lessons >", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_lessons >=", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsLessThan(Integer value) {
            addCriterion("total_lessons <", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsLessThanOrEqualTo(Integer value) {
            addCriterion("total_lessons <=", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIn(List<Integer> values) {
            addCriterion("total_lessons in", values, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotIn(List<Integer> values) {
            addCriterion("total_lessons not in", values, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsBetween(Integer value1, Integer value2) {
            addCriterion("total_lessons between", value1, value2, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_lessons not between", value1, value2, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIsNull() {
            addCriterion("left_lessons is null");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIsNotNull() {
            addCriterion("left_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsEqualTo(Integer value) {
            addCriterion("left_lessons =", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotEqualTo(Integer value) {
            addCriterion("left_lessons <>", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsGreaterThan(Integer value) {
            addCriterion("left_lessons >", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_lessons >=", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsLessThan(Integer value) {
            addCriterion("left_lessons <", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsLessThanOrEqualTo(Integer value) {
            addCriterion("left_lessons <=", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIn(List<Integer> values) {
            addCriterion("left_lessons in", values, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotIn(List<Integer> values) {
            addCriterion("left_lessons not in", values, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsBetween(Integer value1, Integer value2) {
            addCriterion("left_lessons between", value1, value2, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotBetween(Integer value1, Integer value2) {
            addCriterion("left_lessons not between", value1, value2, "leftLessons");
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