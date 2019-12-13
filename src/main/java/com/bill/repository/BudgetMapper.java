package com.bill.repository;

import com.bill.po.BudgetPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/13 9:26 下午
 */
@Mapper
public interface BudgetMapper {

    /**
     * 新增预算记录
     *
     * @param budgetPo 预算实体
     * @return 受影响条数
     */
    int insert(BudgetPo budgetPo);

    /**
     * 更新预算记录
     *
     * @param budgetPo 预算实体
     * @return 受影响条数
     */
    int update(BudgetPo budgetPo);

    /**
     * 根据主键获取预算一条记录
     *
     * @param uid   用户id
     * @param year  年份
     * @param month 月份
     * @return 一条预算实体
     */
    BudgetPo selectByPrimaryKey(@Param("uid") String uid,
                                @Param("year") String year,
                                @Param("month") String month);

}
