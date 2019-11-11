package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andCpidIsNull() {
            addCriterion("cpid is null");
            return (Criteria) this;
        }

        public Criteria andCpidIsNotNull() {
            addCriterion("cpid is not null");
            return (Criteria) this;
        }

        public Criteria andCpidEqualTo(String value) {
            addCriterion("cpid =", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotEqualTo(String value) {
            addCriterion("cpid <>", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThan(String value) {
            addCriterion("cpid >", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThanOrEqualTo(String value) {
            addCriterion("cpid >=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThan(String value) {
            addCriterion("cpid <", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThanOrEqualTo(String value) {
            addCriterion("cpid <=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLike(String value) {
            addCriterion("cpid like", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotLike(String value) {
            addCriterion("cpid not like", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidIn(List<String> values) {
            addCriterion("cpid in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotIn(List<String> values) {
            addCriterion("cpid not in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidBetween(String value1, String value2) {
            addCriterion("cpid between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotBetween(String value1, String value2) {
            addCriterion("cpid not between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpnameIsNull() {
            addCriterion("cpname is null");
            return (Criteria) this;
        }

        public Criteria andCpnameIsNotNull() {
            addCriterion("cpname is not null");
            return (Criteria) this;
        }

        public Criteria andCpnameEqualTo(String value) {
            addCriterion("cpname =", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameNotEqualTo(String value) {
            addCriterion("cpname <>", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameGreaterThan(String value) {
            addCriterion("cpname >", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameGreaterThanOrEqualTo(String value) {
            addCriterion("cpname >=", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameLessThan(String value) {
            addCriterion("cpname <", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameLessThanOrEqualTo(String value) {
            addCriterion("cpname <=", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameLike(String value) {
            addCriterion("cpname like", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameNotLike(String value) {
            addCriterion("cpname not like", value, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameIn(List<String> values) {
            addCriterion("cpname in", values, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameNotIn(List<String> values) {
            addCriterion("cpname not in", values, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameBetween(String value1, String value2) {
            addCriterion("cpname between", value1, value2, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpnameNotBetween(String value1, String value2) {
            addCriterion("cpname not between", value1, value2, "cpname");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceIsNull() {
            addCriterion("cp_min_price is null");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceIsNotNull() {
            addCriterion("cp_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceEqualTo(Double value) {
            addCriterion("cp_min_price =", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceNotEqualTo(Double value) {
            addCriterion("cp_min_price <>", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceGreaterThan(Double value) {
            addCriterion("cp_min_price >", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("cp_min_price >=", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceLessThan(Double value) {
            addCriterion("cp_min_price <", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceLessThanOrEqualTo(Double value) {
            addCriterion("cp_min_price <=", value, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceIn(List<Double> values) {
            addCriterion("cp_min_price in", values, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceNotIn(List<Double> values) {
            addCriterion("cp_min_price not in", values, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceBetween(Double value1, Double value2) {
            addCriterion("cp_min_price between", value1, value2, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpMinPriceNotBetween(Double value1, Double value2) {
            addCriterion("cp_min_price not between", value1, value2, "cpMinPrice");
            return (Criteria) this;
        }

        public Criteria andCpvalueIsNull() {
            addCriterion("cpvalue is null");
            return (Criteria) this;
        }

        public Criteria andCpvalueIsNotNull() {
            addCriterion("cpvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCpvalueEqualTo(Double value) {
            addCriterion("cpvalue =", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueNotEqualTo(Double value) {
            addCriterion("cpvalue <>", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueGreaterThan(Double value) {
            addCriterion("cpvalue >", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("cpvalue >=", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueLessThan(Double value) {
            addCriterion("cpvalue <", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueLessThanOrEqualTo(Double value) {
            addCriterion("cpvalue <=", value, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueIn(List<Double> values) {
            addCriterion("cpvalue in", values, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueNotIn(List<Double> values) {
            addCriterion("cpvalue not in", values, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueBetween(Double value1, Double value2) {
            addCriterion("cpvalue between", value1, value2, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCpvalueNotBetween(Double value1, Double value2) {
            addCriterion("cpvalue not between", value1, value2, "cpvalue");
            return (Criteria) this;
        }

        public Criteria andCptimeIsNull() {
            addCriterion("cptime is null");
            return (Criteria) this;
        }

        public Criteria andCptimeIsNotNull() {
            addCriterion("cptime is not null");
            return (Criteria) this;
        }

        public Criteria andCptimeEqualTo(Integer value) {
            addCriterion("cptime =", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeNotEqualTo(Integer value) {
            addCriterion("cptime <>", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeGreaterThan(Integer value) {
            addCriterion("cptime >", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cptime >=", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeLessThan(Integer value) {
            addCriterion("cptime <", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeLessThanOrEqualTo(Integer value) {
            addCriterion("cptime <=", value, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeIn(List<Integer> values) {
            addCriterion("cptime in", values, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeNotIn(List<Integer> values) {
            addCriterion("cptime not in", values, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeBetween(Integer value1, Integer value2) {
            addCriterion("cptime between", value1, value2, "cptime");
            return (Criteria) this;
        }

        public Criteria andCptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cptime not between", value1, value2, "cptime");
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