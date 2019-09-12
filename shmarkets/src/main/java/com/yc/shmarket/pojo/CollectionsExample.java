package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionsExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CollectionsExample() {
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

		public Criteria andColidIsNull() {
			addCriterion("colid is null");
			return (Criteria) this;
		}

		public Criteria andColidIsNotNull() {
			addCriterion("colid is not null");
			return (Criteria) this;
		}

		public Criteria andColidEqualTo(Integer value) {
			addCriterion("colid =", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidNotEqualTo(Integer value) {
			addCriterion("colid <>", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidGreaterThan(Integer value) {
			addCriterion("colid >", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidGreaterThanOrEqualTo(Integer value) {
			addCriterion("colid >=", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidLessThan(Integer value) {
			addCriterion("colid <", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidLessThanOrEqualTo(Integer value) {
			addCriterion("colid <=", value, "colid");
			return (Criteria) this;
		}

		public Criteria andColidIn(List<Integer> values) {
			addCriterion("colid in", values, "colid");
			return (Criteria) this;
		}

		public Criteria andColidNotIn(List<Integer> values) {
			addCriterion("colid not in", values, "colid");
			return (Criteria) this;
		}

		public Criteria andColidBetween(Integer value1, Integer value2) {
			addCriterion("colid between", value1, value2, "colid");
			return (Criteria) this;
		}

		public Criteria andColidNotBetween(Integer value1, Integer value2) {
			addCriterion("colid not between", value1, value2, "colid");
			return (Criteria) this;
		}

		public Criteria andUidIsNull() {
			addCriterion("uid is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {
			addCriterion("uid is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(Integer value) {
			addCriterion("uid =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(Integer value) {
			addCriterion("uid <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(Integer value) {
			addCriterion("uid >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(Integer value) {
			addCriterion("uid >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(Integer value) {
			addCriterion("uid <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(Integer value) {
			addCriterion("uid <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<Integer> values) {
			addCriterion("uid in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<Integer> values) {
			addCriterion("uid not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(Integer value1, Integer value2) {
			addCriterion("uid between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(Integer value1, Integer value2) {
			addCriterion("uid not between", value1, value2, "uid");
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

		public Criteria andColtimeIsNull() {
			addCriterion("coltime is null");
			return (Criteria) this;
		}

		public Criteria andColtimeIsNotNull() {
			addCriterion("coltime is not null");
			return (Criteria) this;
		}

		public Criteria andColtimeEqualTo(Date value) {
			addCriterion("coltime =", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeNotEqualTo(Date value) {
			addCriterion("coltime <>", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeGreaterThan(Date value) {
			addCriterion("coltime >", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("coltime >=", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeLessThan(Date value) {
			addCriterion("coltime <", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeLessThanOrEqualTo(Date value) {
			addCriterion("coltime <=", value, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeIn(List<Date> values) {
			addCriterion("coltime in", values, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeNotIn(List<Date> values) {
			addCriterion("coltime not in", values, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeBetween(Date value1, Date value2) {
			addCriterion("coltime between", value1, value2, "coltime");
			return (Criteria) this;
		}

		public Criteria andColtimeNotBetween(Date value1, Date value2) {
			addCriterion("coltime not between", value1, value2, "coltime");
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