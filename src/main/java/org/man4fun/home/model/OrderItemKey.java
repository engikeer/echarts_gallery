package org.man4fun.home.model;

public class OrderItemKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitems.order_num
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private Integer order_num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderitems.order_item
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private Integer order_item;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitems.order_num
     *
     * @return the value of orderitems.order_num
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public Integer getOrder_num() {
        return order_num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitems.order_num
     *
     * @param order_num the value for orderitems.order_num
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderitems.order_item
     *
     * @return the value of orderitems.order_item
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public Integer getOrder_item() {
        return order_item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderitems.order_item
     *
     * @param order_item the value for orderitems.order_item
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setOrder_item(Integer order_item) {
        this.order_item = order_item;
    }
}