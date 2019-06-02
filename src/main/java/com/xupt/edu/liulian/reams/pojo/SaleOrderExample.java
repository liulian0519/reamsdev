package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SaleOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleOrderExample() {
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

        public Criteria andSale_timeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSale_timeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSale_timeEqualTo(Date value) {
            addCriterionForJDBCDate("sale_time =", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("sale_time <>", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("sale_time >", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sale_time >=", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeLessThan(Date value) {
            addCriterionForJDBCDate("sale_time <", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sale_time <=", value, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeIn(List<Date> values) {
            addCriterionForJDBCDate("sale_time in", values, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("sale_time not in", values, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sale_time between", value1, value2, "sale_time");
            return (Criteria) this;
        }

        public Criteria andSale_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sale_time not between", value1, value2, "sale_time");
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

        public Criteria andSale_typeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSale_typeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSale_typeEqualTo(String value) {
            addCriterion("sale_type =", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotEqualTo(String value) {
            addCriterion("sale_type <>", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeGreaterThan(String value) {
            addCriterion("sale_type >", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type >=", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeLessThan(String value) {
            addCriterion("sale_type <", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeLessThanOrEqualTo(String value) {
            addCriterion("sale_type <=", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeLike(String value) {
            addCriterion("sale_type like", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotLike(String value) {
            addCriterion("sale_type not like", value, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeIn(List<String> values) {
            addCriterion("sale_type in", values, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotIn(List<String> values) {
            addCriterion("sale_type not in", values, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeBetween(String value1, String value2) {
            addCriterion("sale_type between", value1, value2, "sale_type");
            return (Criteria) this;
        }

        public Criteria andSale_typeNotBetween(String value1, String value2) {
            addCriterion("sale_type not between", value1, value2, "sale_type");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idIsNull() {
            addCriterion("greenhouse_id is null");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idIsNotNull() {
            addCriterion("greenhouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idEqualTo(Integer value) {
            addCriterion("greenhouse_id =", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idNotEqualTo(Integer value) {
            addCriterion("greenhouse_id <>", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idGreaterThan(Integer value) {
            addCriterion("greenhouse_id >", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("greenhouse_id >=", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idLessThan(Integer value) {
            addCriterion("greenhouse_id <", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idLessThanOrEqualTo(Integer value) {
            addCriterion("greenhouse_id <=", value, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idIn(List<Integer> values) {
            addCriterion("greenhouse_id in", values, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idNotIn(List<Integer> values) {
            addCriterion("greenhouse_id not in", values, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idBetween(Integer value1, Integer value2) {
            addCriterion("greenhouse_id between", value1, value2, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andGreenhouse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("greenhouse_id not between", value1, value2, "greenhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idIsNull() {
            addCriterion("newhouse_id is null");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idIsNotNull() {
            addCriterion("newhouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idEqualTo(Integer value) {
            addCriterion("newhouse_id =", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idNotEqualTo(Integer value) {
            addCriterion("newhouse_id <>", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idGreaterThan(Integer value) {
            addCriterion("newhouse_id >", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("newhouse_id >=", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idLessThan(Integer value) {
            addCriterion("newhouse_id <", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idLessThanOrEqualTo(Integer value) {
            addCriterion("newhouse_id <=", value, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idIn(List<Integer> values) {
            addCriterion("newhouse_id in", values, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idNotIn(List<Integer> values) {
            addCriterion("newhouse_id not in", values, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idBetween(Integer value1, Integer value2) {
            addCriterion("newhouse_id between", value1, value2, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andNewhouse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("newhouse_id not between", value1, value2, "newhouse_id");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneEqualTo(String value) {
            addCriterion("user_phone =", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThan(String value) {
            addCriterion("user_phone <", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLike(String value) {
            addCriterion("user_phone like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotLike(String value) {
            addCriterion("user_phone not like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIn(List<String> values) {
            addCriterion("user_phone in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idIsNull() {
            addCriterion("renthouse_id is null");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idIsNotNull() {
            addCriterion("renthouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idEqualTo(Integer value) {
            addCriterion("renthouse_id =", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idNotEqualTo(Integer value) {
            addCriterion("renthouse_id <>", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idGreaterThan(Integer value) {
            addCriterion("renthouse_id >", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("renthouse_id >=", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idLessThan(Integer value) {
            addCriterion("renthouse_id <", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idLessThanOrEqualTo(Integer value) {
            addCriterion("renthouse_id <=", value, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idIn(List<Integer> values) {
            addCriterion("renthouse_id in", values, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idNotIn(List<Integer> values) {
            addCriterion("renthouse_id not in", values, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idBetween(Integer value1, Integer value2) {
            addCriterion("renthouse_id between", value1, value2, "renthouse_id");
            return (Criteria) this;
        }

        public Criteria andRenthouse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("renthouse_id not between", value1, value2, "renthouse_id");
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