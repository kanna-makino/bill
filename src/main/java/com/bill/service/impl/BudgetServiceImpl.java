package com.bill.service.impl;

import com.bill.controller.form.BudgetForm;
import com.bill.po.BudgetPo;
import com.bill.repository.BudgetMapper;
import com.bill.service.BudgetService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 预算与统计服务。
 *
 * @author zhulongkun20@163.com
 * @since 2020/1/1 8:33 下午
 */
@Service
public class BudgetServiceImpl implements BudgetService {

    @Resource
    private BudgetMapper budgetMapper;


    @Override
    public BudgetForm prepareBudgetData(String uid, String yearParam, String monthParam) {
        int year = StringUtils.isEmpty(yearParam) ? new Date().getYear() : Integer.parseInt(yearParam);
        int month = StringUtils.isEmpty(monthParam) ? new Date().getYear() : Integer.parseInt(monthParam);

        // 获取当月预算
//        BudgetPo budgetPo = budgetMapper.selectByPrimaryKey(uid, , month);

        // 获取当月账单

        // 计算结果并返回

        return null;
    }
}
