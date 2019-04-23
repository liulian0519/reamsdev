package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewHouseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andWaterIsNull() {
            addCriterion("water is null");
            return (Criteria) this;
        }

        public Criteria andWaterIsNotNull() {
            addCriterion("water is not null");
            return (Criteria) this;
        }

        public Criteria andWaterEqualTo(String value) {
            addCriterion("water =", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotEqualTo(String value) {
            addCriterion("water <>", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThan(String value) {
            addCriterion("water >", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterGreaterThanOrEqualTo(String value) {
            addCriterion("water >=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThan(String value) {
            addCriterion("water <", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLessThanOrEqualTo(String value) {
            addCriterion("water <=", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterLike(String value) {
            addCriterion("water like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotLike(String value) {
            addCriterion("water not like", value, "water");
            return (Criteria) this;
        }

        public Criteria andWaterIn(List<String> values) {
            addCriterion("water in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotIn(List<String> values) {
            addCriterion("water not in", values, "water");
            return (Criteria) this;
        }

        public Criteria andWaterBetween(String value1, String value2) {
            addCriterion("water between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andWaterNotBetween(String value1, String value2) {
            addCriterion("water not between", value1, value2, "water");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(String value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(String value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(String value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(String value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(String value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(String value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLike(String value) {
            addCriterion("fee like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotLike(String value) {
            addCriterion("fee not like", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<String> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<String> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(String value1, String value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(String value1, String value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNull() {
            addCriterion("heating is null");
            return (Criteria) this;
        }

        public Criteria andHeatingIsNotNull() {
            addCriterion("heating is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingEqualTo(String value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(String value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(String value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(String value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(String value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(String value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLike(String value) {
            addCriterion("heating like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotLike(String value) {
            addCriterion("heating not like", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<String> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<String> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(String value1, String value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(String value1, String value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andElectricIsNull() {
            addCriterion("electric is null");
            return (Criteria) this;
        }

        public Criteria andElectricIsNotNull() {
            addCriterion("electric is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEqualTo(String value) {
            addCriterion("electric =", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotEqualTo(String value) {
            addCriterion("electric <>", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThan(String value) {
            addCriterion("electric >", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThanOrEqualTo(String value) {
            addCriterion("electric >=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThan(String value) {
            addCriterion("electric <", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThanOrEqualTo(String value) {
            addCriterion("electric <=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLike(String value) {
            addCriterion("electric like", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotLike(String value) {
            addCriterion("electric not like", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricIn(List<String> values) {
            addCriterion("electric in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotIn(List<String> values) {
            addCriterion("electric not in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricBetween(String value1, String value2) {
            addCriterion("electric between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotBetween(String value1, String value2) {
            addCriterion("electric not between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andHousetype_idIsNull() {
            addCriterion("housetype_id is null");
            return (Criteria) this;
        }

        public Criteria andHousetype_idIsNotNull() {
            addCriterion("housetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andHousetype_idEqualTo(Integer value) {
            addCriterion("housetype_id =", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idNotEqualTo(Integer value) {
            addCriterion("housetype_id <>", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idGreaterThan(Integer value) {
            addCriterion("housetype_id >", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("housetype_id >=", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idLessThan(Integer value) {
            addCriterion("housetype_id <", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idLessThanOrEqualTo(Integer value) {
            addCriterion("housetype_id <=", value, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idIn(List<Integer> values) {
            addCriterion("housetype_id in", values, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idNotIn(List<Integer> values) {
            addCriterion("housetype_id not in", values, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idBetween(Integer value1, Integer value2) {
            addCriterion("housetype_id between", value1, value2, "housetype_id");
            return (Criteria) this;
        }

        public Criteria andHousetype_idNotBetween(Integer value1, Integer value2) {
            addCriterion("housetype_id not between", value1, value2, "housetype_id");
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

        public Criteria andHousexIsNull() {
            addCriterion("housex is null");
            return (Criteria) this;
        }

        public Criteria andHousexIsNotNull() {
            addCriterion("housex is not null");
            return (Criteria) this;
        }

        public Criteria andHousexEqualTo(String value) {
            addCriterion("housex =", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexNotEqualTo(String value) {
            addCriterion("housex <>", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexGreaterThan(String value) {
            addCriterion("housex >", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexGreaterThanOrEqualTo(String value) {
            addCriterion("housex >=", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexLessThan(String value) {
            addCriterion("housex <", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexLessThanOrEqualTo(String value) {
            addCriterion("housex <=", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexLike(String value) {
            addCriterion("housex like", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexNotLike(String value) {
            addCriterion("housex not like", value, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexIn(List<String> values) {
            addCriterion("housex in", values, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexNotIn(List<String> values) {
            addCriterion("housex not in", values, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexBetween(String value1, String value2) {
            addCriterion("housex between", value1, value2, "housex");
            return (Criteria) this;
        }

        public Criteria andHousexNotBetween(String value1, String value2) {
            addCriterion("housex not between", value1, value2, "housex");
            return (Criteria) this;
        }

        public Criteria andHouseyIsNull() {
            addCriterion("housey is null");
            return (Criteria) this;
        }

        public Criteria andHouseyIsNotNull() {
            addCriterion("housey is not null");
            return (Criteria) this;
        }

        public Criteria andHouseyEqualTo(String value) {
            addCriterion("housey =", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyNotEqualTo(String value) {
            addCriterion("housey <>", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyGreaterThan(String value) {
            addCriterion("housey >", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyGreaterThanOrEqualTo(String value) {
            addCriterion("housey >=", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyLessThan(String value) {
            addCriterion("housey <", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyLessThanOrEqualTo(String value) {
            addCriterion("housey <=", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyLike(String value) {
            addCriterion("housey like", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyNotLike(String value) {
            addCriterion("housey not like", value, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyIn(List<String> values) {
            addCriterion("housey in", values, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyNotIn(List<String> values) {
            addCriterion("housey not in", values, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyBetween(String value1, String value2) {
            addCriterion("housey between", value1, value2, "housey");
            return (Criteria) this;
        }

        public Criteria andHouseyNotBetween(String value1, String value2) {
            addCriterion("housey not between", value1, value2, "housey");
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