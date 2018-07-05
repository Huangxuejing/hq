package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinanceInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceInvoiceExample() {
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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
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

        public Criteria andDateCreatedIsNull() {
            addCriterion("date_created is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("date_created is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("date_created =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_created <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("date_created >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_created >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterionForJDBCDate("date_created <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_created <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("date_created in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_created not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_created between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_created not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateDueIsNull() {
            addCriterion("date_due is null");
            return (Criteria) this;
        }

        public Criteria andDateDueIsNotNull() {
            addCriterion("date_due is not null");
            return (Criteria) this;
        }

        public Criteria andDateDueEqualTo(Date value) {
            addCriterionForJDBCDate("date_due =", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_due <>", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueGreaterThan(Date value) {
            addCriterionForJDBCDate("date_due >", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_due >=", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueLessThan(Date value) {
            addCriterionForJDBCDate("date_due <", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_due <=", value, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueIn(List<Date> values) {
            addCriterionForJDBCDate("date_due in", values, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_due not in", values, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_due between", value1, value2, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateDueNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_due not between", value1, value2, "dateDue");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedIsNull() {
            addCriterion("date_generated is null");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedIsNotNull() {
            addCriterion("date_generated is not null");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedEqualTo(Date value) {
            addCriterion("date_generated =", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedNotEqualTo(Date value) {
            addCriterion("date_generated <>", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedGreaterThan(Date value) {
            addCriterion("date_generated >", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedGreaterThanOrEqualTo(Date value) {
            addCriterion("date_generated >=", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedLessThan(Date value) {
            addCriterion("date_generated <", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedLessThanOrEqualTo(Date value) {
            addCriterion("date_generated <=", value, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedIn(List<Date> values) {
            addCriterion("date_generated in", values, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedNotIn(List<Date> values) {
            addCriterion("date_generated not in", values, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedBetween(Date value1, Date value2) {
            addCriterion("date_generated between", value1, value2, "dateGenerated");
            return (Criteria) this;
        }

        public Criteria andDateGeneratedNotBetween(Date value1, Date value2) {
            addCriterion("date_generated not between", value1, value2, "dateGenerated");
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

        public Criteria andVoidRemarksIsNull() {
            addCriterion("void_remarks is null");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksIsNotNull() {
            addCriterion("void_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksEqualTo(String value) {
            addCriterion("void_remarks =", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksNotEqualTo(String value) {
            addCriterion("void_remarks <>", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksGreaterThan(String value) {
            addCriterion("void_remarks >", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("void_remarks >=", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksLessThan(String value) {
            addCriterion("void_remarks <", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksLessThanOrEqualTo(String value) {
            addCriterion("void_remarks <=", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksLike(String value) {
            addCriterion("void_remarks like", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksNotLike(String value) {
            addCriterion("void_remarks not like", value, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksIn(List<String> values) {
            addCriterion("void_remarks in", values, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksNotIn(List<String> values) {
            addCriterion("void_remarks not in", values, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksBetween(String value1, String value2) {
            addCriterion("void_remarks between", value1, value2, "voidRemarks");
            return (Criteria) this;
        }

        public Criteria andVoidRemarksNotBetween(String value1, String value2) {
            addCriterion("void_remarks not between", value1, value2, "voidRemarks");
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

        public Criteria andSalesPersonIsNull() {
            addCriterion("sales_person is null");
            return (Criteria) this;
        }

        public Criteria andSalesPersonIsNotNull() {
            addCriterion("sales_person is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPersonEqualTo(String value) {
            addCriterion("sales_person =", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonNotEqualTo(String value) {
            addCriterion("sales_person <>", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonGreaterThan(String value) {
            addCriterion("sales_person >", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonGreaterThanOrEqualTo(String value) {
            addCriterion("sales_person >=", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonLessThan(String value) {
            addCriterion("sales_person <", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonLessThanOrEqualTo(String value) {
            addCriterion("sales_person <=", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonLike(String value) {
            addCriterion("sales_person like", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonNotLike(String value) {
            addCriterion("sales_person not like", value, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonIn(List<String> values) {
            addCriterion("sales_person in", values, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonNotIn(List<String> values) {
            addCriterion("sales_person not in", values, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonBetween(String value1, String value2) {
            addCriterion("sales_person between", value1, value2, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andSalesPersonNotBetween(String value1, String value2) {
            addCriterion("sales_person not between", value1, value2, "salesPerson");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIsNull() {
            addCriterion("auto_generated is null");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIsNotNull() {
            addCriterion("auto_generated is not null");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedEqualTo(Integer value) {
            addCriterion("auto_generated =", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotEqualTo(Integer value) {
            addCriterion("auto_generated <>", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedGreaterThan(Integer value) {
            addCriterion("auto_generated >", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_generated >=", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedLessThan(Integer value) {
            addCriterion("auto_generated <", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedLessThanOrEqualTo(Integer value) {
            addCriterion("auto_generated <=", value, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedIn(List<Integer> values) {
            addCriterion("auto_generated in", values, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotIn(List<Integer> values) {
            addCriterion("auto_generated not in", values, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedBetween(Integer value1, Integer value2) {
            addCriterion("auto_generated between", value1, value2, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andAutoGeneratedNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_generated not between", value1, value2, "autoGenerated");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
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

        public Criteria andOriginBalanceIsNull() {
            addCriterion("origin_balance is null");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceIsNotNull() {
            addCriterion("origin_balance is not null");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceEqualTo(BigDecimal value) {
            addCriterion("origin_balance =", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceNotEqualTo(BigDecimal value) {
            addCriterion("origin_balance <>", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceGreaterThan(BigDecimal value) {
            addCriterion("origin_balance >", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_balance >=", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceLessThan(BigDecimal value) {
            addCriterion("origin_balance <", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("origin_balance <=", value, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceIn(List<BigDecimal> values) {
            addCriterion("origin_balance in", values, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceNotIn(List<BigDecimal> values) {
            addCriterion("origin_balance not in", values, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_balance between", value1, value2, "originBalance");
            return (Criteria) this;
        }

        public Criteria andOriginBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("origin_balance not between", value1, value2, "originBalance");
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

        public Criteria andSoldToIsNull() {
            addCriterion("sold_to is null");
            return (Criteria) this;
        }

        public Criteria andSoldToIsNotNull() {
            addCriterion("sold_to is not null");
            return (Criteria) this;
        }

        public Criteria andSoldToEqualTo(String value) {
            addCriterion("sold_to =", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotEqualTo(String value) {
            addCriterion("sold_to <>", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToGreaterThan(String value) {
            addCriterion("sold_to >", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToGreaterThanOrEqualTo(String value) {
            addCriterion("sold_to >=", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLessThan(String value) {
            addCriterion("sold_to <", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLessThanOrEqualTo(String value) {
            addCriterion("sold_to <=", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToLike(String value) {
            addCriterion("sold_to like", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotLike(String value) {
            addCriterion("sold_to not like", value, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToIn(List<String> values) {
            addCriterion("sold_to in", values, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotIn(List<String> values) {
            addCriterion("sold_to not in", values, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToBetween(String value1, String value2) {
            addCriterion("sold_to between", value1, value2, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToNotBetween(String value1, String value2) {
            addCriterion("sold_to not between", value1, value2, "soldTo");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailIsNull() {
            addCriterion("sold_to_email is null");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailIsNotNull() {
            addCriterion("sold_to_email is not null");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailEqualTo(String value) {
            addCriterion("sold_to_email =", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailNotEqualTo(String value) {
            addCriterion("sold_to_email <>", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailGreaterThan(String value) {
            addCriterion("sold_to_email >", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailGreaterThanOrEqualTo(String value) {
            addCriterion("sold_to_email >=", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailLessThan(String value) {
            addCriterion("sold_to_email <", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailLessThanOrEqualTo(String value) {
            addCriterion("sold_to_email <=", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailLike(String value) {
            addCriterion("sold_to_email like", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailNotLike(String value) {
            addCriterion("sold_to_email not like", value, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailIn(List<String> values) {
            addCriterion("sold_to_email in", values, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailNotIn(List<String> values) {
            addCriterion("sold_to_email not in", values, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailBetween(String value1, String value2) {
            addCriterion("sold_to_email between", value1, value2, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andSoldToEmailNotBetween(String value1, String value2) {
            addCriterion("sold_to_email not between", value1, value2, "soldToEmail");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodIsNull() {
            addCriterion("preset_payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodIsNotNull() {
            addCriterion("preset_payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodEqualTo(Integer value) {
            addCriterion("preset_payment_method =", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodNotEqualTo(Integer value) {
            addCriterion("preset_payment_method <>", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodGreaterThan(Integer value) {
            addCriterion("preset_payment_method >", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("preset_payment_method >=", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodLessThan(Integer value) {
            addCriterion("preset_payment_method <", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodLessThanOrEqualTo(Integer value) {
            addCriterion("preset_payment_method <=", value, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodIn(List<Integer> values) {
            addCriterion("preset_payment_method in", values, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodNotIn(List<Integer> values) {
            addCriterion("preset_payment_method not in", values, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodBetween(Integer value1, Integer value2) {
            addCriterion("preset_payment_method between", value1, value2, "presetPaymentMethod");
            return (Criteria) this;
        }

        public Criteria andPresetPaymentMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("preset_payment_method not between", value1, value2, "presetPaymentMethod");
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