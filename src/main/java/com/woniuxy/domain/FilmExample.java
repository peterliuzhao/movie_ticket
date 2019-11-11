package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class FilmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FilmExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(String value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(String value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(String value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(String value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(String value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(String value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLike(String value) {
            addCriterion("fid like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotLike(String value) {
            addCriterion("fid not like", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<String> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<String> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(String value1, String value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(String value1, String value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
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

        public Criteria andFactorIsNull() {
            addCriterion("factor is null");
            return (Criteria) this;
        }

        public Criteria andFactorIsNotNull() {
            addCriterion("factor is not null");
            return (Criteria) this;
        }

        public Criteria andFactorEqualTo(String value) {
            addCriterion("factor =", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotEqualTo(String value) {
            addCriterion("factor <>", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThan(String value) {
            addCriterion("factor >", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorGreaterThanOrEqualTo(String value) {
            addCriterion("factor >=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThan(String value) {
            addCriterion("factor <", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLessThanOrEqualTo(String value) {
            addCriterion("factor <=", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorLike(String value) {
            addCriterion("factor like", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotLike(String value) {
            addCriterion("factor not like", value, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorIn(List<String> values) {
            addCriterion("factor in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotIn(List<String> values) {
            addCriterion("factor not in", values, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorBetween(String value1, String value2) {
            addCriterion("factor between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorNotBetween(String value1, String value2) {
            addCriterion("factor not between", value1, value2, "factor");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoIsNull() {
            addCriterion("factor_photo is null");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoIsNotNull() {
            addCriterion("factor_photo is not null");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoEqualTo(String value) {
            addCriterion("factor_photo =", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoNotEqualTo(String value) {
            addCriterion("factor_photo <>", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoGreaterThan(String value) {
            addCriterion("factor_photo >", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("factor_photo >=", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoLessThan(String value) {
            addCriterion("factor_photo <", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoLessThanOrEqualTo(String value) {
            addCriterion("factor_photo <=", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoLike(String value) {
            addCriterion("factor_photo like", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoNotLike(String value) {
            addCriterion("factor_photo not like", value, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoIn(List<String> values) {
            addCriterion("factor_photo in", values, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoNotIn(List<String> values) {
            addCriterion("factor_photo not in", values, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoBetween(String value1, String value2) {
            addCriterion("factor_photo between", value1, value2, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFactorPhotoNotBetween(String value1, String value2) {
            addCriterion("factor_photo not between", value1, value2, "factorPhoto");
            return (Criteria) this;
        }

        public Criteria andFphotoIsNull() {
            addCriterion("fphoto is null");
            return (Criteria) this;
        }

        public Criteria andFphotoIsNotNull() {
            addCriterion("fphoto is not null");
            return (Criteria) this;
        }

        public Criteria andFphotoEqualTo(String value) {
            addCriterion("fphoto =", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotEqualTo(String value) {
            addCriterion("fphoto <>", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoGreaterThan(String value) {
            addCriterion("fphoto >", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoGreaterThanOrEqualTo(String value) {
            addCriterion("fphoto >=", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLessThan(String value) {
            addCriterion("fphoto <", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLessThanOrEqualTo(String value) {
            addCriterion("fphoto <=", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLike(String value) {
            addCriterion("fphoto like", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotLike(String value) {
            addCriterion("fphoto not like", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoIn(List<String> values) {
            addCriterion("fphoto in", values, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotIn(List<String> values) {
            addCriterion("fphoto not in", values, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoBetween(String value1, String value2) {
            addCriterion("fphoto between", value1, value2, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotBetween(String value1, String value2) {
            addCriterion("fphoto not between", value1, value2, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNull() {
            addCriterion("fprice is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("fprice is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(Double value) {
            addCriterion("fprice =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(Double value) {
            addCriterion("fprice <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(Double value) {
            addCriterion("fprice >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fprice >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(Double value) {
            addCriterion("fprice <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(Double value) {
            addCriterion("fprice <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<Double> values) {
            addCriterion("fprice in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<Double> values) {
            addCriterion("fprice not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(Double value1, Double value2) {
            addCriterion("fprice between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(Double value1, Double value2) {
            addCriterion("fprice not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpreviewIsNull() {
            addCriterion("fpreview is null");
            return (Criteria) this;
        }

        public Criteria andFpreviewIsNotNull() {
            addCriterion("fpreview is not null");
            return (Criteria) this;
        }

        public Criteria andFpreviewEqualTo(String value) {
            addCriterion("fpreview =", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewNotEqualTo(String value) {
            addCriterion("fpreview <>", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewGreaterThan(String value) {
            addCriterion("fpreview >", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewGreaterThanOrEqualTo(String value) {
            addCriterion("fpreview >=", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewLessThan(String value) {
            addCriterion("fpreview <", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewLessThanOrEqualTo(String value) {
            addCriterion("fpreview <=", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewLike(String value) {
            addCriterion("fpreview like", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewNotLike(String value) {
            addCriterion("fpreview not like", value, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewIn(List<String> values) {
            addCriterion("fpreview in", values, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewNotIn(List<String> values) {
            addCriterion("fpreview not in", values, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewBetween(String value1, String value2) {
            addCriterion("fpreview between", value1, value2, "fpreview");
            return (Criteria) this;
        }

        public Criteria andFpreviewNotBetween(String value1, String value2) {
            addCriterion("fpreview not between", value1, value2, "fpreview");
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