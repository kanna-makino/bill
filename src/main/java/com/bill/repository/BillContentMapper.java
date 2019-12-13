package com.bill.repository;

import com.bill.po.BillContentPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/13 8:56 下午
 */
@Mapper
public interface BillContentMapper {

    /**
     * 新增一条账单记录
     *
     * @param billContentPo 账单实体
     * @return 受影响条数
     */
    int insert(BillContentPo billContentPo);

    /**
     * 修改一条账单信息
     *
     * @param billContentPo 修改信息
     * @return 受影响条数
     */
    int update(BillContentPo billContentPo);

    /**
     * 根据账单编号获取一条账单
     *
     * @param billNo 账单编号
     * @return 账单实体
     */
    BillContentPo selectByBillNo(@Param("billNo") String billNo);
}
