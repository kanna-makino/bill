package com.bill.po.condition;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 主表数据检索条件。
 * <p>
 * 账单日期，包含范围检索
 * 账单类型
 * 支付方式
 * 消费金额，包含范围检索
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/31 11:25 下午
 */
@Data
public class BillContentCondition {

    /* 账单日期下限 */
    private String startDate;

    /* 账单日期上限 */
    private String endDate;

    /* 账单类型 */
    private String billType;

    /* 支付方式 */
    private String payType;

    /* 消费金额 */
    private BigDecimal amount;

    public BillContentCondition(String startDate, String endDate, String billType, String payType,
                                BigDecimal amount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.billType = billType;
        this.payType = payType;
        this.amount = amount;
    }
}
