package org.man4fun.home.model;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_id
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private Integer custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_name
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_address
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_city
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_state
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_zip
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custZip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_country
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custCountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_contact
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custContact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customers.cust_email
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    private String custEmail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_id
     *
     * @return the value of customers.cust_id
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_id
     *
     * @param custId the value for customers.cust_id
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_name
     *
     * @return the value of customers.cust_name
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_name
     *
     * @param custName the value for customers.cust_name
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_address
     *
     * @return the value of customers.cust_address
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_address
     *
     * @param custAddress the value for customers.cust_address
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_city
     *
     * @return the value of customers.cust_city
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_city
     *
     * @param custCity the value for customers.cust_city
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustCity(String custCity) {
        this.custCity = custCity == null ? null : custCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_state
     *
     * @return the value of customers.cust_state
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustState() {
        return custState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_state
     *
     * @param custState the value for customers.cust_state
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustState(String custState) {
        this.custState = custState == null ? null : custState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_zip
     *
     * @return the value of customers.cust_zip
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustZip() {
        return custZip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_zip
     *
     * @param custZip the value for customers.cust_zip
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_country
     *
     * @return the value of customers.cust_country
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustCountry() {
        return custCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_country
     *
     * @param custCountry the value for customers.cust_country
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry == null ? null : custCountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_contact
     *
     * @return the value of customers.cust_contact
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustContact() {
        return custContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_contact
     *
     * @param custContact the value for customers.cust_contact
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustContact(String custContact) {
        this.custContact = custContact == null ? null : custContact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customers.cust_email
     *
     * @return the value of customers.cust_email
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customers.cust_email
     *
     * @param custEmail the value for customers.cust_email
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }
}