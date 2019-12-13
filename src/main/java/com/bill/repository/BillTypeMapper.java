package com.bill.repository;

import com.bill.po.BillTypePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/13 9:11 下午
 */
@Mapper
public interface BillTypeMapper {

    /**
     * 新增账单分类
     *
     * @param billTypePo 账单分类实体
     * @return 受影响条数
     */
    int insert(BillTypePo billTypePo);

    /**
     * 更新账单分类信息
     *
     * @param billTypePo 账单分类信息
     * @return 受影响条数
     */
    int update(BillTypePo billTypePo);

    /**
     * 根据id获取账单分类信息
     *
     * @param typeId 账单分类id
     * @return 满足条件的记录
     */
    BillTypePo selectBillTypeByTypeId(@Param("typeId") String typeId);

    /**
     * 获取某个用户的账单分类
     *
     * @param uid 用户id
     * @return 某个用户的账单分类
     */
    List<BillTypePo> selectBillTypeByUid(@Param("uid") String uid);
}
