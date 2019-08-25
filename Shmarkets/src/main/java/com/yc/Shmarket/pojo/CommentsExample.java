package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andComidIsNull() {
            addCriterion("comid is null");
            return (Criteria) this;
        }

        public Criteria andComidIsNotNull() {
            addCriterion("comid is not null");
            return (Criteria) this;
        }

        public Criteria andComidEqualTo(Integer value) {
            addCriterion("comid =", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotEqualTo(Integer value) {
            addCriterion("comid <>", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThan(Integer value) {
            addCriterion("comid >", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comid >=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThan(Integer value) {
            addCriterion("comid <", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThanOrEqualTo(Integer value) {
            addCriterion("comid <=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidIn(List<Integer> values) {
            addCriterion("comid in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotIn(List<Integer> values) {
            addCriterion("comid not in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidBetween(Integer value1, Integer value2) {
            addCriterion("comid between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotBetween(Integer value1, Integer value2) {
            addCriterion("comid not between", value1, value2, "comid");
            return (Criteria) this;
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

        public Criteria andComcontentIsNull() {
            addCriterion("comcontent is null");
            return (Criteria) this;
        }

        public Criteria andComcontentIsNotNull() {
            addCriterion("comcontent is not null");
            return (Criteria) this;
        }

        public Criteria andComcontentEqualTo(String value) {
            addCriterion("comcontent =", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotEqualTo(String value) {
            addCriterion("comcontent <>", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentGreaterThan(String value) {
            addCriterion("comcontent >", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentGreaterThanOrEqualTo(String value) {
            addCriterion("comcontent >=", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLessThan(String value) {
            addCriterion("comcontent <", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLessThanOrEqualTo(String value) {
            addCriterion("comcontent <=", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentLike(String value) {
            addCriterion("comcontent like", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotLike(String value) {
            addCriterion("comcontent not like", value, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentIn(List<String> values) {
            addCriterion("comcontent in", values, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotIn(List<String> values) {
            addCriterion("comcontent not in", values, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentBetween(String value1, String value2) {
            addCriterion("comcontent between", value1, value2, "comcontent");
            return (Criteria) this;
        }

        public Criteria andComcontentNotBetween(String value1, String value2) {
            addCriterion("comcontent not between", value1, value2, "comcontent");
            return (Criteria) this;
        }

        public Criteria andCompicIsNull() {
            addCriterion("compic is null");
            return (Criteria) this;
        }

        public Criteria andCompicIsNotNull() {
            addCriterion("compic is not null");
            return (Criteria) this;
        }

        public Criteria andCompicEqualTo(String value) {
            addCriterion("compic =", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicNotEqualTo(String value) {
            addCriterion("compic <>", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicGreaterThan(String value) {
            addCriterion("compic >", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicGreaterThanOrEqualTo(String value) {
            addCriterion("compic >=", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicLessThan(String value) {
            addCriterion("compic <", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicLessThanOrEqualTo(String value) {
            addCriterion("compic <=", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicLike(String value) {
            addCriterion("compic like", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicNotLike(String value) {
            addCriterion("compic not like", value, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicIn(List<String> values) {
            addCriterion("compic in", values, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicNotIn(List<String> values) {
            addCriterion("compic not in", values, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicBetween(String value1, String value2) {
            addCriterion("compic between", value1, value2, "compic");
            return (Criteria) this;
        }

        public Criteria andCompicNotBetween(String value1, String value2) {
            addCriterion("compic not between", value1, value2, "compic");
            return (Criteria) this;
        }

        public Criteria andComgradeIsNull() {
            addCriterion("comgrade is null");
            return (Criteria) this;
        }

        public Criteria andComgradeIsNotNull() {
            addCriterion("comgrade is not null");
            return (Criteria) this;
        }

        public Criteria andComgradeEqualTo(Integer value) {
            addCriterion("comgrade =", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeNotEqualTo(Integer value) {
            addCriterion("comgrade <>", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeGreaterThan(Integer value) {
            addCriterion("comgrade >", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("comgrade >=", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeLessThan(Integer value) {
            addCriterion("comgrade <", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeLessThanOrEqualTo(Integer value) {
            addCriterion("comgrade <=", value, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeIn(List<Integer> values) {
            addCriterion("comgrade in", values, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeNotIn(List<Integer> values) {
            addCriterion("comgrade not in", values, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeBetween(Integer value1, Integer value2) {
            addCriterion("comgrade between", value1, value2, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("comgrade not between", value1, value2, "comgrade");
            return (Criteria) this;
        }

        public Criteria andComtimeIsNull() {
            addCriterion("comtime is null");
            return (Criteria) this;
        }

        public Criteria andComtimeIsNotNull() {
            addCriterion("comtime is not null");
            return (Criteria) this;
        }

        public Criteria andComtimeEqualTo(Date value) {
            addCriterion("comtime =", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotEqualTo(Date value) {
            addCriterion("comtime <>", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeGreaterThan(Date value) {
            addCriterion("comtime >", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comtime >=", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeLessThan(Date value) {
            addCriterion("comtime <", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeLessThanOrEqualTo(Date value) {
            addCriterion("comtime <=", value, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeIn(List<Date> values) {
            addCriterion("comtime in", values, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotIn(List<Date> values) {
            addCriterion("comtime not in", values, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeBetween(Date value1, Date value2) {
            addCriterion("comtime between", value1, value2, "comtime");
            return (Criteria) this;
        }

        public Criteria andComtimeNotBetween(Date value1, Date value2) {
            addCriterion("comtime not between", value1, value2, "comtime");
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