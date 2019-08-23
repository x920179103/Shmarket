package com.yc.Shmarket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommoditiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommoditiesExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCnumIsNull() {
            addCriterion("cnum is null");
            return (Criteria) this;
        }

        public Criteria andCnumIsNotNull() {
            addCriterion("cnum is not null");
            return (Criteria) this;
        }

        public Criteria andCnumEqualTo(Integer value) {
            addCriterion("cnum =", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotEqualTo(Integer value) {
            addCriterion("cnum <>", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThan(Integer value) {
            addCriterion("cnum >", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnum >=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThan(Integer value) {
            addCriterion("cnum <", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThanOrEqualTo(Integer value) {
            addCriterion("cnum <=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumIn(List<Integer> values) {
            addCriterion("cnum in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotIn(List<Integer> values) {
            addCriterion("cnum not in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumBetween(Integer value1, Integer value2) {
            addCriterion("cnum between", value1, value2, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cnum not between", value1, value2, "cnum");
            return (Criteria) this;
        }

        public Criteria andCdescribeIsNull() {
            addCriterion("cdescribe is null");
            return (Criteria) this;
        }

        public Criteria andCdescribeIsNotNull() {
            addCriterion("cdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andCdescribeEqualTo(String value) {
            addCriterion("cdescribe =", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeNotEqualTo(String value) {
            addCriterion("cdescribe <>", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeGreaterThan(String value) {
            addCriterion("cdescribe >", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cdescribe >=", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeLessThan(String value) {
            addCriterion("cdescribe <", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeLessThanOrEqualTo(String value) {
            addCriterion("cdescribe <=", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeLike(String value) {
            addCriterion("cdescribe like", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeNotLike(String value) {
            addCriterion("cdescribe not like", value, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeIn(List<String> values) {
            addCriterion("cdescribe in", values, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeNotIn(List<String> values) {
            addCriterion("cdescribe not in", values, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeBetween(String value1, String value2) {
            addCriterion("cdescribe between", value1, value2, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCdescribeNotBetween(String value1, String value2) {
            addCriterion("cdescribe not between", value1, value2, "cdescribe");
            return (Criteria) this;
        }

        public Criteria andCcolorIsNull() {
            addCriterion("ccolor is null");
            return (Criteria) this;
        }

        public Criteria andCcolorIsNotNull() {
            addCriterion("ccolor is not null");
            return (Criteria) this;
        }

        public Criteria andCcolorEqualTo(String value) {
            addCriterion("ccolor =", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotEqualTo(String value) {
            addCriterion("ccolor <>", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorGreaterThan(String value) {
            addCriterion("ccolor >", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorGreaterThanOrEqualTo(String value) {
            addCriterion("ccolor >=", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLessThan(String value) {
            addCriterion("ccolor <", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLessThanOrEqualTo(String value) {
            addCriterion("ccolor <=", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLike(String value) {
            addCriterion("ccolor like", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotLike(String value) {
            addCriterion("ccolor not like", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorIn(List<String> values) {
            addCriterion("ccolor in", values, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotIn(List<String> values) {
            addCriterion("ccolor not in", values, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorBetween(String value1, String value2) {
            addCriterion("ccolor between", value1, value2, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotBetween(String value1, String value2) {
            addCriterion("ccolor not between", value1, value2, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNull() {
            addCriterion("cmodel is null");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNotNull() {
            addCriterion("cmodel is not null");
            return (Criteria) this;
        }

        public Criteria andCmodelEqualTo(String value) {
            addCriterion("cmodel =", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotEqualTo(String value) {
            addCriterion("cmodel <>", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThan(String value) {
            addCriterion("cmodel >", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThanOrEqualTo(String value) {
            addCriterion("cmodel >=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThan(String value) {
            addCriterion("cmodel <", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThanOrEqualTo(String value) {
            addCriterion("cmodel <=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLike(String value) {
            addCriterion("cmodel like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotLike(String value) {
            addCriterion("cmodel not like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelIn(List<String> values) {
            addCriterion("cmodel in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotIn(List<String> values) {
            addCriterion("cmodel not in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelBetween(String value1, String value2) {
            addCriterion("cmodel between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotBetween(String value1, String value2) {
            addCriterion("cmodel not between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCnewIsNull() {
            addCriterion("cnew is null");
            return (Criteria) this;
        }

        public Criteria andCnewIsNotNull() {
            addCriterion("cnew is not null");
            return (Criteria) this;
        }

        public Criteria andCnewEqualTo(Integer value) {
            addCriterion("cnew =", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewNotEqualTo(Integer value) {
            addCriterion("cnew <>", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewGreaterThan(Integer value) {
            addCriterion("cnew >", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnew >=", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewLessThan(Integer value) {
            addCriterion("cnew <", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewLessThanOrEqualTo(Integer value) {
            addCriterion("cnew <=", value, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewIn(List<Integer> values) {
            addCriterion("cnew in", values, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewNotIn(List<Integer> values) {
            addCriterion("cnew not in", values, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewBetween(Integer value1, Integer value2) {
            addCriterion("cnew between", value1, value2, "cnew");
            return (Criteria) this;
        }

        public Criteria andCnewNotBetween(Integer value1, Integer value2) {
            addCriterion("cnew not between", value1, value2, "cnew");
            return (Criteria) this;
        }

        public Criteria andCpicIsNull() {
            addCriterion("cpic is null");
            return (Criteria) this;
        }

        public Criteria andCpicIsNotNull() {
            addCriterion("cpic is not null");
            return (Criteria) this;
        }

        public Criteria andCpicEqualTo(String value) {
            addCriterion("cpic =", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotEqualTo(String value) {
            addCriterion("cpic <>", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicGreaterThan(String value) {
            addCriterion("cpic >", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicGreaterThanOrEqualTo(String value) {
            addCriterion("cpic >=", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLessThan(String value) {
            addCriterion("cpic <", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLessThanOrEqualTo(String value) {
            addCriterion("cpic <=", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLike(String value) {
            addCriterion("cpic like", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotLike(String value) {
            addCriterion("cpic not like", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicIn(List<String> values) {
            addCriterion("cpic in", values, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotIn(List<String> values) {
            addCriterion("cpic not in", values, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicBetween(String value1, String value2) {
            addCriterion("cpic between", value1, value2, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotBetween(String value1, String value2) {
            addCriterion("cpic not between", value1, value2, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNull() {
            addCriterion("cprice is null");
            return (Criteria) this;
        }

        public Criteria andCpriceIsNotNull() {
            addCriterion("cprice is not null");
            return (Criteria) this;
        }

        public Criteria andCpriceEqualTo(Long value) {
            addCriterion("cprice =", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotEqualTo(Long value) {
            addCriterion("cprice <>", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThan(Long value) {
            addCriterion("cprice >", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("cprice >=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThan(Long value) {
            addCriterion("cprice <", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceLessThanOrEqualTo(Long value) {
            addCriterion("cprice <=", value, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceIn(List<Long> values) {
            addCriterion("cprice in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotIn(List<Long> values) {
            addCriterion("cprice not in", values, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceBetween(Long value1, Long value2) {
            addCriterion("cprice between", value1, value2, "cprice");
            return (Criteria) this;
        }

        public Criteria andCpriceNotBetween(Long value1, Long value2) {
            addCriterion("cprice not between", value1, value2, "cprice");
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

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCpostageIsNull() {
            addCriterion("cpostage is null");
            return (Criteria) this;
        }

        public Criteria andCpostageIsNotNull() {
            addCriterion("cpostage is not null");
            return (Criteria) this;
        }

        public Criteria andCpostageEqualTo(Integer value) {
            addCriterion("cpostage =", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageNotEqualTo(Integer value) {
            addCriterion("cpostage <>", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageGreaterThan(Integer value) {
            addCriterion("cpostage >", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpostage >=", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageLessThan(Integer value) {
            addCriterion("cpostage <", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageLessThanOrEqualTo(Integer value) {
            addCriterion("cpostage <=", value, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageIn(List<Integer> values) {
            addCriterion("cpostage in", values, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageNotIn(List<Integer> values) {
            addCriterion("cpostage not in", values, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageBetween(Integer value1, Integer value2) {
            addCriterion("cpostage between", value1, value2, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCpostageNotBetween(Integer value1, Integer value2) {
            addCriterion("cpostage not between", value1, value2, "cpostage");
            return (Criteria) this;
        }

        public Criteria andCupDateIsNull() {
            addCriterion("cup_date is null");
            return (Criteria) this;
        }

        public Criteria andCupDateIsNotNull() {
            addCriterion("cup_date is not null");
            return (Criteria) this;
        }

        public Criteria andCupDateEqualTo(Date value) {
            addCriterion("cup_date =", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateNotEqualTo(Date value) {
            addCriterion("cup_date <>", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateGreaterThan(Date value) {
            addCriterion("cup_date >", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cup_date >=", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateLessThan(Date value) {
            addCriterion("cup_date <", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateLessThanOrEqualTo(Date value) {
            addCriterion("cup_date <=", value, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateIn(List<Date> values) {
            addCriterion("cup_date in", values, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateNotIn(List<Date> values) {
            addCriterion("cup_date not in", values, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateBetween(Date value1, Date value2) {
            addCriterion("cup_date between", value1, value2, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCupDateNotBetween(Date value1, Date value2) {
            addCriterion("cup_date not between", value1, value2, "cupDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateIsNull() {
            addCriterion("cdown_date is null");
            return (Criteria) this;
        }

        public Criteria andCdownDateIsNotNull() {
            addCriterion("cdown_date is not null");
            return (Criteria) this;
        }

        public Criteria andCdownDateEqualTo(Date value) {
            addCriterion("cdown_date =", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateNotEqualTo(Date value) {
            addCriterion("cdown_date <>", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateGreaterThan(Date value) {
            addCriterion("cdown_date >", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdown_date >=", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateLessThan(Date value) {
            addCriterion("cdown_date <", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateLessThanOrEqualTo(Date value) {
            addCriterion("cdown_date <=", value, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateIn(List<Date> values) {
            addCriterion("cdown_date in", values, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateNotIn(List<Date> values) {
            addCriterion("cdown_date not in", values, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateBetween(Date value1, Date value2) {
            addCriterion("cdown_date between", value1, value2, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCdownDateNotBetween(Date value1, Date value2) {
            addCriterion("cdown_date not between", value1, value2, "cdownDate");
            return (Criteria) this;
        }

        public Criteria andCstateComIsNull() {
            addCriterion("cstate_com is null");
            return (Criteria) this;
        }

        public Criteria andCstateComIsNotNull() {
            addCriterion("cstate_com is not null");
            return (Criteria) this;
        }

        public Criteria andCstateComEqualTo(Integer value) {
            addCriterion("cstate_com =", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComNotEqualTo(Integer value) {
            addCriterion("cstate_com <>", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComGreaterThan(Integer value) {
            addCriterion("cstate_com >", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstate_com >=", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComLessThan(Integer value) {
            addCriterion("cstate_com <", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComLessThanOrEqualTo(Integer value) {
            addCriterion("cstate_com <=", value, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComIn(List<Integer> values) {
            addCriterion("cstate_com in", values, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComNotIn(List<Integer> values) {
            addCriterion("cstate_com not in", values, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComBetween(Integer value1, Integer value2) {
            addCriterion("cstate_com between", value1, value2, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateComNotBetween(Integer value1, Integer value2) {
            addCriterion("cstate_com not between", value1, value2, "cstateCom");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanIsNull() {
            addCriterion("cstate_dingdan is null");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanIsNotNull() {
            addCriterion("cstate_dingdan is not null");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanEqualTo(Integer value) {
            addCriterion("cstate_dingdan =", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanNotEqualTo(Integer value) {
            addCriterion("cstate_dingdan <>", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanGreaterThan(Integer value) {
            addCriterion("cstate_dingdan >", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstate_dingdan >=", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanLessThan(Integer value) {
            addCriterion("cstate_dingdan <", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanLessThanOrEqualTo(Integer value) {
            addCriterion("cstate_dingdan <=", value, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanIn(List<Integer> values) {
            addCriterion("cstate_dingdan in", values, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanNotIn(List<Integer> values) {
            addCriterion("cstate_dingdan not in", values, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanBetween(Integer value1, Integer value2) {
            addCriterion("cstate_dingdan between", value1, value2, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCstateDingdanNotBetween(Integer value1, Integer value2) {
            addCriterion("cstate_dingdan not between", value1, value2, "cstateDingdan");
            return (Criteria) this;
        }

        public Criteria andCavgGradeIsNull() {
            addCriterion("cavg_grade is null");
            return (Criteria) this;
        }

        public Criteria andCavgGradeIsNotNull() {
            addCriterion("cavg_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCavgGradeEqualTo(Integer value) {
            addCriterion("cavg_grade =", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeNotEqualTo(Integer value) {
            addCriterion("cavg_grade <>", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeGreaterThan(Integer value) {
            addCriterion("cavg_grade >", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cavg_grade >=", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeLessThan(Integer value) {
            addCriterion("cavg_grade <", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeLessThanOrEqualTo(Integer value) {
            addCriterion("cavg_grade <=", value, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeIn(List<Integer> values) {
            addCriterion("cavg_grade in", values, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeNotIn(List<Integer> values) {
            addCriterion("cavg_grade not in", values, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeBetween(Integer value1, Integer value2) {
            addCriterion("cavg_grade between", value1, value2, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCavgGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("cavg_grade not between", value1, value2, "cavgGrade");
            return (Criteria) this;
        }

        public Criteria andCbargainIsNull() {
            addCriterion("cbargain is null");
            return (Criteria) this;
        }

        public Criteria andCbargainIsNotNull() {
            addCriterion("cbargain is not null");
            return (Criteria) this;
        }

        public Criteria andCbargainEqualTo(String value) {
            addCriterion("cbargain =", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainNotEqualTo(String value) {
            addCriterion("cbargain <>", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainGreaterThan(String value) {
            addCriterion("cbargain >", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainGreaterThanOrEqualTo(String value) {
            addCriterion("cbargain >=", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainLessThan(String value) {
            addCriterion("cbargain <", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainLessThanOrEqualTo(String value) {
            addCriterion("cbargain <=", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainLike(String value) {
            addCriterion("cbargain like", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainNotLike(String value) {
            addCriterion("cbargain not like", value, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainIn(List<String> values) {
            addCriterion("cbargain in", values, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainNotIn(List<String> values) {
            addCriterion("cbargain not in", values, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainBetween(String value1, String value2) {
            addCriterion("cbargain between", value1, value2, "cbargain");
            return (Criteria) this;
        }

        public Criteria andCbargainNotBetween(String value1, String value2) {
            addCriterion("cbargain not between", value1, value2, "cbargain");
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