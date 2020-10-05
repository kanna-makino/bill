package com.bill.controller.form;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 预算与统计用数据传输类。
 *
 * @author zhulongkun20@163.com
 * @since 2020/1/1 8:19 下午
 */
@Data
public class BudgetForm {

    /* 年份 */
    private String year;

    /* 月份 */
    private String month;

    /* 本月预算 */
    private Double budget;

    /* 本月已消费金额 */
    private Double consumed;

    /* 本月余额 */
    private Double restAmount;

    /* 本月余额占总预算比率 */
    private Double consumedRate;

    /* 本月消费金额按类别统计 */
    private Map<String, Double> type2ConsumedMap;

    /* 过去5个月消费金额与当月预算比较情况 */
    private List<Map<String, Double>> fiveMonthsStatList;

}
