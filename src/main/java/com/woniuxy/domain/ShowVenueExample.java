package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class ShowVenueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShowVenueExample() {
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

        public Criteria andSvidIsNull() {
            addCriterion("svid is null");
            return (Criteria) this;
        }

        public Criteria andSvidIsNotNull() {
            addCriterion("svid is not null");
            return (Criteria) this;
        }

        public Criteria andSvidEqualTo(String value) {
            addCriterion("svid =", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidNotEqualTo(String value) {
            addCriterion("svid <>", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidGreaterThan(String value) {
            addCriterion("svid >", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidGreaterThanOrEqualTo(String value) {
            addCriterion("svid >=", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidLessThan(String value) {
            addCriterion("svid <", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidLessThanOrEqualTo(String value) {
            addCriterion("svid <=", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidLike(String value) {
            addCriterion("svid like", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidNotLike(String value) {
            addCriterion("svid not like", value, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidIn(List<String> values) {
            addCriterion("svid in", values, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidNotIn(List<String> values) {
            addCriterion("svid not in", values, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidBetween(String value1, String value2) {
            addCriterion("svid between", value1, value2, "svid");
            return (Criteria) this;
        }

        public Criteria andSvidNotBetween(String value1, String value2) {
            addCriterion("svid not between", value1, value2, "svid");
            return (Criteria) this;
        }

        public Criteria andSvnameIsNull() {
            addCriterion("svname is null");
            return (Criteria) this;
        }

        public Criteria andSvnameIsNotNull() {
            addCriterion("svname is not null");
            return (Criteria) this;
        }

        public Criteria andSvnameEqualTo(String value) {
            addCriterion("svname =", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameNotEqualTo(String value) {
            addCriterion("svname <>", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameGreaterThan(String value) {
            addCriterion("svname >", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameGreaterThanOrEqualTo(String value) {
            addCriterion("svname >=", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameLessThan(String value) {
            addCriterion("svname <", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameLessThanOrEqualTo(String value) {
            addCriterion("svname <=", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameLike(String value) {
            addCriterion("svname like", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameNotLike(String value) {
            addCriterion("svname not like", value, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameIn(List<String> values) {
            addCriterion("svname in", values, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameNotIn(List<String> values) {
            addCriterion("svname not in", values, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameBetween(String value1, String value2) {
            addCriterion("svname between", value1, value2, "svname");
            return (Criteria) this;
        }

        public Criteria andSvnameNotBetween(String value1, String value2) {
            addCriterion("svname not between", value1, value2, "svname");
            return (Criteria) this;
        }

        public Criteria andSvaddressIsNull() {
            addCriterion("svaddress is null");
            return (Criteria) this;
        }

        public Criteria andSvaddressIsNotNull() {
            addCriterion("svaddress is not null");
            return (Criteria) this;
        }

        public Criteria andSvaddressEqualTo(String value) {
            addCriterion("svaddress =", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressNotEqualTo(String value) {
            addCriterion("svaddress <>", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressGreaterThan(String value) {
            addCriterion("svaddress >", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressGreaterThanOrEqualTo(String value) {
            addCriterion("svaddress >=", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressLessThan(String value) {
            addCriterion("svaddress <", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressLessThanOrEqualTo(String value) {
            addCriterion("svaddress <=", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressLike(String value) {
            addCriterion("svaddress like", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressNotLike(String value) {
            addCriterion("svaddress not like", value, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressIn(List<String> values) {
            addCriterion("svaddress in", values, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressNotIn(List<String> values) {
            addCriterion("svaddress not in", values, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressBetween(String value1, String value2) {
            addCriterion("svaddress between", value1, value2, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvaddressNotBetween(String value1, String value2) {
            addCriterion("svaddress not between", value1, value2, "svaddress");
            return (Criteria) this;
        }

        public Criteria andSvinfoIsNull() {
            addCriterion("svinfo is null");
            return (Criteria) this;
        }

        public Criteria andSvinfoIsNotNull() {
            addCriterion("svinfo is not null");
            return (Criteria) this;
        }

        public Criteria andSvinfoEqualTo(String value) {
            addCriterion("svinfo =", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoNotEqualTo(String value) {
            addCriterion("svinfo <>", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoGreaterThan(String value) {
            addCriterion("svinfo >", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoGreaterThanOrEqualTo(String value) {
            addCriterion("svinfo >=", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoLessThan(String value) {
            addCriterion("svinfo <", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoLessThanOrEqualTo(String value) {
            addCriterion("svinfo <=", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoLike(String value) {
            addCriterion("svinfo like", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoNotLike(String value) {
            addCriterion("svinfo not like", value, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoIn(List<String> values) {
            addCriterion("svinfo in", values, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoNotIn(List<String> values) {
            addCriterion("svinfo not in", values, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoBetween(String value1, String value2) {
            addCriterion("svinfo between", value1, value2, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvinfoNotBetween(String value1, String value2) {
            addCriterion("svinfo not between", value1, value2, "svinfo");
            return (Criteria) this;
        }

        public Criteria andSvlayoutIsNull() {
            addCriterion("svlayout is null");
            return (Criteria) this;
        }

        public Criteria andSvlayoutIsNotNull() {
            addCriterion("svlayout is not null");
            return (Criteria) this;
        }

        public Criteria andSvlayoutEqualTo(String value) {
            addCriterion("svlayout =", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutNotEqualTo(String value) {
            addCriterion("svlayout <>", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutGreaterThan(String value) {
            addCriterion("svlayout >", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutGreaterThanOrEqualTo(String value) {
            addCriterion("svlayout >=", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutLessThan(String value) {
            addCriterion("svlayout <", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutLessThanOrEqualTo(String value) {
            addCriterion("svlayout <=", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutLike(String value) {
            addCriterion("svlayout like", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutNotLike(String value) {
            addCriterion("svlayout not like", value, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutIn(List<String> values) {
            addCriterion("svlayout in", values, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutNotIn(List<String> values) {
            addCriterion("svlayout not in", values, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutBetween(String value1, String value2) {
            addCriterion("svlayout between", value1, value2, "svlayout");
            return (Criteria) this;
        }

        public Criteria andSvlayoutNotBetween(String value1, String value2) {
            addCriterion("svlayout not between", value1, value2, "svlayout");
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

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
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