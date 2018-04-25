package com.gbanker.core.order.dao.entity;

import java.util.Date;

public class RechargePay {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.pay_no
     *
     * @mbggenerated
     */
    private String payNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.account_id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.order_type
     *
     * @mbggenerated
     */
    private Byte orderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.serial_no
     *
     * @mbggenerated
     */
    private Integer serialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.pay_way
     *
     * @mbggenerated
     */
    private Integer payWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.pay_money
     *
     * @mbggenerated
     */
    private Long payMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.error_msg
     *
     * @mbggenerated
     */
    private String errorMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_pay.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.id
     *
     * @return the value of recharge_pay.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.id
     *
     * @param id the value for recharge_pay.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.pay_no
     *
     * @return the value of recharge_pay.pay_no
     *
     * @mbggenerated
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.pay_no
     *
     * @param payNo the value for recharge_pay.pay_no
     *
     * @mbggenerated
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo == null ? null : payNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.user_id
     *
     * @return the value of recharge_pay.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.user_id
     *
     * @param userId the value for recharge_pay.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.account_id
     *
     * @return the value of recharge_pay.account_id
     *
     * @mbggenerated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.account_id
     *
     * @param accountId the value for recharge_pay.account_id
     *
     * @mbggenerated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.order_no
     *
     * @return the value of recharge_pay.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.order_no
     *
     * @param orderNo the value for recharge_pay.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.order_type
     *
     * @return the value of recharge_pay.order_type
     *
     * @mbggenerated
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.order_type
     *
     * @param orderType the value for recharge_pay.order_type
     *
     * @mbggenerated
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.serial_no
     *
     * @return the value of recharge_pay.serial_no
     *
     * @mbggenerated
     */
    public Integer getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.serial_no
     *
     * @param serialNo the value for recharge_pay.serial_no
     *
     * @mbggenerated
     */
    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.create_time
     *
     * @return the value of recharge_pay.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.create_time
     *
     * @param createTime the value for recharge_pay.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.pay_way
     *
     * @return the value of recharge_pay.pay_way
     *
     * @mbggenerated
     */
    public Integer getPayWay() {
        return payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.pay_way
     *
     * @param payWay the value for recharge_pay.pay_way
     *
     * @mbggenerated
     */
    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.pay_money
     *
     * @return the value of recharge_pay.pay_money
     *
     * @mbggenerated
     */
    public Long getPayMoney() {
        return payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.pay_money
     *
     * @param payMoney the value for recharge_pay.pay_money
     *
     * @mbggenerated
     */
    public void setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.description
     *
     * @return the value of recharge_pay.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.description
     *
     * @param description the value for recharge_pay.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.status
     *
     * @return the value of recharge_pay.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.status
     *
     * @param status the value for recharge_pay.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.error_msg
     *
     * @return the value of recharge_pay.error_msg
     *
     * @mbggenerated
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.error_msg
     *
     * @param errorMsg the value for recharge_pay.error_msg
     *
     * @mbggenerated
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_pay.update_time
     *
     * @return the value of recharge_pay.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_pay.update_time
     *
     * @param updateTime the value for recharge_pay.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}