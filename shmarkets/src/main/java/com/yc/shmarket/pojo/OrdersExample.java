package com.yc.shmarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public OrdersExample() {
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

		public Criteria andOnumberIsNull() {
			addCriterion("onumber is null");
			return (Criteria) this;
		}

		public Criteria andOnumberIsNotNull() {
			addCriterion("onumber is not null");
			return (Criteria) this;
		}

		public Criteria andOnumberEqualTo(String value) {
			addCriterion("onumber =", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberNotEqualTo(String value) {
			addCriterion("onumber <>", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberGreaterThan(String value) {
			addCriterion("onumber >", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberGreaterThanOrEqualTo(String value) {
			addCriterion("onumber >=", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberLessThan(String value) {
			addCriterion("onumber <", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberLessThanOrEqualTo(String value) {
			addCriterion("onumber <=", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberLike(String value) {
			addCriterion("onumber like", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberNotLike(String value) {
			addCriterion("onumber not like", value, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberIn(List<String> values) {
			addCriterion("onumber in", values, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberNotIn(List<String> values) {
			addCriterion("onumber not in", values, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberBetween(String value1, String value2) {
			addCriterion("onumber between", value1, value2, "onumber");
			return (Criteria) this;
		}

		public Criteria andOnumberNotBetween(String value1, String value2) {
			addCriterion("onumber not between", value1, value2, "onumber");
			return (Criteria) this;
		}

		public Criteria andOstateIsNull() {
			addCriterion("ostate is null");
			return (Criteria) this;
		}

		public Criteria andOstateIsNotNull() {
			addCriterion("ostate is not null");
			return (Criteria) this;
		}

		public Criteria andOstateEqualTo(Integer value) {
			addCriterion("ostate =", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateNotEqualTo(Integer value) {
			addCriterion("ostate <>", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateGreaterThan(Integer value) {
			addCriterion("ostate >", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
			addCriterion("ostate >=", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateLessThan(Integer value) {
			addCriterion("ostate <", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateLessThanOrEqualTo(Integer value) {
			addCriterion("ostate <=", value, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateIn(List<Integer> values) {
			addCriterion("ostate in", values, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateNotIn(List<Integer> values) {
			addCriterion("ostate not in", values, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateBetween(Integer value1, Integer value2) {
			addCriterion("ostate between", value1, value2, "ostate");
			return (Criteria) this;
		}

		public Criteria andOstateNotBetween(Integer value1, Integer value2) {
			addCriterion("ostate not between", value1, value2, "ostate");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeIsNull() {
			addCriterion("ocreate_time is null");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeIsNotNull() {
			addCriterion("ocreate_time is not null");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeEqualTo(Date value) {
			addCriterion("ocreate_time =", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeNotEqualTo(Date value) {
			addCriterion("ocreate_time <>", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeGreaterThan(Date value) {
			addCriterion("ocreate_time >", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("ocreate_time >=", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeLessThan(Date value) {
			addCriterion("ocreate_time <", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("ocreate_time <=", value, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeIn(List<Date> values) {
			addCriterion("ocreate_time in", values, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeNotIn(List<Date> values) {
			addCriterion("ocreate_time not in", values, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeBetween(Date value1, Date value2) {
			addCriterion("ocreate_time between", value1, value2, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOcreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("ocreate_time not between", value1, value2, "ocreateTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeIsNull() {
			addCriterion("opay_time is null");
			return (Criteria) this;
		}

		public Criteria andOpayTimeIsNotNull() {
			addCriterion("opay_time is not null");
			return (Criteria) this;
		}

		public Criteria andOpayTimeEqualTo(Date value) {
			addCriterion("opay_time =", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeNotEqualTo(Date value) {
			addCriterion("opay_time <>", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeGreaterThan(Date value) {
			addCriterion("opay_time >", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("opay_time >=", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeLessThan(Date value) {
			addCriterion("opay_time <", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeLessThanOrEqualTo(Date value) {
			addCriterion("opay_time <=", value, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeIn(List<Date> values) {
			addCriterion("opay_time in", values, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeNotIn(List<Date> values) {
			addCriterion("opay_time not in", values, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeBetween(Date value1, Date value2) {
			addCriterion("opay_time between", value1, value2, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOpayTimeNotBetween(Date value1, Date value2) {
			addCriterion("opay_time not between", value1, value2, "opayTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeIsNull() {
			addCriterion("odeliver_time is null");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeIsNotNull() {
			addCriterion("odeliver_time is not null");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeEqualTo(Date value) {
			addCriterion("odeliver_time =", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeNotEqualTo(Date value) {
			addCriterion("odeliver_time <>", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeGreaterThan(Date value) {
			addCriterion("odeliver_time >", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("odeliver_time >=", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeLessThan(Date value) {
			addCriterion("odeliver_time <", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeLessThanOrEqualTo(Date value) {
			addCriterion("odeliver_time <=", value, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeIn(List<Date> values) {
			addCriterion("odeliver_time in", values, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeNotIn(List<Date> values) {
			addCriterion("odeliver_time not in", values, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeBetween(Date value1, Date value2) {
			addCriterion("odeliver_time between", value1, value2, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOdeliverTimeNotBetween(Date value1, Date value2) {
			addCriterion("odeliver_time not between", value1, value2, "odeliverTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeIsNull() {
			addCriterion("ofinish_time is null");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeIsNotNull() {
			addCriterion("ofinish_time is not null");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeEqualTo(Date value) {
			addCriterion("ofinish_time =", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeNotEqualTo(Date value) {
			addCriterion("ofinish_time <>", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeGreaterThan(Date value) {
			addCriterion("ofinish_time >", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("ofinish_time >=", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeLessThan(Date value) {
			addCriterion("ofinish_time <", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeLessThanOrEqualTo(Date value) {
			addCriterion("ofinish_time <=", value, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeIn(List<Date> values) {
			addCriterion("ofinish_time in", values, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeNotIn(List<Date> values) {
			addCriterion("ofinish_time not in", values, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeBetween(Date value1, Date value2) {
			addCriterion("ofinish_time between", value1, value2, "ofinishTime");
			return (Criteria) this;
		}

		public Criteria andOfinishTimeNotBetween(Date value1, Date value2) {
			addCriterion("ofinish_time not between", value1, value2, "ofinishTime");
			return (Criteria) this;
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

		public Criteria andOpsIsNull() {
			addCriterion("ops is null");
			return (Criteria) this;
		}

		public Criteria andOpsIsNotNull() {
			addCriterion("ops is not null");
			return (Criteria) this;
		}

		public Criteria andOpsEqualTo(String value) {
			addCriterion("ops =", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsNotEqualTo(String value) {
			addCriterion("ops <>", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsGreaterThan(String value) {
			addCriterion("ops >", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsGreaterThanOrEqualTo(String value) {
			addCriterion("ops >=", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsLessThan(String value) {
			addCriterion("ops <", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsLessThanOrEqualTo(String value) {
			addCriterion("ops <=", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsLike(String value) {
			addCriterion("ops like", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsNotLike(String value) {
			addCriterion("ops not like", value, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsIn(List<String> values) {
			addCriterion("ops in", values, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsNotIn(List<String> values) {
			addCriterion("ops not in", values, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsBetween(String value1, String value2) {
			addCriterion("ops between", value1, value2, "ops");
			return (Criteria) this;
		}

		public Criteria andOpsNotBetween(String value1, String value2) {
			addCriterion("ops not between", value1, value2, "ops");
			return (Criteria) this;
		}

		public Criteria andOallChargeIsNull() {
			addCriterion("oall_charge is null");
			return (Criteria) this;
		}

		public Criteria andOallChargeIsNotNull() {
			addCriterion("oall_charge is not null");
			return (Criteria) this;
		}

		public Criteria andOallChargeEqualTo(Long value) {
			addCriterion("oall_charge =", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeNotEqualTo(Long value) {
			addCriterion("oall_charge <>", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeGreaterThan(Long value) {
			addCriterion("oall_charge >", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeGreaterThanOrEqualTo(Long value) {
			addCriterion("oall_charge >=", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeLessThan(Long value) {
			addCriterion("oall_charge <", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeLessThanOrEqualTo(Long value) {
			addCriterion("oall_charge <=", value, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeIn(List<Long> values) {
			addCriterion("oall_charge in", values, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeNotIn(List<Long> values) {
			addCriterion("oall_charge not in", values, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeBetween(Long value1, Long value2) {
			addCriterion("oall_charge between", value1, value2, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallChargeNotBetween(Long value1, Long value2) {
			addCriterion("oall_charge not between", value1, value2, "oallCharge");
			return (Criteria) this;
		}

		public Criteria andOallPriceIsNull() {
			addCriterion("oall_price is null");
			return (Criteria) this;
		}

		public Criteria andOallPriceIsNotNull() {
			addCriterion("oall_price is not null");
			return (Criteria) this;
		}

		public Criteria andOallPriceEqualTo(Long value) {
			addCriterion("oall_price =", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceNotEqualTo(Long value) {
			addCriterion("oall_price <>", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceGreaterThan(Long value) {
			addCriterion("oall_price >", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceGreaterThanOrEqualTo(Long value) {
			addCriterion("oall_price >=", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceLessThan(Long value) {
			addCriterion("oall_price <", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceLessThanOrEqualTo(Long value) {
			addCriterion("oall_price <=", value, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceIn(List<Long> values) {
			addCriterion("oall_price in", values, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceNotIn(List<Long> values) {
			addCriterion("oall_price not in", values, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceBetween(Long value1, Long value2) {
			addCriterion("oall_price between", value1, value2, "oallPrice");
			return (Criteria) this;
		}

		public Criteria andOallPriceNotBetween(Long value1, Long value2) {
			addCriterion("oall_price not between", value1, value2, "oallPrice");
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