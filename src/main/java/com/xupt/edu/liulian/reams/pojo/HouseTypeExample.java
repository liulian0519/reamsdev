package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.List;

public class HouseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseTypeExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArea_typeIsNull() {
            addCriterion("area_type is null");
            return (Criteria) this;
        }

        public Criteria andArea_typeIsNotNull() {
            addCriterion("area_type is not null");
            return (Criteria) this;
        }

        public Criteria andArea_typeEqualTo(String value) {
            addCriterion("area_type =", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotEqualTo(String value) {
            addCriterion("area_type <>", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeGreaterThan(String value) {
            addCriterion("area_type >", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeGreaterThanOrEqualTo(String value) {
            addCriterion("area_type >=", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLessThan(String value) {
            addCriterion("area_type <", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLessThanOrEqualTo(String value) {
            addCriterion("area_type <=", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeLike(String value) {
            addCriterion("area_type like", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotLike(String value) {
            addCriterion("area_type not like", value, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeIn(List<String> values) {
            addCriterion("area_type in", values, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotIn(List<String> values) {
            addCriterion("area_type not in", values, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeBetween(String value1, String value2) {
            addCriterion("area_type between", value1, value2, "area_type");
            return (Criteria) this;
        }

        public Criteria andArea_typeNotBetween(String value1, String value2) {
            addCriterion("area_type not between", value1, value2, "area_type");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBuilding_idIsNull() {
            addCriterion("building_id is null");
            return (Criteria) this;
        }

        public Criteria andBuilding_idIsNotNull() {
            addCriterion("building_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuilding_idEqualTo(Integer value) {
            addCriterion("building_id =", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idNotEqualTo(Integer value) {
            addCriterion("building_id <>", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idGreaterThan(Integer value) {
            addCriterion("building_id >", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("building_id >=", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idLessThan(Integer value) {
            addCriterion("building_id <", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idLessThanOrEqualTo(Integer value) {
            addCriterion("building_id <=", value, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idIn(List<Integer> values) {
            addCriterion("building_id in", values, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idNotIn(List<Integer> values) {
            addCriterion("building_id not in", values, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idBetween(Integer value1, Integer value2) {
            addCriterion("building_id between", value1, value2, "building_id");
            return (Criteria) this;
        }

        public Criteria andBuilding_idNotBetween(Integer value1, Integer value2) {
            addCriterion("building_id not between", value1, value2, "building_id");
            return (Criteria) this;
        }

        public Criteria andHouse_imgIsNull() {
            addCriterion("house_img is null");
            return (Criteria) this;
        }

        public Criteria andHouse_imgIsNotNull() {
            addCriterion("house_img is not null");
            return (Criteria) this;
        }

        public Criteria andHouse_imgEqualTo(String value) {
            addCriterion("house_img =", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgNotEqualTo(String value) {
            addCriterion("house_img <>", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgGreaterThan(String value) {
            addCriterion("house_img >", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgGreaterThanOrEqualTo(String value) {
            addCriterion("house_img >=", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgLessThan(String value) {
            addCriterion("house_img <", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgLessThanOrEqualTo(String value) {
            addCriterion("house_img <=", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgLike(String value) {
            addCriterion("house_img like", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgNotLike(String value) {
            addCriterion("house_img not like", value, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgIn(List<String> values) {
            addCriterion("house_img in", values, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgNotIn(List<String> values) {
            addCriterion("house_img not in", values, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgBetween(String value1, String value2) {
            addCriterion("house_img between", value1, value2, "house_img");
            return (Criteria) this;
        }

        public Criteria andHouse_imgNotBetween(String value1, String value2) {
            addCriterion("house_img not between", value1, value2, "house_img");
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