package com.taidii.staffdevelopment.hq.entity;

import java.util.ArrayList;
import java.util.List;

public class EnrichmentProductbundleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnrichmentProductbundleExample() {
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

        public Criteria andChargingItemIsNull() {
            addCriterion("charging_item is null");
            return (Criteria) this;
        }

        public Criteria andChargingItemIsNotNull() {
            addCriterion("charging_item is not null");
            return (Criteria) this;
        }

        public Criteria andChargingItemEqualTo(String value) {
            addCriterion("charging_item =", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemNotEqualTo(String value) {
            addCriterion("charging_item <>", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemGreaterThan(String value) {
            addCriterion("charging_item >", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemGreaterThanOrEqualTo(String value) {
            addCriterion("charging_item >=", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemLessThan(String value) {
            addCriterion("charging_item <", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemLessThanOrEqualTo(String value) {
            addCriterion("charging_item <=", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemLike(String value) {
            addCriterion("charging_item like", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemNotLike(String value) {
            addCriterion("charging_item not like", value, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemIn(List<String> values) {
            addCriterion("charging_item in", values, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemNotIn(List<String> values) {
            addCriterion("charging_item not in", values, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemBetween(String value1, String value2) {
            addCriterion("charging_item between", value1, value2, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andChargingItemNotBetween(String value1, String value2) {
            addCriterion("charging_item not between", value1, value2, "chargingItem");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("item_code is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("item_code is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("item_code =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("item_code <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("item_code >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("item_code >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("item_code <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("item_code <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("item_code like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("item_code not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("item_code in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("item_code not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("item_code between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("item_code not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIsNull() {
            addCriterion("amount_before is null");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIsNotNull() {
            addCriterion("amount_before is not null");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeEqualTo(Double value) {
            addCriterion("amount_before =", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotEqualTo(Double value) {
            addCriterion("amount_before <>", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeGreaterThan(Double value) {
            addCriterion("amount_before >", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_before >=", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeLessThan(Double value) {
            addCriterion("amount_before <", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeLessThanOrEqualTo(Double value) {
            addCriterion("amount_before <=", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIn(List<Double> values) {
            addCriterion("amount_before in", values, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotIn(List<Double> values) {
            addCriterion("amount_before not in", values, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeBetween(Double value1, Double value2) {
            addCriterion("amount_before between", value1, value2, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotBetween(Double value1, Double value2) {
            addCriterion("amount_before not between", value1, value2, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIsNull() {
            addCriterion("amount_after is null");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIsNotNull() {
            addCriterion("amount_after is not null");
            return (Criteria) this;
        }

        public Criteria andAmountAfterEqualTo(Double value) {
            addCriterion("amount_after =", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotEqualTo(Double value) {
            addCriterion("amount_after <>", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterGreaterThan(Double value) {
            addCriterion("amount_after >", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_after >=", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterLessThan(Double value) {
            addCriterion("amount_after <", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterLessThanOrEqualTo(Double value) {
            addCriterion("amount_after <=", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIn(List<Double> values) {
            addCriterion("amount_after in", values, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotIn(List<Double> values) {
            addCriterion("amount_after not in", values, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterBetween(Double value1, Double value2) {
            addCriterion("amount_after between", value1, value2, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotBetween(Double value1, Double value2) {
            addCriterion("amount_after not between", value1, value2, "amountAfter");
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