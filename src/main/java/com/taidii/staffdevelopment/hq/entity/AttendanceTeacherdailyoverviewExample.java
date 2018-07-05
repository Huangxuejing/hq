package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceTeacherdailyoverviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceTeacherdailyoverviewExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andOverviewDateIsNull() {
            addCriterion("overview_date is null");
            return (Criteria) this;
        }

        public Criteria andOverviewDateIsNotNull() {
            addCriterion("overview_date is not null");
            return (Criteria) this;
        }

        public Criteria andOverviewDateEqualTo(Date value) {
            addCriterionForJDBCDate("overview_date =", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("overview_date <>", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateGreaterThan(Date value) {
            addCriterionForJDBCDate("overview_date >", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overview_date >=", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateLessThan(Date value) {
            addCriterionForJDBCDate("overview_date <", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overview_date <=", value, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateIn(List<Date> values) {
            addCriterionForJDBCDate("overview_date in", values, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("overview_date not in", values, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overview_date between", value1, value2, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andOverviewDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overview_date not between", value1, value2, "overviewDate");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNull() {
            addCriterion("verify is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNotNull() {
            addCriterion("verify is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEqualTo(Integer value) {
            addCriterion("verify =", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotEqualTo(Integer value) {
            addCriterion("verify <>", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThan(Integer value) {
            addCriterion("verify >", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify >=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThan(Integer value) {
            addCriterion("verify <", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("verify <=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyIn(List<Integer> values) {
            addCriterion("verify in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotIn(List<Integer> values) {
            addCriterion("verify not in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyBetween(Integer value1, Integer value2) {
            addCriterion("verify between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("verify not between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria andOvertimeInIsNull() {
            addCriterion("overtime_in is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeInIsNotNull() {
            addCriterion("overtime_in is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeInEqualTo(Integer value) {
            addCriterion("overtime_in =", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInNotEqualTo(Integer value) {
            addCriterion("overtime_in <>", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInGreaterThan(Integer value) {
            addCriterion("overtime_in >", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_in >=", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInLessThan(Integer value) {
            addCriterion("overtime_in <", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInLessThanOrEqualTo(Integer value) {
            addCriterion("overtime_in <=", value, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInIn(List<Integer> values) {
            addCriterion("overtime_in in", values, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInNotIn(List<Integer> values) {
            addCriterion("overtime_in not in", values, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInBetween(Integer value1, Integer value2) {
            addCriterion("overtime_in between", value1, value2, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeInNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_in not between", value1, value2, "overtimeIn");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutIsNull() {
            addCriterion("overtime_out is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutIsNotNull() {
            addCriterion("overtime_out is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutEqualTo(Integer value) {
            addCriterion("overtime_out =", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutNotEqualTo(Integer value) {
            addCriterion("overtime_out <>", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutGreaterThan(Integer value) {
            addCriterion("overtime_out >", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_out >=", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutLessThan(Integer value) {
            addCriterion("overtime_out <", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("overtime_out <=", value, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutIn(List<Integer> values) {
            addCriterion("overtime_out in", values, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutNotIn(List<Integer> values) {
            addCriterion("overtime_out not in", values, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutBetween(Integer value1, Integer value2) {
            addCriterion("overtime_out between", value1, value2, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_out not between", value1, value2, "overtimeOut");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2IsNull() {
            addCriterion("overtime_in2 is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2IsNotNull() {
            addCriterion("overtime_in2 is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2EqualTo(Integer value) {
            addCriterion("overtime_in2 =", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2NotEqualTo(Integer value) {
            addCriterion("overtime_in2 <>", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2GreaterThan(Integer value) {
            addCriterion("overtime_in2 >", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2GreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_in2 >=", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2LessThan(Integer value) {
            addCriterion("overtime_in2 <", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2LessThanOrEqualTo(Integer value) {
            addCriterion("overtime_in2 <=", value, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2In(List<Integer> values) {
            addCriterion("overtime_in2 in", values, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2NotIn(List<Integer> values) {
            addCriterion("overtime_in2 not in", values, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2Between(Integer value1, Integer value2) {
            addCriterion("overtime_in2 between", value1, value2, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn2NotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_in2 not between", value1, value2, "overtimeIn2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2IsNull() {
            addCriterion("overtime_out2 is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2IsNotNull() {
            addCriterion("overtime_out2 is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2EqualTo(Integer value) {
            addCriterion("overtime_out2 =", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2NotEqualTo(Integer value) {
            addCriterion("overtime_out2 <>", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2GreaterThan(Integer value) {
            addCriterion("overtime_out2 >", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2GreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_out2 >=", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2LessThan(Integer value) {
            addCriterion("overtime_out2 <", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2LessThanOrEqualTo(Integer value) {
            addCriterion("overtime_out2 <=", value, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2In(List<Integer> values) {
            addCriterion("overtime_out2 in", values, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2NotIn(List<Integer> values) {
            addCriterion("overtime_out2 not in", values, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2Between(Integer value1, Integer value2) {
            addCriterion("overtime_out2 between", value1, value2, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andOvertimeOut2NotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_out2 not between", value1, value2, "overtimeOut2");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceIsNull() {
            addCriterion("verify_attendance is null");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceIsNotNull() {
            addCriterion("verify_attendance is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceEqualTo(Integer value) {
            addCriterion("verify_attendance =", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceNotEqualTo(Integer value) {
            addCriterion("verify_attendance <>", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceGreaterThan(Integer value) {
            addCriterion("verify_attendance >", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_attendance >=", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceLessThan(Integer value) {
            addCriterion("verify_attendance <", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceLessThanOrEqualTo(Integer value) {
            addCriterion("verify_attendance <=", value, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceIn(List<Integer> values) {
            addCriterion("verify_attendance in", values, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceNotIn(List<Integer> values) {
            addCriterion("verify_attendance not in", values, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceBetween(Integer value1, Integer value2) {
            addCriterion("verify_attendance between", value1, value2, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyAttendanceNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_attendance not between", value1, value2, "verifyAttendance");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdIsNull() {
            addCriterion("verify_by_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdIsNotNull() {
            addCriterion("verify_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdEqualTo(Integer value) {
            addCriterion("verify_by_id =", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdNotEqualTo(Integer value) {
            addCriterion("verify_by_id <>", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdGreaterThan(Integer value) {
            addCriterion("verify_by_id >", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_by_id >=", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdLessThan(Integer value) {
            addCriterion("verify_by_id <", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdLessThanOrEqualTo(Integer value) {
            addCriterion("verify_by_id <=", value, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdIn(List<Integer> values) {
            addCriterion("verify_by_id in", values, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdNotIn(List<Integer> values) {
            addCriterion("verify_by_id not in", values, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdBetween(Integer value1, Integer value2) {
            addCriterion("verify_by_id between", value1, value2, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_by_id not between", value1, value2, "verifyById");
            return (Criteria) this;
        }

        public Criteria andVerifyAtIsNull() {
            addCriterion("verify_at is null");
            return (Criteria) this;
        }

        public Criteria andVerifyAtIsNotNull() {
            addCriterion("verify_at is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyAtEqualTo(Date value) {
            addCriterion("verify_at =", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtNotEqualTo(Date value) {
            addCriterion("verify_at <>", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtGreaterThan(Date value) {
            addCriterion("verify_at >", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_at >=", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtLessThan(Date value) {
            addCriterion("verify_at <", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtLessThanOrEqualTo(Date value) {
            addCriterion("verify_at <=", value, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtIn(List<Date> values) {
            addCriterion("verify_at in", values, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtNotIn(List<Date> values) {
            addCriterion("verify_at not in", values, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtBetween(Date value1, Date value2) {
            addCriterion("verify_at between", value1, value2, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyAtNotBetween(Date value1, Date value2) {
            addCriterion("verify_at not between", value1, value2, "verifyAt");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdIsNull() {
            addCriterion("verify_level2_by_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdIsNotNull() {
            addCriterion("verify_level2_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdEqualTo(Integer value) {
            addCriterion("verify_level2_by_id =", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdNotEqualTo(Integer value) {
            addCriterion("verify_level2_by_id <>", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdGreaterThan(Integer value) {
            addCriterion("verify_level2_by_id >", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_level2_by_id >=", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdLessThan(Integer value) {
            addCriterion("verify_level2_by_id <", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdLessThanOrEqualTo(Integer value) {
            addCriterion("verify_level2_by_id <=", value, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdIn(List<Integer> values) {
            addCriterion("verify_level2_by_id in", values, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdNotIn(List<Integer> values) {
            addCriterion("verify_level2_by_id not in", values, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdBetween(Integer value1, Integer value2) {
            addCriterion("verify_level2_by_id between", value1, value2, "verifyLevel2ById");
            return (Criteria) this;
        }

        public Criteria andVerifyLevel2ByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_level2_by_id not between", value1, value2, "verifyLevel2ById");
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