package com.gbanker.core.order.dao.entity;

import java.util.Date;

public class MarginInvestBalance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.account_id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.trade_type
     *
     * @mbggenerated
     */
    private Byte tradeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.pre_pay_fee
     *
     * @mbggenerated
     */
    private Long prePayFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.actual_pay_fee
     *
     * @mbggenerated
     */
    private Long actualPayFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.trade_margin
     *
     * @mbggenerated
     */
    private Long tradeMargin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.trade_cost
     *
     * @mbggenerated
     */
    private Long tradeCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.trade_amount
     *
     * @mbggenerated
     */
    private Long tradeAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_invest_balance.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.id
     *
     * @return the value of margin_invest_balance.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.id
     *
     * @param id the value for margin_invest_balance.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.user_id
     *
     * @return the value of margin_invest_balance.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.user_id
     *
     * @param userId the value for margin_invest_balance.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.account_id
     *
     * @return the value of margin_invest_balance.account_id
     *
     * @mbggenerated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.account_id
     *
     * @param accountId the value for margin_invest_balance.account_id
     *
     * @mbggenerated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.trade_type
     *
     * @return the value of margin_invest_balance.trade_type
     *
     * @mbggenerated
     */
    public Byte getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.trade_type
     *
     * @param tradeType the value for margin_invest_balance.trade_type
     *
     * @mbggenerated
     */
    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.pre_pay_fee
     *
     * @return the value of margin_invest_balance.pre_pay_fee
     *
     * @mbggenerated
     */
    public Long getPrePayFee() {
        return prePayFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.pre_pay_fee
     *
     * @param prePayFee the value for margin_invest_balance.pre_pay_fee
     *
     * @mbggenerated
     */
    public void setPrePayFee(Long prePayFee) {
        this.prePayFee = prePayFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.actual_pay_fee
     *
     * @return the value of margin_invest_balance.actual_pay_fee
     *
     * @mbggenerated
     */
    public Long getActualPayFee() {
        return actualPayFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.actual_pay_fee
     *
     * @param actualPayFee the value for margin_invest_balance.actual_pay_fee
     *
     * @mbggenerated
     */
    public void setActualPayFee(Long actualPayFee) {
        this.actualPayFee = actualPayFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.trade_margin
     *
     * @return the value of margin_invest_balance.trade_margin
     *
     * @mbggenerated
     */
    public Long getTradeMargin() {
        return tradeMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.trade_margin
     *
     * @param tradeMargin the value for margin_invest_balance.trade_margin
     *
     * @mbggenerated
     */
    public void setTradeMargin(Long tradeMargin) {
        this.tradeMargin = tradeMargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.trade_cost
     *
     * @return the value of margin_invest_balance.trade_cost
     *
     * @mbggenerated
     */
    public Long getTradeCost() {
        return tradeCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.trade_cost
     *
     * @param tradeCost the value for margin_invest_balance.trade_cost
     *
     * @mbggenerated
     */
    public void setTradeCost(Long tradeCost) {
        this.tradeCost = tradeCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.trade_amount
     *
     * @return the value of margin_invest_balance.trade_amount
     *
     * @mbggenerated
     */
    public Long getTradeAmount() {
        return tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.trade_amount
     *
     * @param tradeAmount the value for margin_invest_balance.trade_amount
     *
     * @mbggenerated
     */
    public void setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.status
     *
     * @return the value of margin_invest_balance.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.status
     *
     * @param status the value for margin_invest_balance.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.create_time
     *
     * @return the value of margin_invest_balance.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.create_time
     *
     * @param createTime the value for margin_invest_balance.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_invest_balance.update_time
     *
     * @return the value of margin_invest_balance.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_invest_balance.update_time
     *
     * @param updateTime the value for margin_invest_balance.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}