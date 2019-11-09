package com.woniuxy.domain;

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

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOstartTimeIsNull() {
            addCriterion("ostart_time is null");
            return (Criteria) this;
        }

        public Criteria andOstartTimeIsNotNull() {
            addCriterion("ostart_time is not null");
            return (Criteria) this;
        }

        public Criteria andOstartTimeEqualTo(Date value) {
            addCriterion("ostart_time =", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeNotEqualTo(Date value) {
            addCriterion("ostart_time <>", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeGreaterThan(Date value) {
            addCriterion("ostart_time >", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ostart_time >=", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeLessThan(Date value) {
            addCriterion("ostart_time <", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ostart_time <=", value, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeIn(List<Date> values) {
            addCriterion("ostart_time in", values, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeNotIn(List<Date> values) {
            addCriterion("ostart_time not in", values, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeBetween(Date value1, Date value2) {
            addCriterion("ostart_time between", value1, value2, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOstartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ostart_time not between", value1, value2, "ostartTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeIsNull() {
            addCriterion("oupdate_time is null");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeIsNotNull() {
            addCriterion("oupdate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeEqualTo(Date value) {
            addCriterion("oupdate_time =", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeNotEqualTo(Date value) {
            addCriterion("oupdate_time <>", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeGreaterThan(Date value) {
            addCriterion("oupdate_time >", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("oupdate_time >=", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeLessThan(Date value) {
            addCriterion("oupdate_time <", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("oupdate_time <=", value, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeIn(List<Date> values) {
            addCriterion("oupdate_time in", values, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeNotIn(List<Date> values) {
            addCriterion("oupdate_time not in", values, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeBetween(Date value1, Date value2) {
            addCriterion("oupdate_time between", value1, value2, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOupdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("oupdate_time not between", value1, value2, "oupdateTime");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIsNull() {
            addCriterion("ototalprice is null");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIsNotNull() {
            addCriterion("ototalprice is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceEqualTo(Double value) {
            addCriterion("ototalprice =", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotEqualTo(Double value) {
            addCriterion("ototalprice <>", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceGreaterThan(Double value) {
            addCriterion("ototalprice >", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ototalprice >=", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceLessThan(Double value) {
            addCriterion("ototalprice <", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("ototalprice <=", value, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceIn(List<Double> values) {
            addCriterion("ototalprice in", values, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotIn(List<Double> values) {
            addCriterion("ototalprice not in", values, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceBetween(Double value1, Double value2) {
            addCriterion("ototalprice between", value1, value2, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOtotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("ototalprice not between", value1, value2, "ototalprice");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNull() {
            addCriterion("ostatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("ostatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(Integer value) {
            addCriterion("ostatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(Integer value) {
            addCriterion("ostatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(Integer value) {
            addCriterion("ostatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(Integer value) {
            addCriterion("ostatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ostatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<Integer> values) {
            addCriterion("ostatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<Integer> values) {
            addCriterion("ostatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(Integer value1, Integer value2) {
            addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ostatus not between", value1, value2, "ostatus");
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

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andFsidIsNull() {
            addCriterion("fsid is null");
            return (Criteria) this;
        }

        public Criteria andFsidIsNotNull() {
            addCriterion("fsid is not null");
            return (Criteria) this;
        }

        public Criteria andFsidEqualTo(String value) {
            addCriterion("fsid =", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotEqualTo(String value) {
            addCriterion("fsid <>", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThan(String value) {
            addCriterion("fsid >", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThanOrEqualTo(String value) {
            addCriterion("fsid >=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThan(String value) {
            addCriterion("fsid <", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThanOrEqualTo(String value) {
            addCriterion("fsid <=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLike(String value) {
            addCriterion("fsid like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotLike(String value) {
            addCriterion("fsid not like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidIn(List<String> values) {
            addCriterion("fsid in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotIn(List<String> values) {
            addCriterion("fsid not in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidBetween(String value1, String value2) {
            addCriterion("fsid between", value1, value2, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotBetween(String value1, String value2) {
            addCriterion("fsid not between", value1, value2, "fsid");
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