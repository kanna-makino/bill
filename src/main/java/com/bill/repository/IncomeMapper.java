package com.bill.repository;

import com.bill.po.IncomePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/11 9:11 下午
 */
@Mapper
public interface IncomeMapper {

    /**
     * 新增收入信息
     *
     * @param incomePo 收入实体
     * @return 新增收入数量
     */
    int insert(IncomePo incomePo);

    /**
     * 更新收入记录
     *
     * @param incomePo 收入实体
     * @return 受影响条数
     */
    int update(IncomePo incomePo);

    /**
     * 根据收入编号获取收入记录
     *
     * @param incomeNo 收入记录编号
     * @return 指定编号的收入记录
     */
    IncomePo selectIncomeByNo(@Param("incomeNo") String incomeNo);

    /**
     * 获取所有的收入记录
     *
     * @return 所有的收入记录
     */
    List<IncomePo> getAllIncomes();
}
