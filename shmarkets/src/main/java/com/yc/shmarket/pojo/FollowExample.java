package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class FollowExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public FollowExample() {
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

		public Criteria andFidIsNull() {
			addCriterion("fid is null");
			return (Criteria) this;
		}

		public Criteria andFidIsNotNull() {
			addCriterion("fid is not null");
			return (Criteria) this;
		}

		public Criteria andFidEqualTo(Integer value) {
			addCriterion("fid =", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidNotEqualTo(Integer value) {
			addCriterion("fid <>", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidGreaterThan(Integer value) {
			addCriterion("fid >", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidGreaterThanOrEqualTo(Integer value) {
			addCriterion("fid >=", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidLessThan(Integer value) {
			addCriterion("fid <", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidLessThanOrEqualTo(Integer value) {
			addCriterion("fid <=", value, "fid");
			return (Criteria) this;
		}

		public Criteria andFidIn(List<Integer> values) {
			addCriterion("fid in", values, "fid");
			return (Criteria) this;
		}

		public Criteria andFidNotIn(List<Integer> values) {
			addCriterion("fid not in", values, "fid");
			return (Criteria) this;
		}

		public Criteria andFidBetween(Integer value1, Integer value2) {
			addCriterion("fid between", value1, value2, "fid");
			return (Criteria) this;
		}

		public Criteria andFidNotBetween(Integer value1, Integer value2) {
			addCriterion("fid not between", value1, value2, "fid");
			return (Criteria) this;
		}

		public Criteria andFuidIsNull() {
			addCriterion("fuid is null");
			return (Criteria) this;
		}

		public Criteria andFuidIsNotNull() {
			addCriterion("fuid is not null");
			return (Criteria) this;
		}

		public Criteria andFuidEqualTo(Integer value) {
			addCriterion("fuid =", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidNotEqualTo(Integer value) {
			addCriterion("fuid <>", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidGreaterThan(Integer value) {
			addCriterion("fuid >", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidGreaterThanOrEqualTo(Integer value) {
			addCriterion("fuid >=", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidLessThan(Integer value) {
			addCriterion("fuid <", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidLessThanOrEqualTo(Integer value) {
			addCriterion("fuid <=", value, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidIn(List<Integer> values) {
			addCriterion("fuid in", values, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidNotIn(List<Integer> values) {
			addCriterion("fuid not in", values, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidBetween(Integer value1, Integer value2) {
			addCriterion("fuid between", value1, value2, "fuid");
			return (Criteria) this;
		}

		public Criteria andFuidNotBetween(Integer value1, Integer value2) {
			addCriterion("fuid not between", value1, value2, "fuid");
			return (Criteria) this;
		}

		public Criteria andFeduidIsNull() {
			addCriterion("feduid is null");
			return (Criteria) this;
		}

		public Criteria andFeduidIsNotNull() {
			addCriterion("feduid is not null");
			return (Criteria) this;
		}

		public Criteria andFeduidEqualTo(Integer value) {
			addCriterion("feduid =", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidNotEqualTo(Integer value) {
			addCriterion("feduid <>", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidGreaterThan(Integer value) {
			addCriterion("feduid >", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidGreaterThanOrEqualTo(Integer value) {
			addCriterion("feduid >=", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidLessThan(Integer value) {
			addCriterion("feduid <", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidLessThanOrEqualTo(Integer value) {
			addCriterion("feduid <=", value, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidIn(List<Integer> values) {
			addCriterion("feduid in", values, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidNotIn(List<Integer> values) {
			addCriterion("feduid not in", values, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidBetween(Integer value1, Integer value2) {
			addCriterion("feduid between", value1, value2, "feduid");
			return (Criteria) this;
		}

		public Criteria andFeduidNotBetween(Integer value1, Integer value2) {
			addCriterion("feduid not between", value1, value2, "feduid");
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