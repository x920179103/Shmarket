package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAusenameIsNull() {
            addCriterion("ausename is null");
            return (Criteria) this;
        }

        public Criteria andAusenameIsNotNull() {
            addCriterion("ausename is not null");
            return (Criteria) this;
        }

        public Criteria andAusenameEqualTo(String value) {
            addCriterion("ausename =", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameNotEqualTo(String value) {
            addCriterion("ausename <>", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameGreaterThan(String value) {
            addCriterion("ausename >", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameGreaterThanOrEqualTo(String value) {
            addCriterion("ausename >=", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameLessThan(String value) {
            addCriterion("ausename <", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameLessThanOrEqualTo(String value) {
            addCriterion("ausename <=", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameLike(String value) {
            addCriterion("ausename like", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameNotLike(String value) {
            addCriterion("ausename not like", value, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameIn(List<String> values) {
            addCriterion("ausename in", values, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameNotIn(List<String> values) {
            addCriterion("ausename not in", values, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameBetween(String value1, String value2) {
            addCriterion("ausename between", value1, value2, "ausename");
            return (Criteria) this;
        }

        public Criteria andAusenameNotBetween(String value1, String value2) {
            addCriterion("ausename not between", value1, value2, "ausename");
            return (Criteria) this;
        }

        public Criteria andAlogoIsNull() {
            addCriterion("alogo is null");
            return (Criteria) this;
        }

        public Criteria andAlogoIsNotNull() {
            addCriterion("alogo is not null");
            return (Criteria) this;
        }

        public Criteria andAlogoEqualTo(String value) {
            addCriterion("alogo =", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoNotEqualTo(String value) {
            addCriterion("alogo <>", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoGreaterThan(String value) {
            addCriterion("alogo >", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoGreaterThanOrEqualTo(String value) {
            addCriterion("alogo >=", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoLessThan(String value) {
            addCriterion("alogo <", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoLessThanOrEqualTo(String value) {
            addCriterion("alogo <=", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoLike(String value) {
            addCriterion("alogo like", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoNotLike(String value) {
            addCriterion("alogo not like", value, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoIn(List<String> values) {
            addCriterion("alogo in", values, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoNotIn(List<String> values) {
            addCriterion("alogo not in", values, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoBetween(String value1, String value2) {
            addCriterion("alogo between", value1, value2, "alogo");
            return (Criteria) this;
        }

        public Criteria andAlogoNotBetween(String value1, String value2) {
            addCriterion("alogo not between", value1, value2, "alogo");
            return (Criteria) this;
        }

        public Criteria andApwdIsNull() {
            addCriterion("apwd is null");
            return (Criteria) this;
        }

        public Criteria andApwdIsNotNull() {
            addCriterion("apwd is not null");
            return (Criteria) this;
        }

        public Criteria andApwdEqualTo(String value) {
            addCriterion("apwd =", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotEqualTo(String value) {
            addCriterion("apwd <>", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdGreaterThan(String value) {
            addCriterion("apwd >", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdGreaterThanOrEqualTo(String value) {
            addCriterion("apwd >=", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLessThan(String value) {
            addCriterion("apwd <", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLessThanOrEqualTo(String value) {
            addCriterion("apwd <=", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdLike(String value) {
            addCriterion("apwd like", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotLike(String value) {
            addCriterion("apwd not like", value, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdIn(List<String> values) {
            addCriterion("apwd in", values, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotIn(List<String> values) {
            addCriterion("apwd not in", values, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdBetween(String value1, String value2) {
            addCriterion("apwd between", value1, value2, "apwd");
            return (Criteria) this;
        }

        public Criteria andApwdNotBetween(String value1, String value2) {
            addCriterion("apwd not between", value1, value2, "apwd");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAgenderIsNull() {
            addCriterion("agender is null");
            return (Criteria) this;
        }

        public Criteria andAgenderIsNotNull() {
            addCriterion("agender is not null");
            return (Criteria) this;
        }

        public Criteria andAgenderEqualTo(String value) {
            addCriterion("agender =", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotEqualTo(String value) {
            addCriterion("agender <>", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderGreaterThan(String value) {
            addCriterion("agender >", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderGreaterThanOrEqualTo(String value) {
            addCriterion("agender >=", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLessThan(String value) {
            addCriterion("agender <", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLessThanOrEqualTo(String value) {
            addCriterion("agender <=", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderLike(String value) {
            addCriterion("agender like", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotLike(String value) {
            addCriterion("agender not like", value, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderIn(List<String> values) {
            addCriterion("agender in", values, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotIn(List<String> values) {
            addCriterion("agender not in", values, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderBetween(String value1, String value2) {
            addCriterion("agender between", value1, value2, "agender");
            return (Criteria) this;
        }

        public Criteria andAgenderNotBetween(String value1, String value2) {
            addCriterion("agender not between", value1, value2, "agender");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNull() {
            addCriterion("aphone is null");
            return (Criteria) this;
        }

        public Criteria andAphoneIsNotNull() {
            addCriterion("aphone is not null");
            return (Criteria) this;
        }

        public Criteria andAphoneEqualTo(String value) {
            addCriterion("aphone =", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotEqualTo(String value) {
            addCriterion("aphone <>", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThan(String value) {
            addCriterion("aphone >", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneGreaterThanOrEqualTo(String value) {
            addCriterion("aphone >=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThan(String value) {
            addCriterion("aphone <", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLessThanOrEqualTo(String value) {
            addCriterion("aphone <=", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneLike(String value) {
            addCriterion("aphone like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotLike(String value) {
            addCriterion("aphone not like", value, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneIn(List<String> values) {
            addCriterion("aphone in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotIn(List<String> values) {
            addCriterion("aphone not in", values, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneBetween(String value1, String value2) {
            addCriterion("aphone between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAphoneNotBetween(String value1, String value2) {
            addCriterion("aphone not between", value1, value2, "aphone");
            return (Criteria) this;
        }

        public Criteria andAemailIsNull() {
            addCriterion("aemail is null");
            return (Criteria) this;
        }

        public Criteria andAemailIsNotNull() {
            addCriterion("aemail is not null");
            return (Criteria) this;
        }

        public Criteria andAemailEqualTo(String value) {
            addCriterion("aemail =", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotEqualTo(String value) {
            addCriterion("aemail <>", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailGreaterThan(String value) {
            addCriterion("aemail >", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailGreaterThanOrEqualTo(String value) {
            addCriterion("aemail >=", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLessThan(String value) {
            addCriterion("aemail <", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLessThanOrEqualTo(String value) {
            addCriterion("aemail <=", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailLike(String value) {
            addCriterion("aemail like", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotLike(String value) {
            addCriterion("aemail not like", value, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailIn(List<String> values) {
            addCriterion("aemail in", values, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotIn(List<String> values) {
            addCriterion("aemail not in", values, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailBetween(String value1, String value2) {
            addCriterion("aemail between", value1, value2, "aemail");
            return (Criteria) this;
        }

        public Criteria andAemailNotBetween(String value1, String value2) {
            addCriterion("aemail not between", value1, value2, "aemail");
            return (Criteria) this;
        }

        public Criteria andAlevelIsNull() {
            addCriterion("alevel is null");
            return (Criteria) this;
        }

        public Criteria andAlevelIsNotNull() {
            addCriterion("alevel is not null");
            return (Criteria) this;
        }

        public Criteria andAlevelEqualTo(Integer value) {
            addCriterion("alevel =", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelNotEqualTo(Integer value) {
            addCriterion("alevel <>", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelGreaterThan(Integer value) {
            addCriterion("alevel >", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("alevel >=", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelLessThan(Integer value) {
            addCriterion("alevel <", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelLessThanOrEqualTo(Integer value) {
            addCriterion("alevel <=", value, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelIn(List<Integer> values) {
            addCriterion("alevel in", values, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelNotIn(List<Integer> values) {
            addCriterion("alevel not in", values, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelBetween(Integer value1, Integer value2) {
            addCriterion("alevel between", value1, value2, "alevel");
            return (Criteria) this;
        }

        public Criteria andAlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("alevel not between", value1, value2, "alevel");
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