package com.bt.but.ctypechange.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UKBNOVCTCOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UKBNOVCTCOrderExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNull() {
            addCriterion("REQUESTID is null");
            return (Criteria) this;
        }

        public Criteria andRequestidIsNotNull() {
            addCriterion("REQUESTID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestidEqualTo(String value) {
            addCriterion("REQUESTID =", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotEqualTo(String value) {
            addCriterion("REQUESTID <>", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThan(String value) {
            addCriterion("REQUESTID >", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTID >=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThan(String value) {
            addCriterion("REQUESTID <", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLessThanOrEqualTo(String value) {
            addCriterion("REQUESTID <=", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidLike(String value) {
            addCriterion("REQUESTID like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotLike(String value) {
            addCriterion("REQUESTID not like", value, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidIn(List<String> values) {
            addCriterion("REQUESTID in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotIn(List<String> values) {
            addCriterion("REQUESTID not in", values, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidBetween(String value1, String value2) {
            addCriterion("REQUESTID between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andRequestidNotBetween(String value1, String value2) {
            addCriterion("REQUESTID not between", value1, value2, "requestid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartingdateIsNull() {
            addCriterion("STARTINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartingdateIsNotNull() {
            addCriterion("STARTINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartingdateEqualTo(Date value) {
            addCriterion("STARTINGDATE =", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateNotEqualTo(Date value) {
            addCriterion("STARTINGDATE <>", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateGreaterThan(Date value) {
            addCriterion("STARTINGDATE >", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTINGDATE >=", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateLessThan(Date value) {
            addCriterion("STARTINGDATE <", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTINGDATE <=", value, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateIn(List<Date> values) {
            addCriterion("STARTINGDATE in", values, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateNotIn(List<Date> values) {
            addCriterion("STARTINGDATE not in", values, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateBetween(Date value1, Date value2) {
            addCriterion("STARTINGDATE between", value1, value2, "startingdate");
            return (Criteria) this;
        }

        public Criteria andStartingdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTINGDATE not between", value1, value2, "startingdate");
            return (Criteria) this;
        }

        public Criteria andLosingbacIsNull() {
            addCriterion("LOSINGBAC is null");
            return (Criteria) this;
        }

        public Criteria andLosingbacIsNotNull() {
            addCriterion("LOSINGBAC is not null");
            return (Criteria) this;
        }

        public Criteria andLosingbacEqualTo(String value) {
            addCriterion("LOSINGBAC =", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacNotEqualTo(String value) {
            addCriterion("LOSINGBAC <>", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacGreaterThan(String value) {
            addCriterion("LOSINGBAC >", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacGreaterThanOrEqualTo(String value) {
            addCriterion("LOSINGBAC >=", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacLessThan(String value) {
            addCriterion("LOSINGBAC <", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacLessThanOrEqualTo(String value) {
            addCriterion("LOSINGBAC <=", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacLike(String value) {
            addCriterion("LOSINGBAC like", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacNotLike(String value) {
            addCriterion("LOSINGBAC not like", value, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacIn(List<String> values) {
            addCriterion("LOSINGBAC in", values, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacNotIn(List<String> values) {
            addCriterion("LOSINGBAC not in", values, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacBetween(String value1, String value2) {
            addCriterion("LOSINGBAC between", value1, value2, "losingbac");
            return (Criteria) this;
        }

        public Criteria andLosingbacNotBetween(String value1, String value2) {
            addCriterion("LOSINGBAC not between", value1, value2, "losingbac");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountIsNull() {
            addCriterion("ONEBILLACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountIsNotNull() {
            addCriterion("ONEBILLACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountEqualTo(String value) {
            addCriterion("ONEBILLACCOUNT =", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountNotEqualTo(String value) {
            addCriterion("ONEBILLACCOUNT <>", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountGreaterThan(String value) {
            addCriterion("ONEBILLACCOUNT >", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountGreaterThanOrEqualTo(String value) {
            addCriterion("ONEBILLACCOUNT >=", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountLessThan(String value) {
            addCriterion("ONEBILLACCOUNT <", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountLessThanOrEqualTo(String value) {
            addCriterion("ONEBILLACCOUNT <=", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountLike(String value) {
            addCriterion("ONEBILLACCOUNT like", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountNotLike(String value) {
            addCriterion("ONEBILLACCOUNT not like", value, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountIn(List<String> values) {
            addCriterion("ONEBILLACCOUNT in", values, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountNotIn(List<String> values) {
            addCriterion("ONEBILLACCOUNT not in", values, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountBetween(String value1, String value2) {
            addCriterion("ONEBILLACCOUNT between", value1, value2, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andOnebillaccountNotBetween(String value1, String value2) {
            addCriterion("ONEBILLACCOUNT not between", value1, value2, "onebillaccount");
            return (Criteria) this;
        }

        public Criteria andGainingcugidIsNull() {
            addCriterion("GAININGCUGID is null");
            return (Criteria) this;
        }

        public Criteria andGainingcugidIsNotNull() {
            addCriterion("GAININGCUGID is not null");
            return (Criteria) this;
        }

        public Criteria andGainingcugidEqualTo(String value) {
            addCriterion("GAININGCUGID =", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidNotEqualTo(String value) {
            addCriterion("GAININGCUGID <>", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidGreaterThan(String value) {
            addCriterion("GAININGCUGID >", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidGreaterThanOrEqualTo(String value) {
            addCriterion("GAININGCUGID >=", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidLessThan(String value) {
            addCriterion("GAININGCUGID <", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidLessThanOrEqualTo(String value) {
            addCriterion("GAININGCUGID <=", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidLike(String value) {
            addCriterion("GAININGCUGID like", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidNotLike(String value) {
            addCriterion("GAININGCUGID not like", value, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidIn(List<String> values) {
            addCriterion("GAININGCUGID in", values, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidNotIn(List<String> values) {
            addCriterion("GAININGCUGID not in", values, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidBetween(String value1, String value2) {
            addCriterion("GAININGCUGID between", value1, value2, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGainingcugidNotBetween(String value1, String value2) {
            addCriterion("GAININGCUGID not between", value1, value2, "gainingcugid");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeIsNull() {
            addCriterion("GAININGLECODE is null");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeIsNotNull() {
            addCriterion("GAININGLECODE is not null");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeEqualTo(String value) {
            addCriterion("GAININGLECODE =", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeNotEqualTo(String value) {
            addCriterion("GAININGLECODE <>", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeGreaterThan(String value) {
            addCriterion("GAININGLECODE >", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeGreaterThanOrEqualTo(String value) {
            addCriterion("GAININGLECODE >=", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeLessThan(String value) {
            addCriterion("GAININGLECODE <", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeLessThanOrEqualTo(String value) {
            addCriterion("GAININGLECODE <=", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeLike(String value) {
            addCriterion("GAININGLECODE like", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeNotLike(String value) {
            addCriterion("GAININGLECODE not like", value, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeIn(List<String> values) {
            addCriterion("GAININGLECODE in", values, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeNotIn(List<String> values) {
            addCriterion("GAININGLECODE not in", values, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeBetween(String value1, String value2) {
            addCriterion("GAININGLECODE between", value1, value2, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglecodeNotBetween(String value1, String value2) {
            addCriterion("GAININGLECODE not between", value1, value2, "gaininglecode");
            return (Criteria) this;
        }

        public Criteria andGaininglenameIsNull() {
            addCriterion("GAININGLENAME is null");
            return (Criteria) this;
        }

        public Criteria andGaininglenameIsNotNull() {
            addCriterion("GAININGLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andGaininglenameEqualTo(String value) {
            addCriterion("GAININGLENAME =", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameNotEqualTo(String value) {
            addCriterion("GAININGLENAME <>", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameGreaterThan(String value) {
            addCriterion("GAININGLENAME >", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameGreaterThanOrEqualTo(String value) {
            addCriterion("GAININGLENAME >=", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameLessThan(String value) {
            addCriterion("GAININGLENAME <", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameLessThanOrEqualTo(String value) {
            addCriterion("GAININGLENAME <=", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameLike(String value) {
            addCriterion("GAININGLENAME like", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameNotLike(String value) {
            addCriterion("GAININGLENAME not like", value, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameIn(List<String> values) {
            addCriterion("GAININGLENAME in", values, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameNotIn(List<String> values) {
            addCriterion("GAININGLENAME not in", values, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameBetween(String value1, String value2) {
            addCriterion("GAININGLENAME between", value1, value2, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGaininglenameNotBetween(String value1, String value2) {
            addCriterion("GAININGLENAME not between", value1, value2, "gaininglename");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameIsNull() {
            addCriterion("GAININGBACNAME is null");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameIsNotNull() {
            addCriterion("GAININGBACNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameEqualTo(String value) {
            addCriterion("GAININGBACNAME =", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameNotEqualTo(String value) {
            addCriterion("GAININGBACNAME <>", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameGreaterThan(String value) {
            addCriterion("GAININGBACNAME >", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameGreaterThanOrEqualTo(String value) {
            addCriterion("GAININGBACNAME >=", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameLessThan(String value) {
            addCriterion("GAININGBACNAME <", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameLessThanOrEqualTo(String value) {
            addCriterion("GAININGBACNAME <=", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameLike(String value) {
            addCriterion("GAININGBACNAME like", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameNotLike(String value) {
            addCriterion("GAININGBACNAME not like", value, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameIn(List<String> values) {
            addCriterion("GAININGBACNAME in", values, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameNotIn(List<String> values) {
            addCriterion("GAININGBACNAME not in", values, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameBetween(String value1, String value2) {
            addCriterion("GAININGBACNAME between", value1, value2, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andGainingbacnameNotBetween(String value1, String value2) {
            addCriterion("GAININGBACNAME not between", value1, value2, "gainingbacname");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNull() {
            addCriterion("EFFECTIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNotNull() {
            addCriterion("EFFECTIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateEqualTo(String value) {
            addCriterion("EFFECTIVEDATE =", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <>", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThan(String value) {
            addCriterion("EFFECTIVEDATE >", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE >=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThan(String value) {
            addCriterion("EFFECTIVEDATE <", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLike(String value) {
            addCriterion("EFFECTIVEDATE like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotLike(String value) {
            addCriterion("EFFECTIVEDATE not like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIn(List<String> values) {
            addCriterion("EFFECTIVEDATE in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotIn(List<String> values) {
            addCriterion("EFFECTIVEDATE not in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE not between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andBillingaddressIsNull() {
            addCriterion("BILLINGADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBillingaddressIsNotNull() {
            addCriterion("BILLINGADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBillingaddressEqualTo(String value) {
            addCriterion("BILLINGADDRESS =", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressNotEqualTo(String value) {
            addCriterion("BILLINGADDRESS <>", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressGreaterThan(String value) {
            addCriterion("BILLINGADDRESS >", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressGreaterThanOrEqualTo(String value) {
            addCriterion("BILLINGADDRESS >=", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressLessThan(String value) {
            addCriterion("BILLINGADDRESS <", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressLessThanOrEqualTo(String value) {
            addCriterion("BILLINGADDRESS <=", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressLike(String value) {
            addCriterion("BILLINGADDRESS like", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressNotLike(String value) {
            addCriterion("BILLINGADDRESS not like", value, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressIn(List<String> values) {
            addCriterion("BILLINGADDRESS in", values, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressNotIn(List<String> values) {
            addCriterion("BILLINGADDRESS not in", values, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressBetween(String value1, String value2) {
            addCriterion("BILLINGADDRESS between", value1, value2, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andBillingaddressNotBetween(String value1, String value2) {
            addCriterion("BILLINGADDRESS not between", value1, value2, "billingaddress");
            return (Criteria) this;
        }

        public Criteria andToacctidIsNull() {
            addCriterion("TOACCTID is null");
            return (Criteria) this;
        }

        public Criteria andToacctidIsNotNull() {
            addCriterion("TOACCTID is not null");
            return (Criteria) this;
        }

        public Criteria andToacctidEqualTo(String value) {
            addCriterion("TOACCTID =", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidNotEqualTo(String value) {
            addCriterion("TOACCTID <>", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidGreaterThan(String value) {
            addCriterion("TOACCTID >", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidGreaterThanOrEqualTo(String value) {
            addCriterion("TOACCTID >=", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidLessThan(String value) {
            addCriterion("TOACCTID <", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidLessThanOrEqualTo(String value) {
            addCriterion("TOACCTID <=", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidLike(String value) {
            addCriterion("TOACCTID like", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidNotLike(String value) {
            addCriterion("TOACCTID not like", value, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidIn(List<String> values) {
            addCriterion("TOACCTID in", values, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidNotIn(List<String> values) {
            addCriterion("TOACCTID not in", values, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidBetween(String value1, String value2) {
            addCriterion("TOACCTID between", value1, value2, "toacctid");
            return (Criteria) this;
        }

        public Criteria andToacctidNotBetween(String value1, String value2) {
            addCriterion("TOACCTID not between", value1, value2, "toacctid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidIsNull() {
            addCriterion("SERVICEACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidIsNotNull() {
            addCriterion("SERVICEACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidEqualTo(String value) {
            addCriterion("SERVICEACCOUNTID =", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidNotEqualTo(String value) {
            addCriterion("SERVICEACCOUNTID <>", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidGreaterThan(String value) {
            addCriterion("SERVICEACCOUNTID >", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEACCOUNTID >=", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidLessThan(String value) {
            addCriterion("SERVICEACCOUNTID <", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidLessThanOrEqualTo(String value) {
            addCriterion("SERVICEACCOUNTID <=", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidLike(String value) {
            addCriterion("SERVICEACCOUNTID like", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidNotLike(String value) {
            addCriterion("SERVICEACCOUNTID not like", value, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidIn(List<String> values) {
            addCriterion("SERVICEACCOUNTID in", values, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidNotIn(List<String> values) {
            addCriterion("SERVICEACCOUNTID not in", values, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidBetween(String value1, String value2) {
            addCriterion("SERVICEACCOUNTID between", value1, value2, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andServiceaccountidNotBetween(String value1, String value2) {
            addCriterion("SERVICEACCOUNTID not between", value1, value2, "serviceaccountid");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNull() {
            addCriterion("SEQUENCENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIsNotNull() {
            addCriterion("SEQUENCENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenumberEqualTo(String value) {
            addCriterion("SEQUENCENUMBER =", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotEqualTo(String value) {
            addCriterion("SEQUENCENUMBER <>", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThan(String value) {
            addCriterion("SEQUENCENUMBER >", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberGreaterThanOrEqualTo(String value) {
            addCriterion("SEQUENCENUMBER >=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThan(String value) {
            addCriterion("SEQUENCENUMBER <", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLessThanOrEqualTo(String value) {
            addCriterion("SEQUENCENUMBER <=", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberLike(String value) {
            addCriterion("SEQUENCENUMBER like", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotLike(String value) {
            addCriterion("SEQUENCENUMBER not like", value, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberIn(List<String> values) {
            addCriterion("SEQUENCENUMBER in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotIn(List<String> values) {
            addCriterion("SEQUENCENUMBER not in", values, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberBetween(String value1, String value2) {
            addCriterion("SEQUENCENUMBER between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andSequencenumberNotBetween(String value1, String value2) {
            addCriterion("SEQUENCENUMBER not between", value1, value2, "sequencenumber");
            return (Criteria) this;
        }

        public Criteria andFlowcodeIsNull() {
            addCriterion("FLOWCODE is null");
            return (Criteria) this;
        }

        public Criteria andFlowcodeIsNotNull() {
            addCriterion("FLOWCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowcodeEqualTo(String value) {
            addCriterion("FLOWCODE =", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeNotEqualTo(String value) {
            addCriterion("FLOWCODE <>", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeGreaterThan(String value) {
            addCriterion("FLOWCODE >", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWCODE >=", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeLessThan(String value) {
            addCriterion("FLOWCODE <", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeLessThanOrEqualTo(String value) {
            addCriterion("FLOWCODE <=", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeLike(String value) {
            addCriterion("FLOWCODE like", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeNotLike(String value) {
            addCriterion("FLOWCODE not like", value, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeIn(List<String> values) {
            addCriterion("FLOWCODE in", values, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeNotIn(List<String> values) {
            addCriterion("FLOWCODE not in", values, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeBetween(String value1, String value2) {
            addCriterion("FLOWCODE between", value1, value2, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowcodeNotBetween(String value1, String value2) {
            addCriterion("FLOWCODE not between", value1, value2, "flowcode");
            return (Criteria) this;
        }

        public Criteria andFlowmessageIsNull() {
            addCriterion("FLOWMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andFlowmessageIsNotNull() {
            addCriterion("FLOWMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowmessageEqualTo(String value) {
            addCriterion("FLOWMESSAGE =", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageNotEqualTo(String value) {
            addCriterion("FLOWMESSAGE <>", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageGreaterThan(String value) {
            addCriterion("FLOWMESSAGE >", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageGreaterThanOrEqualTo(String value) {
            addCriterion("FLOWMESSAGE >=", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageLessThan(String value) {
            addCriterion("FLOWMESSAGE <", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageLessThanOrEqualTo(String value) {
            addCriterion("FLOWMESSAGE <=", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageLike(String value) {
            addCriterion("FLOWMESSAGE like", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageNotLike(String value) {
            addCriterion("FLOWMESSAGE not like", value, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageIn(List<String> values) {
            addCriterion("FLOWMESSAGE in", values, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageNotIn(List<String> values) {
            addCriterion("FLOWMESSAGE not in", values, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageBetween(String value1, String value2) {
            addCriterion("FLOWMESSAGE between", value1, value2, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andFlowmessageNotBetween(String value1, String value2) {
            addCriterion("FLOWMESSAGE not between", value1, value2, "flowmessage");
            return (Criteria) this;
        }

        public Criteria andToflowfnameIsNull() {
            addCriterion("TOFLOWFNAME is null");
            return (Criteria) this;
        }

        public Criteria andToflowfnameIsNotNull() {
            addCriterion("TOFLOWFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andToflowfnameEqualTo(String value) {
            addCriterion("TOFLOWFNAME =", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameNotEqualTo(String value) {
            addCriterion("TOFLOWFNAME <>", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameGreaterThan(String value) {
            addCriterion("TOFLOWFNAME >", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameGreaterThanOrEqualTo(String value) {
            addCriterion("TOFLOWFNAME >=", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameLessThan(String value) {
            addCriterion("TOFLOWFNAME <", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameLessThanOrEqualTo(String value) {
            addCriterion("TOFLOWFNAME <=", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameLike(String value) {
            addCriterion("TOFLOWFNAME like", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameNotLike(String value) {
            addCriterion("TOFLOWFNAME not like", value, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameIn(List<String> values) {
            addCriterion("TOFLOWFNAME in", values, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameNotIn(List<String> values) {
            addCriterion("TOFLOWFNAME not in", values, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameBetween(String value1, String value2) {
            addCriterion("TOFLOWFNAME between", value1, value2, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andToflowfnameNotBetween(String value1, String value2) {
            addCriterion("TOFLOWFNAME not between", value1, value2, "toflowfname");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumIsNull() {
            addCriterion("TIRGGERBATCHNUM is null");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumIsNotNull() {
            addCriterion("TIRGGERBATCHNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumEqualTo(String value) {
            addCriterion("TIRGGERBATCHNUM =", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumNotEqualTo(String value) {
            addCriterion("TIRGGERBATCHNUM <>", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumGreaterThan(String value) {
            addCriterion("TIRGGERBATCHNUM >", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumGreaterThanOrEqualTo(String value) {
            addCriterion("TIRGGERBATCHNUM >=", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumLessThan(String value) {
            addCriterion("TIRGGERBATCHNUM <", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumLessThanOrEqualTo(String value) {
            addCriterion("TIRGGERBATCHNUM <=", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumLike(String value) {
            addCriterion("TIRGGERBATCHNUM like", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumNotLike(String value) {
            addCriterion("TIRGGERBATCHNUM not like", value, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumIn(List<String> values) {
            addCriterion("TIRGGERBATCHNUM in", values, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumNotIn(List<String> values) {
            addCriterion("TIRGGERBATCHNUM not in", values, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumBetween(String value1, String value2) {
            addCriterion("TIRGGERBATCHNUM between", value1, value2, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andTirggerbatchnumNotBetween(String value1, String value2) {
            addCriterion("TIRGGERBATCHNUM not between", value1, value2, "tirggerbatchnum");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
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