package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentStudentklassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentStudentklassExample() {
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

        public Criteria andStudentklassscheduleIdIsNull() {
            addCriterion("studentklassschedule_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdIsNotNull() {
            addCriterion("studentklassschedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdEqualTo(Integer value) {
            addCriterion("studentklassschedule_id =", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdNotEqualTo(Integer value) {
            addCriterion("studentklassschedule_id <>", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdGreaterThan(Integer value) {
            addCriterion("studentklassschedule_id >", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentklassschedule_id >=", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdLessThan(Integer value) {
            addCriterion("studentklassschedule_id <", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("studentklassschedule_id <=", value, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdIn(List<Integer> values) {
            addCriterion("studentklassschedule_id in", values, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdNotIn(List<Integer> values) {
            addCriterion("studentklassschedule_id not in", values, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("studentklassschedule_id between", value1, value2, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andStudentklassscheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("studentklassschedule_id not between", value1, value2, "studentklassscheduleId");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeIsNull() {
            addCriterion("reschedule_type is null");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeIsNotNull() {
            addCriterion("reschedule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeEqualTo(Integer value) {
            addCriterion("reschedule_type =", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeNotEqualTo(Integer value) {
            addCriterion("reschedule_type <>", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeGreaterThan(Integer value) {
            addCriterion("reschedule_type >", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reschedule_type >=", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeLessThan(Integer value) {
            addCriterion("reschedule_type <", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("reschedule_type <=", value, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeIn(List<Integer> values) {
            addCriterion("reschedule_type in", values, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeNotIn(List<Integer> values) {
            addCriterion("reschedule_type not in", values, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_type between", value1, value2, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andRescheduleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_type not between", value1, value2, "rescheduleType");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdIsNull() {
            addCriterion("student_klass_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdIsNotNull() {
            addCriterion("student_klass_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdEqualTo(Integer value) {
            addCriterion("student_klass_id =", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdNotEqualTo(Integer value) {
            addCriterion("student_klass_id <>", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdGreaterThan(Integer value) {
            addCriterion("student_klass_id >", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_klass_id >=", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdLessThan(Integer value) {
            addCriterion("student_klass_id <", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_klass_id <=", value, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdIn(List<Integer> values) {
            addCriterion("student_klass_id in", values, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdNotIn(List<Integer> values) {
            addCriterion("student_klass_id not in", values, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdBetween(Integer value1, Integer value2) {
            addCriterion("student_klass_id between", value1, value2, "studentKlassId");
            return (Criteria) this;
        }

        public Criteria andStudentKlassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_klass_id not between", value1, value2, "studentKlassId");
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

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("is_paid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Boolean value) {
            addCriterion("is_paid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Boolean value) {
            addCriterion("is_paid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Boolean value) {
            addCriterion("is_paid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_paid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Boolean value) {
            addCriterion("is_paid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_paid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Boolean> values) {
            addCriterion("is_paid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Boolean> values) {
            addCriterion("is_paid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_paid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_paid not between", value1, value2, "isPaid");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdIsNull() {
            addCriterion("reschedule_from_id is null");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdIsNotNull() {
            addCriterion("reschedule_from_id is not null");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdEqualTo(Integer value) {
            addCriterion("reschedule_from_id =", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdNotEqualTo(Integer value) {
            addCriterion("reschedule_from_id <>", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdGreaterThan(Integer value) {
            addCriterion("reschedule_from_id >", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reschedule_from_id >=", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdLessThan(Integer value) {
            addCriterion("reschedule_from_id <", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdLessThanOrEqualTo(Integer value) {
            addCriterion("reschedule_from_id <=", value, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdIn(List<Integer> values) {
            addCriterion("reschedule_from_id in", values, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdNotIn(List<Integer> values) {
            addCriterion("reschedule_from_id not in", values, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_from_id between", value1, value2, "rescheduleFromId");
            return (Criteria) this;
        }

        public Criteria andRescheduleFromIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_from_id not between", value1, value2, "rescheduleFromId");
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