package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrollmentEnrollmentformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrollmentEnrollmentformExample() {
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesIsNull() {
            addCriterion("talk_to_sales is null");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesIsNotNull() {
            addCriterion("talk_to_sales is not null");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesEqualTo(Boolean value) {
            addCriterion("talk_to_sales =", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesNotEqualTo(Boolean value) {
            addCriterion("talk_to_sales <>", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesGreaterThan(Boolean value) {
            addCriterion("talk_to_sales >", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("talk_to_sales >=", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesLessThan(Boolean value) {
            addCriterion("talk_to_sales <", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesLessThanOrEqualTo(Boolean value) {
            addCriterion("talk_to_sales <=", value, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesIn(List<Boolean> values) {
            addCriterion("talk_to_sales in", values, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesNotIn(List<Boolean> values) {
            addCriterion("talk_to_sales not in", values, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesBetween(Boolean value1, Boolean value2) {
            addCriterion("talk_to_sales between", value1, value2, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andTalkToSalesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("talk_to_sales not between", value1, value2, "talkToSales");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeIsNull() {
            addCriterion("admission_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeIsNotNull() {
            addCriterion("admission_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeEqualTo(Integer value) {
            addCriterion("admission_fee =", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeNotEqualTo(Integer value) {
            addCriterion("admission_fee <>", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeGreaterThan(Integer value) {
            addCriterion("admission_fee >", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admission_fee >=", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeLessThan(Integer value) {
            addCriterion("admission_fee <", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeLessThanOrEqualTo(Integer value) {
            addCriterion("admission_fee <=", value, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeIn(List<Integer> values) {
            addCriterion("admission_fee in", values, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeNotIn(List<Integer> values) {
            addCriterion("admission_fee not in", values, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeBetween(Integer value1, Integer value2) {
            addCriterion("admission_fee between", value1, value2, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andAdmissionFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("admission_fee not between", value1, value2, "admissionFee");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateIsNull() {
            addCriterion("preferred_visiting_date is null");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateIsNotNull() {
            addCriterion("preferred_visiting_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date =", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date <>", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date >", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date >=", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateLessThan(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date <", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_visiting_date <=", value, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateIn(List<Date> values) {
            addCriterionForJDBCDate("preferred_visiting_date in", values, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("preferred_visiting_date not in", values, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("preferred_visiting_date between", value1, value2, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("preferred_visiting_date not between", value1, value2, "preferredVisitingDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateIsNull() {
            addCriterion("preferred_commencement_date is null");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateIsNotNull() {
            addCriterion("preferred_commencement_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date =", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date <>", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateGreaterThan(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date >", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date >=", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateLessThan(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date <", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("preferred_commencement_date <=", value, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateIn(List<Date> values) {
            addCriterionForJDBCDate("preferred_commencement_date in", values, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("preferred_commencement_date not in", values, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("preferred_commencement_date between", value1, value2, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andPreferredCommencementDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("preferred_commencement_date not between", value1, value2, "preferredCommencementDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIsNull() {
            addCriterion("registered_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIsNotNull() {
            addCriterion("registered_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateEqualTo(Date value) {
            addCriterionForJDBCDate("registered_date =", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registered_date <>", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("registered_date >", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registered_date >=", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateLessThan(Date value) {
            addCriterionForJDBCDate("registered_date <", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registered_date <=", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIn(List<Date> values) {
            addCriterionForJDBCDate("registered_date in", values, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registered_date not in", values, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registered_date between", value1, value2, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registered_date not between", value1, value2, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsIsNull() {
            addCriterion("no_of_siblings is null");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsIsNotNull() {
            addCriterion("no_of_siblings is not null");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsEqualTo(Integer value) {
            addCriterion("no_of_siblings =", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsNotEqualTo(Integer value) {
            addCriterion("no_of_siblings <>", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsGreaterThan(Integer value) {
            addCriterion("no_of_siblings >", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_of_siblings >=", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsLessThan(Integer value) {
            addCriterion("no_of_siblings <", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsLessThanOrEqualTo(Integer value) {
            addCriterion("no_of_siblings <=", value, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsIn(List<Integer> values) {
            addCriterion("no_of_siblings in", values, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsNotIn(List<Integer> values) {
            addCriterion("no_of_siblings not in", values, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsBetween(Integer value1, Integer value2) {
            addCriterion("no_of_siblings between", value1, value2, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsNotBetween(Integer value1, Integer value2) {
            addCriterion("no_of_siblings not between", value1, value2, "noOfSiblings");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolIsNull() {
            addCriterion("no_of_siblings_in_school is null");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolIsNotNull() {
            addCriterion("no_of_siblings_in_school is not null");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolEqualTo(Integer value) {
            addCriterion("no_of_siblings_in_school =", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolNotEqualTo(Integer value) {
            addCriterion("no_of_siblings_in_school <>", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolGreaterThan(Integer value) {
            addCriterion("no_of_siblings_in_school >", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_of_siblings_in_school >=", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolLessThan(Integer value) {
            addCriterion("no_of_siblings_in_school <", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolLessThanOrEqualTo(Integer value) {
            addCriterion("no_of_siblings_in_school <=", value, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolIn(List<Integer> values) {
            addCriterion("no_of_siblings_in_school in", values, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolNotIn(List<Integer> values) {
            addCriterion("no_of_siblings_in_school not in", values, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolBetween(Integer value1, Integer value2) {
            addCriterion("no_of_siblings_in_school between", value1, value2, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andNoOfSiblingsInSchoolNotBetween(Integer value1, Integer value2) {
            addCriterion("no_of_siblings_in_school not between", value1, value2, "noOfSiblingsInSchool");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreIsNull() {
            addCriterion("is_enrolled_another_centre is null");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreIsNotNull() {
            addCriterion("is_enrolled_another_centre is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreEqualTo(Boolean value) {
            addCriterion("is_enrolled_another_centre =", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreNotEqualTo(Boolean value) {
            addCriterion("is_enrolled_another_centre <>", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreGreaterThan(Boolean value) {
            addCriterion("is_enrolled_another_centre >", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enrolled_another_centre >=", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreLessThan(Boolean value) {
            addCriterion("is_enrolled_another_centre <", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enrolled_another_centre <=", value, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreIn(List<Boolean> values) {
            addCriterion("is_enrolled_another_centre in", values, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreNotIn(List<Boolean> values) {
            addCriterion("is_enrolled_another_centre not in", values, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enrolled_another_centre between", value1, value2, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andIsEnrolledAnotherCentreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enrolled_another_centre not between", value1, value2, "isEnrolledAnotherCentre");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayIsNull() {
            addCriterion("full_half_day is null");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayIsNotNull() {
            addCriterion("full_half_day is not null");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayEqualTo(Integer value) {
            addCriterion("full_half_day =", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayNotEqualTo(Integer value) {
            addCriterion("full_half_day <>", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayGreaterThan(Integer value) {
            addCriterion("full_half_day >", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_half_day >=", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayLessThan(Integer value) {
            addCriterion("full_half_day <", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayLessThanOrEqualTo(Integer value) {
            addCriterion("full_half_day <=", value, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayIn(List<Integer> values) {
            addCriterion("full_half_day in", values, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayNotIn(List<Integer> values) {
            addCriterion("full_half_day not in", values, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayBetween(Integer value1, Integer value2) {
            addCriterion("full_half_day between", value1, value2, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andFullHalfDayNotBetween(Integer value1, Integer value2) {
            addCriterion("full_half_day not between", value1, value2, "fullHalfDay");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNull() {
            addCriterion("program_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNotNull() {
            addCriterion("program_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramIdEqualTo(Integer value) {
            addCriterion("program_id =", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotEqualTo(Integer value) {
            addCriterion("program_id <>", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThan(Integer value) {
            addCriterion("program_id >", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("program_id >=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThan(Integer value) {
            addCriterion("program_id <", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThanOrEqualTo(Integer value) {
            addCriterion("program_id <=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdIn(List<Integer> values) {
            addCriterion("program_id in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotIn(List<Integer> values) {
            addCriterion("program_id not in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdBetween(Integer value1, Integer value2) {
            addCriterion("program_id between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotBetween(Integer value1, Integer value2) {
            addCriterion("program_id not between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andFollowupByIsNull() {
            addCriterion("followup_by is null");
            return (Criteria) this;
        }

        public Criteria andFollowupByIsNotNull() {
            addCriterion("followup_by is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupByEqualTo(String value) {
            addCriterion("followup_by =", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByNotEqualTo(String value) {
            addCriterion("followup_by <>", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByGreaterThan(String value) {
            addCriterion("followup_by >", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByGreaterThanOrEqualTo(String value) {
            addCriterion("followup_by >=", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByLessThan(String value) {
            addCriterion("followup_by <", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByLessThanOrEqualTo(String value) {
            addCriterion("followup_by <=", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByLike(String value) {
            addCriterion("followup_by like", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByNotLike(String value) {
            addCriterion("followup_by not like", value, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByIn(List<String> values) {
            addCriterion("followup_by in", values, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByNotIn(List<String> values) {
            addCriterion("followup_by not in", values, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByBetween(String value1, String value2) {
            addCriterion("followup_by between", value1, value2, "followupBy");
            return (Criteria) this;
        }

        public Criteria andFollowupByNotBetween(String value1, String value2) {
            addCriterion("followup_by not between", value1, value2, "followupBy");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeIsNull() {
            addCriterion("withdrawal_type is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeIsNotNull() {
            addCriterion("withdrawal_type is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeEqualTo(Integer value) {
            addCriterion("withdrawal_type =", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeNotEqualTo(Integer value) {
            addCriterion("withdrawal_type <>", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeGreaterThan(Integer value) {
            addCriterion("withdrawal_type >", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_type >=", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeLessThan(Integer value) {
            addCriterion("withdrawal_type <", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeLessThanOrEqualTo(Integer value) {
            addCriterion("withdrawal_type <=", value, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeIn(List<Integer> values) {
            addCriterion("withdrawal_type in", values, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeNotIn(List<Integer> values) {
            addCriterion("withdrawal_type not in", values, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_type between", value1, value2, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andWithdrawalTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("withdrawal_type not between", value1, value2, "withdrawalType");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterIsNull() {
            addCriterion("last_date_at_center is null");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterIsNotNull() {
            addCriterion("last_date_at_center is not null");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterEqualTo(Date value) {
            addCriterionForJDBCDate("last_date_at_center =", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_date_at_center <>", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterGreaterThan(Date value) {
            addCriterionForJDBCDate("last_date_at_center >", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_date_at_center >=", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterLessThan(Date value) {
            addCriterionForJDBCDate("last_date_at_center <", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_date_at_center <=", value, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterIn(List<Date> values) {
            addCriterionForJDBCDate("last_date_at_center in", values, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_date_at_center not in", values, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_date_at_center between", value1, value2, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andLastDateAtCenterNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_date_at_center not between", value1, value2, "lastDateAtCenter");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeIsNull() {
            addCriterion("month_notice is null");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeIsNotNull() {
            addCriterion("month_notice is not null");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeEqualTo(Boolean value) {
            addCriterion("month_notice =", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeNotEqualTo(Boolean value) {
            addCriterion("month_notice <>", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeGreaterThan(Boolean value) {
            addCriterion("month_notice >", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("month_notice >=", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeLessThan(Boolean value) {
            addCriterion("month_notice <", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeLessThanOrEqualTo(Boolean value) {
            addCriterion("month_notice <=", value, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeIn(List<Boolean> values) {
            addCriterion("month_notice in", values, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeNotIn(List<Boolean> values) {
            addCriterion("month_notice not in", values, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeBetween(Boolean value1, Boolean value2) {
            addCriterion("month_notice between", value1, value2, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andMonthNoticeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("month_notice not between", value1, value2, "monthNotice");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedIsNull() {
            addCriterion("deposit_returned is null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedIsNotNull() {
            addCriterion("deposit_returned is not null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedEqualTo(Boolean value) {
            addCriterion("deposit_returned =", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedNotEqualTo(Boolean value) {
            addCriterion("deposit_returned <>", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedGreaterThan(Boolean value) {
            addCriterion("deposit_returned >", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deposit_returned >=", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedLessThan(Boolean value) {
            addCriterion("deposit_returned <", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedLessThanOrEqualTo(Boolean value) {
            addCriterion("deposit_returned <=", value, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedIn(List<Boolean> values) {
            addCriterion("deposit_returned in", values, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedNotIn(List<Boolean> values) {
            addCriterion("deposit_returned not in", values, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedBetween(Boolean value1, Boolean value2) {
            addCriterion("deposit_returned between", value1, value2, "depositReturned");
            return (Criteria) this;
        }

        public Criteria andDepositReturnedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deposit_returned not between", value1, value2, "depositReturned");
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

        public Criteria andSalesNameIsNull() {
            addCriterion("sales_name is null");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNotNull() {
            addCriterion("sales_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNameEqualTo(String value) {
            addCriterion("sales_name =", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotEqualTo(String value) {
            addCriterion("sales_name <>", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThan(String value) {
            addCriterion("sales_name >", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThanOrEqualTo(String value) {
            addCriterion("sales_name >=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThan(String value) {
            addCriterion("sales_name <", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThanOrEqualTo(String value) {
            addCriterion("sales_name <=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLike(String value) {
            addCriterion("sales_name like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotLike(String value) {
            addCriterion("sales_name not like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameIn(List<String> values) {
            addCriterion("sales_name in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotIn(List<String> values) {
            addCriterion("sales_name not in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameBetween(String value1, String value2) {
            addCriterion("sales_name between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotBetween(String value1, String value2) {
            addCriterion("sales_name not between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andGetInformationIsNull() {
            addCriterion("get_information is null");
            return (Criteria) this;
        }

        public Criteria andGetInformationIsNotNull() {
            addCriterion("get_information is not null");
            return (Criteria) this;
        }

        public Criteria andGetInformationEqualTo(Boolean value) {
            addCriterion("get_information =", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationNotEqualTo(Boolean value) {
            addCriterion("get_information <>", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationGreaterThan(Boolean value) {
            addCriterion("get_information >", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("get_information >=", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationLessThan(Boolean value) {
            addCriterion("get_information <", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationLessThanOrEqualTo(Boolean value) {
            addCriterion("get_information <=", value, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationIn(List<Boolean> values) {
            addCriterion("get_information in", values, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationNotIn(List<Boolean> values) {
            addCriterion("get_information not in", values, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationBetween(Boolean value1, Boolean value2) {
            addCriterion("get_information between", value1, value2, "getInformation");
            return (Criteria) this;
        }

        public Criteria andGetInformationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("get_information not between", value1, value2, "getInformation");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeIsNull() {
            addCriterion("preferred_visiting_time is null");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeIsNotNull() {
            addCriterion("preferred_visiting_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeEqualTo(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time =", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time <>", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time >", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time >=", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeLessThan(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time <", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("preferred_visiting_time <=", value, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeIn(List<Date> values) {
            addCriterionForJDBCTime("preferred_visiting_time in", values, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("preferred_visiting_time not in", values, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("preferred_visiting_time between", value1, value2, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andPreferredVisitingTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("preferred_visiting_time not between", value1, value2, "preferredVisitingTime");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleIsNull() {
            addCriterion("agree_rule is null");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleIsNotNull() {
            addCriterion("agree_rule is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleEqualTo(Boolean value) {
            addCriterion("agree_rule =", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleNotEqualTo(Boolean value) {
            addCriterion("agree_rule <>", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleGreaterThan(Boolean value) {
            addCriterion("agree_rule >", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("agree_rule >=", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleLessThan(Boolean value) {
            addCriterion("agree_rule <", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleLessThanOrEqualTo(Boolean value) {
            addCriterion("agree_rule <=", value, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleIn(List<Boolean> values) {
            addCriterion("agree_rule in", values, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleNotIn(List<Boolean> values) {
            addCriterion("agree_rule not in", values, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleBetween(Boolean value1, Boolean value2) {
            addCriterion("agree_rule between", value1, value2, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andAgreeRuleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("agree_rule not between", value1, value2, "agreeRule");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNull() {
            addCriterion("preference is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceIsNotNull() {
            addCriterion("preference is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceEqualTo(Integer value) {
            addCriterion("preference =", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotEqualTo(Integer value) {
            addCriterion("preference <>", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThan(Integer value) {
            addCriterion("preference >", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("preference >=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThan(Integer value) {
            addCriterion("preference <", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceLessThanOrEqualTo(Integer value) {
            addCriterion("preference <=", value, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceIn(List<Integer> values) {
            addCriterion("preference in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotIn(List<Integer> values) {
            addCriterion("preference not in", values, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceBetween(Integer value1, Integer value2) {
            addCriterion("preference between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andPreferenceNotBetween(Integer value1, Integer value2) {
            addCriterion("preference not between", value1, value2, "preference");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("student_no is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("student_no is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("student_no =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("student_no <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("student_no >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("student_no >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("student_no <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("student_no <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("student_no like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("student_no not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("student_no in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("student_no not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("student_no between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("student_no not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonIsNull() {
            addCriterion("withdraw_reason is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonIsNotNull() {
            addCriterion("withdraw_reason is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonEqualTo(Integer value) {
            addCriterion("withdraw_reason =", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonNotEqualTo(Integer value) {
            addCriterion("withdraw_reason <>", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonGreaterThan(Integer value) {
            addCriterion("withdraw_reason >", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_reason >=", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonLessThan(Integer value) {
            addCriterion("withdraw_reason <", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_reason <=", value, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonIn(List<Integer> values) {
            addCriterion("withdraw_reason in", values, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonNotIn(List<Integer> values) {
            addCriterion("withdraw_reason not in", values, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_reason between", value1, value2, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andWithdrawReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_reason not between", value1, value2, "withdrawReason");
            return (Criteria) this;
        }

        public Criteria andMcReferenceIsNull() {
            addCriterion("mc_reference is null");
            return (Criteria) this;
        }

        public Criteria andMcReferenceIsNotNull() {
            addCriterion("mc_reference is not null");
            return (Criteria) this;
        }

        public Criteria andMcReferenceEqualTo(String value) {
            addCriterion("mc_reference =", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceNotEqualTo(String value) {
            addCriterion("mc_reference <>", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceGreaterThan(String value) {
            addCriterion("mc_reference >", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("mc_reference >=", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceLessThan(String value) {
            addCriterion("mc_reference <", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceLessThanOrEqualTo(String value) {
            addCriterion("mc_reference <=", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceLike(String value) {
            addCriterion("mc_reference like", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceNotLike(String value) {
            addCriterion("mc_reference not like", value, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceIn(List<String> values) {
            addCriterion("mc_reference in", values, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceNotIn(List<String> values) {
            addCriterion("mc_reference not in", values, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceBetween(String value1, String value2) {
            addCriterion("mc_reference between", value1, value2, "mcReference");
            return (Criteria) this;
        }

        public Criteria andMcReferenceNotBetween(String value1, String value2) {
            addCriterion("mc_reference not between", value1, value2, "mcReference");
            return (Criteria) this;
        }

        public Criteria andSalesNumberIsNull() {
            addCriterion("sales_number is null");
            return (Criteria) this;
        }

        public Criteria andSalesNumberIsNotNull() {
            addCriterion("sales_number is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNumberEqualTo(String value) {
            addCriterion("sales_number =", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberNotEqualTo(String value) {
            addCriterion("sales_number <>", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberGreaterThan(String value) {
            addCriterion("sales_number >", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sales_number >=", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberLessThan(String value) {
            addCriterion("sales_number <", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberLessThanOrEqualTo(String value) {
            addCriterion("sales_number <=", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberLike(String value) {
            addCriterion("sales_number like", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberNotLike(String value) {
            addCriterion("sales_number not like", value, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberIn(List<String> values) {
            addCriterion("sales_number in", values, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberNotIn(List<String> values) {
            addCriterion("sales_number not in", values, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberBetween(String value1, String value2) {
            addCriterion("sales_number between", value1, value2, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesNumberNotBetween(String value1, String value2) {
            addCriterion("sales_number not between", value1, value2, "salesNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberIsNull() {
            addCriterion("sales_contact_number is null");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberIsNotNull() {
            addCriterion("sales_contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberEqualTo(String value) {
            addCriterion("sales_contact_number =", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberNotEqualTo(String value) {
            addCriterion("sales_contact_number <>", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberGreaterThan(String value) {
            addCriterion("sales_contact_number >", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sales_contact_number >=", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberLessThan(String value) {
            addCriterion("sales_contact_number <", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberLessThanOrEqualTo(String value) {
            addCriterion("sales_contact_number <=", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberLike(String value) {
            addCriterion("sales_contact_number like", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberNotLike(String value) {
            addCriterion("sales_contact_number not like", value, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberIn(List<String> values) {
            addCriterion("sales_contact_number in", values, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberNotIn(List<String> values) {
            addCriterion("sales_contact_number not in", values, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberBetween(String value1, String value2) {
            addCriterion("sales_contact_number between", value1, value2, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andSalesContactNumberNotBetween(String value1, String value2) {
            addCriterion("sales_contact_number not between", value1, value2, "salesContactNumber");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeIsNull() {
            addCriterion("preference_type is null");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeIsNotNull() {
            addCriterion("preference_type is not null");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeEqualTo(String value) {
            addCriterion("preference_type =", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeNotEqualTo(String value) {
            addCriterion("preference_type <>", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeGreaterThan(String value) {
            addCriterion("preference_type >", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("preference_type >=", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeLessThan(String value) {
            addCriterion("preference_type <", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeLessThanOrEqualTo(String value) {
            addCriterion("preference_type <=", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeLike(String value) {
            addCriterion("preference_type like", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeNotLike(String value) {
            addCriterion("preference_type not like", value, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeIn(List<String> values) {
            addCriterion("preference_type in", values, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeNotIn(List<String> values) {
            addCriterion("preference_type not in", values, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeBetween(String value1, String value2) {
            addCriterion("preference_type between", value1, value2, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andPreferenceTypeNotBetween(String value1, String value2) {
            addCriterion("preference_type not between", value1, value2, "preferenceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("source_type like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("source_type not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesIsNull() {
            addCriterion("food_allergies is null");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesIsNotNull() {
            addCriterion("food_allergies is not null");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesEqualTo(String value) {
            addCriterion("food_allergies =", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesNotEqualTo(String value) {
            addCriterion("food_allergies <>", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesGreaterThan(String value) {
            addCriterion("food_allergies >", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesGreaterThanOrEqualTo(String value) {
            addCriterion("food_allergies >=", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesLessThan(String value) {
            addCriterion("food_allergies <", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesLessThanOrEqualTo(String value) {
            addCriterion("food_allergies <=", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesLike(String value) {
            addCriterion("food_allergies like", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesNotLike(String value) {
            addCriterion("food_allergies not like", value, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesIn(List<String> values) {
            addCriterion("food_allergies in", values, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesNotIn(List<String> values) {
            addCriterion("food_allergies not in", values, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesBetween(String value1, String value2) {
            addCriterion("food_allergies between", value1, value2, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andFoodAllergiesNotBetween(String value1, String value2) {
            addCriterion("food_allergies not between", value1, value2, "foodAllergies");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsIsNull() {
            addCriterion("medical_conditions is null");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsIsNotNull() {
            addCriterion("medical_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsEqualTo(String value) {
            addCriterion("medical_conditions =", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsNotEqualTo(String value) {
            addCriterion("medical_conditions <>", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsGreaterThan(String value) {
            addCriterion("medical_conditions >", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("medical_conditions >=", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsLessThan(String value) {
            addCriterion("medical_conditions <", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsLessThanOrEqualTo(String value) {
            addCriterion("medical_conditions <=", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsLike(String value) {
            addCriterion("medical_conditions like", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsNotLike(String value) {
            addCriterion("medical_conditions not like", value, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsIn(List<String> values) {
            addCriterion("medical_conditions in", values, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsNotIn(List<String> values) {
            addCriterion("medical_conditions not in", values, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsBetween(String value1, String value2) {
            addCriterion("medical_conditions between", value1, value2, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andMedicalConditionsNotBetween(String value1, String value2) {
            addCriterion("medical_conditions not between", value1, value2, "medicalConditions");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesIsNull() {
            addCriterion("learning_differences is null");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesIsNotNull() {
            addCriterion("learning_differences is not null");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesEqualTo(String value) {
            addCriterion("learning_differences =", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesNotEqualTo(String value) {
            addCriterion("learning_differences <>", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesGreaterThan(String value) {
            addCriterion("learning_differences >", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesGreaterThanOrEqualTo(String value) {
            addCriterion("learning_differences >=", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesLessThan(String value) {
            addCriterion("learning_differences <", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesLessThanOrEqualTo(String value) {
            addCriterion("learning_differences <=", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesLike(String value) {
            addCriterion("learning_differences like", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesNotLike(String value) {
            addCriterion("learning_differences not like", value, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesIn(List<String> values) {
            addCriterion("learning_differences in", values, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesNotIn(List<String> values) {
            addCriterion("learning_differences not in", values, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesBetween(String value1, String value2) {
            addCriterion("learning_differences between", value1, value2, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLearningDifferencesNotBetween(String value1, String value2) {
            addCriterion("learning_differences not between", value1, value2, "learningDifferences");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNull() {
            addCriterion("last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeEqualTo(Date value) {
            addCriterion("last_edit_time =", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotEqualTo(Date value) {
            addCriterion("last_edit_time <>", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThan(Date value) {
            addCriterion("last_edit_time >", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_edit_time >=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThan(Date value) {
            addCriterion("last_edit_time <", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_edit_time <=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIn(List<Date> values) {
            addCriterion("last_edit_time in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotIn(List<Date> values) {
            addCriterion("last_edit_time not in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeBetween(Date value1, Date value2) {
            addCriterion("last_edit_time between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_edit_time not between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateIsNull() {
            addCriterion("enquiry_date is null");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateIsNotNull() {
            addCriterion("enquiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("enquiry_date =", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enquiry_date <>", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("enquiry_date >", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enquiry_date >=", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateLessThan(Date value) {
            addCriterionForJDBCDate("enquiry_date <", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enquiry_date <=", value, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("enquiry_date in", values, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enquiry_date not in", values, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enquiry_date between", value1, value2, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andEnquiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enquiry_date not between", value1, value2, "enquiryDate");
            return (Criteria) this;
        }

        public Criteria andSourceOtherIsNull() {
            addCriterion("source_other is null");
            return (Criteria) this;
        }

        public Criteria andSourceOtherIsNotNull() {
            addCriterion("source_other is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOtherEqualTo(String value) {
            addCriterion("source_other =", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherNotEqualTo(String value) {
            addCriterion("source_other <>", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherGreaterThan(String value) {
            addCriterion("source_other >", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherGreaterThanOrEqualTo(String value) {
            addCriterion("source_other >=", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherLessThan(String value) {
            addCriterion("source_other <", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherLessThanOrEqualTo(String value) {
            addCriterion("source_other <=", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherLike(String value) {
            addCriterion("source_other like", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherNotLike(String value) {
            addCriterion("source_other not like", value, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherIn(List<String> values) {
            addCriterion("source_other in", values, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherNotIn(List<String> values) {
            addCriterion("source_other not in", values, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherBetween(String value1, String value2) {
            addCriterion("source_other between", value1, value2, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andSourceOtherNotBetween(String value1, String value2) {
            addCriterion("source_other not between", value1, value2, "sourceOther");
            return (Criteria) this;
        }

        public Criteria andConvertDateIsNull() {
            addCriterion("convert_date is null");
            return (Criteria) this;
        }

        public Criteria andConvertDateIsNotNull() {
            addCriterion("convert_date is not null");
            return (Criteria) this;
        }

        public Criteria andConvertDateEqualTo(Date value) {
            addCriterionForJDBCDate("convert_date =", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("convert_date <>", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateGreaterThan(Date value) {
            addCriterionForJDBCDate("convert_date >", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("convert_date >=", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateLessThan(Date value) {
            addCriterionForJDBCDate("convert_date <", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("convert_date <=", value, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateIn(List<Date> values) {
            addCriterionForJDBCDate("convert_date in", values, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("convert_date not in", values, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("convert_date between", value1, value2, "convertDate");
            return (Criteria) this;
        }

        public Criteria andConvertDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("convert_date not between", value1, value2, "convertDate");
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