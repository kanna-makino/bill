package com.bill.service;

import com.bill.po.BillContentPo;
import com.bill.util.PageHelper;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/29 3:50 下午
 */
public interface BillContentService {

    /**
     * 分页加载账单数据。
     *
     * @param page     当前页码。
     * @param pageSize 每页数据量。
     * @return 指定页的账单数据。
     */
    PageHelper<BillContentPo> prepareBillContent(String uid, int page, int pageSize);

    /**
     * 新增数据
     *
     * @param billContentPo 账单实体
     */
    void createBillContent(BillContentPo billContentPo);
}
