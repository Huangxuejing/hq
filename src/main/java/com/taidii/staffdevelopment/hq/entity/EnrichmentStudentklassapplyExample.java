package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentStudentklassapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentStudentklassapplyExample() {
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

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNull() {
            addCriterion("created_by_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIsNotNull() {
            addCriterion("created_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdEqualTo(Integer value) {
            addCriterion("created_by_id =", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotEqualTo(Integer value) {
            addCriterion("created_by_id <>", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThan(Integer value) {
            addCriterion("created_by_id >", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by_id >=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThan(Integer value) {
            addCriterion("created_by_id <", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdLessThanOrEqualTo(Integer value) {
            addCriterion("created_by_id <=", value, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdIn(List<Integer> values) {
            addCriterion("created_by_id in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotIn(List<Integer> values) {
            addCriterion("created_by_id not in", values, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdBetween(Integer value1, Integer value2) {
            addCriterion("created_by_id between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andCreatedByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by_id not between", value1, value2, "createdById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdIsNull() {
            addCriterion("last_update_by_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdIsNotNull() {
            addCriterion("last_update_by_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdEqualTo(Integer value) {
            addCriterion("last_update_by_id =", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdNotEqualTo(Integer value) {
            addCriterion("last_update_by_id <>", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdGreaterThan(Integer value) {
            addCriterion("last_update_by_id >", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_update_by_id >=", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdLessThan(Integer value) {
            addCriterion("last_update_by_id <", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_update_by_id <=", value, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdIn(List<Integer> values) {
            addCriterion("last_update_by_id in", values, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdNotIn(List<Integer> values) {
            addCriterion("last_update_by_id not in", values, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdBetween(Integer value1, Integer value2) {
            addCriterion("last_update_by_id between", value1, value2, "lastUpdateById");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_update_by_id not between", value1, value2, "lastUpdateById");
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