package com.gbanker.core.activity.dao.mapper;

import com.gbanker.core.activity.dao.mapper.UserPassword;

public interface UserPasswordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    int insert(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    int insertSelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    UserPassword selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserPassword record);
}