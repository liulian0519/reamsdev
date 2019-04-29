package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GreenHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GreenHouseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(String value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(String value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(String value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(String value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(String value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(String value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLike(String value) {
            addCriterion("floor like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotLike(String value) {
            addCriterion("floor not like", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<String> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<String> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(String value1, String value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(String value1, String value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andBuild_typeIsNull() {
            addCriterion("build_type is null");
            return (Criteria) this;
        }

        public Criteria andBuild_typeIsNotNull() {
            addCriterion("build_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_typeEqualTo(String value) {
            addCriterion("build_type =", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeNotEqualTo(String value) {
            addCriterion("build_type <>", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeGreaterThan(String value) {
            addCriterion("build_type >", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeGreaterThanOrEqualTo(String value) {
            addCriterion("build_type >=", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeLessThan(String value) {
            addCriterion("build_type <", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeLessThanOrEqualTo(String value) {
            addCriterion("build_type <=", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeLike(String value) {
            addCriterion("build_type like", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeNotLike(String value) {
            addCriterion("build_type not like", value, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeIn(List<String> values) {
            addCriterion("build_type in", values, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeNotIn(List<String> values) {
            addCriterion("build_type not in", values, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeBetween(String value1, String value2) {
            addCriterion("build_type between", value1, value2, "build_type");
            return (Criteria) this;
        }

        public Criteria andBuild_typeNotBetween(String value1, String value2) {
            addCriterion("build_type not between", value1, value2, "build_type");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNull() {
            addCriterion("decoration is null");
            return (Criteria) this;
        }

        public Criteria andDecorationIsNotNull() {
            addCriterion("decoration is not null");
            return (Criteria) this;
        }

        public Criteria andDecorationEqualTo(String value) {
            addCriterion("decoration =", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotEqualTo(String value) {
            addCriterion("decoration <>", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThan(String value) {
            addCriterion("decoration >", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationGreaterThanOrEqualTo(String value) {
            addCriterion("decoration >=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThan(String value) {
            addCriterion("decoration <", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLessThanOrEqualTo(String value) {
            addCriterion("decoration <=", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationLike(String value) {
            addCriterion("decoration like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotLike(String value) {
            addCriterion("decoration not like", value, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationIn(List<String> values) {
            addCriterion("decoration in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotIn(List<String> values) {
            addCriterion("decoration not in", values, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationBetween(String value1, String value2) {
            addCriterion("decoration between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andDecorationNotBetween(String value1, String value2) {
            addCriterion("decoration not between", value1, value2, "decoration");
            return (Criteria) this;
        }

        public Criteria andLadder_houseIsNull() {
            addCriterion("ladder_house is null");
            return (Criteria) this;
        }

        public Criteria andLadder_houseIsNotNull() {
            addCriterion("ladder_house is not null");
            return (Criteria) this;
        }

        public Criteria andLadder_houseEqualTo(String value) {
            addCriterion("ladder_house =", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseNotEqualTo(String value) {
            addCriterion("ladder_house <>", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseGreaterThan(String value) {
            addCriterion("ladder_house >", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseGreaterThanOrEqualTo(String value) {
            addCriterion("ladder_house >=", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseLessThan(String value) {
            addCriterion("ladder_house <", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseLessThanOrEqualTo(String value) {
            addCriterion("ladder_house <=", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseLike(String value) {
            addCriterion("ladder_house like", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseNotLike(String value) {
            addCriterion("ladder_house not like", value, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseIn(List<String> values) {
            addCriterion("ladder_house in", values, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseNotIn(List<String> values) {
            addCriterion("ladder_house not in", values, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseBetween(String value1, String value2) {
            addCriterion("ladder_house between", value1, value2, "ladder_house");
            return (Criteria) this;
        }

        public Criteria andLadder_houseNotBetween(String value1, String value2) {
            addCriterion("ladder_house not between", value1, value2, "ladder_house");
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

        public Criteria andHeatingEqualTo(Integer value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(Integer value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(Integer value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(Integer value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(Integer value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<Integer> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<Integer> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(Integer value1, Integer value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(Integer value1, Integer value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(Integer value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Integer value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Integer value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Integer value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Integer value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Integer> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Integer> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Integer value1, Integer value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Integer value1, Integer value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andBuild_useIsNull() {
            addCriterion("build_use is null");
            return (Criteria) this;
        }

        public Criteria andBuild_useIsNotNull() {
            addCriterion("build_use is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_useEqualTo(String value) {
            addCriterion("build_use =", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useNotEqualTo(String value) {
            addCriterion("build_use <>", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useGreaterThan(String value) {
            addCriterion("build_use >", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useGreaterThanOrEqualTo(String value) {
            addCriterion("build_use >=", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useLessThan(String value) {
            addCriterion("build_use <", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useLessThanOrEqualTo(String value) {
            addCriterion("build_use <=", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useLike(String value) {
            addCriterion("build_use like", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useNotLike(String value) {
            addCriterion("build_use not like", value, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useIn(List<String> values) {
            addCriterion("build_use in", values, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useNotIn(List<String> values) {
            addCriterion("build_use not in", values, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useBetween(String value1, String value2) {
            addCriterion("build_use between", value1, value2, "build_use");
            return (Criteria) this;
        }

        public Criteria andBuild_useNotBetween(String value1, String value2) {
            addCriterion("build_use not between", value1, value2, "build_use");
            return (Criteria) this;
        }

        public Criteria andRight_ageIsNull() {
            addCriterion("right_age is null");
            return (Criteria) this;
        }

        public Criteria andRight_ageIsNotNull() {
            addCriterion("right_age is not null");
            return (Criteria) this;
        }

        public Criteria andRight_ageEqualTo(String value) {
            addCriterion("right_age =", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageNotEqualTo(String value) {
            addCriterion("right_age <>", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageGreaterThan(String value) {
            addCriterion("right_age >", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageGreaterThanOrEqualTo(String value) {
            addCriterion("right_age >=", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageLessThan(String value) {
            addCriterion("right_age <", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageLessThanOrEqualTo(String value) {
            addCriterion("right_age <=", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageLike(String value) {
            addCriterion("right_age like", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageNotLike(String value) {
            addCriterion("right_age not like", value, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageIn(List<String> values) {
            addCriterion("right_age in", values, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageNotIn(List<String> values) {
            addCriterion("right_age not in", values, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageBetween(String value1, String value2) {
            addCriterion("right_age between", value1, value2, "right_age");
            return (Criteria) this;
        }

        public Criteria andRight_ageNotBetween(String value1, String value2) {
            addCriterion("right_age not between", value1, value2, "right_age");
            return (Criteria) this;
        }

        public Criteria andCon_timeIsNull() {
            addCriterion("con_time is null");
            return (Criteria) this;
        }

        public Criteria andCon_timeIsNotNull() {
            addCriterion("con_time is not null");
            return (Criteria) this;
        }

        public Criteria andCon_timeEqualTo(Date value) {
            addCriterionForJDBCDate("con_time =", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("con_time <>", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("con_time >", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("con_time >=", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeLessThan(Date value) {
            addCriterionForJDBCDate("con_time <", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("con_time <=", value, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeIn(List<Date> values) {
            addCriterionForJDBCDate("con_time in", values, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("con_time not in", values, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("con_time between", value1, value2, "con_time");
            return (Criteria) this;
        }

        public Criteria andCon_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("con_time not between", value1, value2, "con_time");
            return (Criteria) this;
        }

        public Criteria andMortgageIsNull() {
            addCriterion("mortgage is null");
            return (Criteria) this;
        }

        public Criteria andMortgageIsNotNull() {
            addCriterion("mortgage is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageEqualTo(Integer value) {
            addCriterion("mortgage =", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageNotEqualTo(Integer value) {
            addCriterion("mortgage <>", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageGreaterThan(Integer value) {
            addCriterion("mortgage >", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mortgage >=", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageLessThan(Integer value) {
            addCriterion("mortgage <", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageLessThanOrEqualTo(Integer value) {
            addCriterion("mortgage <=", value, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageIn(List<Integer> values) {
            addCriterion("mortgage in", values, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageNotIn(List<Integer> values) {
            addCriterion("mortgage not in", values, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageBetween(Integer value1, Integer value2) {
            addCriterion("mortgage between", value1, value2, "mortgage");
            return (Criteria) this;
        }

        public Criteria andMortgageNotBetween(Integer value1, Integer value2) {
            addCriterion("mortgage not between", value1, value2, "mortgage");
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

        public Criteria andCommunity_idIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunity_idIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunity_idEqualTo(Integer value) {
            addCriterion("community_id =", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idNotEqualTo(Integer value) {
            addCriterion("community_id <>", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idGreaterThan(Integer value) {
            addCriterion("community_id >", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("community_id >=", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idLessThan(Integer value) {
            addCriterion("community_id <", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idLessThanOrEqualTo(Integer value) {
            addCriterion("community_id <=", value, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idIn(List<Integer> values) {
            addCriterion("community_id in", values, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idNotIn(List<Integer> values) {
            addCriterion("community_id not in", values, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idBetween(Integer value1, Integer value2) {
            addCriterion("community_id between", value1, value2, "community_id");
            return (Criteria) this;
        }

        public Criteria andCommunity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("community_id not between", value1, value2, "community_id");
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

        public Criteria andExamIsNull() {
            addCriterion("exam is null");
            return (Criteria) this;
        }

        public Criteria andExamIsNotNull() {
            addCriterion("exam is not null");
            return (Criteria) this;
        }

        public Criteria andExamEqualTo(Integer value) {
            addCriterion("exam =", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotEqualTo(Integer value) {
            addCriterion("exam <>", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThan(Integer value) {
            addCriterion("exam >", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam >=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThan(Integer value) {
            addCriterion("exam <", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThanOrEqualTo(Integer value) {
            addCriterion("exam <=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamIn(List<Integer> values) {
            addCriterion("exam in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotIn(List<Integer> values) {
            addCriterion("exam not in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamBetween(Integer value1, Integer value2) {
            addCriterion("exam between", value1, value2, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotBetween(Integer value1, Integer value2) {
            addCriterion("exam not between", value1, value2, "exam");
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