package com.gbanker.core.order.dao.entity;

import java.util.Date;

public class MarginOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.account_id
     *
     * @mbggenerated
     */
    private String accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.order_no
     *
     * @mbggenerated
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.order_type
     *
     * @mbggenerated
     */
    private Byte orderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.order_weight
     *
     * @mbggenerated
     */
    private Long orderWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.order_amount
     *
     * @mbggenerated
     */
    private Long orderAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_amount
     *
     * @mbggenerated
     */
    private Long realAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_weight
     *
     * @mbggenerated
     */
    private Long realWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_price
     *
     * @mbggenerated
     */
    private Long realPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.sale_price
     *
     * @mbggenerated
     */
    private Long salePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.sale_fee
     *
     * @mbggenerated
     */
    private Long saleFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.pre_service_fee
     *
     * @mbggenerated
     */
    private Long preServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_service_fee
     *
     * @mbggenerated
     */
    private Long realServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.bse_margin_amount
     *
     * @mbggenerated
     */
    private Long bseMarginAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.add_margin_amount
     *
     * @mbggenerated
     */
    private Long addMarginAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.force_sale_price
     *
     * @mbggenerated
     */
    private Long forceSalePrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.max_hodl_day
     *
     * @mbggenerated
     */
    private Integer maxHodlDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_sale_type
     *
     * @mbggenerated
     */
    private Byte realSaleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_sale_earnings
     *
     * @mbggenerated
     */
    private Long realSaleEarnings;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.crate_time
     *
     * @mbggenerated
     */
    private Date crateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_buy_time
     *
     * @mbggenerated
     */
    private Date realBuyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.real_sale_time
     *
     * @mbggenerated
     */
    private Date realSaleTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.latest_sale_date
     *
     * @mbggenerated
     */
    private Date latestSaleDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column margin_order.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.id
     *
     * @return the value of margin_order.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.id
     *
     * @param id the value for margin_order.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.user_id
     *
     * @return the value of margin_order.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.user_id
     *
     * @param userId the value for margin_order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.account_id
     *
     * @return the value of margin_order.account_id
     *
     * @mbggenerated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.account_id
     *
     * @param accountId the value for margin_order.account_id
     *
     * @mbggenerated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.order_no
     *
     * @return the value of margin_order.order_no
     *
     * @mbggenerated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.order_no
     *
     * @param orderNo the value for margin_order.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.order_type
     *
     * @return the value of margin_order.order_type
     *
     * @mbggenerated
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.order_type
     *
     * @param orderType the value for margin_order.order_type
     *
     * @mbggenerated
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.order_weight
     *
     * @return the value of margin_order.order_weight
     *
     * @mbggenerated
     */
    public Long getOrderWeight() {
        return orderWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.order_weight
     *
     * @param orderWeight the value for margin_order.order_weight
     *
     * @mbggenerated
     */
    public void setOrderWeight(Long orderWeight) {
        this.orderWeight = orderWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.order_amount
     *
     * @return the value of margin_order.order_amount
     *
     * @mbggenerated
     */
    public Long getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.order_amount
     *
     * @param orderAmount the value for margin_order.order_amount
     *
     * @mbggenerated
     */
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_amount
     *
     * @return the value of margin_order.real_amount
     *
     * @mbggenerated
     */
    public Long getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_amount
     *
     * @param realAmount the value for margin_order.real_amount
     *
     * @mbggenerated
     */
    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_weight
     *
     * @return the value of margin_order.real_weight
     *
     * @mbggenerated
     */
    public Long getRealWeight() {
        return realWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_weight
     *
     * @param realWeight the value for margin_order.real_weight
     *
     * @mbggenerated
     */
    public void setRealWeight(Long realWeight) {
        this.realWeight = realWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_price
     *
     * @return the value of margin_order.real_price
     *
     * @mbggenerated
     */
    public Long getRealPrice() {
        return realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_price
     *
     * @param realPrice the value for margin_order.real_price
     *
     * @mbggenerated
     */
    public void setRealPrice(Long realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.sale_price
     *
     * @return the value of margin_order.sale_price
     *
     * @mbggenerated
     */
    public Long getSalePrice() {
        return salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.sale_price
     *
     * @param salePrice the value for margin_order.sale_price
     *
     * @mbggenerated
     */
    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.sale_fee
     *
     * @return the value of margin_order.sale_fee
     *
     * @mbggenerated
     */
    public Long getSaleFee() {
        return saleFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.sale_fee
     *
     * @param saleFee the value for margin_order.sale_fee
     *
     * @mbggenerated
     */
    public void setSaleFee(Long saleFee) {
        this.saleFee = saleFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.pre_service_fee
     *
     * @return the value of margin_order.pre_service_fee
     *
     * @mbggenerated
     */
    public Long getPreServiceFee() {
        return preServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.pre_service_fee
     *
     * @param preServiceFee the value for margin_order.pre_service_fee
     *
     * @mbggenerated
     */
    public void setPreServiceFee(Long preServiceFee) {
        this.preServiceFee = preServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_service_fee
     *
     * @return the value of margin_order.real_service_fee
     *
     * @mbggenerated
     */
    public Long getRealServiceFee() {
        return realServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_service_fee
     *
     * @param realServiceFee the value for margin_order.real_service_fee
     *
     * @mbggenerated
     */
    public void setRealServiceFee(Long realServiceFee) {
        this.realServiceFee = realServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.bse_margin_amount
     *
     * @return the value of margin_order.bse_margin_amount
     *
     * @mbggenerated
     */
    public Long getBseMarginAmount() {
        return bseMarginAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.bse_margin_amount
     *
     * @param bseMarginAmount the value for margin_order.bse_margin_amount
     *
     * @mbggenerated
     */
    public void setBseMarginAmount(Long bseMarginAmount) {
        this.bseMarginAmount = bseMarginAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.add_margin_amount
     *
     * @return the value of margin_order.add_margin_amount
     *
     * @mbggenerated
     */
    public Long getAddMarginAmount() {
        return addMarginAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.add_margin_amount
     *
     * @param addMarginAmount the value for margin_order.add_margin_amount
     *
     * @mbggenerated
     */
    public void setAddMarginAmount(Long addMarginAmount) {
        this.addMarginAmount = addMarginAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.force_sale_price
     *
     * @return the value of margin_order.force_sale_price
     *
     * @mbggenerated
     */
    public Long getForceSalePrice() {
        return forceSalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.force_sale_price
     *
     * @param forceSalePrice the value for margin_order.force_sale_price
     *
     * @mbggenerated
     */
    public void setForceSalePrice(Long forceSalePrice) {
        this.forceSalePrice = forceSalePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.max_hodl_day
     *
     * @return the value of margin_order.max_hodl_day
     *
     * @mbggenerated
     */
    public Integer getMaxHodlDay() {
        return maxHodlDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.max_hodl_day
     *
     * @param maxHodlDay the value for margin_order.max_hodl_day
     *
     * @mbggenerated
     */
    public void setMaxHodlDay(Integer maxHodlDay) {
        this.maxHodlDay = maxHodlDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_sale_type
     *
     * @return the value of margin_order.real_sale_type
     *
     * @mbggenerated
     */
    public Byte getRealSaleType() {
        return realSaleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_sale_type
     *
     * @param realSaleType the value for margin_order.real_sale_type
     *
     * @mbggenerated
     */
    public void setRealSaleType(Byte realSaleType) {
        this.realSaleType = realSaleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_sale_earnings
     *
     * @return the value of margin_order.real_sale_earnings
     *
     * @mbggenerated
     */
    public Long getRealSaleEarnings() {
        return realSaleEarnings;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_sale_earnings
     *
     * @param realSaleEarnings the value for margin_order.real_sale_earnings
     *
     * @mbggenerated
     */
    public void setRealSaleEarnings(Long realSaleEarnings) {
        this.realSaleEarnings = realSaleEarnings;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.crate_time
     *
     * @return the value of margin_order.crate_time
     *
     * @mbggenerated
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.crate_time
     *
     * @param crateTime the value for margin_order.crate_time
     *
     * @mbggenerated
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_buy_time
     *
     * @return the value of margin_order.real_buy_time
     *
     * @mbggenerated
     */
    public Date getRealBuyTime() {
        return realBuyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_buy_time
     *
     * @param realBuyTime the value for margin_order.real_buy_time
     *
     * @mbggenerated
     */
    public void setRealBuyTime(Date realBuyTime) {
        this.realBuyTime = realBuyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.real_sale_time
     *
     * @return the value of margin_order.real_sale_time
     *
     * @mbggenerated
     */
    public Date getRealSaleTime() {
        return realSaleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.real_sale_time
     *
     * @param realSaleTime the value for margin_order.real_sale_time
     *
     * @mbggenerated
     */
    public void setRealSaleTime(Date realSaleTime) {
        this.realSaleTime = realSaleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.latest_sale_date
     *
     * @return the value of margin_order.latest_sale_date
     *
     * @mbggenerated
     */
    public Date getLatestSaleDate() {
        return latestSaleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.latest_sale_date
     *
     * @param latestSaleDate the value for margin_order.latest_sale_date
     *
     * @mbggenerated
     */
    public void setLatestSaleDate(Date latestSaleDate) {
        this.latestSaleDate = latestSaleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.update_time
     *
     * @return the value of margin_order.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.update_time
     *
     * @param updateTime the value for margin_order.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column margin_order.status
     *
     * @return the value of margin_order.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column margin_order.status
     *
     * @param status the value for margin_order.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}