package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class TheaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TheaterExample() {
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

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTlogoIsNull() {
            addCriterion("tlogo is null");
            return (Criteria) this;
        }

        public Criteria andTlogoIsNotNull() {
            addCriterion("tlogo is not null");
            return (Criteria) this;
        }

        public Criteria andTlogoEqualTo(String value) {
            addCriterion("tlogo =", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotEqualTo(String value) {
            addCriterion("tlogo <>", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoGreaterThan(String value) {
            addCriterion("tlogo >", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoGreaterThanOrEqualTo(String value) {
            addCriterion("tlogo >=", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLessThan(String value) {
            addCriterion("tlogo <", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLessThanOrEqualTo(String value) {
            addCriterion("tlogo <=", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoLike(String value) {
            addCriterion("tlogo like", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotLike(String value) {
            addCriterion("tlogo not like", value, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoIn(List<String> values) {
            addCriterion("tlogo in", values, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotIn(List<String> values) {
            addCriterion("tlogo not in", values, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoBetween(String value1, String value2) {
            addCriterion("tlogo between", value1, value2, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTlogoNotBetween(String value1, String value2) {
            addCriterion("tlogo not between", value1, value2, "tlogo");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNull() {
            addCriterion("tphoto is null");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNotNull() {
            addCriterion("tphoto is not null");
            return (Criteria) this;
        }

        public Criteria andTphotoEqualTo(String value) {
            addCriterion("tphoto =", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotEqualTo(String value) {
            addCriterion("tphoto <>", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThan(String value) {
            addCriterion("tphoto >", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThanOrEqualTo(String value) {
            addCriterion("tphoto >=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThan(String value) {
            addCriterion("tphoto <", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThanOrEqualTo(String value) {
            addCriterion("tphoto <=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLike(String value) {
            addCriterion("tphoto like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotLike(String value) {
            addCriterion("tphoto not like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoIn(List<String> values) {
            addCriterion("tphoto in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotIn(List<String> values) {
            addCriterion("tphoto not in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoBetween(String value1, String value2) {
            addCriterion("tphoto between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotBetween(String value1, String value2) {
            addCriterion("tphoto not between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNull() {
            addCriterion("tphone is null");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNotNull() {
            addCriterion("tphone is not null");
            return (Criteria) this;
        }

        public Criteria andTphoneEqualTo(String value) {
            addCriterion("tphone =", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotEqualTo(String value) {
            addCriterion("tphone <>", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThan(String value) {
            addCriterion("tphone >", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThanOrEqualTo(String value) {
            addCriterion("tphone >=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThan(String value) {
            addCriterion("tphone <", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThanOrEqualTo(String value) {
            addCriterion("tphone <=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLike(String value) {
            addCriterion("tphone like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotLike(String value) {
            addCriterion("tphone not like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneIn(List<String> values) {
            addCriterion("tphone in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotIn(List<String> values) {
            addCriterion("tphone not in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneBetween(String value1, String value2) {
            addCriterion("tphone between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotBetween(String value1, String value2) {
            addCriterion("tphone not between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTcopyrightIsNull() {
            addCriterion("tcopyright is null");
            return (Criteria) this;
        }

        public Criteria andTcopyrightIsNotNull() {
            addCriterion("tcopyright is not null");
            return (Criteria) this;
        }

        public Criteria andTcopyrightEqualTo(String value) {
            addCriterion("tcopyright =", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightNotEqualTo(String value) {
            addCriterion("tcopyright <>", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightGreaterThan(String value) {
            addCriterion("tcopyright >", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("tcopyright >=", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightLessThan(String value) {
            addCriterion("tcopyright <", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightLessThanOrEqualTo(String value) {
            addCriterion("tcopyright <=", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightLike(String value) {
            addCriterion("tcopyright like", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightNotLike(String value) {
            addCriterion("tcopyright not like", value, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightIn(List<String> values) {
            addCriterion("tcopyright in", values, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightNotIn(List<String> values) {
            addCriterion("tcopyright not in", values, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightBetween(String value1, String value2) {
            addCriterion("tcopyright between", value1, value2, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTcopyrightNotBetween(String value1, String value2) {
            addCriterion("tcopyright not between", value1, value2, "tcopyright");
            return (Criteria) this;
        }

        public Criteria andTaccountIsNull() {
            addCriterion("taccount is null");
            return (Criteria) this;
        }

        public Criteria andTaccountIsNotNull() {
            addCriterion("taccount is not null");
            return (Criteria) this;
        }

        public Criteria andTaccountEqualTo(String value) {
            addCriterion("taccount =", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotEqualTo(String value) {
            addCriterion("taccount <>", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountGreaterThan(String value) {
            addCriterion("taccount >", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountGreaterThanOrEqualTo(String value) {
            addCriterion("taccount >=", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountLessThan(String value) {
            addCriterion("taccount <", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountLessThanOrEqualTo(String value) {
            addCriterion("taccount <=", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountLike(String value) {
            addCriterion("taccount like", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotLike(String value) {
            addCriterion("taccount not like", value, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountIn(List<String> values) {
            addCriterion("taccount in", values, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotIn(List<String> values) {
            addCriterion("taccount not in", values, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountBetween(String value1, String value2) {
            addCriterion("taccount between", value1, value2, "taccount");
            return (Criteria) this;
        }

        public Criteria andTaccountNotBetween(String value1, String value2) {
            addCriterion("taccount not between", value1, value2, "taccount");
            return (Criteria) this;
        }

        public Criteria andTsoftDelIsNull() {
            addCriterion("tsoft_del is null");
            return (Criteria) this;
        }

        public Criteria andTsoftDelIsNotNull() {
            addCriterion("tsoft_del is not null");
            return (Criteria) this;
        }

        public Criteria andTsoftDelEqualTo(Integer value) {
            addCriterion("tsoft_del =", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelNotEqualTo(Integer value) {
            addCriterion("tsoft_del <>", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelGreaterThan(Integer value) {
            addCriterion("tsoft_del >", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsoft_del >=", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelLessThan(Integer value) {
            addCriterion("tsoft_del <", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelLessThanOrEqualTo(Integer value) {
            addCriterion("tsoft_del <=", value, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelIn(List<Integer> values) {
            addCriterion("tsoft_del in", values, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelNotIn(List<Integer> values) {
            addCriterion("tsoft_del not in", values, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelBetween(Integer value1, Integer value2) {
            addCriterion("tsoft_del between", value1, value2, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTsoftDelNotBetween(Integer value1, Integer value2) {
            addCriterion("tsoft_del not between", value1, value2, "tsoftDel");
            return (Criteria) this;
        }

        public Criteria andTurlIsNull() {
            addCriterion("turl is null");
            return (Criteria) this;
        }

        public Criteria andTurlIsNotNull() {
            addCriterion("turl is not null");
            return (Criteria) this;
        }

        public Criteria andTurlEqualTo(String value) {
            addCriterion("turl =", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotEqualTo(String value) {
            addCriterion("turl <>", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThan(String value) {
            addCriterion("turl >", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlGreaterThanOrEqualTo(String value) {
            addCriterion("turl >=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThan(String value) {
            addCriterion("turl <", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLessThanOrEqualTo(String value) {
            addCriterion("turl <=", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlLike(String value) {
            addCriterion("turl like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotLike(String value) {
            addCriterion("turl not like", value, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlIn(List<String> values) {
            addCriterion("turl in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotIn(List<String> values) {
            addCriterion("turl not in", values, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlBetween(String value1, String value2) {
            addCriterion("turl between", value1, value2, "turl");
            return (Criteria) this;
        }

        public Criteria andTurlNotBetween(String value1, String value2) {
            addCriterion("turl not between", value1, value2, "turl");
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