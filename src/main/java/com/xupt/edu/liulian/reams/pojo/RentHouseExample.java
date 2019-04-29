package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RentHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RentHouseExample() {
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

        public Criteria andRent_typeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRent_typeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRent_typeEqualTo(Byte value) {
            addCriterion("rent_type =", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeNotEqualTo(Byte value) {
            addCriterion("rent_type <>", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeGreaterThan(Byte value) {
            addCriterion("rent_type >", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("rent_type >=", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeLessThan(Byte value) {
            addCriterion("rent_type <", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeLessThanOrEqualTo(Byte value) {
            addCriterion("rent_type <=", value, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeIn(List<Byte> values) {
            addCriterion("rent_type in", values, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeNotIn(List<Byte> values) {
            addCriterion("rent_type not in", values, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeBetween(Byte value1, Byte value2) {
            addCriterion("rent_type between", value1, value2, "rent_type");
            return (Criteria) this;
        }

        public Criteria andRent_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("rent_type not between", value1, value2, "rent_type");
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

        public Criteria andRent_timeIsNull() {
            addCriterion("rent_time is null");
            return (Criteria) this;
        }

        public Criteria andRent_timeIsNotNull() {
            addCriterion("rent_time is not null");
            return (Criteria) this;
        }

        public Criteria andRent_timeEqualTo(String value) {
            addCriterion("rent_time =", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeNotEqualTo(String value) {
            addCriterion("rent_time <>", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeGreaterThan(String value) {
            addCriterion("rent_time >", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeGreaterThanOrEqualTo(String value) {
            addCriterion("rent_time >=", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeLessThan(String value) {
            addCriterion("rent_time <", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeLessThanOrEqualTo(String value) {
            addCriterion("rent_time <=", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeLike(String value) {
            addCriterion("rent_time like", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeNotLike(String value) {
            addCriterion("rent_time not like", value, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeIn(List<String> values) {
            addCriterion("rent_time in", values, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeNotIn(List<String> values) {
            addCriterion("rent_time not in", values, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeBetween(String value1, String value2) {
            addCriterion("rent_time between", value1, value2, "rent_time");
            return (Criteria) this;
        }

        public Criteria andRent_timeNotBetween(String value1, String value2) {
            addCriterion("rent_time not between", value1, value2, "rent_time");
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

        public Criteria andEletricIsNull() {
            addCriterion("eletric is null");
            return (Criteria) this;
        }

        public Criteria andEletricIsNotNull() {
            addCriterion("eletric is not null");
            return (Criteria) this;
        }

        public Criteria andEletricEqualTo(String value) {
            addCriterion("eletric =", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotEqualTo(String value) {
            addCriterion("eletric <>", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricGreaterThan(String value) {
            addCriterion("eletric >", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricGreaterThanOrEqualTo(String value) {
            addCriterion("eletric >=", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricLessThan(String value) {
            addCriterion("eletric <", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricLessThanOrEqualTo(String value) {
            addCriterion("eletric <=", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricLike(String value) {
            addCriterion("eletric like", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotLike(String value) {
            addCriterion("eletric not like", value, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricIn(List<String> values) {
            addCriterion("eletric in", values, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotIn(List<String> values) {
            addCriterion("eletric not in", values, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricBetween(String value1, String value2) {
            addCriterion("eletric between", value1, value2, "eletric");
            return (Criteria) this;
        }

        public Criteria andEletricNotBetween(String value1, String value2) {
            addCriterion("eletric not between", value1, value2, "eletric");
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

        public Criteria andElevatorEqualTo(Byte value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Byte value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Byte value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Byte value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Byte value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Byte value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Byte> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Byte> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Byte value1, Byte value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Byte value1, Byte value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
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

        public Criteria andFireIsNull() {
            addCriterion("fire is null");
            return (Criteria) this;
        }

        public Criteria andFireIsNotNull() {
            addCriterion("fire is not null");
            return (Criteria) this;
        }

        public Criteria andFireEqualTo(Byte value) {
            addCriterion("fire =", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotEqualTo(Byte value) {
            addCriterion("fire <>", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThan(Byte value) {
            addCriterion("fire >", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireGreaterThanOrEqualTo(Byte value) {
            addCriterion("fire >=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThan(Byte value) {
            addCriterion("fire <", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireLessThanOrEqualTo(Byte value) {
            addCriterion("fire <=", value, "fire");
            return (Criteria) this;
        }

        public Criteria andFireIn(List<Byte> values) {
            addCriterion("fire in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotIn(List<Byte> values) {
            addCriterion("fire not in", values, "fire");
            return (Criteria) this;
        }

        public Criteria andFireBetween(Byte value1, Byte value2) {
            addCriterion("fire between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andFireNotBetween(Byte value1, Byte value2) {
            addCriterion("fire not between", value1, value2, "fire");
            return (Criteria) this;
        }

        public Criteria andTvIsNull() {
            addCriterion("tv is null");
            return (Criteria) this;
        }

        public Criteria andTvIsNotNull() {
            addCriterion("tv is not null");
            return (Criteria) this;
        }

        public Criteria andTvEqualTo(Byte value) {
            addCriterion("tv =", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotEqualTo(Byte value) {
            addCriterion("tv <>", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvGreaterThan(Byte value) {
            addCriterion("tv >", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvGreaterThanOrEqualTo(Byte value) {
            addCriterion("tv >=", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvLessThan(Byte value) {
            addCriterion("tv <", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvLessThanOrEqualTo(Byte value) {
            addCriterion("tv <=", value, "tv");
            return (Criteria) this;
        }

        public Criteria andTvIn(List<Byte> values) {
            addCriterion("tv in", values, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotIn(List<Byte> values) {
            addCriterion("tv not in", values, "tv");
            return (Criteria) this;
        }

        public Criteria andTvBetween(Byte value1, Byte value2) {
            addCriterion("tv between", value1, value2, "tv");
            return (Criteria) this;
        }

        public Criteria andTvNotBetween(Byte value1, Byte value2) {
            addCriterion("tv not between", value1, value2, "tv");
            return (Criteria) this;
        }

        public Criteria andFridgeIsNull() {
            addCriterion("fridge is null");
            return (Criteria) this;
        }

        public Criteria andFridgeIsNotNull() {
            addCriterion("fridge is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeEqualTo(Byte value) {
            addCriterion("fridge =", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotEqualTo(Byte value) {
            addCriterion("fridge <>", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeGreaterThan(Byte value) {
            addCriterion("fridge >", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fridge >=", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeLessThan(Byte value) {
            addCriterion("fridge <", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeLessThanOrEqualTo(Byte value) {
            addCriterion("fridge <=", value, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeIn(List<Byte> values) {
            addCriterion("fridge in", values, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotIn(List<Byte> values) {
            addCriterion("fridge not in", values, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeBetween(Byte value1, Byte value2) {
            addCriterion("fridge between", value1, value2, "fridge");
            return (Criteria) this;
        }

        public Criteria andFridgeNotBetween(Byte value1, Byte value2) {
            addCriterion("fridge not between", value1, value2, "fridge");
            return (Criteria) this;
        }

        public Criteria andWasherIsNull() {
            addCriterion("washer is null");
            return (Criteria) this;
        }

        public Criteria andWasherIsNotNull() {
            addCriterion("washer is not null");
            return (Criteria) this;
        }

        public Criteria andWasherEqualTo(Byte value) {
            addCriterion("washer =", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherNotEqualTo(Byte value) {
            addCriterion("washer <>", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherGreaterThan(Byte value) {
            addCriterion("washer >", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherGreaterThanOrEqualTo(Byte value) {
            addCriterion("washer >=", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherLessThan(Byte value) {
            addCriterion("washer <", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherLessThanOrEqualTo(Byte value) {
            addCriterion("washer <=", value, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherIn(List<Byte> values) {
            addCriterion("washer in", values, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherNotIn(List<Byte> values) {
            addCriterion("washer not in", values, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherBetween(Byte value1, Byte value2) {
            addCriterion("washer between", value1, value2, "washer");
            return (Criteria) this;
        }

        public Criteria andWasherNotBetween(Byte value1, Byte value2) {
            addCriterion("washer not between", value1, value2, "washer");
            return (Criteria) this;
        }

        public Criteria andAir_conditionIsNull() {
            addCriterion("air_condition is null");
            return (Criteria) this;
        }

        public Criteria andAir_conditionIsNotNull() {
            addCriterion("air_condition is not null");
            return (Criteria) this;
        }

        public Criteria andAir_conditionEqualTo(Byte value) {
            addCriterion("air_condition =", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionNotEqualTo(Byte value) {
            addCriterion("air_condition <>", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionGreaterThan(Byte value) {
            addCriterion("air_condition >", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionGreaterThanOrEqualTo(Byte value) {
            addCriterion("air_condition >=", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionLessThan(Byte value) {
            addCriterion("air_condition <", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionLessThanOrEqualTo(Byte value) {
            addCriterion("air_condition <=", value, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionIn(List<Byte> values) {
            addCriterion("air_condition in", values, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionNotIn(List<Byte> values) {
            addCriterion("air_condition not in", values, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionBetween(Byte value1, Byte value2) {
            addCriterion("air_condition between", value1, value2, "air_condition");
            return (Criteria) this;
        }

        public Criteria andAir_conditionNotBetween(Byte value1, Byte value2) {
            addCriterion("air_condition not between", value1, value2, "air_condition");
            return (Criteria) this;
        }

        public Criteria andShowerIsNull() {
            addCriterion("shower is null");
            return (Criteria) this;
        }

        public Criteria andShowerIsNotNull() {
            addCriterion("shower is not null");
            return (Criteria) this;
        }

        public Criteria andShowerEqualTo(Byte value) {
            addCriterion("shower =", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerNotEqualTo(Byte value) {
            addCriterion("shower <>", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerGreaterThan(Byte value) {
            addCriterion("shower >", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerGreaterThanOrEqualTo(Byte value) {
            addCriterion("shower >=", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerLessThan(Byte value) {
            addCriterion("shower <", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerLessThanOrEqualTo(Byte value) {
            addCriterion("shower <=", value, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerIn(List<Byte> values) {
            addCriterion("shower in", values, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerNotIn(List<Byte> values) {
            addCriterion("shower not in", values, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerBetween(Byte value1, Byte value2) {
            addCriterion("shower between", value1, value2, "shower");
            return (Criteria) this;
        }

        public Criteria andShowerNotBetween(Byte value1, Byte value2) {
            addCriterion("shower not between", value1, value2, "shower");
            return (Criteria) this;
        }

        public Criteria andBedIsNull() {
            addCriterion("bed is null");
            return (Criteria) this;
        }

        public Criteria andBedIsNotNull() {
            addCriterion("bed is not null");
            return (Criteria) this;
        }

        public Criteria andBedEqualTo(Byte value) {
            addCriterion("bed =", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotEqualTo(Byte value) {
            addCriterion("bed <>", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThan(Byte value) {
            addCriterion("bed >", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedGreaterThanOrEqualTo(Byte value) {
            addCriterion("bed >=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThan(Byte value) {
            addCriterion("bed <", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedLessThanOrEqualTo(Byte value) {
            addCriterion("bed <=", value, "bed");
            return (Criteria) this;
        }

        public Criteria andBedIn(List<Byte> values) {
            addCriterion("bed in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotIn(List<Byte> values) {
            addCriterion("bed not in", values, "bed");
            return (Criteria) this;
        }

        public Criteria andBedBetween(Byte value1, Byte value2) {
            addCriterion("bed between", value1, value2, "bed");
            return (Criteria) this;
        }

        public Criteria andBedNotBetween(Byte value1, Byte value2) {
            addCriterion("bed not between", value1, value2, "bed");
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

        public Criteria andHeatingEqualTo(Byte value) {
            addCriterion("heating =", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotEqualTo(Byte value) {
            addCriterion("heating <>", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThan(Byte value) {
            addCriterion("heating >", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingGreaterThanOrEqualTo(Byte value) {
            addCriterion("heating >=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThan(Byte value) {
            addCriterion("heating <", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingLessThanOrEqualTo(Byte value) {
            addCriterion("heating <=", value, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingIn(List<Byte> values) {
            addCriterion("heating in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotIn(List<Byte> values) {
            addCriterion("heating not in", values, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingBetween(Byte value1, Byte value2) {
            addCriterion("heating between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andHeatingNotBetween(Byte value1, Byte value2) {
            addCriterion("heating not between", value1, value2, "heating");
            return (Criteria) this;
        }

        public Criteria andWifiIsNull() {
            addCriterion("wifi is null");
            return (Criteria) this;
        }

        public Criteria andWifiIsNotNull() {
            addCriterion("wifi is not null");
            return (Criteria) this;
        }

        public Criteria andWifiEqualTo(Byte value) {
            addCriterion("wifi =", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotEqualTo(Byte value) {
            addCriterion("wifi <>", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThan(Byte value) {
            addCriterion("wifi >", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiGreaterThanOrEqualTo(Byte value) {
            addCriterion("wifi >=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThan(Byte value) {
            addCriterion("wifi <", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiLessThanOrEqualTo(Byte value) {
            addCriterion("wifi <=", value, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiIn(List<Byte> values) {
            addCriterion("wifi in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotIn(List<Byte> values) {
            addCriterion("wifi not in", values, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiBetween(Byte value1, Byte value2) {
            addCriterion("wifi between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andWifiNotBetween(Byte value1, Byte value2) {
            addCriterion("wifi not between", value1, value2, "wifi");
            return (Criteria) this;
        }

        public Criteria andGasIsNull() {
            addCriterion("gas is null");
            return (Criteria) this;
        }

        public Criteria andGasIsNotNull() {
            addCriterion("gas is not null");
            return (Criteria) this;
        }

        public Criteria andGasEqualTo(Byte value) {
            addCriterion("gas =", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotEqualTo(Byte value) {
            addCriterion("gas <>", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasGreaterThan(Byte value) {
            addCriterion("gas >", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasGreaterThanOrEqualTo(Byte value) {
            addCriterion("gas >=", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasLessThan(Byte value) {
            addCriterion("gas <", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasLessThanOrEqualTo(Byte value) {
            addCriterion("gas <=", value, "gas");
            return (Criteria) this;
        }

        public Criteria andGasIn(List<Byte> values) {
            addCriterion("gas in", values, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotIn(List<Byte> values) {
            addCriterion("gas not in", values, "gas");
            return (Criteria) this;
        }

        public Criteria andGasBetween(Byte value1, Byte value2) {
            addCriterion("gas between", value1, value2, "gas");
            return (Criteria) this;
        }

        public Criteria andGasNotBetween(Byte value1, Byte value2) {
            addCriterion("gas not between", value1, value2, "gas");
            return (Criteria) this;
        }

        public Criteria andClosespressIsNull() {
            addCriterion("closespress is null");
            return (Criteria) this;
        }

        public Criteria andClosespressIsNotNull() {
            addCriterion("closespress is not null");
            return (Criteria) this;
        }

        public Criteria andClosespressEqualTo(Byte value) {
            addCriterion("closespress =", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressNotEqualTo(Byte value) {
            addCriterion("closespress <>", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressGreaterThan(Byte value) {
            addCriterion("closespress >", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressGreaterThanOrEqualTo(Byte value) {
            addCriterion("closespress >=", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressLessThan(Byte value) {
            addCriterion("closespress <", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressLessThanOrEqualTo(Byte value) {
            addCriterion("closespress <=", value, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressIn(List<Byte> values) {
            addCriterion("closespress in", values, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressNotIn(List<Byte> values) {
            addCriterion("closespress not in", values, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressBetween(Byte value1, Byte value2) {
            addCriterion("closespress between", value1, value2, "closespress");
            return (Criteria) this;
        }

        public Criteria andClosespressNotBetween(Byte value1, Byte value2) {
            addCriterion("closespress not between", value1, value2, "closespress");
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