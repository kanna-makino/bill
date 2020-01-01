package com.bill.service;

import com.bill.controller.form.BudgetForm;

/**
 * 统计与预算。
 *
 * @author zhulongkun20@163.com
 * @since 2020/1/1 8:19 下午
 */
public interface BudgetService {

    /**
     * 获取指定年月的统计数据。
     *
     * @param uid   指定用户
     * @param year  指定年
     * @param month 指定月
     * @return 指定年月的数据。
     */
    BudgetForm prepareBudgetData(String uid, String year, String month);

}
