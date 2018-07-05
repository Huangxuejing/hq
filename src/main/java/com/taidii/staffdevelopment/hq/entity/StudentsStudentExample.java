package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentsStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsStudentExample() {
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

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
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

        public Criteria andReligionIsNull() {
            addCriterion("religion is null");
            return (Criteria) this;
        }

        public Criteria andReligionIsNotNull() {
            addCriterion("religion is not null");
            return (Criteria) this;
        }

        public Criteria andReligionEqualTo(String value) {
            addCriterion("religion =", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotEqualTo(String value) {
            addCriterion("religion <>", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThan(String value) {
            addCriterion("religion >", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThanOrEqualTo(String value) {
            addCriterion("religion >=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThan(String value) {
            addCriterion("religion <", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThanOrEqualTo(String value) {
            addCriterion("religion <=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLike(String value) {
            addCriterion("religion like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotLike(String value) {
            addCriterion("religion not like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionIn(List<String> values) {
            addCriterion("religion in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotIn(List<String> values) {
            addCriterion("religion not in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionBetween(String value1, String value2) {
            addCriterion("religion between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotBetween(String value1, String value2) {
            addCriterion("religion not between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNull() {
            addCriterion("mother_tongue is null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNotNull() {
            addCriterion("mother_tongue is not null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueEqualTo(String value) {
            addCriterion("mother_tongue =", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotEqualTo(String value) {
            addCriterion("mother_tongue <>", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThan(String value) {
            addCriterion("mother_tongue >", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThanOrEqualTo(String value) {
            addCriterion("mother_tongue >=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThan(String value) {
            addCriterion("mother_tongue <", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThanOrEqualTo(String value) {
            addCriterion("mother_tongue <=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLike(String value) {
            addCriterion("mother_tongue like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotLike(String value) {
            addCriterion("mother_tongue not like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIn(List<String> values) {
            addCriterion("mother_tongue in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotIn(List<String> values) {
            addCriterion("mother_tongue not in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueBetween(String value1, String value2) {
            addCriterion("mother_tongue between", value1, value2, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotBetween(String value1, String value2) {
            addCriterion("mother_tongue not between", value1, value2, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenIsNull() {
            addCriterion("language_spoken is null");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenIsNotNull() {
            addCriterion("language_spoken is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenEqualTo(String value) {
            addCriterion("language_spoken =", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenNotEqualTo(String value) {
            addCriterion("language_spoken <>", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenGreaterThan(String value) {
            addCriterion("language_spoken >", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenGreaterThanOrEqualTo(String value) {
            addCriterion("language_spoken >=", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenLessThan(String value) {
            addCriterion("language_spoken <", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenLessThanOrEqualTo(String value) {
            addCriterion("language_spoken <=", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenLike(String value) {
            addCriterion("language_spoken like", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenNotLike(String value) {
            addCriterion("language_spoken not like", value, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenIn(List<String> values) {
            addCriterion("language_spoken in", values, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenNotIn(List<String> values) {
            addCriterion("language_spoken not in", values, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenBetween(String value1, String value2) {
            addCriterion("language_spoken between", value1, value2, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andLanguageSpokenNotBetween(String value1, String value2) {
            addCriterion("language_spoken not between", value1, value2, "languageSpoken");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNull() {
            addCriterion("medical_record is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNotNull() {
            addCriterion("medical_record is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordEqualTo(String value) {
            addCriterion("medical_record =", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotEqualTo(String value) {
            addCriterion("medical_record <>", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThan(String value) {
            addCriterion("medical_record >", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("medical_record >=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThan(String value) {
            addCriterion("medical_record <", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("medical_record <=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLike(String value) {
            addCriterion("medical_record like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotLike(String value) {
            addCriterion("medical_record not like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIn(List<String> values) {
            addCriterion("medical_record in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotIn(List<String> values) {
            addCriterion("medical_record not in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordBetween(String value1, String value2) {
            addCriterion("medical_record between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("medical_record not between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsIsNull() {
            addCriterion("special_needs is null");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsIsNotNull() {
            addCriterion("special_needs is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsEqualTo(String value) {
            addCriterion("special_needs =", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsNotEqualTo(String value) {
            addCriterion("special_needs <>", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsGreaterThan(String value) {
            addCriterion("special_needs >", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsGreaterThanOrEqualTo(String value) {
            addCriterion("special_needs >=", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsLessThan(String value) {
            addCriterion("special_needs <", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsLessThanOrEqualTo(String value) {
            addCriterion("special_needs <=", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsLike(String value) {
            addCriterion("special_needs like", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsNotLike(String value) {
            addCriterion("special_needs not like", value, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsIn(List<String> values) {
            addCriterion("special_needs in", values, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsNotIn(List<String> values) {
            addCriterion("special_needs not in", values, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsBetween(String value1, String value2) {
            addCriterion("special_needs between", value1, value2, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andSpecialNeedsNotBetween(String value1, String value2) {
            addCriterion("special_needs not between", value1, value2, "specialNeeds");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("enter_date >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(Date value) {
            addCriterionForJDBCDate("enter_date <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enter_date <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<Date> values) {
            addCriterionForJDBCDate("enter_date in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enter_date not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enter_date between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enter_date not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNull() {
            addCriterion("leave_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNotNull() {
            addCriterion("leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date =", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <>", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_date >", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date >=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThan(Date value) {
            addCriterionForJDBCDate("leave_date <", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_date <=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_date not in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_date not between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoIsNull() {
            addCriterion("emergency_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoIsNotNull() {
            addCriterion("emergency_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoEqualTo(String value) {
            addCriterion("emergency_contact_no =", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoNotEqualTo(String value) {
            addCriterion("emergency_contact_no <>", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoGreaterThan(String value) {
            addCriterion("emergency_contact_no >", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_no >=", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoLessThan(String value) {
            addCriterion("emergency_contact_no <", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_no <=", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoLike(String value) {
            addCriterion("emergency_contact_no like", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoNotLike(String value) {
            addCriterion("emergency_contact_no not like", value, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoIn(List<String> values) {
            addCriterion("emergency_contact_no in", values, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoNotIn(List<String> values) {
            addCriterion("emergency_contact_no not in", values, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoBetween(String value1, String value2) {
            addCriterion("emergency_contact_no between", value1, value2, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNoNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_no not between", value1, value2, "emergencyContactNo");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeIsNull() {
            addCriterion("student_care_type is null");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeIsNotNull() {
            addCriterion("student_care_type is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeEqualTo(Integer value) {
            addCriterion("student_care_type =", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeNotEqualTo(Integer value) {
            addCriterion("student_care_type <>", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeGreaterThan(Integer value) {
            addCriterion("student_care_type >", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_care_type >=", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeLessThan(Integer value) {
            addCriterion("student_care_type <", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeLessThanOrEqualTo(Integer value) {
            addCriterion("student_care_type <=", value, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeIn(List<Integer> values) {
            addCriterion("student_care_type in", values, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeNotIn(List<Integer> values) {
            addCriterion("student_care_type not in", values, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeBetween(Integer value1, Integer value2) {
            addCriterion("student_care_type between", value1, value2, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andStudentCareTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("student_care_type not between", value1, value2, "studentCareType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIsNull() {
            addCriterion("program_type is null");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIsNotNull() {
            addCriterion("program_type is not null");
            return (Criteria) this;
        }

        public Criteria andProgramTypeEqualTo(Integer value) {
            addCriterion("program_type =", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotEqualTo(Integer value) {
            addCriterion("program_type <>", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeGreaterThan(Integer value) {
            addCriterion("program_type >", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("program_type >=", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeLessThan(Integer value) {
            addCriterion("program_type <", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeLessThanOrEqualTo(Integer value) {
            addCriterion("program_type <=", value, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeIn(List<Integer> values) {
            addCriterion("program_type in", values, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotIn(List<Integer> values) {
            addCriterion("program_type not in", values, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeBetween(Integer value1, Integer value2) {
            addCriterion("program_type between", value1, value2, "programType");
            return (Criteria) this;
        }

        public Criteria andProgramTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("program_type not between", value1, value2, "programType");
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

        public Criteria andRegistrationNoIsNull() {
            addCriterion("registration_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoIsNotNull() {
            addCriterion("registration_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoEqualTo(String value) {
            addCriterion("registration_no =", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoNotEqualTo(String value) {
            addCriterion("registration_no <>", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoGreaterThan(String value) {
            addCriterion("registration_no >", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoGreaterThanOrEqualTo(String value) {
            addCriterion("registration_no >=", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoLessThan(String value) {
            addCriterion("registration_no <", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoLessThanOrEqualTo(String value) {
            addCriterion("registration_no <=", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoLike(String value) {
            addCriterion("registration_no like", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoNotLike(String value) {
            addCriterion("registration_no not like", value, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoIn(List<String> values) {
            addCriterion("registration_no in", values, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoNotIn(List<String> values) {
            addCriterion("registration_no not in", values, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoBetween(String value1, String value2) {
            addCriterion("registration_no between", value1, value2, "registrationNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoNotBetween(String value1, String value2) {
            addCriterion("registration_no not between", value1, value2, "registrationNo");
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

        public Criteria andEmergencyContactIsNull() {
            addCriterion("emergency_contact is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIsNotNull() {
            addCriterion("emergency_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactEqualTo(String value) {
            addCriterion("emergency_contact =", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotEqualTo(String value) {
            addCriterion("emergency_contact <>", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThan(String value) {
            addCriterion("emergency_contact >", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact >=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThan(String value) {
            addCriterion("emergency_contact <", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact <=", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactLike(String value) {
            addCriterion("emergency_contact like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotLike(String value) {
            addCriterion("emergency_contact not like", value, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactIn(List<String> values) {
            addCriterion("emergency_contact in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotIn(List<String> values) {
            addCriterion("emergency_contact not in", values, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactBetween(String value1, String value2) {
            addCriterion("emergency_contact between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNotBetween(String value1, String value2) {
            addCriterion("emergency_contact not between", value1, value2, "emergencyContact");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("country not between", value1, value2, "country");
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

        public Criteria andBirthRangeIsNull() {
            addCriterion("birth_range is null");
            return (Criteria) this;
        }

        public Criteria andBirthRangeIsNotNull() {
            addCriterion("birth_range is not null");
            return (Criteria) this;
        }

        public Criteria andBirthRangeEqualTo(Integer value) {
            addCriterion("birth_range =", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeNotEqualTo(Integer value) {
            addCriterion("birth_range <>", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeGreaterThan(Integer value) {
            addCriterion("birth_range >", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeGreaterThanOrEqualTo(Integer value) {
            addCriterion("birth_range >=", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeLessThan(Integer value) {
            addCriterion("birth_range <", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeLessThanOrEqualTo(Integer value) {
            addCriterion("birth_range <=", value, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeIn(List<Integer> values) {
            addCriterion("birth_range in", values, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeNotIn(List<Integer> values) {
            addCriterion("birth_range not in", values, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeBetween(Integer value1, Integer value2) {
            addCriterion("birth_range between", value1, value2, "birthRange");
            return (Criteria) this;
        }

        public Criteria andBirthRangeNotBetween(Integer value1, Integer value2) {
            addCriterion("birth_range not between", value1, value2, "birthRange");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameIsNull() {
            addCriterion("alternative_care_name is null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameIsNotNull() {
            addCriterion("alternative_care_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameEqualTo(String value) {
            addCriterion("alternative_care_name =", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameNotEqualTo(String value) {
            addCriterion("alternative_care_name <>", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameGreaterThan(String value) {
            addCriterion("alternative_care_name >", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameGreaterThanOrEqualTo(String value) {
            addCriterion("alternative_care_name >=", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameLessThan(String value) {
            addCriterion("alternative_care_name <", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameLessThanOrEqualTo(String value) {
            addCriterion("alternative_care_name <=", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameLike(String value) {
            addCriterion("alternative_care_name like", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameNotLike(String value) {
            addCriterion("alternative_care_name not like", value, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameIn(List<String> values) {
            addCriterion("alternative_care_name in", values, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameNotIn(List<String> values) {
            addCriterion("alternative_care_name not in", values, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameBetween(String value1, String value2) {
            addCriterion("alternative_care_name between", value1, value2, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareNameNotBetween(String value1, String value2) {
            addCriterion("alternative_care_name not between", value1, value2, "alternativeCareName");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoIsNull() {
            addCriterion("alternative_care_contact_no is null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoIsNotNull() {
            addCriterion("alternative_care_contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoEqualTo(String value) {
            addCriterion("alternative_care_contact_no =", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoNotEqualTo(String value) {
            addCriterion("alternative_care_contact_no <>", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoGreaterThan(String value) {
            addCriterion("alternative_care_contact_no >", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("alternative_care_contact_no >=", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoLessThan(String value) {
            addCriterion("alternative_care_contact_no <", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoLessThanOrEqualTo(String value) {
            addCriterion("alternative_care_contact_no <=", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoLike(String value) {
            addCriterion("alternative_care_contact_no like", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoNotLike(String value) {
            addCriterion("alternative_care_contact_no not like", value, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoIn(List<String> values) {
            addCriterion("alternative_care_contact_no in", values, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoNotIn(List<String> values) {
            addCriterion("alternative_care_contact_no not in", values, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoBetween(String value1, String value2) {
            addCriterion("alternative_care_contact_no between", value1, value2, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareContactNoNotBetween(String value1, String value2) {
            addCriterion("alternative_care_contact_no not between", value1, value2, "alternativeCareContactNo");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressIsNull() {
            addCriterion("alternative_care_adress is null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressIsNotNull() {
            addCriterion("alternative_care_adress is not null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressEqualTo(String value) {
            addCriterion("alternative_care_adress =", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressNotEqualTo(String value) {
            addCriterion("alternative_care_adress <>", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressGreaterThan(String value) {
            addCriterion("alternative_care_adress >", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressGreaterThanOrEqualTo(String value) {
            addCriterion("alternative_care_adress >=", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressLessThan(String value) {
            addCriterion("alternative_care_adress <", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressLessThanOrEqualTo(String value) {
            addCriterion("alternative_care_adress <=", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressLike(String value) {
            addCriterion("alternative_care_adress like", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressNotLike(String value) {
            addCriterion("alternative_care_adress not like", value, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressIn(List<String> values) {
            addCriterion("alternative_care_adress in", values, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressNotIn(List<String> values) {
            addCriterion("alternative_care_adress not in", values, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressBetween(String value1, String value2) {
            addCriterion("alternative_care_adress between", value1, value2, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareAdressNotBetween(String value1, String value2) {
            addCriterion("alternative_care_adress not between", value1, value2, "alternativeCareAdress");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipIsNull() {
            addCriterion("alternative_care_relationship is null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipIsNotNull() {
            addCriterion("alternative_care_relationship is not null");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipEqualTo(String value) {
            addCriterion("alternative_care_relationship =", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipNotEqualTo(String value) {
            addCriterion("alternative_care_relationship <>", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipGreaterThan(String value) {
            addCriterion("alternative_care_relationship >", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("alternative_care_relationship >=", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipLessThan(String value) {
            addCriterion("alternative_care_relationship <", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipLessThanOrEqualTo(String value) {
            addCriterion("alternative_care_relationship <=", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipLike(String value) {
            addCriterion("alternative_care_relationship like", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipNotLike(String value) {
            addCriterion("alternative_care_relationship not like", value, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipIn(List<String> values) {
            addCriterion("alternative_care_relationship in", values, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipNotIn(List<String> values) {
            addCriterion("alternative_care_relationship not in", values, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipBetween(String value1, String value2) {
            addCriterion("alternative_care_relationship between", value1, value2, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andAlternativeCareRelationshipNotBetween(String value1, String value2) {
            addCriterion("alternative_care_relationship not between", value1, value2, "alternativeCareRelationship");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordIsNull() {
            addCriterion("touch_password is null");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordIsNotNull() {
            addCriterion("touch_password is not null");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordEqualTo(String value) {
            addCriterion("touch_password =", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordNotEqualTo(String value) {
            addCriterion("touch_password <>", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordGreaterThan(String value) {
            addCriterion("touch_password >", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("touch_password >=", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordLessThan(String value) {
            addCriterion("touch_password <", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordLessThanOrEqualTo(String value) {
            addCriterion("touch_password <=", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordLike(String value) {
            addCriterion("touch_password like", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordNotLike(String value) {
            addCriterion("touch_password not like", value, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordIn(List<String> values) {
            addCriterion("touch_password in", values, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordNotIn(List<String> values) {
            addCriterion("touch_password not in", values, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordBetween(String value1, String value2) {
            addCriterion("touch_password between", value1, value2, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andTouchPasswordNotBetween(String value1, String value2) {
            addCriterion("touch_password not between", value1, value2, "touchPassword");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdIsNull() {
            addCriterion("enrichment_center_id is null");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdIsNotNull() {
            addCriterion("enrichment_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdEqualTo(Integer value) {
            addCriterion("enrichment_center_id =", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdNotEqualTo(Integer value) {
            addCriterion("enrichment_center_id <>", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdGreaterThan(Integer value) {
            addCriterion("enrichment_center_id >", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enrichment_center_id >=", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdLessThan(Integer value) {
            addCriterion("enrichment_center_id <", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdLessThanOrEqualTo(Integer value) {
            addCriterion("enrichment_center_id <=", value, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdIn(List<Integer> values) {
            addCriterion("enrichment_center_id in", values, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdNotIn(List<Integer> values) {
            addCriterion("enrichment_center_id not in", values, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdBetween(Integer value1, Integer value2) {
            addCriterion("enrichment_center_id between", value1, value2, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andEnrichmentCenterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enrichment_center_id not between", value1, value2, "enrichmentCenterId");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterion("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterion("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterion("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterion("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterion("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterion("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterion("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterion("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterion("date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNull() {
            addCriterion("issued_by is null");
            return (Criteria) this;
        }

        public Criteria andIssuedByIsNotNull() {
            addCriterion("issued_by is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedByEqualTo(String value) {
            addCriterion("issued_by =", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotEqualTo(String value) {
            addCriterion("issued_by <>", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThan(String value) {
            addCriterion("issued_by >", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByGreaterThanOrEqualTo(String value) {
            addCriterion("issued_by >=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThan(String value) {
            addCriterion("issued_by <", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLessThanOrEqualTo(String value) {
            addCriterion("issued_by <=", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByLike(String value) {
            addCriterion("issued_by like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotLike(String value) {
            addCriterion("issued_by not like", value, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByIn(List<String> values) {
            addCriterion("issued_by in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotIn(List<String> values) {
            addCriterion("issued_by not in", values, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByBetween(String value1, String value2) {
            addCriterion("issued_by between", value1, value2, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andIssuedByNotBetween(String value1, String value2) {
            addCriterion("issued_by not between", value1, value2, "issuedBy");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIsNull() {
            addCriterion("total_lessons is null");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIsNotNull() {
            addCriterion("total_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsEqualTo(Integer value) {
            addCriterion("total_lessons =", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotEqualTo(Integer value) {
            addCriterion("total_lessons <>", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsGreaterThan(Integer value) {
            addCriterion("total_lessons >", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_lessons >=", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsLessThan(Integer value) {
            addCriterion("total_lessons <", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsLessThanOrEqualTo(Integer value) {
            addCriterion("total_lessons <=", value, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsIn(List<Integer> values) {
            addCriterion("total_lessons in", values, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotIn(List<Integer> values) {
            addCriterion("total_lessons not in", values, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsBetween(Integer value1, Integer value2) {
            addCriterion("total_lessons between", value1, value2, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andTotalLessonsNotBetween(Integer value1, Integer value2) {
            addCriterion("total_lessons not between", value1, value2, "totalLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIsNull() {
            addCriterion("left_lessons is null");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIsNotNull() {
            addCriterion("left_lessons is not null");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsEqualTo(Integer value) {
            addCriterion("left_lessons =", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotEqualTo(Integer value) {
            addCriterion("left_lessons <>", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsGreaterThan(Integer value) {
            addCriterion("left_lessons >", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_lessons >=", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsLessThan(Integer value) {
            addCriterion("left_lessons <", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsLessThanOrEqualTo(Integer value) {
            addCriterion("left_lessons <=", value, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsIn(List<Integer> values) {
            addCriterion("left_lessons in", values, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotIn(List<Integer> values) {
            addCriterion("left_lessons not in", values, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsBetween(Integer value1, Integer value2) {
            addCriterion("left_lessons between", value1, value2, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andLeftLessonsNotBetween(Integer value1, Integer value2) {
            addCriterion("left_lessons not between", value1, value2, "leftLessons");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateIsNull() {
            addCriterion("registration_no_template is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateIsNotNull() {
            addCriterion("registration_no_template is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateEqualTo(String value) {
            addCriterion("registration_no_template =", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateNotEqualTo(String value) {
            addCriterion("registration_no_template <>", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateGreaterThan(String value) {
            addCriterion("registration_no_template >", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("registration_no_template >=", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateLessThan(String value) {
            addCriterion("registration_no_template <", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateLessThanOrEqualTo(String value) {
            addCriterion("registration_no_template <=", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateLike(String value) {
            addCriterion("registration_no_template like", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateNotLike(String value) {
            addCriterion("registration_no_template not like", value, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateIn(List<String> values) {
            addCriterion("registration_no_template in", values, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateNotIn(List<String> values) {
            addCriterion("registration_no_template not in", values, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateBetween(String value1, String value2) {
            addCriterion("registration_no_template between", value1, value2, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoTemplateNotBetween(String value1, String value2) {
            addCriterion("registration_no_template not between", value1, value2, "registrationNoTemplate");
            return (Criteria) this;
        }

        public Criteria andKnowUsIsNull() {
            addCriterion("know_us is null");
            return (Criteria) this;
        }

        public Criteria andKnowUsIsNotNull() {
            addCriterion("know_us is not null");
            return (Criteria) this;
        }

        public Criteria andKnowUsEqualTo(String value) {
            addCriterion("know_us =", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsNotEqualTo(String value) {
            addCriterion("know_us <>", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsGreaterThan(String value) {
            addCriterion("know_us >", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsGreaterThanOrEqualTo(String value) {
            addCriterion("know_us >=", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsLessThan(String value) {
            addCriterion("know_us <", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsLessThanOrEqualTo(String value) {
            addCriterion("know_us <=", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsLike(String value) {
            addCriterion("know_us like", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsNotLike(String value) {
            addCriterion("know_us not like", value, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsIn(List<String> values) {
            addCriterion("know_us in", values, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsNotIn(List<String> values) {
            addCriterion("know_us not in", values, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsBetween(String value1, String value2) {
            addCriterion("know_us between", value1, value2, "knowUs");
            return (Criteria) this;
        }

        public Criteria andKnowUsNotBetween(String value1, String value2) {
            addCriterion("know_us not between", value1, value2, "knowUs");
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