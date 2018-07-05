package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CentersCenterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CentersCenterExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsIsNull() {
            addCriterion("lesson_plan_settings is null");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsIsNotNull() {
            addCriterion("lesson_plan_settings is not null");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsEqualTo(Integer value) {
            addCriterion("lesson_plan_settings =", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsNotEqualTo(Integer value) {
            addCriterion("lesson_plan_settings <>", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsGreaterThan(Integer value) {
            addCriterion("lesson_plan_settings >", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("lesson_plan_settings >=", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsLessThan(Integer value) {
            addCriterion("lesson_plan_settings <", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsLessThanOrEqualTo(Integer value) {
            addCriterion("lesson_plan_settings <=", value, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsIn(List<Integer> values) {
            addCriterion("lesson_plan_settings in", values, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsNotIn(List<Integer> values) {
            addCriterion("lesson_plan_settings not in", values, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsBetween(Integer value1, Integer value2) {
            addCriterion("lesson_plan_settings between", value1, value2, "lessonPlanSettings");
            return (Criteria) this;
        }

        public Criteria andLessonPlanSettingsNotBetween(Integer value1, Integer value2) {
            addCriterion("lesson_plan_settings not between", value1, value2, "lessonPlanSettings");
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

        public Criteria andContactNoIsNull() {
            addCriterion("contact_no is null");
            return (Criteria) this;
        }

        public Criteria andContactNoIsNotNull() {
            addCriterion("contact_no is not null");
            return (Criteria) this;
        }

        public Criteria andContactNoEqualTo(String value) {
            addCriterion("contact_no =", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotEqualTo(String value) {
            addCriterion("contact_no <>", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoGreaterThan(String value) {
            addCriterion("contact_no >", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_no >=", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLessThan(String value) {
            addCriterion("contact_no <", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLessThanOrEqualTo(String value) {
            addCriterion("contact_no <=", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoLike(String value) {
            addCriterion("contact_no like", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotLike(String value) {
            addCriterion("contact_no not like", value, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoIn(List<String> values) {
            addCriterion("contact_no in", values, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotIn(List<String> values) {
            addCriterion("contact_no not in", values, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoBetween(String value1, String value2) {
            addCriterion("contact_no between", value1, value2, "contactNo");
            return (Criteria) this;
        }

        public Criteria andContactNoNotBetween(String value1, String value2) {
            addCriterion("contact_no not between", value1, value2, "contactNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNull() {
            addCriterion("fax_no is null");
            return (Criteria) this;
        }

        public Criteria andFaxNoIsNotNull() {
            addCriterion("fax_no is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNoEqualTo(String value) {
            addCriterion("fax_no =", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotEqualTo(String value) {
            addCriterion("fax_no <>", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThan(String value) {
            addCriterion("fax_no >", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("fax_no >=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThan(String value) {
            addCriterion("fax_no <", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLessThanOrEqualTo(String value) {
            addCriterion("fax_no <=", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoLike(String value) {
            addCriterion("fax_no like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotLike(String value) {
            addCriterion("fax_no not like", value, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoIn(List<String> values) {
            addCriterion("fax_no in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotIn(List<String> values) {
            addCriterion("fax_no not in", values, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoBetween(String value1, String value2) {
            addCriterion("fax_no between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andFaxNoNotBetween(String value1, String value2) {
            addCriterion("fax_no not between", value1, value2, "faxNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoIsNull() {
            addCriterion("gst_reg_no is null");
            return (Criteria) this;
        }

        public Criteria andGstRegNoIsNotNull() {
            addCriterion("gst_reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andGstRegNoEqualTo(String value) {
            addCriterion("gst_reg_no =", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoNotEqualTo(String value) {
            addCriterion("gst_reg_no <>", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoGreaterThan(String value) {
            addCriterion("gst_reg_no >", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("gst_reg_no >=", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoLessThan(String value) {
            addCriterion("gst_reg_no <", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoLessThanOrEqualTo(String value) {
            addCriterion("gst_reg_no <=", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoLike(String value) {
            addCriterion("gst_reg_no like", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoNotLike(String value) {
            addCriterion("gst_reg_no not like", value, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoIn(List<String> values) {
            addCriterion("gst_reg_no in", values, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoNotIn(List<String> values) {
            addCriterion("gst_reg_no not in", values, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoBetween(String value1, String value2) {
            addCriterion("gst_reg_no between", value1, value2, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andGstRegNoNotBetween(String value1, String value2) {
            addCriterion("gst_reg_no not between", value1, value2, "gstRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoIsNull() {
            addCriterion("company_reg_no is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoIsNotNull() {
            addCriterion("company_reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoEqualTo(String value) {
            addCriterion("company_reg_no =", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoNotEqualTo(String value) {
            addCriterion("company_reg_no <>", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoGreaterThan(String value) {
            addCriterion("company_reg_no >", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("company_reg_no >=", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoLessThan(String value) {
            addCriterion("company_reg_no <", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoLessThanOrEqualTo(String value) {
            addCriterion("company_reg_no <=", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoLike(String value) {
            addCriterion("company_reg_no like", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoNotLike(String value) {
            addCriterion("company_reg_no not like", value, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoIn(List<String> values) {
            addCriterion("company_reg_no in", values, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoNotIn(List<String> values) {
            addCriterion("company_reg_no not in", values, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoBetween(String value1, String value2) {
            addCriterion("company_reg_no between", value1, value2, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andCompanyRegNoNotBetween(String value1, String value2) {
            addCriterion("company_reg_no not between", value1, value2, "companyRegNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentIsNull() {
            addCriterion("available_student is null");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentIsNotNull() {
            addCriterion("available_student is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentEqualTo(Boolean value) {
            addCriterion("available_student =", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentNotEqualTo(Boolean value) {
            addCriterion("available_student <>", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentGreaterThan(Boolean value) {
            addCriterion("available_student >", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("available_student >=", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentLessThan(Boolean value) {
            addCriterion("available_student <", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentLessThanOrEqualTo(Boolean value) {
            addCriterion("available_student <=", value, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentIn(List<Boolean> values) {
            addCriterion("available_student in", values, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentNotIn(List<Boolean> values) {
            addCriterion("available_student not in", values, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentBetween(Boolean value1, Boolean value2) {
            addCriterion("available_student between", value1, value2, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("available_student not between", value1, value2, "availableStudent");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffIsNull() {
            addCriterion("available_staff is null");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffIsNotNull() {
            addCriterion("available_staff is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffEqualTo(Boolean value) {
            addCriterion("available_staff =", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffNotEqualTo(Boolean value) {
            addCriterion("available_staff <>", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffGreaterThan(Boolean value) {
            addCriterion("available_staff >", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffGreaterThanOrEqualTo(Boolean value) {
            addCriterion("available_staff >=", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffLessThan(Boolean value) {
            addCriterion("available_staff <", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffLessThanOrEqualTo(Boolean value) {
            addCriterion("available_staff <=", value, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffIn(List<Boolean> values) {
            addCriterion("available_staff in", values, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffNotIn(List<Boolean> values) {
            addCriterion("available_staff not in", values, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffBetween(Boolean value1, Boolean value2) {
            addCriterion("available_staff between", value1, value2, "availableStaff");
            return (Criteria) this;
        }

        public Criteria andAvailableStaffNotBetween(Boolean value1, Boolean value2) {
            addCriterion("available_staff not between", value1, value2, "availableStaff");
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

        public Criteria andAssessmentDateIsNull() {
            addCriterion("assessment_date is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateIsNotNull() {
            addCriterion("assessment_date is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateEqualTo(Boolean value) {
            addCriterion("assessment_date =", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateNotEqualTo(Boolean value) {
            addCriterion("assessment_date <>", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateGreaterThan(Boolean value) {
            addCriterion("assessment_date >", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("assessment_date >=", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateLessThan(Boolean value) {
            addCriterion("assessment_date <", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateLessThanOrEqualTo(Boolean value) {
            addCriterion("assessment_date <=", value, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateIn(List<Boolean> values) {
            addCriterion("assessment_date in", values, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateNotIn(List<Boolean> values) {
            addCriterion("assessment_date not in", values, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateBetween(Boolean value1, Boolean value2) {
            addCriterion("assessment_date between", value1, value2, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentDateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("assessment_date not between", value1, value2, "assessmentDate");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermIsNull() {
            addCriterion("assessment_term is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermIsNotNull() {
            addCriterion("assessment_term is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermEqualTo(Integer value) {
            addCriterion("assessment_term =", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermNotEqualTo(Integer value) {
            addCriterion("assessment_term <>", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermGreaterThan(Integer value) {
            addCriterion("assessment_term >", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_term >=", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermLessThan(Integer value) {
            addCriterion("assessment_term <", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_term <=", value, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermIn(List<Integer> values) {
            addCriterion("assessment_term in", values, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermNotIn(List<Integer> values) {
            addCriterion("assessment_term not in", values, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermBetween(Integer value1, Integer value2) {
            addCriterion("assessment_term between", value1, value2, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andAssessmentTermNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_term not between", value1, value2, "assessmentTerm");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveIsNull() {
            addCriterion("gallery_auto_approve is null");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveIsNotNull() {
            addCriterion("gallery_auto_approve is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveEqualTo(Integer value) {
            addCriterion("gallery_auto_approve =", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveNotEqualTo(Integer value) {
            addCriterion("gallery_auto_approve <>", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveGreaterThan(Integer value) {
            addCriterion("gallery_auto_approve >", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("gallery_auto_approve >=", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveLessThan(Integer value) {
            addCriterion("gallery_auto_approve <", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveLessThanOrEqualTo(Integer value) {
            addCriterion("gallery_auto_approve <=", value, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveIn(List<Integer> values) {
            addCriterion("gallery_auto_approve in", values, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveNotIn(List<Integer> values) {
            addCriterion("gallery_auto_approve not in", values, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveBetween(Integer value1, Integer value2) {
            addCriterion("gallery_auto_approve between", value1, value2, "galleryAutoApprove");
            return (Criteria) this;
        }

        public Criteria andGalleryAutoApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("gallery_auto_approve not between", value1, value2, "galleryAutoApprove");
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

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdIsNull() {
            addCriterion("custom_home_page_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdIsNotNull() {
            addCriterion("custom_home_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdEqualTo(Integer value) {
            addCriterion("custom_home_page_id =", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdNotEqualTo(Integer value) {
            addCriterion("custom_home_page_id <>", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdGreaterThan(Integer value) {
            addCriterion("custom_home_page_id >", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_home_page_id >=", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdLessThan(Integer value) {
            addCriterion("custom_home_page_id <", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdLessThanOrEqualTo(Integer value) {
            addCriterion("custom_home_page_id <=", value, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdIn(List<Integer> values) {
            addCriterion("custom_home_page_id in", values, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdNotIn(List<Integer> values) {
            addCriterion("custom_home_page_id not in", values, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdBetween(Integer value1, Integer value2) {
            addCriterion("custom_home_page_id between", value1, value2, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andCustomHomePageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_home_page_id not between", value1, value2, "customHomePageId");
            return (Criteria) this;
        }

        public Criteria andMechanismIsNull() {
            addCriterion("mechanism is null");
            return (Criteria) this;
        }

        public Criteria andMechanismIsNotNull() {
            addCriterion("mechanism is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismEqualTo(String value) {
            addCriterion("mechanism =", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotEqualTo(String value) {
            addCriterion("mechanism <>", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismGreaterThan(String value) {
            addCriterion("mechanism >", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismGreaterThanOrEqualTo(String value) {
            addCriterion("mechanism >=", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLessThan(String value) {
            addCriterion("mechanism <", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLessThanOrEqualTo(String value) {
            addCriterion("mechanism <=", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismLike(String value) {
            addCriterion("mechanism like", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotLike(String value) {
            addCriterion("mechanism not like", value, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismIn(List<String> values) {
            addCriterion("mechanism in", values, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotIn(List<String> values) {
            addCriterion("mechanism not in", values, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismBetween(String value1, String value2) {
            addCriterion("mechanism between", value1, value2, "mechanism");
            return (Criteria) this;
        }

        public Criteria andMechanismNotBetween(String value1, String value2) {
            addCriterion("mechanism not between", value1, value2, "mechanism");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberIsNull() {
            addCriterion("graduation_number is null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberIsNotNull() {
            addCriterion("graduation_number is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberEqualTo(Integer value) {
            addCriterion("graduation_number =", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNotEqualTo(Integer value) {
            addCriterion("graduation_number <>", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberGreaterThan(Integer value) {
            addCriterion("graduation_number >", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("graduation_number >=", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberLessThan(Integer value) {
            addCriterion("graduation_number <", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("graduation_number <=", value, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberIn(List<Integer> values) {
            addCriterion("graduation_number in", values, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNotIn(List<Integer> values) {
            addCriterion("graduation_number not in", values, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberBetween(Integer value1, Integer value2) {
            addCriterion("graduation_number between", value1, value2, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("graduation_number not between", value1, value2, "graduationNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoIsNull() {
            addCriterion("serial_number_no is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoIsNotNull() {
            addCriterion("serial_number_no is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoEqualTo(String value) {
            addCriterion("serial_number_no =", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoNotEqualTo(String value) {
            addCriterion("serial_number_no <>", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoGreaterThan(String value) {
            addCriterion("serial_number_no >", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number_no >=", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoLessThan(String value) {
            addCriterion("serial_number_no <", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoLessThanOrEqualTo(String value) {
            addCriterion("serial_number_no <=", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoLike(String value) {
            addCriterion("serial_number_no like", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoNotLike(String value) {
            addCriterion("serial_number_no not like", value, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoIn(List<String> values) {
            addCriterion("serial_number_no in", values, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoNotIn(List<String> values) {
            addCriterion("serial_number_no not in", values, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoBetween(String value1, String value2) {
            addCriterion("serial_number_no between", value1, value2, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNoNotBetween(String value1, String value2) {
            addCriterion("serial_number_no not between", value1, value2, "serialNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoIsNull() {
            addCriterion("graduation_number_no is null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoIsNotNull() {
            addCriterion("graduation_number_no is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoEqualTo(String value) {
            addCriterion("graduation_number_no =", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoNotEqualTo(String value) {
            addCriterion("graduation_number_no <>", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoGreaterThan(String value) {
            addCriterion("graduation_number_no >", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoGreaterThanOrEqualTo(String value) {
            addCriterion("graduation_number_no >=", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoLessThan(String value) {
            addCriterion("graduation_number_no <", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoLessThanOrEqualTo(String value) {
            addCriterion("graduation_number_no <=", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoLike(String value) {
            addCriterion("graduation_number_no like", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoNotLike(String value) {
            addCriterion("graduation_number_no not like", value, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoIn(List<String> values) {
            addCriterion("graduation_number_no in", values, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoNotIn(List<String> values) {
            addCriterion("graduation_number_no not in", values, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoBetween(String value1, String value2) {
            addCriterion("graduation_number_no between", value1, value2, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andGraduationNumberNoNotBetween(String value1, String value2) {
            addCriterion("graduation_number_no not between", value1, value2, "graduationNumberNo");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAllowshareIsNull() {
            addCriterion("allowshare is null");
            return (Criteria) this;
        }

        public Criteria andAllowshareIsNotNull() {
            addCriterion("allowshare is not null");
            return (Criteria) this;
        }

        public Criteria andAllowshareEqualTo(Integer value) {
            addCriterion("allowshare =", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareNotEqualTo(Integer value) {
            addCriterion("allowshare <>", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareGreaterThan(Integer value) {
            addCriterion("allowshare >", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowshare >=", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareLessThan(Integer value) {
            addCriterion("allowshare <", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareLessThanOrEqualTo(Integer value) {
            addCriterion("allowshare <=", value, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareIn(List<Integer> values) {
            addCriterion("allowshare in", values, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareNotIn(List<Integer> values) {
            addCriterion("allowshare not in", values, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareBetween(Integer value1, Integer value2) {
            addCriterion("allowshare between", value1, value2, "allowshare");
            return (Criteria) this;
        }

        public Criteria andAllowshareNotBetween(Integer value1, Integer value2) {
            addCriterion("allowshare not between", value1, value2, "allowshare");
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

        public Criteria andOtherLanguageCenterNameIsNull() {
            addCriterion("other_language_center_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameIsNotNull() {
            addCriterion("other_language_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameEqualTo(String value) {
            addCriterion("other_language_center_name =", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameNotEqualTo(String value) {
            addCriterion("other_language_center_name <>", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameGreaterThan(String value) {
            addCriterion("other_language_center_name >", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_language_center_name >=", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameLessThan(String value) {
            addCriterion("other_language_center_name <", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameLessThanOrEqualTo(String value) {
            addCriterion("other_language_center_name <=", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameLike(String value) {
            addCriterion("other_language_center_name like", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameNotLike(String value) {
            addCriterion("other_language_center_name not like", value, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameIn(List<String> values) {
            addCriterion("other_language_center_name in", values, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameNotIn(List<String> values) {
            addCriterion("other_language_center_name not in", values, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameBetween(String value1, String value2) {
            addCriterion("other_language_center_name between", value1, value2, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andOtherLanguageCenterNameNotBetween(String value1, String value2) {
            addCriterion("other_language_center_name not between", value1, value2, "otherLanguageCenterName");
            return (Criteria) this;
        }

        public Criteria andCenterTypeIsNull() {
            addCriterion("center_type is null");
            return (Criteria) this;
        }

        public Criteria andCenterTypeIsNotNull() {
            addCriterion("center_type is not null");
            return (Criteria) this;
        }

        public Criteria andCenterTypeEqualTo(Integer value) {
            addCriterion("center_type =", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeNotEqualTo(Integer value) {
            addCriterion("center_type <>", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeGreaterThan(Integer value) {
            addCriterion("center_type >", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("center_type >=", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeLessThan(Integer value) {
            addCriterion("center_type <", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeLessThanOrEqualTo(Integer value) {
            addCriterion("center_type <=", value, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeIn(List<Integer> values) {
            addCriterion("center_type in", values, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeNotIn(List<Integer> values) {
            addCriterion("center_type not in", values, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeBetween(Integer value1, Integer value2) {
            addCriterion("center_type between", value1, value2, "centerType");
            return (Criteria) this;
        }

        public Criteria andCenterTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("center_type not between", value1, value2, "centerType");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeIsNull() {
            addCriterion("enquiry_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeIsNotNull() {
            addCriterion("enquiry_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeEqualTo(String value) {
            addCriterion("enquiry_qrcode =", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeNotEqualTo(String value) {
            addCriterion("enquiry_qrcode <>", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeGreaterThan(String value) {
            addCriterion("enquiry_qrcode >", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("enquiry_qrcode >=", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeLessThan(String value) {
            addCriterion("enquiry_qrcode <", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeLessThanOrEqualTo(String value) {
            addCriterion("enquiry_qrcode <=", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeLike(String value) {
            addCriterion("enquiry_qrcode like", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeNotLike(String value) {
            addCriterion("enquiry_qrcode not like", value, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeIn(List<String> values) {
            addCriterion("enquiry_qrcode in", values, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeNotIn(List<String> values) {
            addCriterion("enquiry_qrcode not in", values, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeBetween(String value1, String value2) {
            addCriterion("enquiry_qrcode between", value1, value2, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andEnquiryQrcodeNotBetween(String value1, String value2) {
            addCriterion("enquiry_qrcode not between", value1, value2, "enquiryQrcode");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemIsNull() {
            addCriterion("subsidy_approval_system is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemIsNotNull() {
            addCriterion("subsidy_approval_system is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemEqualTo(Boolean value) {
            addCriterion("subsidy_approval_system =", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemNotEqualTo(Boolean value) {
            addCriterion("subsidy_approval_system <>", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemGreaterThan(Boolean value) {
            addCriterion("subsidy_approval_system >", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subsidy_approval_system >=", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemLessThan(Boolean value) {
            addCriterion("subsidy_approval_system <", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemLessThanOrEqualTo(Boolean value) {
            addCriterion("subsidy_approval_system <=", value, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemIn(List<Boolean> values) {
            addCriterion("subsidy_approval_system in", values, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemNotIn(List<Boolean> values) {
            addCriterion("subsidy_approval_system not in", values, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemBetween(Boolean value1, Boolean value2) {
            addCriterion("subsidy_approval_system between", value1, value2, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyApprovalSystemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subsidy_approval_system not between", value1, value2, "subsidyApprovalSystem");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryIsNull() {
            addCriterion("subsidy_has_different_expiry is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryIsNotNull() {
            addCriterion("subsidy_has_different_expiry is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryEqualTo(Boolean value) {
            addCriterion("subsidy_has_different_expiry =", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryNotEqualTo(Boolean value) {
            addCriterion("subsidy_has_different_expiry <>", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryGreaterThan(Boolean value) {
            addCriterion("subsidy_has_different_expiry >", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("subsidy_has_different_expiry >=", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryLessThan(Boolean value) {
            addCriterion("subsidy_has_different_expiry <", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryLessThanOrEqualTo(Boolean value) {
            addCriterion("subsidy_has_different_expiry <=", value, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryIn(List<Boolean> values) {
            addCriterion("subsidy_has_different_expiry in", values, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryNotIn(List<Boolean> values) {
            addCriterion("subsidy_has_different_expiry not in", values, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryBetween(Boolean value1, Boolean value2) {
            addCriterion("subsidy_has_different_expiry between", value1, value2, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andSubsidyHasDifferentExpiryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("subsidy_has_different_expiry not between", value1, value2, "subsidyHasDifferentExpiry");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalIsNull() {
            addCriterion("name_of_principal is null");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalIsNotNull() {
            addCriterion("name_of_principal is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalEqualTo(String value) {
            addCriterion("name_of_principal =", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalNotEqualTo(String value) {
            addCriterion("name_of_principal <>", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalGreaterThan(String value) {
            addCriterion("name_of_principal >", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("name_of_principal >=", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalLessThan(String value) {
            addCriterion("name_of_principal <", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalLessThanOrEqualTo(String value) {
            addCriterion("name_of_principal <=", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalLike(String value) {
            addCriterion("name_of_principal like", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalNotLike(String value) {
            addCriterion("name_of_principal not like", value, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalIn(List<String> values) {
            addCriterion("name_of_principal in", values, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalNotIn(List<String> values) {
            addCriterion("name_of_principal not in", values, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalBetween(String value1, String value2) {
            addCriterion("name_of_principal between", value1, value2, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andNameOfPrincipalNotBetween(String value1, String value2) {
            addCriterion("name_of_principal not between", value1, value2, "nameOfPrincipal");
            return (Criteria) this;
        }

        public Criteria andUenIsNull() {
            addCriterion("uen is null");
            return (Criteria) this;
        }

        public Criteria andUenIsNotNull() {
            addCriterion("uen is not null");
            return (Criteria) this;
        }

        public Criteria andUenEqualTo(String value) {
            addCriterion("uen =", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenNotEqualTo(String value) {
            addCriterion("uen <>", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenGreaterThan(String value) {
            addCriterion("uen >", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenGreaterThanOrEqualTo(String value) {
            addCriterion("uen >=", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenLessThan(String value) {
            addCriterion("uen <", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenLessThanOrEqualTo(String value) {
            addCriterion("uen <=", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenLike(String value) {
            addCriterion("uen like", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenNotLike(String value) {
            addCriterion("uen not like", value, "uen");
            return (Criteria) this;
        }

        public Criteria andUenIn(List<String> values) {
            addCriterion("uen in", values, "uen");
            return (Criteria) this;
        }

        public Criteria andUenNotIn(List<String> values) {
            addCriterion("uen not in", values, "uen");
            return (Criteria) this;
        }

        public Criteria andUenBetween(String value1, String value2) {
            addCriterion("uen between", value1, value2, "uen");
            return (Criteria) this;
        }

        public Criteria andUenNotBetween(String value1, String value2) {
            addCriterion("uen not between", value1, value2, "uen");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordIsNull() {
            addCriterion("setting_password is null");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordIsNotNull() {
            addCriterion("setting_password is not null");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordEqualTo(String value) {
            addCriterion("setting_password =", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordNotEqualTo(String value) {
            addCriterion("setting_password <>", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordGreaterThan(String value) {
            addCriterion("setting_password >", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("setting_password >=", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordLessThan(String value) {
            addCriterion("setting_password <", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordLessThanOrEqualTo(String value) {
            addCriterion("setting_password <=", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordLike(String value) {
            addCriterion("setting_password like", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordNotLike(String value) {
            addCriterion("setting_password not like", value, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordIn(List<String> values) {
            addCriterion("setting_password in", values, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordNotIn(List<String> values) {
            addCriterion("setting_password not in", values, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordBetween(String value1, String value2) {
            addCriterion("setting_password between", value1, value2, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andSettingPasswordNotBetween(String value1, String value2) {
            addCriterion("setting_password not between", value1, value2, "settingPassword");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNull() {
            addCriterion("timezone is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("timezone is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("timezone =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("timezone <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("timezone >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("timezone >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("timezone <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("timezone <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("timezone like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("timezone not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("timezone in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("timezone not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("timezone between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("timezone not between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonIsNull() {
            addCriterion("show_student_absent_reason is null");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonIsNotNull() {
            addCriterion("show_student_absent_reason is not null");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonEqualTo(Boolean value) {
            addCriterion("show_student_absent_reason =", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonNotEqualTo(Boolean value) {
            addCriterion("show_student_absent_reason <>", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonGreaterThan(Boolean value) {
            addCriterion("show_student_absent_reason >", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_student_absent_reason >=", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonLessThan(Boolean value) {
            addCriterion("show_student_absent_reason <", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonLessThanOrEqualTo(Boolean value) {
            addCriterion("show_student_absent_reason <=", value, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonIn(List<Boolean> values) {
            addCriterion("show_student_absent_reason in", values, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonNotIn(List<Boolean> values) {
            addCriterion("show_student_absent_reason not in", values, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonBetween(Boolean value1, Boolean value2) {
            addCriterion("show_student_absent_reason between", value1, value2, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andShowStudentAbsentReasonNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_student_absent_reason not between", value1, value2, "showStudentAbsentReason");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdIsNull() {
            addCriterion("custom_diibear_app_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdIsNotNull() {
            addCriterion("custom_diibear_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdEqualTo(Integer value) {
            addCriterion("custom_diibear_app_id =", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdNotEqualTo(Integer value) {
            addCriterion("custom_diibear_app_id <>", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdGreaterThan(Integer value) {
            addCriterion("custom_diibear_app_id >", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_diibear_app_id >=", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdLessThan(Integer value) {
            addCriterion("custom_diibear_app_id <", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("custom_diibear_app_id <=", value, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdIn(List<Integer> values) {
            addCriterion("custom_diibear_app_id in", values, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdNotIn(List<Integer> values) {
            addCriterion("custom_diibear_app_id not in", values, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdBetween(Integer value1, Integer value2) {
            addCriterion("custom_diibear_app_id between", value1, value2, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andCustomDiibearAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_diibear_app_id not between", value1, value2, "customDiibearAppId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdIsNull() {
            addCriterion("portfoliov3template_id is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdIsNotNull() {
            addCriterion("portfoliov3template_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdEqualTo(Integer value) {
            addCriterion("portfoliov3template_id =", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdNotEqualTo(Integer value) {
            addCriterion("portfoliov3template_id <>", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdGreaterThan(Integer value) {
            addCriterion("portfoliov3template_id >", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("portfoliov3template_id >=", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdLessThan(Integer value) {
            addCriterion("portfoliov3template_id <", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdLessThanOrEqualTo(Integer value) {
            addCriterion("portfoliov3template_id <=", value, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdIn(List<Integer> values) {
            addCriterion("portfoliov3template_id in", values, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdNotIn(List<Integer> values) {
            addCriterion("portfoliov3template_id not in", values, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdBetween(Integer value1, Integer value2) {
            addCriterion("portfoliov3template_id between", value1, value2, "portfoliov3templateId");
            return (Criteria) this;
        }

        public Criteria andPortfoliov3templateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("portfoliov3template_id not between", value1, value2, "portfoliov3templateId");
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

        public Criteria andRegistrationNoRunningNoIsNull() {
            addCriterion("registration_no_running_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoIsNotNull() {
            addCriterion("registration_no_running_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoEqualTo(String value) {
            addCriterion("registration_no_running_no =", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoNotEqualTo(String value) {
            addCriterion("registration_no_running_no <>", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoGreaterThan(String value) {
            addCriterion("registration_no_running_no >", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoGreaterThanOrEqualTo(String value) {
            addCriterion("registration_no_running_no >=", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoLessThan(String value) {
            addCriterion("registration_no_running_no <", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoLessThanOrEqualTo(String value) {
            addCriterion("registration_no_running_no <=", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoLike(String value) {
            addCriterion("registration_no_running_no like", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoNotLike(String value) {
            addCriterion("registration_no_running_no not like", value, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoIn(List<String> values) {
            addCriterion("registration_no_running_no in", values, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoNotIn(List<String> values) {
            addCriterion("registration_no_running_no not in", values, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoBetween(String value1, String value2) {
            addCriterion("registration_no_running_no between", value1, value2, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoRunningNoNotBetween(String value1, String value2) {
            addCriterion("registration_no_running_no not between", value1, value2, "registrationNoRunningNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoIsNull() {
            addCriterion("registration_no_current_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoIsNotNull() {
            addCriterion("registration_no_current_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoEqualTo(Integer value) {
            addCriterion("registration_no_current_no =", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoNotEqualTo(Integer value) {
            addCriterion("registration_no_current_no <>", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoGreaterThan(Integer value) {
            addCriterion("registration_no_current_no >", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_no_current_no >=", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoLessThan(Integer value) {
            addCriterion("registration_no_current_no <", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoLessThanOrEqualTo(Integer value) {
            addCriterion("registration_no_current_no <=", value, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoIn(List<Integer> values) {
            addCriterion("registration_no_current_no in", values, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoNotIn(List<Integer> values) {
            addCriterion("registration_no_current_no not in", values, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoBetween(Integer value1, Integer value2) {
            addCriterion("registration_no_current_no between", value1, value2, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationNoCurrentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_no_current_no not between", value1, value2, "registrationNoCurrentNo");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionIsNull() {
            addCriterion("gallery_upload_version is null");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionIsNotNull() {
            addCriterion("gallery_upload_version is not null");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionEqualTo(Integer value) {
            addCriterion("gallery_upload_version =", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionNotEqualTo(Integer value) {
            addCriterion("gallery_upload_version <>", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionGreaterThan(Integer value) {
            addCriterion("gallery_upload_version >", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("gallery_upload_version >=", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionLessThan(Integer value) {
            addCriterion("gallery_upload_version <", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionLessThanOrEqualTo(Integer value) {
            addCriterion("gallery_upload_version <=", value, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionIn(List<Integer> values) {
            addCriterion("gallery_upload_version in", values, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionNotIn(List<Integer> values) {
            addCriterion("gallery_upload_version not in", values, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionBetween(Integer value1, Integer value2) {
            addCriterion("gallery_upload_version between", value1, value2, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andGalleryUploadVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("gallery_upload_version not between", value1, value2, "galleryUploadVersion");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdIsNull() {
            addCriterion("precinct_id is null");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdIsNotNull() {
            addCriterion("precinct_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdEqualTo(Integer value) {
            addCriterion("precinct_id =", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdNotEqualTo(Integer value) {
            addCriterion("precinct_id <>", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdGreaterThan(Integer value) {
            addCriterion("precinct_id >", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("precinct_id >=", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdLessThan(Integer value) {
            addCriterion("precinct_id <", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdLessThanOrEqualTo(Integer value) {
            addCriterion("precinct_id <=", value, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdIn(List<Integer> values) {
            addCriterion("precinct_id in", values, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdNotIn(List<Integer> values) {
            addCriterion("precinct_id not in", values, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdBetween(Integer value1, Integer value2) {
            addCriterion("precinct_id between", value1, value2, "precinctId");
            return (Criteria) this;
        }

        public Criteria andPrecinctIdNotBetween(Integer value1, Integer value2) {
            addCriterion("precinct_id not between", value1, value2, "precinctId");
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