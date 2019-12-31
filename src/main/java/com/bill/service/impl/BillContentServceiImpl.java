package com.bill.service.impl;

import com.bill.common.ConstantValue;
import com.bill.po.BillContentPo;
import com.bill.repository.BillContentMapper;
import com.bill.repository.UserMapper;
import com.bill.service.BillContentService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
    public List<BillContentPo> prepareBillContent(int page, int pageSize) {
        int size = pageSize;
        if (size <= 0) {
            size = ConstantValue.PAGE_SIZE;
        }
        // size = 5
        // page: 1   start: 0~5
        // page: 2   start: 6~10
        // page: 3   start: 11~15
        int start = (page - 1) * pageSize + 1;
        return billContentMapper.selectByPage(start, size);
    }
}
