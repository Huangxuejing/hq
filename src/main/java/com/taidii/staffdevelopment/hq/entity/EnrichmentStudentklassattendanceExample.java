package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentStudentklassattendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentStudentklassattendanceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdIsNull() {
            addCriterion("studentklass_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdIsNotNull() {
            addCriterion("studentklass_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdEqualTo(Integer value) {
            addCriterion("studentklass_id =", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdNotEqualTo(Integer value) {
            addCriterion("studentklass_id <>", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdGreaterThan(Integer value) {
            addCriterion("studentklass_id >", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentklass_id >=", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdLessThan(Integer value) {
            addCriterion("studentklass_id <", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdLessThanOrEqualTo(Integer value) {
            addCriterion("studentklass_id <=", value, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdIn(List<Integer> values) {
            addCriterion("studentklass_id in", values, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdNotIn(List<Integer> values) {
            addCriterion("studentklass_id not in", values, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdBetween(Integer value1, Integer value2) {
            addCriterion("studentklass_id between", value1, value2, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andStudentklassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studentklass_id not between", value1, value2, "studentklassId");
            return (Criteria) this;
        }

        public Criteria andSignInIsNull() {
            addCriterion("sign_in is null");
            return (Criteria) this;
        }

        public Criteria andSignInIsNotNull() {
            addCriterion("sign_in is not null");
            return (Criteria) this;
        }

        public Criteria andSignInEqualTo(Integer value) {
            addCriterion("sign_in =", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInNotEqualTo(Integer value) {
            addCriterion("sign_in <>", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInGreaterThan(Integer value) {
            addCriterion("sign_in >", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in >=", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInLessThan(Integer value) {
            addCriterion("sign_in <", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInLessThanOrEqualTo(Integer value) {
            addCriterion("sign_in <=", value, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInIn(List<Integer> values) {
            addCriterion("sign_in in", values, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInNotIn(List<Integer> values) {
            addCriterion("sign_in not in", values, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInBetween(Integer value1, Integer value2) {
            addCriterion("sign_in between", value1, value2, "signIn");
            return (Criteria) this;
        }

        public Criteria andSignInNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in not between", value1, value2, "signIn");
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

        public Criteria andRecordedOnIsNull() {
            addCriterion("recorded_on is null");
            return (Criteria) this;
        }

        public Criteria andRecordedOnIsNotNull() {
            addCriterion("recorded_on is not null");
            return (Criteria) this;
        }

        public Criteria andRecordedOnEqualTo(Date value) {
            addCriterionForJDBCTime("recorded_on =", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnNotEqualTo(Date value) {
            addCriterionForJDBCTime("recorded_on <>", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnGreaterThan(Date value) {
            addCriterionForJDBCTime("recorded_on >", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("recorded_on >=", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnLessThan(Date value) {
            addCriterionForJDBCTime("recorded_on <", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("recorded_on <=", value, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnIn(List<Date> values) {
            addCriterionForJDBCTime("recorded_on in", values, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnNotIn(List<Date> values) {
            addCriterionForJDBCTime("recorded_on not in", values, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("recorded_on between", value1, value2, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andRecordedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("recorded_on not between", value1, value2, "recordedOn");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(BigDecimal value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(BigDecimal value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(BigDecimal value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<BigDecimal> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPickUpIdIsNull() {
            addCriterion("pick_up_id is null");
            return (Criteria) this;
        }

        public Criteria andPickUpIdIsNotNull() {
            addCriterion("pick_up_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickUpIdEqualTo(Integer value) {
            addCriterion("pick_up_id =", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdNotEqualTo(Integer value) {
            addCriterion("pick_up_id <>", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdGreaterThan(Integer value) {
            addCriterion("pick_up_id >", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pick_up_id >=", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdLessThan(Integer value) {
            addCriterion("pick_up_id <", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("pick_up_id <=", value, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdIn(List<Integer> values) {
            addCriterion("pick_up_id in", values, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdNotIn(List<Integer> values) {
            addCriterion("pick_up_id not in", values, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdBetween(Integer value1, Integer value2) {
            addCriterion("pick_up_id between", value1, value2, "pickUpId");
            return (Criteria) this;
        }

        public Criteria andPickUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pick_up_id not between", value1, value2, "pickUpId");
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