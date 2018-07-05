package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentEnrichmentsettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentEnrichmentsettingExample() {
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

        public Criteria andMondayStartTimeIsNull() {
            addCriterion("monday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeIsNotNull() {
            addCriterion("monday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("monday_start_time =", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("monday_start_time <>", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("monday_start_time >", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("monday_start_time >=", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("monday_start_time <", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("monday_start_time <=", value, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("monday_start_time in", values, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("monday_start_time not in", values, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("monday_start_time between", value1, value2, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("monday_start_time not between", value1, value2, "mondayStartTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeIsNull() {
            addCriterion("monday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeIsNotNull() {
            addCriterion("monday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("monday_end_time =", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("monday_end_time <>", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("monday_end_time >", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("monday_end_time >=", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("monday_end_time <", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("monday_end_time <=", value, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("monday_end_time in", values, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("monday_end_time not in", values, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("monday_end_time between", value1, value2, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("monday_end_time not between", value1, value2, "mondayEndTime");
            return (Criteria) this;
        }

        public Criteria andMondayStatusIsNull() {
            addCriterion("monday_status is null");
            return (Criteria) this;
        }

        public Criteria andMondayStatusIsNotNull() {
            addCriterion("monday_status is not null");
            return (Criteria) this;
        }

        public Criteria andMondayStatusEqualTo(Integer value) {
            addCriterion("monday_status =", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusNotEqualTo(Integer value) {
            addCriterion("monday_status <>", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusGreaterThan(Integer value) {
            addCriterion("monday_status >", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("monday_status >=", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusLessThan(Integer value) {
            addCriterion("monday_status <", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("monday_status <=", value, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusIn(List<Integer> values) {
            addCriterion("monday_status in", values, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusNotIn(List<Integer> values) {
            addCriterion("monday_status not in", values, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusBetween(Integer value1, Integer value2) {
            addCriterion("monday_status between", value1, value2, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andMondayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("monday_status not between", value1, value2, "mondayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeIsNull() {
            addCriterion("tuesday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeIsNotNull() {
            addCriterion("tuesday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_start_time =", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_start_time <>", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("tuesday_start_time >", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_start_time >=", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("tuesday_start_time <", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_start_time <=", value, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("tuesday_start_time in", values, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("tuesday_start_time not in", values, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tuesday_start_time between", value1, value2, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tuesday_start_time not between", value1, value2, "tuesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeIsNull() {
            addCriterion("tuesday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeIsNotNull() {
            addCriterion("tuesday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_end_time =", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_end_time <>", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("tuesday_end_time >", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_end_time >=", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("tuesday_end_time <", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("tuesday_end_time <=", value, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("tuesday_end_time in", values, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("tuesday_end_time not in", values, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tuesday_end_time between", value1, value2, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("tuesday_end_time not between", value1, value2, "tuesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusIsNull() {
            addCriterion("tuesday_status is null");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusIsNotNull() {
            addCriterion("tuesday_status is not null");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusEqualTo(Integer value) {
            addCriterion("tuesday_status =", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusNotEqualTo(Integer value) {
            addCriterion("tuesday_status <>", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusGreaterThan(Integer value) {
            addCriterion("tuesday_status >", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuesday_status >=", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusLessThan(Integer value) {
            addCriterion("tuesday_status <", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tuesday_status <=", value, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusIn(List<Integer> values) {
            addCriterion("tuesday_status in", values, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusNotIn(List<Integer> values) {
            addCriterion("tuesday_status not in", values, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusBetween(Integer value1, Integer value2) {
            addCriterion("tuesday_status between", value1, value2, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andTuesdayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tuesday_status not between", value1, value2, "tuesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeIsNull() {
            addCriterion("wednesday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeIsNotNull() {
            addCriterion("wednesday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_start_time =", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_start_time <>", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("wednesday_start_time >", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_start_time >=", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("wednesday_start_time <", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_start_time <=", value, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("wednesday_start_time in", values, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("wednesday_start_time not in", values, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wednesday_start_time between", value1, value2, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wednesday_start_time not between", value1, value2, "wednesdayStartTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeIsNull() {
            addCriterion("wednesday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeIsNotNull() {
            addCriterion("wednesday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_end_time =", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_end_time <>", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("wednesday_end_time >", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_end_time >=", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("wednesday_end_time <", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wednesday_end_time <=", value, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("wednesday_end_time in", values, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("wednesday_end_time not in", values, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wednesday_end_time between", value1, value2, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wednesday_end_time not between", value1, value2, "wednesdayEndTime");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusIsNull() {
            addCriterion("wednesday_status is null");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusIsNotNull() {
            addCriterion("wednesday_status is not null");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusEqualTo(Integer value) {
            addCriterion("wednesday_status =", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusNotEqualTo(Integer value) {
            addCriterion("wednesday_status <>", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusGreaterThan(Integer value) {
            addCriterion("wednesday_status >", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wednesday_status >=", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusLessThan(Integer value) {
            addCriterion("wednesday_status <", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wednesday_status <=", value, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusIn(List<Integer> values) {
            addCriterion("wednesday_status in", values, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusNotIn(List<Integer> values) {
            addCriterion("wednesday_status not in", values, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusBetween(Integer value1, Integer value2) {
            addCriterion("wednesday_status between", value1, value2, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andWednesdayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wednesday_status not between", value1, value2, "wednesdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeIsNull() {
            addCriterion("thursday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeIsNotNull() {
            addCriterion("thursday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_start_time =", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_start_time <>", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("thursday_start_time >", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_start_time >=", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("thursday_start_time <", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_start_time <=", value, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("thursday_start_time in", values, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("thursday_start_time not in", values, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thursday_start_time between", value1, value2, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thursday_start_time not between", value1, value2, "thursdayStartTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeIsNull() {
            addCriterion("thursday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeIsNotNull() {
            addCriterion("thursday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_end_time =", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_end_time <>", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("thursday_end_time >", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_end_time >=", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("thursday_end_time <", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("thursday_end_time <=", value, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("thursday_end_time in", values, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("thursday_end_time not in", values, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thursday_end_time between", value1, value2, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("thursday_end_time not between", value1, value2, "thursdayEndTime");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusIsNull() {
            addCriterion("thursday_status is null");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusIsNotNull() {
            addCriterion("thursday_status is not null");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusEqualTo(Integer value) {
            addCriterion("thursday_status =", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusNotEqualTo(Integer value) {
            addCriterion("thursday_status <>", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusGreaterThan(Integer value) {
            addCriterion("thursday_status >", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("thursday_status >=", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusLessThan(Integer value) {
            addCriterion("thursday_status <", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("thursday_status <=", value, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusIn(List<Integer> values) {
            addCriterion("thursday_status in", values, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusNotIn(List<Integer> values) {
            addCriterion("thursday_status not in", values, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusBetween(Integer value1, Integer value2) {
            addCriterion("thursday_status between", value1, value2, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andThursdayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("thursday_status not between", value1, value2, "thursdayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeIsNull() {
            addCriterion("friday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeIsNotNull() {
            addCriterion("friday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("friday_start_time =", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("friday_start_time <>", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("friday_start_time >", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("friday_start_time >=", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("friday_start_time <", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("friday_start_time <=", value, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("friday_start_time in", values, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("friday_start_time not in", values, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("friday_start_time between", value1, value2, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("friday_start_time not between", value1, value2, "fridayStartTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeIsNull() {
            addCriterion("friday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeIsNotNull() {
            addCriterion("friday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("friday_end_time =", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("friday_end_time <>", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("friday_end_time >", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("friday_end_time >=", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("friday_end_time <", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("friday_end_time <=", value, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("friday_end_time in", values, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("friday_end_time not in", values, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("friday_end_time between", value1, value2, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("friday_end_time not between", value1, value2, "fridayEndTime");
            return (Criteria) this;
        }

        public Criteria andFridayStatusIsNull() {
            addCriterion("friday_status is null");
            return (Criteria) this;
        }

        public Criteria andFridayStatusIsNotNull() {
            addCriterion("friday_status is not null");
            return (Criteria) this;
        }

        public Criteria andFridayStatusEqualTo(Integer value) {
            addCriterion("friday_status =", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusNotEqualTo(Integer value) {
            addCriterion("friday_status <>", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusGreaterThan(Integer value) {
            addCriterion("friday_status >", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("friday_status >=", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusLessThan(Integer value) {
            addCriterion("friday_status <", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("friday_status <=", value, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusIn(List<Integer> values) {
            addCriterion("friday_status in", values, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusNotIn(List<Integer> values) {
            addCriterion("friday_status not in", values, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusBetween(Integer value1, Integer value2) {
            addCriterion("friday_status between", value1, value2, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andFridayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("friday_status not between", value1, value2, "fridayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeIsNull() {
            addCriterion("saturday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeIsNotNull() {
            addCriterion("saturday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_start_time =", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_start_time <>", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("saturday_start_time >", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_start_time >=", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("saturday_start_time <", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_start_time <=", value, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("saturday_start_time in", values, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("saturday_start_time not in", values, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("saturday_start_time between", value1, value2, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("saturday_start_time not between", value1, value2, "saturdayStartTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeIsNull() {
            addCriterion("saturday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeIsNotNull() {
            addCriterion("saturday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_end_time =", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_end_time <>", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("saturday_end_time >", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_end_time >=", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("saturday_end_time <", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("saturday_end_time <=", value, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("saturday_end_time in", values, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("saturday_end_time not in", values, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("saturday_end_time between", value1, value2, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("saturday_end_time not between", value1, value2, "saturdayEndTime");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusIsNull() {
            addCriterion("saturday_status is null");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusIsNotNull() {
            addCriterion("saturday_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusEqualTo(Integer value) {
            addCriterion("saturday_status =", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusNotEqualTo(Integer value) {
            addCriterion("saturday_status <>", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusGreaterThan(Integer value) {
            addCriterion("saturday_status >", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("saturday_status >=", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusLessThan(Integer value) {
            addCriterion("saturday_status <", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("saturday_status <=", value, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusIn(List<Integer> values) {
            addCriterion("saturday_status in", values, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusNotIn(List<Integer> values) {
            addCriterion("saturday_status not in", values, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusBetween(Integer value1, Integer value2) {
            addCriterion("saturday_status between", value1, value2, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSaturdayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("saturday_status not between", value1, value2, "saturdayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeIsNull() {
            addCriterion("sunday_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeIsNotNull() {
            addCriterion("sunday_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_start_time =", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_start_time <>", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sunday_start_time >", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_start_time >=", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("sunday_start_time <", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_start_time <=", value, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sunday_start_time in", values, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sunday_start_time not in", values, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sunday_start_time between", value1, value2, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sunday_start_time not between", value1, value2, "sundayStartTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeIsNull() {
            addCriterion("sunday_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeIsNotNull() {
            addCriterion("sunday_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_end_time =", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_end_time <>", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("sunday_end_time >", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_end_time >=", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("sunday_end_time <", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("sunday_end_time <=", value, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("sunday_end_time in", values, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("sunday_end_time not in", values, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sunday_end_time between", value1, value2, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("sunday_end_time not between", value1, value2, "sundayEndTime");
            return (Criteria) this;
        }

        public Criteria andSundayStatusIsNull() {
            addCriterion("sunday_status is null");
            return (Criteria) this;
        }

        public Criteria andSundayStatusIsNotNull() {
            addCriterion("sunday_status is not null");
            return (Criteria) this;
        }

        public Criteria andSundayStatusEqualTo(Integer value) {
            addCriterion("sunday_status =", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusNotEqualTo(Integer value) {
            addCriterion("sunday_status <>", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusGreaterThan(Integer value) {
            addCriterion("sunday_status >", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sunday_status >=", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusLessThan(Integer value) {
            addCriterion("sunday_status <", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sunday_status <=", value, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusIn(List<Integer> values) {
            addCriterion("sunday_status in", values, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusNotIn(List<Integer> values) {
            addCriterion("sunday_status not in", values, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusBetween(Integer value1, Integer value2) {
            addCriterion("sunday_status between", value1, value2, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andSundayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sunday_status not between", value1, value2, "sundayStatus");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonIsNull() {
            addCriterion("calendar_holiday_effect_lesson is null");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonIsNotNull() {
            addCriterion("calendar_holiday_effect_lesson is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonEqualTo(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson =", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonNotEqualTo(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson <>", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonGreaterThan(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson >", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonGreaterThanOrEqualTo(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson >=", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonLessThan(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson <", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonLessThanOrEqualTo(Boolean value) {
            addCriterion("calendar_holiday_effect_lesson <=", value, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonIn(List<Boolean> values) {
            addCriterion("calendar_holiday_effect_lesson in", values, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonNotIn(List<Boolean> values) {
            addCriterion("calendar_holiday_effect_lesson not in", values, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonBetween(Boolean value1, Boolean value2) {
            addCriterion("calendar_holiday_effect_lesson between", value1, value2, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andCalendarHolidayEffectLessonNotBetween(Boolean value1, Boolean value2) {
            addCriterion("calendar_holiday_effect_lesson not between", value1, value2, "calendarHolidayEffectLesson");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesIsNull() {
            addCriterion("auto_renew_classes is null");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesIsNotNull() {
            addCriterion("auto_renew_classes is not null");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesEqualTo(Boolean value) {
            addCriterion("auto_renew_classes =", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesNotEqualTo(Boolean value) {
            addCriterion("auto_renew_classes <>", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesGreaterThan(Boolean value) {
            addCriterion("auto_renew_classes >", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("auto_renew_classes >=", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesLessThan(Boolean value) {
            addCriterion("auto_renew_classes <", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesLessThanOrEqualTo(Boolean value) {
            addCriterion("auto_renew_classes <=", value, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesIn(List<Boolean> values) {
            addCriterion("auto_renew_classes in", values, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesNotIn(List<Boolean> values) {
            addCriterion("auto_renew_classes not in", values, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_renew_classes between", value1, value2, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andAutoRenewClassesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("auto_renew_classes not between", value1, value2, "autoRenewClasses");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermIsNull() {
            addCriterion("lessons_of_one_term is null");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermIsNotNull() {
            addCriterion("lessons_of_one_term is not null");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermEqualTo(Integer value) {
            addCriterion("lessons_of_one_term =", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermNotEqualTo(Integer value) {
            addCriterion("lessons_of_one_term <>", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermGreaterThan(Integer value) {
            addCriterion("lessons_of_one_term >", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessons_of_one_term >=", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermLessThan(Integer value) {
            addCriterion("lessons_of_one_term <", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermLessThanOrEqualTo(Integer value) {
            addCriterion("lessons_of_one_term <=", value, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermIn(List<Integer> values) {
            addCriterion("lessons_of_one_term in", values, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermNotIn(List<Integer> values) {
            addCriterion("lessons_of_one_term not in", values, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermBetween(Integer value1, Integer value2) {
            addCriterion("lessons_of_one_term between", value1, value2, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andLessonsOfOneTermNotBetween(Integer value1, Integer value2) {
            addCriterion("lessons_of_one_term not between", value1, value2, "lessonsOfOneTerm");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailIsNull() {
            addCriterion("mandatory_parent_email is null");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailIsNotNull() {
            addCriterion("mandatory_parent_email is not null");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailEqualTo(Boolean value) {
            addCriterion("mandatory_parent_email =", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailNotEqualTo(Boolean value) {
            addCriterion("mandatory_parent_email <>", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailGreaterThan(Boolean value) {
            addCriterion("mandatory_parent_email >", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mandatory_parent_email >=", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailLessThan(Boolean value) {
            addCriterion("mandatory_parent_email <", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailLessThanOrEqualTo(Boolean value) {
            addCriterion("mandatory_parent_email <=", value, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailIn(List<Boolean> values) {
            addCriterion("mandatory_parent_email in", values, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailNotIn(List<Boolean> values) {
            addCriterion("mandatory_parent_email not in", values, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailBetween(Boolean value1, Boolean value2) {
            addCriterion("mandatory_parent_email between", value1, value2, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andMandatoryParentEmailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mandatory_parent_email not between", value1, value2, "mandatoryParentEmail");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateIsNull() {
            addCriterion("start_date_can_set_past_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateIsNotNull() {
            addCriterion("start_date_can_set_past_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateEqualTo(Boolean value) {
            addCriterion("start_date_can_set_past_date =", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateNotEqualTo(Boolean value) {
            addCriterion("start_date_can_set_past_date <>", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateGreaterThan(Boolean value) {
            addCriterion("start_date_can_set_past_date >", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("start_date_can_set_past_date >=", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateLessThan(Boolean value) {
            addCriterion("start_date_can_set_past_date <", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateLessThanOrEqualTo(Boolean value) {
            addCriterion("start_date_can_set_past_date <=", value, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateIn(List<Boolean> values) {
            addCriterion("start_date_can_set_past_date in", values, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateNotIn(List<Boolean> values) {
            addCriterion("start_date_can_set_past_date not in", values, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateBetween(Boolean value1, Boolean value2) {
            addCriterion("start_date_can_set_past_date between", value1, value2, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andStartDateCanSetPastDateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("start_date_can_set_past_date not between", value1, value2, "startDateCanSetPastDate");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysIsNull() {
            addCriterion("reschedule_within_days is null");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysIsNotNull() {
            addCriterion("reschedule_within_days is not null");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysEqualTo(Integer value) {
            addCriterion("reschedule_within_days =", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysNotEqualTo(Integer value) {
            addCriterion("reschedule_within_days <>", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysGreaterThan(Integer value) {
            addCriterion("reschedule_within_days >", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("reschedule_within_days >=", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysLessThan(Integer value) {
            addCriterion("reschedule_within_days <", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysLessThanOrEqualTo(Integer value) {
            addCriterion("reschedule_within_days <=", value, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysIn(List<Integer> values) {
            addCriterion("reschedule_within_days in", values, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysNotIn(List<Integer> values) {
            addCriterion("reschedule_within_days not in", values, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_within_days between", value1, value2, "rescheduleWithinDays");
            return (Criteria) this;
        }

        public Criteria andRescheduleWithinDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("reschedule_within_days not between", value1, value2, "rescheduleWithinDays");
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