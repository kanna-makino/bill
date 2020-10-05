package com.bill.service.impl;

import com.bill.controller.form.BudgetForm;
import com.bill.po.BillContentPo;
import com.bill.po.BudgetPo;
import com.bill.repository.BillContentMapper;
import com.bill.repository.BudgetMapper;
import com.bill.service.BudgetService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    @Resource
    private BillContentMapper billContentMapper;

    @Override
    public BudgetForm prepareBudgetData(String uid, String yearParam, String monthParam) {
        BudgetForm budgetForm = new BudgetForm();
        int year = StringUtils.isEmpty(yearParam) ? new Date().getYear() : Integer.parseInt(yearParam);
        int month = StringUtils.isEmpty(monthParam) ? new Date().getYear() : Integer.parseInt(monthParam);
        budgetForm.setYear(String.valueOf(year));
        budgetForm.setMonth(String.valueOf(month));
        // 获取当月预算
        BudgetPo budgetPo = budgetMapper
                .selectByPrimaryKey(uid, String.valueOf(year), String.valueOf(month));
        if (budgetPo != null) {
            budgetForm.setBudget(budgetPo.getBudget());
        } else {
            budgetForm.setBudget(0.00);
        }
        // 指定月第一天
        LocalDate firstDay = LocalDate.of(year, month, 1);
        // 指定月最后一天
        LocalDate lastDay = firstDay.minusMonths(1).minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String startDate = formatter.format(firstDay);
        String endDate = formatter.format(lastDay);
        // 根据日期范围获取当月账单
        List<BillContentPo> billContentPoList = billContentMapper.selectByDateFromTo(startDate, endDate);
        if (CollectionUtils.isEmpty(billContentPoList)) {
            budgetForm.setConsumed(0.00);
            budgetForm.setRestAmount(budgetPo == null ? 0.00 : budgetPo.getBudget());
            budgetForm.setConsumedRate(0.00);
        } else {
            double consumedAmount = billContentPoList
                    .stream()
                    .mapToDouble(BillContentPo::getAmount)
                    .sum();
            budgetForm.setConsumed(consumedAmount);
            // 没有设置预算
            if (budgetPo == null) {
                budgetForm.setRestAmount(0.00);
            } else {
                double rest = budgetPo.getBudget() - consumedAmount;
                budgetForm.setRestAmount(rest > 0 ? rest : 0.00);
            }
        }
        budgetForm.setType2ConsumedMap(type2ConsumedMap(billContentPoList));


        return null;
    }

    private Map<String, Double> type2ConsumedMap(List<BillContentPo> billContentPoList) {
        Map<String, Double> resultMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(billContentPoList)) {
            List<String> types = new ArrayList<>();
            String type;
            double value;
            for (BillContentPo po : billContentPoList) {
                type = po.getBillType();
                if (types.contains(type)) {
                    value = resultMap.get(type) + po.getAmount();
                    resultMap.put(type, value);
                } else {
                    types.add(po.getBillType());
                    resultMap.put(type, po.getAmount());
                }
            }
        }
        return resultMap;
    }

    private List<Map<String, Double>> fiveMonthsStatList(String uid, String yearParam, String monthParam) {
        List<Map<String, Double>> result = new ArrayList<>();
        Map<String, Double> statMap = new HashMap<>();
        Date today = new Date();
        int year = StringUtils.isEmpty(yearParam) ? today.getYear() : Integer.parseInt(yearParam);
        int month = StringUtils.isEmpty(monthParam) ? today.getMonth() : Integer.parseInt(monthParam);
        LocalDate tempDate = LocalDate.of(year, month, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");


        return result;
    }
}
