package com.gbanker.core.order.dao.mapper;

import com.gbanker.core.order.dao.entity.RechargeOnlineOrder;

public interface RechargeOnlineOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    int insert(RechargeOnlineOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    int insertSelective(RechargeOnlineOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    RechargeOnlineOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RechargeOnlineOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_online_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RechargeOnlineOrder record);
}