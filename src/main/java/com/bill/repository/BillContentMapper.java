package com.bill.repository;

import com.bill.po.BillContentPo;
import com.bill.po.condition.BillContentCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * 获取总记录数
     *
     * @return 数据量
     */
    int selectAllCount();

    /**
     * 根据账单编号获取一条账单
     *
     * @param billNo 账单编号
     * @return 账单实体
     */
    BillContentPo selectByBillNo(@Param("billNo") String billNo);

    /**
     * 分页获取账单数据。
     *
     * @param start 起始位置
     * @param size  每页数据量
     * @return 范围的账单。
     */
    List<BillContentPo> selectByPage(@Param("start") int start,
                                     @Param("size") int size);

    /**
     * 根据检索条件获取数据。
     *
     * @param billContentCondition 检索条件。
     * @return 符合条件的账单集合。
     */
    List<BillContentPo> selectByConditions(BillContentCondition billContentCondition);
}
