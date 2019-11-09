package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class TcomboExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TcomboExample() {
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

        public Criteria andTcidIsNull() {
            addCriterion("tcid is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcid is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(String value) {
            addCriterion("tcid =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(String value) {
            addCriterion("tcid <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(String value) {
            addCriterion("tcid >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(String value) {
            addCriterion("tcid >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(String value) {
            addCriterion("tcid <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(String value) {
            addCriterion("tcid <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLike(String value) {
            addCriterion("tcid like", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotLike(String value) {
            addCriterion("tcid not like", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<String> values) {
            addCriterion("tcid in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<String> values) {
            addCriterion("tcid not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(String value1, String value2) {
            addCriterion("tcid between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(String value1, String value2) {
            addCriterion("tcid not between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNull() {
            addCriterion("tcname is null");
            return (Criteria) this;
        }

        public Criteria andTcnameIsNotNull() {
            addCriterion("tcname is not null");
            return (Criteria) this;
        }

        public Criteria andTcnameEqualTo(String value) {
            addCriterion("tcname =", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotEqualTo(String value) {
            addCriterion("tcname <>", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThan(String value) {
            addCriterion("tcname >", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameGreaterThanOrEqualTo(String value) {
            addCriterion("tcname >=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThan(String value) {
            addCriterion("tcname <", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLessThanOrEqualTo(String value) {
            addCriterion("tcname <=", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameLike(String value) {
            addCriterion("tcname like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotLike(String value) {
            addCriterion("tcname not like", value, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameIn(List<String> values) {
            addCriterion("tcname in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotIn(List<String> values) {
            addCriterion("tcname not in", values, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameBetween(String value1, String value2) {
            addCriterion("tcname between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcnameNotBetween(String value1, String value2) {
            addCriterion("tcname not between", value1, value2, "tcname");
            return (Criteria) this;
        }

        public Criteria andTcinfoIsNull() {
            addCriterion("tcinfo is null");
            return (Criteria) this;
        }

        public Criteria andTcinfoIsNotNull() {
            addCriterion("tcinfo is not null");
            return (Criteria) this;
        }

        public Criteria andTcinfoEqualTo(String value) {
            addCriterion("tcinfo =", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoNotEqualTo(String value) {
            addCriterion("tcinfo <>", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoGreaterThan(String value) {
            addCriterion("tcinfo >", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoGreaterThanOrEqualTo(String value) {
            addCriterion("tcinfo >=", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoLessThan(String value) {
            addCriterion("tcinfo <", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoLessThanOrEqualTo(String value) {
            addCriterion("tcinfo <=", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoLike(String value) {
            addCriterion("tcinfo like", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoNotLike(String value) {
            addCriterion("tcinfo not like", value, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoIn(List<String> values) {
            addCriterion("tcinfo in", values, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoNotIn(List<String> values) {
            addCriterion("tcinfo not in", values, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoBetween(String value1, String value2) {
            addCriterion("tcinfo between", value1, value2, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcinfoNotBetween(String value1, String value2) {
            addCriterion("tcinfo not between", value1, value2, "tcinfo");
            return (Criteria) this;
        }

        public Criteria andTcpriceIsNull() {
            addCriterion("tcprice is null");
            return (Criteria) this;
        }

        public Criteria andTcpriceIsNotNull() {
            addCriterion("tcprice is not null");
            return (Criteria) this;
        }

        public Criteria andTcpriceEqualTo(Double value) {
            addCriterion("tcprice =", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceNotEqualTo(Double value) {
            addCriterion("tcprice <>", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceGreaterThan(Double value) {
            addCriterion("tcprice >", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tcprice >=", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceLessThan(Double value) {
            addCriterion("tcprice <", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceLessThanOrEqualTo(Double value) {
            addCriterion("tcprice <=", value, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceIn(List<Double> values) {
            addCriterion("tcprice in", values, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceNotIn(List<Double> values) {
            addCriterion("tcprice not in", values, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceBetween(Double value1, Double value2) {
            addCriterion("tcprice between", value1, value2, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTcpriceNotBetween(Double value1, Double value2) {
            addCriterion("tcprice not between", value1, value2, "tcprice");
            return (Criteria) this;
        }

        public Criteria andTctimeIsNull() {
            addCriterion("tctime is null");
            return (Criteria) this;
        }

        public Criteria andTctimeIsNotNull() {
            addCriterion("tctime is not null");
            return (Criteria) this;
        }

        public Criteria andTctimeEqualTo(Integer value) {
            addCriterion("tctime =", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeNotEqualTo(Integer value) {
            addCriterion("tctime <>", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeGreaterThan(Integer value) {
            addCriterion("tctime >", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tctime >=", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeLessThan(Integer value) {
            addCriterion("tctime <", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeLessThanOrEqualTo(Integer value) {
            addCriterion("tctime <=", value, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeIn(List<Integer> values) {
            addCriterion("tctime in", values, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeNotIn(List<Integer> values) {
            addCriterion("tctime not in", values, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeBetween(Integer value1, Integer value2) {
            addCriterion("tctime between", value1, value2, "tctime");
            return (Criteria) this;
        }

        public Criteria andTctimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tctime not between", value1, value2, "tctime");
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