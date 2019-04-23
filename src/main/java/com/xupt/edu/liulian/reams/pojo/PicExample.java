package com.xupt.edu.liulian.reams.pojo;

import java.util.ArrayList;
import java.util.List;

public class PicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
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