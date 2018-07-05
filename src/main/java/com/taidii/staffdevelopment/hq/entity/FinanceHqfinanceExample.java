package com.taidii.staffdevelopment.hq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FinanceHqfinanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinanceHqfinanceExample() {
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

        public Criteria andGstEnabledIsNull() {
            addCriterion("gst_enabled is null");
            return (Criteria) this;
        }

        public Criteria andGstEnabledIsNotNull() {
            addCriterion("gst_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andGstEnabledEqualTo(Boolean value) {
            addCriterion("gst_enabled =", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledNotEqualTo(Boolean value) {
            addCriterion("gst_enabled <>", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledGreaterThan(Boolean value) {
            addCriterion("gst_enabled >", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gst_enabled >=", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledLessThan(Boolean value) {
            addCriterion("gst_enabled <", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("gst_enabled <=", value, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledIn(List<Boolean> values) {
            addCriterion("gst_enabled in", values, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledNotIn(List<Boolean> values) {
            addCriterion("gst_enabled not in", values, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("gst_enabled between", value1, value2, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gst_enabled not between", value1, value2, "gstEnabled");
            return (Criteria) this;
        }

        public Criteria andGstIsNull() {
            addCriterion("gst is null");
            return (Criteria) this;
        }

        public Criteria andGstIsNotNull() {
            addCriterion("gst is not null");
            return (Criteria) this;
        }

        public Criteria andGstEqualTo(BigDecimal value) {
            addCriterion("gst =", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstNotEqualTo(BigDecimal value) {
            addCriterion("gst <>", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstGreaterThan(BigDecimal value) {
            addCriterion("gst >", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gst >=", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstLessThan(BigDecimal value) {
            addCriterion("gst <", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gst <=", value, "gst");
            return (Criteria) this;
        }

        public Criteria andGstIn(List<BigDecimal> values) {
            addCriterion("gst in", values, "gst");
            return (Criteria) this;
        }

        public Criteria andGstNotIn(List<BigDecimal> values) {
            addCriterion("gst not in", values, "gst");
            return (Criteria) this;
        }

        public Criteria andGstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gst between", value1, value2, "gst");
            return (Criteria) this;
        }

        public Criteria andGstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gst not between", value1, value2, "gst");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledIsNull() {
            addCriterion("gst_credit_note_enabled is null");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledIsNotNull() {
            addCriterion("gst_credit_note_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledEqualTo(Boolean value) {
            addCriterion("gst_credit_note_enabled =", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledNotEqualTo(Boolean value) {
            addCriterion("gst_credit_note_enabled <>", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledGreaterThan(Boolean value) {
            addCriterion("gst_credit_note_enabled >", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gst_credit_note_enabled >=", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledLessThan(Boolean value) {
            addCriterion("gst_credit_note_enabled <", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("gst_credit_note_enabled <=", value, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledIn(List<Boolean> values) {
            addCriterion("gst_credit_note_enabled in", values, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledNotIn(List<Boolean> values) {
            addCriterion("gst_credit_note_enabled not in", values, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("gst_credit_note_enabled between", value1, value2, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gst_credit_note_enabled not between", value1, value2, "gstCreditNoteEnabled");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteIsNull() {
            addCriterion("gst_credit_note is null");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteIsNotNull() {
            addCriterion("gst_credit_note is not null");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteEqualTo(BigDecimal value) {
            addCriterion("gst_credit_note =", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteNotEqualTo(BigDecimal value) {
            addCriterion("gst_credit_note <>", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteGreaterThan(BigDecimal value) {
            addCriterion("gst_credit_note >", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gst_credit_note >=", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteLessThan(BigDecimal value) {
            addCriterion("gst_credit_note <", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gst_credit_note <=", value, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteIn(List<BigDecimal> values) {
            addCriterion("gst_credit_note in", values, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteNotIn(List<BigDecimal> values) {
            addCriterion("gst_credit_note not in", values, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gst_credit_note between", value1, value2, "gstCreditNote");
            return (Criteria) this;
        }

        public Criteria andGstCreditNoteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gst_credit_note not between", value1, value2, "gstCreditNote");
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