package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class FilmTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmTypeExample() {
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

        public Criteria andFtidIsNull() {
            addCriterion("ftid is null");
            return (Criteria) this;
        }

        public Criteria andFtidIsNotNull() {
            addCriterion("ftid is not null");
            return (Criteria) this;
        }

        public Criteria andFtidEqualTo(String value) {
            addCriterion("ftid =", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotEqualTo(String value) {
            addCriterion("ftid <>", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidGreaterThan(String value) {
            addCriterion("ftid >", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidGreaterThanOrEqualTo(String value) {
            addCriterion("ftid >=", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidLessThan(String value) {
            addCriterion("ftid <", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidLessThanOrEqualTo(String value) {
            addCriterion("ftid <=", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidLike(String value) {
            addCriterion("ftid like", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotLike(String value) {
            addCriterion("ftid not like", value, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidIn(List<String> values) {
            addCriterion("ftid in", values, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotIn(List<String> values) {
            addCriterion("ftid not in", values, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidBetween(String value1, String value2) {
            addCriterion("ftid between", value1, value2, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtidNotBetween(String value1, String value2) {
            addCriterion("ftid not between", value1, value2, "ftid");
            return (Criteria) this;
        }

        public Criteria andFtnameIsNull() {
            addCriterion("ftname is null");
            return (Criteria) this;
        }

        public Criteria andFtnameIsNotNull() {
            addCriterion("ftname is not null");
            return (Criteria) this;
        }

        public Criteria andFtnameEqualTo(String value) {
            addCriterion("ftname =", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameNotEqualTo(String value) {
            addCriterion("ftname <>", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameGreaterThan(String value) {
            addCriterion("ftname >", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ftname >=", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameLessThan(String value) {
            addCriterion("ftname <", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameLessThanOrEqualTo(String value) {
            addCriterion("ftname <=", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameLike(String value) {
            addCriterion("ftname like", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameNotLike(String value) {
            addCriterion("ftname not like", value, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameIn(List<String> values) {
            addCriterion("ftname in", values, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameNotIn(List<String> values) {
            addCriterion("ftname not in", values, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameBetween(String value1, String value2) {
            addCriterion("ftname between", value1, value2, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtnameNotBetween(String value1, String value2) {
            addCriterion("ftname not between", value1, value2, "ftname");
            return (Criteria) this;
        }

        public Criteria andFtinfoIsNull() {
            addCriterion("ftinfo is null");
            return (Criteria) this;
        }

        public Criteria andFtinfoIsNotNull() {
            addCriterion("ftinfo is not null");
            return (Criteria) this;
        }

        public Criteria andFtinfoEqualTo(String value) {
            addCriterion("ftinfo =", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoNotEqualTo(String value) {
            addCriterion("ftinfo <>", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoGreaterThan(String value) {
            addCriterion("ftinfo >", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ftinfo >=", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoLessThan(String value) {
            addCriterion("ftinfo <", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoLessThanOrEqualTo(String value) {
            addCriterion("ftinfo <=", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoLike(String value) {
            addCriterion("ftinfo like", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoNotLike(String value) {
            addCriterion("ftinfo not like", value, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoIn(List<String> values) {
            addCriterion("ftinfo in", values, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoNotIn(List<String> values) {
            addCriterion("ftinfo not in", values, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoBetween(String value1, String value2) {
            addCriterion("ftinfo between", value1, value2, "ftinfo");
            return (Criteria) this;
        }

        public Criteria andFtinfoNotBetween(String value1, String value2) {
            addCriterion("ftinfo not between", value1, value2, "ftinfo");
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