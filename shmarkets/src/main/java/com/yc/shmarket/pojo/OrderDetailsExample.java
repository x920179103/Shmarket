package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsExample() {
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

        public Criteria andOdidIsNull() {
            addCriterion("odid is null");
            return (Criteria) this;
        }

        public Criteria andOdidIsNotNull() {
            addCriterion("odid is not null");
            return (Criteria) this;
        }

        public Criteria andOdidEqualTo(Integer value) {
            addCriterion("odid =", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotEqualTo(Integer value) {
            addCriterion("odid <>", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThan(Integer value) {
            addCriterion("odid >", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("odid >=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThan(Integer value) {
            addCriterion("odid <", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThanOrEqualTo(Integer value) {
            addCriterion("odid <=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidIn(List<Integer> values) {
            addCriterion("odid in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotIn(List<Integer> values) {
            addCriterion("odid not in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidBetween(Integer value1, Integer value2) {
            addCriterion("odid between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotBetween(Integer value1, Integer value2) {
            addCriterion("odid not between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andOdpriceIsNull() {
            addCriterion("odprice is null");
            return (Criteria) this;
        }

        public Criteria andOdpriceIsNotNull() {
            addCriterion("odprice is not null");
            return (Criteria) this;
        }

        public Criteria andOdpriceEqualTo(Long value) {
            addCriterion("odprice =", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotEqualTo(Long value) {
            addCriterion("odprice <>", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceGreaterThan(Long value) {
            addCriterion("odprice >", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("odprice >=", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceLessThan(Long value) {
            addCriterion("odprice <", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceLessThanOrEqualTo(Long value) {
            addCriterion("odprice <=", value, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceIn(List<Long> values) {
            addCriterion("odprice in", values, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotIn(List<Long> values) {
            addCriterion("odprice not in", values, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceBetween(Long value1, Long value2) {
            addCriterion("odprice between", value1, value2, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdpriceNotBetween(Long value1, Long value2) {
            addCriterion("odprice not between", value1, value2, "odprice");
            return (Criteria) this;
        }

        public Criteria andOdnumIsNull() {
            addCriterion("odnum is null");
            return (Criteria) this;
        }

        public Criteria andOdnumIsNotNull() {
            addCriterion("odnum is not null");
            return (Criteria) this;
        }

        public Criteria andOdnumEqualTo(Integer value) {
            addCriterion("odnum =", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumNotEqualTo(Integer value) {
            addCriterion("odnum <>", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumGreaterThan(Integer value) {
            addCriterion("odnum >", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("odnum >=", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumLessThan(Integer value) {
            addCriterion("odnum <", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumLessThanOrEqualTo(Integer value) {
            addCriterion("odnum <=", value, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumIn(List<Integer> values) {
            addCriterion("odnum in", values, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumNotIn(List<Integer> values) {
            addCriterion("odnum not in", values, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumBetween(Integer value1, Integer value2) {
            addCriterion("odnum between", value1, value2, "odnum");
            return (Criteria) this;
        }

        public Criteria andOdnumNotBetween(Integer value1, Integer value2) {
            addCriterion("odnum not between", value1, value2, "odnum");
            return (Criteria) this;
        }

        public Criteria andOchargeIsNull() {
            addCriterion("ocharge is null");
            return (Criteria) this;
        }

        public Criteria andOchargeIsNotNull() {
            addCriterion("ocharge is not null");
            return (Criteria) this;
        }

        public Criteria andOchargeEqualTo(Long value) {
            addCriterion("ocharge =", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeNotEqualTo(Long value) {
            addCriterion("ocharge <>", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeGreaterThan(Long value) {
            addCriterion("ocharge >", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeGreaterThanOrEqualTo(Long value) {
            addCriterion("ocharge >=", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeLessThan(Long value) {
            addCriterion("ocharge <", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeLessThanOrEqualTo(Long value) {
            addCriterion("ocharge <=", value, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeIn(List<Long> values) {
            addCriterion("ocharge in", values, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeNotIn(List<Long> values) {
            addCriterion("ocharge not in", values, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeBetween(Long value1, Long value2) {
            addCriterion("ocharge between", value1, value2, "ocharge");
            return (Criteria) this;
        }

        public Criteria andOchargeNotBetween(Long value1, Long value2) {
            addCriterion("ocharge not between", value1, value2, "ocharge");
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