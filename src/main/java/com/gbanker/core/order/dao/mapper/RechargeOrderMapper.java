package com.gbanker.core.order.dao.mapper;

import com.gbanker.core.order.dao.entity.RechargeOrder;

public interface RechargeOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    int insert(RechargeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    int insertSelective(RechargeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    RechargeOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RechargeOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RechargeOrder record);
}