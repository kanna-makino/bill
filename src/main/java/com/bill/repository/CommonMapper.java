package com.bill.repository;

import com.bill.po.CommonPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/13 9:36 下午
 */
@Mapper
public interface CommonMapper {

    /**
     * 根据code id和code value获取通用设置
     *
     * @param codeId    code id
     * @param codeValue code value
     * @return 指定条件的通用设置
     */
    CommonPo selectByCodeIdAndCodeVal(@Param("codeId") String codeId,
                                      @Param("codeValue") String codeValue);
}
