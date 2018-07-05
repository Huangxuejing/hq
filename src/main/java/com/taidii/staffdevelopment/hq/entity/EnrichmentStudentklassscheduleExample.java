package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentStudentklassscheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentStudentklassscheduleExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andNumberOfClassIsNull() {
            addCriterion("number_of_class is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassIsNotNull() {
            addCriterion("number_of_class is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassEqualTo(Integer value) {
            addCriterion("number_of_class =", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassNotEqualTo(Integer value) {
            addCriterion("number_of_class <>", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassGreaterThan(Integer value) {
            addCriterion("number_of_class >", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_class >=", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassLessThan(Integer value) {
            addCriterion("number_of_class <", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_class <=", value, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassIn(List<Integer> values) {
            addCriterion("number_of_class in", values, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassNotIn(List<Integer> values) {
            addCriterion("number_of_class not in", values, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassBetween(Integer value1, Integer value2) {
            addCriterion("number_of_class between", value1, value2, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andNumberOfClassNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_class not between", value1, value2, "numberOfClass");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleIsNull() {
            addCriterion("is_reschedule is null");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleIsNotNull() {
            addCriterion("is_reschedule is not null");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleEqualTo(Boolean value) {
            addCriterion("is_reschedule =", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleNotEqualTo(Boolean value) {
            addCriterion("is_reschedule <>", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleGreaterThan(Boolean value) {
            addCriterion("is_reschedule >", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_reschedule >=", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleLessThan(Boolean value) {
            addCriterion("is_reschedule <", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleLessThanOrEqualTo(Boolean value) {
            addCriterion("is_reschedule <=", value, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleIn(List<Boolean> values) {
            addCriterion("is_reschedule in", values, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleNotIn(List<Boolean> values) {
            addCriterion("is_reschedule not in", values, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reschedule between", value1, value2, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andIsRescheduleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_reschedule not between", value1, value2, "isReschedule");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassIsNull() {
            addCriterion("auto_create_class is null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassIsNotNull() {
            addCriterion("auto_create_class is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassEqualTo(Boolean value) {
            addCriterion("auto_create_class =", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassNotEqualTo(Boolean value) {
            addCriterion("auto_create_class <>", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassGreaterThan(Boolean value) {
            addCriterion("auto_create_class >", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_create_class >=", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassLessThan(Boolean value) {
            addCriterion("auto_create_class <", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_create_class <=", value, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassIn(List<Boolean> values) {
            addCriterion("auto_create_class in", values, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassNotIn(List<Boolean> values) {
            addCriterion("auto_create_class not in", values, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_create_class between", value1, value2, "autoCreateClass");
            return (Criteria) this;
        }

        public Criteria andAutoCreateClassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_create_class not between", value1, value2, "autoCreateClass");
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

        public Criteria andEnrollDateIsNull() {
            addCriterion("enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNotNull() {
            addCriterion("enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateEqualTo(Date value) {
            addCriterionForJDBCDate("enroll_date =", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enroll_date <>", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThan(Date value) {
            addCriterionForJDBCDate("enroll_date >", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enroll_date >=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThan(Date value) {
            addCriterionForJDBCDate("enroll_date <", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enroll_date <=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIn(List<Date> values) {
            addCriterionForJDBCDate("enroll_date in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enroll_date not in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enroll_date between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enroll_date not between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andIsTryClassIsNull() {
            addCriterion("is_try_class is null");
            return (Criteria) this;
        }

        public Criteria andIsTryClassIsNotNull() {
            addCriterion("is_try_class is not null");
            return (Criteria) this;
        }

        public Criteria andIsTryClassEqualTo(Boolean value) {
            addCriterion("is_try_class =", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassNotEqualTo(Boolean value) {
            addCriterion("is_try_class <>", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassGreaterThan(Boolean value) {
            addCriterion("is_try_class >", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_try_class >=", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassLessThan(Boolean value) {
            addCriterion("is_try_class <", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassLessThanOrEqualTo(Boolean value) {
            addCriterion("is_try_class <=", value, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassIn(List<Boolean> values) {
            addCriterion("is_try_class in", values, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassNotIn(List<Boolean> values) {
            addCriterion("is_try_class not in", values, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassBetween(Boolean value1, Boolean value2) {
            addCriterion("is_try_class between", value1, value2, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsTryClassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_try_class not between", value1, value2, "isTryClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassIsNull() {
            addCriterion("is_free_class is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassIsNotNull() {
            addCriterion("is_free_class is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassEqualTo(Boolean value) {
            addCriterion("is_free_class =", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassNotEqualTo(Boolean value) {
            addCriterion("is_free_class <>", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassGreaterThan(Boolean value) {
            addCriterion("is_free_class >", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_free_class >=", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassLessThan(Boolean value) {
            addCriterion("is_free_class <", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassLessThanOrEqualTo(Boolean value) {
            addCriterion("is_free_class <=", value, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassIn(List<Boolean> values) {
            addCriterion("is_free_class in", values, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassNotIn(List<Boolean> values) {
            addCriterion("is_free_class not in", values, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free_class between", value1, value2, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andIsFreeClassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free_class not between", value1, value2, "isFreeClass");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("invoice_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("invoice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(Integer value) {
            addCriterion("invoice_id =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(Integer value) {
            addCriterion("invoice_id <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(Integer value) {
            addCriterion("invoice_id >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_id >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(Integer value) {
            addCriterion("invoice_id <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_id <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<Integer> values) {
            addCriterion("invoice_id in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<Integer> values) {
            addCriterion("invoice_id not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_id not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdIsNull() {
            addCriterion("invoice_item_id is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdIsNotNull() {
            addCriterion("invoice_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdEqualTo(Integer value) {
            addCriterion("invoice_item_id =", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdNotEqualTo(Integer value) {
            addCriterion("invoice_item_id <>", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdGreaterThan(Integer value) {
            addCriterion("invoice_item_id >", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_item_id >=", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdLessThan(Integer value) {
            addCriterion("invoice_item_id <", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_item_id <=", value, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdIn(List<Integer> values) {
            addCriterion("invoice_item_id in", values, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdNotIn(List<Integer> values) {
            addCriterion("invoice_item_id not in", values, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdBetween(Integer value1, Integer value2) {
            addCriterion("invoice_item_id between", value1, value2, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_item_id not between", value1, value2, "invoiceItemId");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIsNull() {
            addCriterion("auto_generated is null");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIsNotNull() {
            addCriterion("auto_generated is not null");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedEqualTo(Integer value) {
            addCriterion("auto_generated =", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotEqualTo(Integer value) {
            addCriterion("auto_generated <>", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedGreaterThan(Integer value) {
            addCriterion("auto_generated >", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_generated >=", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedLessThan(Integer value) {
            addCriterion("auto_generated <", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedLessThanOrEqualTo(Integer value) {
            addCriterion("auto_generated <=", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIn(List<Integer> values) {
            addCriterion("auto_generated in", values, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotIn(List<Integer> values) {
            addCriterion("auto_generated not in", values, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedBetween(Integer value1, Integer value2) {
            addCriterion("auto_generated between", value1, value2, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_generated not between", value1, value2, "autoGenerated");
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