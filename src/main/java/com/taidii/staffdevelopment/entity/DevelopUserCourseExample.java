package com.taidii.staffdevelopment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevelopUserCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevelopUserCourseExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andPlanTotalTrainingHourIsNull() {
            addCriterion("plan_total_training_hour is null");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourIsNotNull() {
            addCriterion("plan_total_training_hour is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourEqualTo(Integer value) {
            addCriterion("plan_total_training_hour =", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourNotEqualTo(Integer value) {
            addCriterion("plan_total_training_hour <>", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourGreaterThan(Integer value) {
            addCriterion("plan_total_training_hour >", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_total_training_hour >=", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourLessThan(Integer value) {
            addCriterion("plan_total_training_hour <", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourLessThanOrEqualTo(Integer value) {
            addCriterion("plan_total_training_hour <=", value, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourIn(List<Integer> values) {
            addCriterion("plan_total_training_hour in", values, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourNotIn(List<Integer> values) {
            addCriterion("plan_total_training_hour not in", values, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourBetween(Integer value1, Integer value2) {
            addCriterion("plan_total_training_hour between", value1, value2, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andPlanTotalTrainingHourNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_total_training_hour not between", value1, value2, "planTotalTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourIsNull() {
            addCriterion("completed_training_hour is null");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourIsNotNull() {
            addCriterion("completed_training_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourEqualTo(Integer value) {
            addCriterion("completed_training_hour =", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourNotEqualTo(Integer value) {
            addCriterion("completed_training_hour <>", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourGreaterThan(Integer value) {
            addCriterion("completed_training_hour >", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("completed_training_hour >=", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourLessThan(Integer value) {
            addCriterion("completed_training_hour <", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourLessThanOrEqualTo(Integer value) {
            addCriterion("completed_training_hour <=", value, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourIn(List<Integer> values) {
            addCriterion("completed_training_hour in", values, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourNotIn(List<Integer> values) {
            addCriterion("completed_training_hour not in", values, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourBetween(Integer value1, Integer value2) {
            addCriterion("completed_training_hour between", value1, value2, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCompletedTrainingHourNotBetween(Integer value1, Integer value2) {
            addCriterion("completed_training_hour not between", value1, value2, "completedTrainingHour");
            return (Criteria) this;
        }

        public Criteria andCourseFeeIsNull() {
            addCriterion("course_fee is null");
            return (Criteria) this;
        }

        public Criteria andCourseFeeIsNotNull() {
            addCriterion("course_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCourseFeeEqualTo(Double value) {
            addCriterion("course_fee =", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeNotEqualTo(Double value) {
            addCriterion("course_fee <>", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeGreaterThan(Double value) {
            addCriterion("course_fee >", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("course_fee >=", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeLessThan(Double value) {
            addCriterion("course_fee <", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeLessThanOrEqualTo(Double value) {
            addCriterion("course_fee <=", value, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeIn(List<Double> values) {
            addCriterion("course_fee in", values, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeNotIn(List<Double> values) {
            addCriterion("course_fee not in", values, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeBetween(Double value1, Double value2) {
            addCriterion("course_fee between", value1, value2, "courseFee");
            return (Criteria) this;
        }

        public Criteria andCourseFeeNotBetween(Double value1, Double value2) {
            addCriterion("course_fee not between", value1, value2, "courseFee");
            return (Criteria) this;
        }

        public Criteria andGrantIsNull() {
            addCriterion("grant is null");
            return (Criteria) this;
        }

        public Criteria andGrantIsNotNull() {
            addCriterion("grant is not null");
            return (Criteria) this;
        }

        public Criteria andGrantEqualTo(Double value) {
            addCriterion("grant =", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotEqualTo(Double value) {
            addCriterion("grant <>", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantGreaterThan(Double value) {
            addCriterion("grant >", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantGreaterThanOrEqualTo(Double value) {
            addCriterion("grant >=", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantLessThan(Double value) {
            addCriterion("grant <", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantLessThanOrEqualTo(Double value) {
            addCriterion("grant <=", value, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantIn(List<Double> values) {
            addCriterion("grant in", values, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotIn(List<Double> values) {
            addCriterion("grant not in", values, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantBetween(Double value1, Double value2) {
            addCriterion("grant between", value1, value2, "grant");
            return (Criteria) this;
        }

        public Criteria andGrantNotBetween(Double value1, Double value2) {
            addCriterion("grant not between", value1, value2, "grant");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollIsNull() {
            addCriterion("absentee_payroll is null");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollIsNotNull() {
            addCriterion("absentee_payroll is not null");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollEqualTo(Double value) {
            addCriterion("absentee_payroll =", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollNotEqualTo(Double value) {
            addCriterion("absentee_payroll <>", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollGreaterThan(Double value) {
            addCriterion("absentee_payroll >", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollGreaterThanOrEqualTo(Double value) {
            addCriterion("absentee_payroll >=", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollLessThan(Double value) {
            addCriterion("absentee_payroll <", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollLessThanOrEqualTo(Double value) {
            addCriterion("absentee_payroll <=", value, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollIn(List<Double> values) {
            addCriterion("absentee_payroll in", values, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollNotIn(List<Double> values) {
            addCriterion("absentee_payroll not in", values, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollBetween(Double value1, Double value2) {
            addCriterion("absentee_payroll between", value1, value2, "absenteePayroll");
            return (Criteria) this;
        }

        public Criteria andAbsenteePayrollNotBetween(Double value1, Double value2) {
            addCriterion("absentee_payroll not between", value1, value2, "absenteePayroll");
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
    
        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }
    
        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
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