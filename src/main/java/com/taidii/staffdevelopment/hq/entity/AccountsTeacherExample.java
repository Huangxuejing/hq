package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccountsTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountsTeacherExample() {
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

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIcIsNull() {
            addCriterion("ic is null");
            return (Criteria) this;
        }

        public Criteria andIcIsNotNull() {
            addCriterion("ic is not null");
            return (Criteria) this;
        }

        public Criteria andIcEqualTo(String value) {
            addCriterion("ic =", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotEqualTo(String value) {
            addCriterion("ic <>", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThan(String value) {
            addCriterion("ic >", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThanOrEqualTo(String value) {
            addCriterion("ic >=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThan(String value) {
            addCriterion("ic <", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThanOrEqualTo(String value) {
            addCriterion("ic <=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLike(String value) {
            addCriterion("ic like", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotLike(String value) {
            addCriterion("ic not like", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcIn(List<String> values) {
            addCriterion("ic in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotIn(List<String> values) {
            addCriterion("ic not in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcBetween(String value1, String value2) {
            addCriterion("ic between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotBetween(String value1, String value2) {
            addCriterion("ic not between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeIsNull() {
            addCriterion("identification_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeIsNotNull() {
            addCriterion("identification_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeEqualTo(Integer value) {
            addCriterion("identification_type =", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeNotEqualTo(Integer value) {
            addCriterion("identification_type <>", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeGreaterThan(Integer value) {
            addCriterion("identification_type >", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("identification_type >=", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeLessThan(Integer value) {
            addCriterion("identification_type <", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("identification_type <=", value, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeIn(List<Integer> values) {
            addCriterion("identification_type in", values, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeNotIn(List<Integer> values) {
            addCriterion("identification_type not in", values, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeBetween(Integer value1, Integer value2) {
            addCriterion("identification_type between", value1, value2, "identificationType");
            return (Criteria) this;
        }

        public Criteria andIdentificationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("identification_type not between", value1, value2, "identificationType");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterionForJDBCDate("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_of_birth not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andHomeNumberIsNull() {
            addCriterion("home_number is null");
            return (Criteria) this;
        }

        public Criteria andHomeNumberIsNotNull() {
            addCriterion("home_number is not null");
            return (Criteria) this;
        }

        public Criteria andHomeNumberEqualTo(String value) {
            addCriterion("home_number =", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberNotEqualTo(String value) {
            addCriterion("home_number <>", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberGreaterThan(String value) {
            addCriterion("home_number >", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("home_number >=", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberLessThan(String value) {
            addCriterion("home_number <", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberLessThanOrEqualTo(String value) {
            addCriterion("home_number <=", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberLike(String value) {
            addCriterion("home_number like", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberNotLike(String value) {
            addCriterion("home_number not like", value, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberIn(List<String> values) {
            addCriterion("home_number in", values, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberNotIn(List<String> values) {
            addCriterion("home_number not in", values, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberBetween(String value1, String value2) {
            addCriterion("home_number between", value1, value2, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andHomeNumberNotBetween(String value1, String value2) {
            addCriterion("home_number not between", value1, value2, "homeNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIsNull() {
            addCriterion("employment_date is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIsNotNull() {
            addCriterion("employment_date is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("employment_date =", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("employment_date <>", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("employment_date >", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_date >=", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateLessThan(Date value) {
            addCriterionForJDBCDate("employment_date <", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_date <=", value, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("employment_date in", values, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("employment_date not in", values, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_date between", value1, value2, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_date not between", value1, value2, "employmentDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateIsNull() {
            addCriterion("resignation_date is null");
            return (Criteria) this;
        }

        public Criteria andResignationDateIsNotNull() {
            addCriterion("resignation_date is not null");
            return (Criteria) this;
        }

        public Criteria andResignationDateEqualTo(Date value) {
            addCriterionForJDBCDate("resignation_date =", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("resignation_date <>", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("resignation_date >", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resignation_date >=", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateLessThan(Date value) {
            addCriterionForJDBCDate("resignation_date <", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("resignation_date <=", value, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateIn(List<Date> values) {
            addCriterionForJDBCDate("resignation_date in", values, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("resignation_date not in", values, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resignation_date between", value1, value2, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andResignationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("resignation_date not between", value1, value2, "resignationDate");
            return (Criteria) this;
        }

        public Criteria andRaceIsNull() {
            addCriterion("race is null");
            return (Criteria) this;
        }

        public Criteria andRaceIsNotNull() {
            addCriterion("race is not null");
            return (Criteria) this;
        }

        public Criteria andRaceEqualTo(String value) {
            addCriterion("race =", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotEqualTo(String value) {
            addCriterion("race <>", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThan(String value) {
            addCriterion("race >", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThanOrEqualTo(String value) {
            addCriterion("race >=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThan(String value) {
            addCriterion("race <", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThanOrEqualTo(String value) {
            addCriterion("race <=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLike(String value) {
            addCriterion("race like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotLike(String value) {
            addCriterion("race not like", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceIn(List<String> values) {
            addCriterion("race in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotIn(List<String> values) {
            addCriterion("race not in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceBetween(String value1, String value2) {
            addCriterion("race between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotBetween(String value1, String value2) {
            addCriterion("race not between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNull() {
            addCriterion("education_level is null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNotNull() {
            addCriterion("education_level is not null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelEqualTo(String value) {
            addCriterion("education_level =", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotEqualTo(String value) {
            addCriterion("education_level <>", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThan(String value) {
            addCriterion("education_level >", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("education_level >=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThan(String value) {
            addCriterion("education_level <", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThanOrEqualTo(String value) {
            addCriterion("education_level <=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLike(String value) {
            addCriterion("education_level like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotLike(String value) {
            addCriterion("education_level not like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIn(List<String> values) {
            addCriterion("education_level in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotIn(List<String> values) {
            addCriterion("education_level not in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelBetween(String value1, String value2) {
            addCriterion("education_level between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotBetween(String value1, String value2) {
            addCriterion("education_level not between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andDesignationIsNull() {
            addCriterion("designation is null");
            return (Criteria) this;
        }

        public Criteria andDesignationIsNotNull() {
            addCriterion("designation is not null");
            return (Criteria) this;
        }

        public Criteria andDesignationEqualTo(String value) {
            addCriterion("designation =", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotEqualTo(String value) {
            addCriterion("designation <>", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationGreaterThan(String value) {
            addCriterion("designation >", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationGreaterThanOrEqualTo(String value) {
            addCriterion("designation >=", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLessThan(String value) {
            addCriterion("designation <", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLessThanOrEqualTo(String value) {
            addCriterion("designation <=", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLike(String value) {
            addCriterion("designation like", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotLike(String value) {
            addCriterion("designation not like", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationIn(List<String> values) {
            addCriterion("designation in", values, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotIn(List<String> values) {
            addCriterion("designation not in", values, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationBetween(String value1, String value2) {
            addCriterion("designation between", value1, value2, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotBetween(String value1, String value2) {
            addCriterion("designation not between", value1, value2, "designation");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andRfidIsNull() {
            addCriterion("rfid is null");
            return (Criteria) this;
        }

        public Criteria andRfidIsNotNull() {
            addCriterion("rfid is not null");
            return (Criteria) this;
        }

        public Criteria andRfidEqualTo(String value) {
            addCriterion("rfid =", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotEqualTo(String value) {
            addCriterion("rfid <>", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThan(String value) {
            addCriterion("rfid >", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidGreaterThanOrEqualTo(String value) {
            addCriterion("rfid >=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThan(String value) {
            addCriterion("rfid <", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLessThanOrEqualTo(String value) {
            addCriterion("rfid <=", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidLike(String value) {
            addCriterion("rfid like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotLike(String value) {
            addCriterion("rfid not like", value, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidIn(List<String> values) {
            addCriterion("rfid in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotIn(List<String> values) {
            addCriterion("rfid not in", values, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidBetween(String value1, String value2) {
            addCriterion("rfid between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andRfidNotBetween(String value1, String value2) {
            addCriterion("rfid not between", value1, value2, "rfid");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeIsNull() {
            addCriterion("total_overtime is null");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeIsNotNull() {
            addCriterion("total_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeEqualTo(Integer value) {
            addCriterion("total_overtime =", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeNotEqualTo(Integer value) {
            addCriterion("total_overtime <>", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeGreaterThan(Integer value) {
            addCriterion("total_overtime >", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_overtime >=", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeLessThan(Integer value) {
            addCriterion("total_overtime <", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("total_overtime <=", value, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeIn(List<Integer> values) {
            addCriterion("total_overtime in", values, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeNotIn(List<Integer> values) {
            addCriterion("total_overtime not in", values, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("total_overtime between", value1, value2, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("total_overtime not between", value1, value2, "totalOvertime");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedIsNull() {
            addCriterion("total_overtime_claimed is null");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedIsNotNull() {
            addCriterion("total_overtime_claimed is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedEqualTo(Integer value) {
            addCriterion("total_overtime_claimed =", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedNotEqualTo(Integer value) {
            addCriterion("total_overtime_claimed <>", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedGreaterThan(Integer value) {
            addCriterion("total_overtime_claimed >", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_overtime_claimed >=", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedLessThan(Integer value) {
            addCriterion("total_overtime_claimed <", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedLessThanOrEqualTo(Integer value) {
            addCriterion("total_overtime_claimed <=", value, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedIn(List<Integer> values) {
            addCriterion("total_overtime_claimed in", values, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedNotIn(List<Integer> values) {
            addCriterion("total_overtime_claimed not in", values, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedBetween(Integer value1, Integer value2) {
            addCriterion("total_overtime_claimed between", value1, value2, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andTotalOvertimeClaimedNotBetween(Integer value1, Integer value2) {
            addCriterion("total_overtime_claimed not between", value1, value2, "totalOvertimeClaimed");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("deleteflag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("deleteflag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(Integer value) {
            addCriterion("deleteflag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(Integer value) {
            addCriterion("deleteflag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(Integer value) {
            addCriterion("deleteflag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteflag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(Integer value) {
            addCriterion("deleteflag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(Integer value) {
            addCriterion("deleteflag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<Integer> values) {
            addCriterion("deleteflag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<Integer> values) {
            addCriterion("deleteflag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(Integer value1, Integer value2) {
            addCriterion("deleteflag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteflag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNull() {
            addCriterion("unit_no is null");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNotNull() {
            addCriterion("unit_no is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNoEqualTo(String value) {
            addCriterion("unit_no =", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotEqualTo(String value) {
            addCriterion("unit_no <>", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThan(String value) {
            addCriterion("unit_no >", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThanOrEqualTo(String value) {
            addCriterion("unit_no >=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThan(String value) {
            addCriterion("unit_no <", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThanOrEqualTo(String value) {
            addCriterion("unit_no <=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLike(String value) {
            addCriterion("unit_no like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotLike(String value) {
            addCriterion("unit_no not like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoIn(List<String> values) {
            addCriterion("unit_no in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotIn(List<String> values) {
            addCriterion("unit_no not in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoBetween(String value1, String value2) {
            addCriterion("unit_no between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotBetween(String value1, String value2) {
            addCriterion("unit_no not between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIsNull() {
            addCriterion("employment_status is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIsNotNull() {
            addCriterion("employment_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusEqualTo(Integer value) {
            addCriterion("employment_status =", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotEqualTo(Integer value) {
            addCriterion("employment_status <>", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusGreaterThan(Integer value) {
            addCriterion("employment_status >", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("employment_status >=", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusLessThan(Integer value) {
            addCriterion("employment_status <", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("employment_status <=", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIn(List<Integer> values) {
            addCriterion("employment_status in", values, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotIn(List<Integer> values) {
            addCriterion("employment_status not in", values, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("employment_status between", value1, value2, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("employment_status not between", value1, value2, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartIsNull() {
            addCriterion("employment_start is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartIsNotNull() {
            addCriterion("employment_start is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartEqualTo(Date value) {
            addCriterionForJDBCDate("employment_start =", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("employment_start <>", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartGreaterThan(Date value) {
            addCriterionForJDBCDate("employment_start >", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_start >=", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartLessThan(Date value) {
            addCriterionForJDBCDate("employment_start <", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_start <=", value, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartIn(List<Date> values) {
            addCriterionForJDBCDate("employment_start in", values, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("employment_start not in", values, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_start between", value1, value2, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_start not between", value1, value2, "employmentStart");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndIsNull() {
            addCriterion("employment_end is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndIsNotNull() {
            addCriterion("employment_end is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndEqualTo(Date value) {
            addCriterionForJDBCDate("employment_end =", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("employment_end <>", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndGreaterThan(Date value) {
            addCriterionForJDBCDate("employment_end >", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_end >=", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndLessThan(Date value) {
            addCriterionForJDBCDate("employment_end <", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employment_end <=", value, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndIn(List<Date> values) {
            addCriterionForJDBCDate("employment_end in", values, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("employment_end not in", values, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_end between", value1, value2, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andEmploymentEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employment_end not between", value1, value2, "employmentEnd");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNull() {
            addCriterion("contract_period is null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIsNotNull() {
            addCriterion("contract_period is not null");
            return (Criteria) this;
        }

        public Criteria andContractPeriodEqualTo(String value) {
            addCriterion("contract_period =", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotEqualTo(String value) {
            addCriterion("contract_period <>", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThan(String value) {
            addCriterion("contract_period >", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("contract_period >=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThan(String value) {
            addCriterion("contract_period <", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLessThanOrEqualTo(String value) {
            addCriterion("contract_period <=", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodLike(String value) {
            addCriterion("contract_period like", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotLike(String value) {
            addCriterion("contract_period not like", value, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodIn(List<String> values) {
            addCriterion("contract_period in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotIn(List<String> values) {
            addCriterion("contract_period not in", values, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodBetween(String value1, String value2) {
            addCriterion("contract_period between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andContractPeriodNotBetween(String value1, String value2) {
            addCriterion("contract_period not between", value1, value2, "contractPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodIsNull() {
            addCriterion("probation_period is null");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodIsNotNull() {
            addCriterion("probation_period is not null");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodEqualTo(Date value) {
            addCriterionForJDBCDate("probation_period =", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodNotEqualTo(Date value) {
            addCriterionForJDBCDate("probation_period <>", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodGreaterThan(Date value) {
            addCriterionForJDBCDate("probation_period >", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probation_period >=", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodLessThan(Date value) {
            addCriterionForJDBCDate("probation_period <", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probation_period <=", value, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodIn(List<Date> values) {
            addCriterionForJDBCDate("probation_period in", values, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodNotIn(List<Date> values) {
            addCriterionForJDBCDate("probation_period not in", values, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probation_period between", value1, value2, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationPeriodNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probation_period not between", value1, value2, "probationPeriod");
            return (Criteria) this;
        }

        public Criteria andProbationEndIsNull() {
            addCriterion("probation_end is null");
            return (Criteria) this;
        }

        public Criteria andProbationEndIsNotNull() {
            addCriterion("probation_end is not null");
            return (Criteria) this;
        }

        public Criteria andProbationEndEqualTo(Date value) {
            addCriterionForJDBCDate("probation_end =", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("probation_end <>", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndGreaterThan(Date value) {
            addCriterionForJDBCDate("probation_end >", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probation_end >=", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndLessThan(Date value) {
            addCriterionForJDBCDate("probation_end <", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("probation_end <=", value, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndIn(List<Date> values) {
            addCriterionForJDBCDate("probation_end in", values, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("probation_end not in", values, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probation_end between", value1, value2, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andProbationEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("probation_end not between", value1, value2, "probationEnd");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceIsNull() {
            addCriterion("length_of_service is null");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceIsNotNull() {
            addCriterion("length_of_service is not null");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceEqualTo(String value) {
            addCriterion("length_of_service =", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceNotEqualTo(String value) {
            addCriterion("length_of_service <>", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceGreaterThan(String value) {
            addCriterion("length_of_service >", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceGreaterThanOrEqualTo(String value) {
            addCriterion("length_of_service >=", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceLessThan(String value) {
            addCriterion("length_of_service <", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceLessThanOrEqualTo(String value) {
            addCriterion("length_of_service <=", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceLike(String value) {
            addCriterion("length_of_service like", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceNotLike(String value) {
            addCriterion("length_of_service not like", value, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceIn(List<String> values) {
            addCriterion("length_of_service in", values, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceNotIn(List<String> values) {
            addCriterion("length_of_service not in", values, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceBetween(String value1, String value2) {
            addCriterion("length_of_service between", value1, value2, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andLengthOfServiceNotBetween(String value1, String value2) {
            addCriterion("length_of_service not between", value1, value2, "lengthOfService");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNull() {
            addCriterion("graduation_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIsNotNull() {
            addCriterion("graduation_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolEqualTo(String value) {
            addCriterion("graduation_school =", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotEqualTo(String value) {
            addCriterion("graduation_school <>", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThan(String value) {
            addCriterion("graduation_school >", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduation_school >=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThan(String value) {
            addCriterion("graduation_school <", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduation_school <=", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolLike(String value) {
            addCriterion("graduation_school like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotLike(String value) {
            addCriterion("graduation_school not like", value, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolIn(List<String> values) {
            addCriterion("graduation_school in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotIn(List<String> values) {
            addCriterion("graduation_school not in", values, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolBetween(String value1, String value2) {
            addCriterion("graduation_school between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andGraduationSchoolNotBetween(String value1, String value2) {
            addCriterion("graduation_school not between", value1, value2, "graduationSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNull() {
            addCriterion("graduation_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNotNull() {
            addCriterion("graduation_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateEqualTo(Date value) {
            addCriterionForJDBCDate("graduation_date =", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduation_date <>", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduation_date >", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduation_date >=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThan(Date value) {
            addCriterionForJDBCDate("graduation_date <", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduation_date <=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIn(List<Date> values) {
            addCriterionForJDBCDate("graduation_date in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduation_date not in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduation_date between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduation_date not between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyIsNull() {
            addCriterion("former_company is null");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyIsNotNull() {
            addCriterion("former_company is not null");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyEqualTo(String value) {
            addCriterion("former_company =", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyNotEqualTo(String value) {
            addCriterion("former_company <>", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyGreaterThan(String value) {
            addCriterion("former_company >", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("former_company >=", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyLessThan(String value) {
            addCriterion("former_company <", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyLessThanOrEqualTo(String value) {
            addCriterion("former_company <=", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyLike(String value) {
            addCriterion("former_company like", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyNotLike(String value) {
            addCriterion("former_company not like", value, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyIn(List<String> values) {
            addCriterion("former_company in", values, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyNotIn(List<String> values) {
            addCriterion("former_company not in", values, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyBetween(String value1, String value2) {
            addCriterion("former_company between", value1, value2, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andFormerCompanyNotBetween(String value1, String value2) {
            addCriterion("former_company not between", value1, value2, "formerCompany");
            return (Criteria) this;
        }

        public Criteria andEndowmentIsNull() {
            addCriterion("endowment is null");
            return (Criteria) this;
        }

        public Criteria andEndowmentIsNotNull() {
            addCriterion("endowment is not null");
            return (Criteria) this;
        }

        public Criteria andEndowmentEqualTo(String value) {
            addCriterion("endowment =", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentNotEqualTo(String value) {
            addCriterion("endowment <>", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentGreaterThan(String value) {
            addCriterion("endowment >", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentGreaterThanOrEqualTo(String value) {
            addCriterion("endowment >=", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentLessThan(String value) {
            addCriterion("endowment <", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentLessThanOrEqualTo(String value) {
            addCriterion("endowment <=", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentLike(String value) {
            addCriterion("endowment like", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentNotLike(String value) {
            addCriterion("endowment not like", value, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentIn(List<String> values) {
            addCriterion("endowment in", values, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentNotIn(List<String> values) {
            addCriterion("endowment not in", values, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentBetween(String value1, String value2) {
            addCriterion("endowment between", value1, value2, "endowment");
            return (Criteria) this;
        }

        public Criteria andEndowmentNotBetween(String value1, String value2) {
            addCriterion("endowment not between", value1, value2, "endowment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentIsNull() {
            addCriterion("medical_treatment is null");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentIsNotNull() {
            addCriterion("medical_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentEqualTo(String value) {
            addCriterion("medical_treatment =", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentNotEqualTo(String value) {
            addCriterion("medical_treatment <>", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentGreaterThan(String value) {
            addCriterion("medical_treatment >", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("medical_treatment >=", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentLessThan(String value) {
            addCriterion("medical_treatment <", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentLessThanOrEqualTo(String value) {
            addCriterion("medical_treatment <=", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentLike(String value) {
            addCriterion("medical_treatment like", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentNotLike(String value) {
            addCriterion("medical_treatment not like", value, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentIn(List<String> values) {
            addCriterion("medical_treatment in", values, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentNotIn(List<String> values) {
            addCriterion("medical_treatment not in", values, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentBetween(String value1, String value2) {
            addCriterion("medical_treatment between", value1, value2, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentNotBetween(String value1, String value2) {
            addCriterion("medical_treatment not between", value1, value2, "medicalTreatment");
            return (Criteria) this;
        }

        public Criteria andArchivesIsNull() {
            addCriterion("archives is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIsNotNull() {
            addCriterion("archives is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesEqualTo(String value) {
            addCriterion("archives =", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotEqualTo(String value) {
            addCriterion("archives <>", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesGreaterThan(String value) {
            addCriterion("archives >", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesGreaterThanOrEqualTo(String value) {
            addCriterion("archives >=", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLessThan(String value) {
            addCriterion("archives <", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLessThanOrEqualTo(String value) {
            addCriterion("archives <=", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesLike(String value) {
            addCriterion("archives like", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotLike(String value) {
            addCriterion("archives not like", value, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesIn(List<String> values) {
            addCriterion("archives in", values, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotIn(List<String> values) {
            addCriterion("archives not in", values, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesBetween(String value1, String value2) {
            addCriterion("archives between", value1, value2, "archives");
            return (Criteria) this;
        }

        public Criteria andArchivesNotBetween(String value1, String value2) {
            addCriterion("archives not between", value1, value2, "archives");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateIsNull() {
            addCriterion("degree_certificate is null");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateIsNotNull() {
            addCriterion("degree_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateEqualTo(String value) {
            addCriterion("degree_certificate =", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateNotEqualTo(String value) {
            addCriterion("degree_certificate <>", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateGreaterThan(String value) {
            addCriterion("degree_certificate >", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("degree_certificate >=", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateLessThan(String value) {
            addCriterion("degree_certificate <", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateLessThanOrEqualTo(String value) {
            addCriterion("degree_certificate <=", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateLike(String value) {
            addCriterion("degree_certificate like", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateNotLike(String value) {
            addCriterion("degree_certificate not like", value, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateIn(List<String> values) {
            addCriterion("degree_certificate in", values, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateNotIn(List<String> values) {
            addCriterion("degree_certificate not in", values, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateBetween(String value1, String value2) {
            addCriterion("degree_certificate between", value1, value2, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andDegreeCertificateNotBetween(String value1, String value2) {
            addCriterion("degree_certificate not between", value1, value2, "degreeCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNull() {
            addCriterion("qualification is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIsNotNull() {
            addCriterion("qualification is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationEqualTo(String value) {
            addCriterion("qualification =", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotEqualTo(String value) {
            addCriterion("qualification <>", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThan(String value) {
            addCriterion("qualification >", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("qualification >=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThan(String value) {
            addCriterion("qualification <", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLessThanOrEqualTo(String value) {
            addCriterion("qualification <=", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationLike(String value) {
            addCriterion("qualification like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotLike(String value) {
            addCriterion("qualification not like", value, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationIn(List<String> values) {
            addCriterion("qualification in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotIn(List<String> values) {
            addCriterion("qualification not in", values, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationBetween(String value1, String value2) {
            addCriterion("qualification between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andQualificationNotBetween(String value1, String value2) {
            addCriterion("qualification not between", value1, value2, "qualification");
            return (Criteria) this;
        }

        public Criteria andTouchAbleIsNull() {
            addCriterion("touch_able is null");
            return (Criteria) this;
        }

        public Criteria andTouchAbleIsNotNull() {
            addCriterion("touch_able is not null");
            return (Criteria) this;
        }

        public Criteria andTouchAbleEqualTo(Integer value) {
            addCriterion("touch_able =", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleNotEqualTo(Integer value) {
            addCriterion("touch_able <>", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleGreaterThan(Integer value) {
            addCriterion("touch_able >", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleGreaterThanOrEqualTo(Integer value) {
            addCriterion("touch_able >=", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleLessThan(Integer value) {
            addCriterion("touch_able <", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleLessThanOrEqualTo(Integer value) {
            addCriterion("touch_able <=", value, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleIn(List<Integer> values) {
            addCriterion("touch_able in", values, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleNotIn(List<Integer> values) {
            addCriterion("touch_able not in", values, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleBetween(Integer value1, Integer value2) {
            addCriterion("touch_able between", value1, value2, "touchAble");
            return (Criteria) this;
        }

        public Criteria andTouchAbleNotBetween(Integer value1, Integer value2) {
            addCriterion("touch_able not between", value1, value2, "touchAble");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNull() {
            addCriterion("application_date is null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIsNotNull() {
            addCriterion("application_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationDateEqualTo(Date value) {
            addCriterionForJDBCDate("application_date =", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("application_date <>", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("application_date >", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("application_date >=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThan(Date value) {
            addCriterionForJDBCDate("application_date <", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("application_date <=", value, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateIn(List<Date> values) {
            addCriterionForJDBCDate("application_date in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("application_date not in", values, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("application_date between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andApplicationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("application_date not between", value1, value2, "applicationDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNull() {
            addCriterion("expired_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIsNotNull() {
            addCriterion("expired_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredDateEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date =", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date <>", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expired_date >", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date >=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThan(Date value) {
            addCriterionForJDBCDate("expired_date <", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expired_date <=", value, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateIn(List<Date> values) {
            addCriterionForJDBCDate("expired_date in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expired_date not in", values, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expired_date between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andExpiredDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expired_date not between", value1, value2, "expiredDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateIsNull() {
            addCriterion("firstAid_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateIsNotNull() {
            addCriterion("firstAid_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date =", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date <>", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date >", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date >=", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date <", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstAid_expiry_date <=", value, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("firstAid_expiry_date in", values, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstAid_expiry_date not in", values, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstAid_expiry_date between", value1, value2, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andFirstaidExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstAid_expiry_date not between", value1, value2, "firstaidExpiryDate");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoIsNull() {
            addCriterion("customer_reference_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoIsNotNull() {
            addCriterion("customer_reference_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoEqualTo(String value) {
            addCriterion("customer_reference_no =", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoNotEqualTo(String value) {
            addCriterion("customer_reference_no <>", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoGreaterThan(String value) {
            addCriterion("customer_reference_no >", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_reference_no >=", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoLessThan(String value) {
            addCriterion("customer_reference_no <", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoLessThanOrEqualTo(String value) {
            addCriterion("customer_reference_no <=", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoLike(String value) {
            addCriterion("customer_reference_no like", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoNotLike(String value) {
            addCriterion("customer_reference_no not like", value, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoIn(List<String> values) {
            addCriterion("customer_reference_no in", values, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoNotIn(List<String> values) {
            addCriterion("customer_reference_no not in", values, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoBetween(String value1, String value2) {
            addCriterion("customer_reference_no between", value1, value2, "customerReferenceNo");
            return (Criteria) this;
        }

        public Criteria andCustomerReferenceNoNotBetween(String value1, String value2) {
            addCriterion("customer_reference_no not between", value1, value2, "customerReferenceNo");
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