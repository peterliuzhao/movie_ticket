package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReviewExample() {
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

        public Criteria andRwidIsNull() {
            addCriterion("rwid is null");
            return (Criteria) this;
        }

        public Criteria andRwidIsNotNull() {
            addCriterion("rwid is not null");
            return (Criteria) this;
        }

        public Criteria andRwidEqualTo(String value) {
            addCriterion("rwid =", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidNotEqualTo(String value) {
            addCriterion("rwid <>", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidGreaterThan(String value) {
            addCriterion("rwid >", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidGreaterThanOrEqualTo(String value) {
            addCriterion("rwid >=", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidLessThan(String value) {
            addCriterion("rwid <", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidLessThanOrEqualTo(String value) {
            addCriterion("rwid <=", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidLike(String value) {
            addCriterion("rwid like", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidNotLike(String value) {
            addCriterion("rwid not like", value, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidIn(List<String> values) {
            addCriterion("rwid in", values, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidNotIn(List<String> values) {
            addCriterion("rwid not in", values, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidBetween(String value1, String value2) {
            addCriterion("rwid between", value1, value2, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwidNotBetween(String value1, String value2) {
            addCriterion("rwid not between", value1, value2, "rwid");
            return (Criteria) this;
        }

        public Criteria andRwtimeIsNull() {
            addCriterion("rwtime is null");
            return (Criteria) this;
        }

        public Criteria andRwtimeIsNotNull() {
            addCriterion("rwtime is not null");
            return (Criteria) this;
        }

        public Criteria andRwtimeEqualTo(Date value) {
            addCriterion("rwtime =", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeNotEqualTo(Date value) {
            addCriterion("rwtime <>", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeGreaterThan(Date value) {
            addCriterion("rwtime >", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rwtime >=", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeLessThan(Date value) {
            addCriterion("rwtime <", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeLessThanOrEqualTo(Date value) {
            addCriterion("rwtime <=", value, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeIn(List<Date> values) {
            addCriterion("rwtime in", values, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeNotIn(List<Date> values) {
            addCriterion("rwtime not in", values, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeBetween(Date value1, Date value2) {
            addCriterion("rwtime between", value1, value2, "rwtime");
            return (Criteria) this;
        }

        public Criteria andRwtimeNotBetween(Date value1, Date value2) {
            addCriterion("rwtime not between", value1, value2, "rwtime");
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

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRwParentidIsNull() {
            addCriterion("rw_parentId is null");
            return (Criteria) this;
        }

        public Criteria andRwParentidIsNotNull() {
            addCriterion("rw_parentId is not null");
            return (Criteria) this;
        }

        public Criteria andRwParentidEqualTo(String value) {
            addCriterion("rw_parentId =", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidNotEqualTo(String value) {
            addCriterion("rw_parentId <>", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidGreaterThan(String value) {
            addCriterion("rw_parentId >", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidGreaterThanOrEqualTo(String value) {
            addCriterion("rw_parentId >=", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidLessThan(String value) {
            addCriterion("rw_parentId <", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidLessThanOrEqualTo(String value) {
            addCriterion("rw_parentId <=", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidLike(String value) {
            addCriterion("rw_parentId like", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidNotLike(String value) {
            addCriterion("rw_parentId not like", value, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidIn(List<String> values) {
            addCriterion("rw_parentId in", values, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidNotIn(List<String> values) {
            addCriterion("rw_parentId not in", values, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidBetween(String value1, String value2) {
            addCriterion("rw_parentId between", value1, value2, "rwParentid");
            return (Criteria) this;
        }

        public Criteria andRwParentidNotBetween(String value1, String value2) {
            addCriterion("rw_parentId not between", value1, value2, "rwParentid");
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