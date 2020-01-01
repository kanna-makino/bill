package com.bill.service.impl;

import com.bill.common.ConstantValue;
import com.bill.po.BillContentPo;
import com.bill.repository.BillContentMapper;
import com.bill.service.BillContentService;
import com.bill.util.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账单数据处理类。
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/29 3:57 下午
 */
@Service
public class BillContentServceiImpl implements BillContentService {

    @Resource
    private BillContentMapper billContentMapper;

    @Override
    public PageHelper<BillContentPo> prepareBillContent(int page, int pageSize) {
        int pageParam = page;
        int size = pageSize;
        if (pageParam <= 0) {
            pageParam = 1;
        }
        if (size <= 0) {
            size = ConstantValue.PAGE_SIZE;
        }
        // size = 5
        // page: 1   start: 0~4
        // page: 2   start: 5~9
        // page: 3   start: 10~14
        int start = (pageParam - 1) * size;
        int totalCount = billContentMapper.selectAllCount();
        List<BillContentPo> billContentPoList = billContentMapper.selectByPage(start, size);
        return new PageHelper<BillContentPo>(pageParam, size, totalCount, billContentPoList);
    }
}
