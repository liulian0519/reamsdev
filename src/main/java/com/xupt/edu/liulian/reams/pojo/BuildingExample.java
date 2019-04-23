package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingExample() {
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

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
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

        public Criteria andBuild_areaIsNull() {
            addCriterion("build_area is null");
            return (Criteria) this;
        }

        public Criteria andBuild_areaIsNotNull() {
            addCriterion("build_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_areaEqualTo(String value) {
            addCriterion("build_area =", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaNotEqualTo(String value) {
            addCriterion("build_area <>", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaGreaterThan(String value) {
            addCriterion("build_area >", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaGreaterThanOrEqualTo(String value) {
            addCriterion("build_area >=", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaLessThan(String value) {
            addCriterion("build_area <", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaLessThanOrEqualTo(String value) {
            addCriterion("build_area <=", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaLike(String value) {
            addCriterion("build_area like", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaNotLike(String value) {
            addCriterion("build_area not like", value, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaIn(List<String> values) {
            addCriterion("build_area in", values, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaNotIn(List<String> values) {
            addCriterion("build_area not in", values, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaBetween(String value1, String value2) {
            addCriterion("build_area between", value1, value2, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_areaNotBetween(String value1, String value2) {
            addCriterion("build_area not between", value1, value2, "build_area");
            return (Criteria) this;
        }

        public Criteria andBuild_userIsNull() {
            addCriterion("build_user is null");
            return (Criteria) this;
        }

        public Criteria andBuild_userIsNotNull() {
            addCriterion("build_user is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_userEqualTo(String value) {
            addCriterion("build_user =", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userNotEqualTo(String value) {
            addCriterion("build_user <>", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userGreaterThan(String value) {
            addCriterion("build_user >", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userGreaterThanOrEqualTo(String value) {
            addCriterion("build_user >=", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userLessThan(String value) {
            addCriterion("build_user <", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userLessThanOrEqualTo(String value) {
            addCriterion("build_user <=", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userLike(String value) {
            addCriterion("build_user like", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userNotLike(String value) {
            addCriterion("build_user not like", value, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userIn(List<String> values) {
            addCriterion("build_user in", values, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userNotIn(List<String> values) {
            addCriterion("build_user not in", values, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userBetween(String value1, String value2) {
            addCriterion("build_user between", value1, value2, "build_user");
            return (Criteria) this;
        }

        public Criteria andBuild_userNotBetween(String value1, String value2) {
            addCriterion("build_user not between", value1, value2, "build_user");
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

        public Criteria andGreen_percentIsNull() {
            addCriterion("green_percent is null");
            return (Criteria) this;
        }

        public Criteria andGreen_percentIsNotNull() {
            addCriterion("green_percent is not null");
            return (Criteria) this;
        }

        public Criteria andGreen_percentEqualTo(String value) {
            addCriterion("green_percent =", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentNotEqualTo(String value) {
            addCriterion("green_percent <>", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentGreaterThan(String value) {
            addCriterion("green_percent >", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentGreaterThanOrEqualTo(String value) {
            addCriterion("green_percent >=", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentLessThan(String value) {
            addCriterion("green_percent <", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentLessThanOrEqualTo(String value) {
            addCriterion("green_percent <=", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentLike(String value) {
            addCriterion("green_percent like", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentNotLike(String value) {
            addCriterion("green_percent not like", value, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentIn(List<String> values) {
            addCriterion("green_percent in", values, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentNotIn(List<String> values) {
            addCriterion("green_percent not in", values, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentBetween(String value1, String value2) {
            addCriterion("green_percent between", value1, value2, "green_percent");
            return (Criteria) this;
        }

        public Criteria andGreen_percentNotBetween(String value1, String value2) {
            addCriterion("green_percent not between", value1, value2, "green_percent");
            return (Criteria) this;
        }

        public Criteria andArea_sizeIsNull() {
            addCriterion("area_size is null");
            return (Criteria) this;
        }

        public Criteria andArea_sizeIsNotNull() {
            addCriterion("area_size is not null");
            return (Criteria) this;
        }

        public Criteria andArea_sizeEqualTo(String value) {
            addCriterion("area_size =", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeNotEqualTo(String value) {
            addCriterion("area_size <>", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeGreaterThan(String value) {
            addCriterion("area_size >", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeGreaterThanOrEqualTo(String value) {
            addCriterion("area_size >=", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeLessThan(String value) {
            addCriterion("area_size <", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeLessThanOrEqualTo(String value) {
            addCriterion("area_size <=", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeLike(String value) {
            addCriterion("area_size like", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeNotLike(String value) {
            addCriterion("area_size not like", value, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeIn(List<String> values) {
            addCriterion("area_size in", values, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeNotIn(List<String> values) {
            addCriterion("area_size not in", values, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeBetween(String value1, String value2) {
            addCriterion("area_size between", value1, value2, "area_size");
            return (Criteria) this;
        }

        public Criteria andArea_sizeNotBetween(String value1, String value2) {
            addCriterion("area_size not between", value1, value2, "area_size");
            return (Criteria) this;
        }

        public Criteria andSurroundingIsNull() {
            addCriterion("surrounding is null");
            return (Criteria) this;
        }

        public Criteria andSurroundingIsNotNull() {
            addCriterion("surrounding is not null");
            return (Criteria) this;
        }

        public Criteria andSurroundingEqualTo(String value) {
            addCriterion("surrounding =", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingNotEqualTo(String value) {
            addCriterion("surrounding <>", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingGreaterThan(String value) {
            addCriterion("surrounding >", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingGreaterThanOrEqualTo(String value) {
            addCriterion("surrounding >=", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingLessThan(String value) {
            addCriterion("surrounding <", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingLessThanOrEqualTo(String value) {
            addCriterion("surrounding <=", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingLike(String value) {
            addCriterion("surrounding like", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingNotLike(String value) {
            addCriterion("surrounding not like", value, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingIn(List<String> values) {
            addCriterion("surrounding in", values, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingNotIn(List<String> values) {
            addCriterion("surrounding not in", values, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingBetween(String value1, String value2) {
            addCriterion("surrounding between", value1, value2, "surrounding");
            return (Criteria) this;
        }

        public Criteria andSurroundingNotBetween(String value1, String value2) {
            addCriterion("surrounding not between", value1, value2, "surrounding");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
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