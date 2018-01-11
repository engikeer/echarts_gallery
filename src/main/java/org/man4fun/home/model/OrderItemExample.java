package org.man4fun.home.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public OrderItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
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

        public Criteria andOrder_numIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrder_numIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_numEqualTo(Integer value) {
            addCriterion("order_num =", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThan(Integer value) {
            addCriterion("order_num >", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThan(Integer value) {
            addCriterion("order_num <", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numIn(List<Integer> values) {
            addCriterion("order_num in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_numNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "order_num");
            return (Criteria) this;
        }

        public Criteria andOrder_itemIsNull() {
            addCriterion("order_item is null");
            return (Criteria) this;
        }

        public Criteria andOrder_itemIsNotNull() {
            addCriterion("order_item is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_itemEqualTo(Integer value) {
            addCriterion("order_item =", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemNotEqualTo(Integer value) {
            addCriterion("order_item <>", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemGreaterThan(Integer value) {
            addCriterion("order_item >", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_item >=", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemLessThan(Integer value) {
            addCriterion("order_item <", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemLessThanOrEqualTo(Integer value) {
            addCriterion("order_item <=", value, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemIn(List<Integer> values) {
            addCriterion("order_item in", values, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemNotIn(List<Integer> values) {
            addCriterion("order_item not in", values, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemBetween(Integer value1, Integer value2) {
            addCriterion("order_item between", value1, value2, "order_item");
            return (Criteria) this;
        }

        public Criteria andOrder_itemNotBetween(Integer value1, Integer value2) {
            addCriterion("order_item not between", value1, value2, "order_item");
            return (Criteria) this;
        }

        public Criteria andProd_idIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProd_idIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProd_idEqualTo(String value) {
            addCriterion("prod_id =", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotEqualTo(String value) {
            addCriterion("prod_id <>", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idGreaterThan(String value) {
            addCriterion("prod_id >", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idGreaterThanOrEqualTo(String value) {
            addCriterion("prod_id >=", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLessThan(String value) {
            addCriterion("prod_id <", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLessThanOrEqualTo(String value) {
            addCriterion("prod_id <=", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idLike(String value) {
            addCriterion("prod_id like", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotLike(String value) {
            addCriterion("prod_id not like", value, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idIn(List<String> values) {
            addCriterion("prod_id in", values, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotIn(List<String> values) {
            addCriterion("prod_id not in", values, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idBetween(String value1, String value2) {
            addCriterion("prod_id between", value1, value2, "prod_id");
            return (Criteria) this;
        }

        public Criteria andProd_idNotBetween(String value1, String value2) {
            addCriterion("prod_id not between", value1, value2, "prod_id");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andItem_priceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItem_priceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItem_priceEqualTo(Double value) {
            addCriterion("item_price =", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceNotEqualTo(Double value) {
            addCriterion("item_price <>", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceGreaterThan(Double value) {
            addCriterion("item_price >", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_price >=", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceLessThan(Double value) {
            addCriterion("item_price <", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceLessThanOrEqualTo(Double value) {
            addCriterion("item_price <=", value, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceIn(List<Double> values) {
            addCriterion("item_price in", values, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceNotIn(List<Double> values) {
            addCriterion("item_price not in", values, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceBetween(Double value1, Double value2) {
            addCriterion("item_price between", value1, value2, "item_price");
            return (Criteria) this;
        }

        public Criteria andItem_priceNotBetween(Double value1, Double value2) {
            addCriterion("item_price not between", value1, value2, "item_price");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderitems
     *
     * @mbg.generated do_not_delete_during_merge Thu Jan 11 11:52:50 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orderitems
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
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