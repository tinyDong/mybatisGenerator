package com.gbanker.core.order.dao.mapper;

import com.gbanker.core.order.dao.entity.MarginOrder;

public interface MarginOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    int insert(MarginOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    int insertSelective(MarginOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    MarginOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MarginOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table margin_order
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MarginOrder record);
}