package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnrichmentKlassscheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentKlassscheduleExample() {
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

        public Criteria andKlassnameIsNull() {
            addCriterion("klassname is null");
            return (Criteria) this;
        }

        public Criteria andKlassnameIsNotNull() {
            addCriterion("klassname is not null");
            return (Criteria) this;
        }

        public Criteria andKlassnameEqualTo(String value) {
            addCriterion("klassname =", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameNotEqualTo(String value) {
            addCriterion("klassname <>", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameGreaterThan(String value) {
            addCriterion("klassname >", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameGreaterThanOrEqualTo(String value) {
            addCriterion("klassname >=", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameLessThan(String value) {
            addCriterion("klassname <", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameLessThanOrEqualTo(String value) {
            addCriterion("klassname <=", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameLike(String value) {
            addCriterion("klassname like", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameNotLike(String value) {
            addCriterion("klassname not like", value, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameIn(List<String> values) {
            addCriterion("klassname in", values, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameNotIn(List<String> values) {
            addCriterion("klassname not in", values, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameBetween(String value1, String value2) {
            addCriterion("klassname between", value1, value2, "klassname");
            return (Criteria) this;
        }

        public Criteria andKlassnameNotBetween(String value1, String value2) {
            addCriterion("klassname not between", value1, value2, "klassname");
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

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Integer value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Integer value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Integer value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Integer value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Integer> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Integer> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
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

        public Criteria andAssistantIdIsNull() {
            addCriterion("assistant_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistantIdIsNotNull() {
            addCriterion("assistant_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantIdEqualTo(Integer value) {
            addCriterion("assistant_id =", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotEqualTo(Integer value) {
            addCriterion("assistant_id <>", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdGreaterThan(Integer value) {
            addCriterion("assistant_id >", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assistant_id >=", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdLessThan(Integer value) {
            addCriterion("assistant_id <", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdLessThanOrEqualTo(Integer value) {
            addCriterion("assistant_id <=", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdIn(List<Integer> values) {
            addCriterion("assistant_id in", values, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotIn(List<Integer> values) {
            addCriterion("assistant_id not in", values, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdBetween(Integer value1, Integer value2) {
            addCriterion("assistant_id between", value1, value2, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assistant_id not between", value1, value2, "assistantId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNull() {
            addCriterion("date_from is null");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNotNull() {
            addCriterion("date_from is not null");
            return (Criteria) this;
        }

        public Criteria andDateFromEqualTo(Date value) {
            addCriterionForJDBCDate("date_from =", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_from <>", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThan(Date value) {
            addCriterionForJDBCDate("date_from >", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_from >=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThan(Date value) {
            addCriterionForJDBCDate("date_from <", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_from <=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromIn(List<Date> values) {
            addCriterionForJDBCDate("date_from in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_from not in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_from between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_from not between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateToIsNull() {
            addCriterion("date_to is null");
            return (Criteria) this;
        }

        public Criteria andDateToIsNotNull() {
            addCriterion("date_to is not null");
            return (Criteria) this;
        }

        public Criteria andDateToEqualTo(Date value) {
            addCriterionForJDBCDate("date_to =", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_to <>", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThan(Date value) {
            addCriterionForJDBCDate("date_to >", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_to >=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThan(Date value) {
            addCriterionForJDBCDate("date_to <", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_to <=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToIn(List<Date> values) {
            addCriterionForJDBCDate("date_to in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_to not in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_to between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_to not between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDatePendingIsNull() {
            addCriterion("date_pending is null");
            return (Criteria) this;
        }

        public Criteria andDatePendingIsNotNull() {
            addCriterion("date_pending is not null");
            return (Criteria) this;
        }

        public Criteria andDatePendingEqualTo(Boolean value) {
            addCriterion("date_pending =", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingNotEqualTo(Boolean value) {
            addCriterion("date_pending <>", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingGreaterThan(Boolean value) {
            addCriterion("date_pending >", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("date_pending >=", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingLessThan(Boolean value) {
            addCriterion("date_pending <", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingLessThanOrEqualTo(Boolean value) {
            addCriterion("date_pending <=", value, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingIn(List<Boolean> values) {
            addCriterion("date_pending in", values, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingNotIn(List<Boolean> values) {
            addCriterion("date_pending not in", values, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingBetween(Boolean value1, Boolean value2) {
            addCriterion("date_pending between", value1, value2, "datePending");
            return (Criteria) this;
        }

        public Criteria andDatePendingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("date_pending not between", value1, value2, "datePending");
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
            addCriterionForJDBCDate("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterionForJDBCDate("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("created_date not between", value1, value2, "createdDate");
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