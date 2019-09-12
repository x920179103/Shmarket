package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressesExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AddressesExample() {
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

		public Criteria andAddidIsNull() {
			addCriterion("addid is null");
			return (Criteria) this;
		}

		public Criteria andAddidIsNotNull() {
			addCriterion("addid is not null");
			return (Criteria) this;
		}

		public Criteria andAddidEqualTo(Integer value) {
			addCriterion("addid =", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidNotEqualTo(Integer value) {
			addCriterion("addid <>", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidGreaterThan(Integer value) {
			addCriterion("addid >", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidGreaterThanOrEqualTo(Integer value) {
			addCriterion("addid >=", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidLessThan(Integer value) {
			addCriterion("addid <", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidLessThanOrEqualTo(Integer value) {
			addCriterion("addid <=", value, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidIn(List<Integer> values) {
			addCriterion("addid in", values, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidNotIn(List<Integer> values) {
			addCriterion("addid not in", values, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidBetween(Integer value1, Integer value2) {
			addCriterion("addid between", value1, value2, "addid");
			return (Criteria) this;
		}

		public Criteria andAddidNotBetween(Integer value1, Integer value2) {
			addCriterion("addid not between", value1, value2, "addid");
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

		public Criteria andAddnameIsNull() {
			addCriterion("addname is null");
			return (Criteria) this;
		}

		public Criteria andAddnameIsNotNull() {
			addCriterion("addname is not null");
			return (Criteria) this;
		}

		public Criteria andAddnameEqualTo(String value) {
			addCriterion("addname =", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameNotEqualTo(String value) {
			addCriterion("addname <>", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameGreaterThan(String value) {
			addCriterion("addname >", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameGreaterThanOrEqualTo(String value) {
			addCriterion("addname >=", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameLessThan(String value) {
			addCriterion("addname <", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameLessThanOrEqualTo(String value) {
			addCriterion("addname <=", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameLike(String value) {
			addCriterion("addname like", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameNotLike(String value) {
			addCriterion("addname not like", value, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameIn(List<String> values) {
			addCriterion("addname in", values, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameNotIn(List<String> values) {
			addCriterion("addname not in", values, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameBetween(String value1, String value2) {
			addCriterion("addname between", value1, value2, "addname");
			return (Criteria) this;
		}

		public Criteria andAddnameNotBetween(String value1, String value2) {
			addCriterion("addname not between", value1, value2, "addname");
			return (Criteria) this;
		}

		public Criteria andAddphoneIsNull() {
			addCriterion("addphone is null");
			return (Criteria) this;
		}

		public Criteria andAddphoneIsNotNull() {
			addCriterion("addphone is not null");
			return (Criteria) this;
		}

		public Criteria andAddphoneEqualTo(String value) {
			addCriterion("addphone =", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneNotEqualTo(String value) {
			addCriterion("addphone <>", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneGreaterThan(String value) {
			addCriterion("addphone >", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneGreaterThanOrEqualTo(String value) {
			addCriterion("addphone >=", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneLessThan(String value) {
			addCriterion("addphone <", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneLessThanOrEqualTo(String value) {
			addCriterion("addphone <=", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneLike(String value) {
			addCriterion("addphone like", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneNotLike(String value) {
			addCriterion("addphone not like", value, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneIn(List<String> values) {
			addCriterion("addphone in", values, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneNotIn(List<String> values) {
			addCriterion("addphone not in", values, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneBetween(String value1, String value2) {
			addCriterion("addphone between", value1, value2, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddphoneNotBetween(String value1, String value2) {
			addCriterion("addphone not between", value1, value2, "addphone");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddstateIsNull() {
			addCriterion("addstate is null");
			return (Criteria) this;
		}

		public Criteria andAddstateIsNotNull() {
			addCriterion("addstate is not null");
			return (Criteria) this;
		}

		public Criteria andAddstateEqualTo(Integer value) {
			addCriterion("addstate =", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateNotEqualTo(Integer value) {
			addCriterion("addstate <>", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateGreaterThan(Integer value) {
			addCriterion("addstate >", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateGreaterThanOrEqualTo(Integer value) {
			addCriterion("addstate >=", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateLessThan(Integer value) {
			addCriterion("addstate <", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateLessThanOrEqualTo(Integer value) {
			addCriterion("addstate <=", value, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateIn(List<Integer> values) {
			addCriterion("addstate in", values, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateNotIn(List<Integer> values) {
			addCriterion("addstate not in", values, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateBetween(Integer value1, Integer value2) {
			addCriterion("addstate between", value1, value2, "addstate");
			return (Criteria) this;
		}

		public Criteria andAddstateNotBetween(Integer value1, Integer value2) {
			addCriterion("addstate not between", value1, value2, "addstate");
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