package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommunityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunityExample() {
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

        public Criteria andAvg_priceIsNull() {
            addCriterion("avg_price is null");
            return (Criteria) this;
        }

        public Criteria andAvg_priceIsNotNull() {
            addCriterion("avg_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvg_priceEqualTo(String value) {
            addCriterion("avg_price =", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotEqualTo(String value) {
            addCriterion("avg_price <>", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceGreaterThan(String value) {
            addCriterion("avg_price >", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceGreaterThanOrEqualTo(String value) {
            addCriterion("avg_price >=", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceLessThan(String value) {
            addCriterion("avg_price <", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceLessThanOrEqualTo(String value) {
            addCriterion("avg_price <=", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceLike(String value) {
            addCriterion("avg_price like", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotLike(String value) {
            addCriterion("avg_price not like", value, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceIn(List<String> values) {
            addCriterion("avg_price in", values, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotIn(List<String> values) {
            addCriterion("avg_price not in", values, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceBetween(String value1, String value2) {
            addCriterion("avg_price between", value1, value2, "avg_price");
            return (Criteria) this;
        }

        public Criteria andAvg_priceNotBetween(String value1, String value2) {
            addCriterion("avg_price not between", value1, value2, "avg_price");
            return (Criteria) this;
        }

        public Criteria andBuild_timeIsNull() {
            addCriterion("build_time is null");
            return (Criteria) this;
        }

        public Criteria andBuild_timeIsNotNull() {
            addCriterion("build_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_timeEqualTo(Date value) {
            addCriterionForJDBCDate("build_time =", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("build_time <>", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("build_time >", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_time >=", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeLessThan(Date value) {
            addCriterionForJDBCDate("build_time <", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("build_time <=", value, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeIn(List<Date> values) {
            addCriterionForJDBCDate("build_time in", values, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("build_time not in", values, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_time between", value1, value2, "build_time");
            return (Criteria) this;
        }

        public Criteria andBuild_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("build_time not between", value1, value2, "build_time");
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

        public Criteria andBuild_numIsNull() {
            addCriterion("build_num is null");
            return (Criteria) this;
        }

        public Criteria andBuild_numIsNotNull() {
            addCriterion("build_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuild_numEqualTo(Integer value) {
            addCriterion("build_num =", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numNotEqualTo(Integer value) {
            addCriterion("build_num <>", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numGreaterThan(Integer value) {
            addCriterion("build_num >", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_num >=", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numLessThan(Integer value) {
            addCriterion("build_num <", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numLessThanOrEqualTo(Integer value) {
            addCriterion("build_num <=", value, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numIn(List<Integer> values) {
            addCriterion("build_num in", values, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numNotIn(List<Integer> values) {
            addCriterion("build_num not in", values, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numBetween(Integer value1, Integer value2) {
            addCriterion("build_num between", value1, value2, "build_num");
            return (Criteria) this;
        }

        public Criteria andBuild_numNotBetween(Integer value1, Integer value2) {
            addCriterion("build_num not between", value1, value2, "build_num");
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

        public Criteria andSurroudingIsNull() {
            addCriterion("surrouding is null");
            return (Criteria) this;
        }

        public Criteria andSurroudingIsNotNull() {
            addCriterion("surrouding is not null");
            return (Criteria) this;
        }

        public Criteria andSurroudingEqualTo(String value) {
            addCriterion("surrouding =", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingNotEqualTo(String value) {
            addCriterion("surrouding <>", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingGreaterThan(String value) {
            addCriterion("surrouding >", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingGreaterThanOrEqualTo(String value) {
            addCriterion("surrouding >=", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingLessThan(String value) {
            addCriterion("surrouding <", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingLessThanOrEqualTo(String value) {
            addCriterion("surrouding <=", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingLike(String value) {
            addCriterion("surrouding like", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingNotLike(String value) {
            addCriterion("surrouding not like", value, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingIn(List<String> values) {
            addCriterion("surrouding in", values, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingNotIn(List<String> values) {
            addCriterion("surrouding not in", values, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingBetween(String value1, String value2) {
            addCriterion("surrouding between", value1, value2, "surrouding");
            return (Criteria) this;
        }

        public Criteria andSurroudingNotBetween(String value1, String value2) {
            addCriterion("surrouding not between", value1, value2, "surrouding");
            return (Criteria) this;
        }

        public Criteria andKey_saleIsNull() {
            addCriterion("key_sale is null");
            return (Criteria) this;
        }

        public Criteria andKey_saleIsNotNull() {
            addCriterion("key_sale is not null");
            return (Criteria) this;
        }

        public Criteria andKey_saleEqualTo(String value) {
            addCriterion("key_sale =", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleNotEqualTo(String value) {
            addCriterion("key_sale <>", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleGreaterThan(String value) {
            addCriterion("key_sale >", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleGreaterThanOrEqualTo(String value) {
            addCriterion("key_sale >=", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleLessThan(String value) {
            addCriterion("key_sale <", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleLessThanOrEqualTo(String value) {
            addCriterion("key_sale <=", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleLike(String value) {
            addCriterion("key_sale like", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleNotLike(String value) {
            addCriterion("key_sale not like", value, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleIn(List<String> values) {
            addCriterion("key_sale in", values, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleNotIn(List<String> values) {
            addCriterion("key_sale not in", values, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleBetween(String value1, String value2) {
            addCriterion("key_sale between", value1, value2, "key_sale");
            return (Criteria) this;
        }

        public Criteria andKey_saleNotBetween(String value1, String value2) {
            addCriterion("key_sale not between", value1, value2, "key_sale");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
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