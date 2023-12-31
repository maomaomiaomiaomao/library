package com.gyk.dao;

import com.gyk.po.LendList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LendListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    void deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    void insert(LendList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    void insertSelective(LendList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    LendList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    void updateByPrimaryKeySelective(LendList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_list
     *
     * @mbggenerated Tue Mar 30 16:30:04 CST 2023
     */
    void updateByPrimaryKey(LendList record);

    /**
     * 查询所有借阅记录
     */
    List<LendList> queryLendListAll(LendList lendList);


    /**
     * 查询借阅阅时间线（一本书什么时候被借走过）
     */
    List<LendList> queryLookBookList(@Param("rid") Integer rid, @Param("bid") Integer bid);

    /**
     * 还书操作(正常还)
     */
    void updateLendListSubmit(LendList lendList);

}