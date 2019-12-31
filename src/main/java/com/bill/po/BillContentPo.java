package com.bill.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 账单实体
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/8 4:42 下午
 */
@Data
public class BillContentPo {

    // 账单编号
    private String billNo;

    // 用户id
    private String uid;

    // 账单日期
    private String billDate;

    // 账单类型
    private String billType;

    // 支付方式
    private String payType;

    // 金额
    private BigDecimal amount;

    // 备注
    private String comment;

    // 记录创建时间
    private Date createTime;

    // 记录更新时间
    private Date updateTime;

    public BillContentPo(String billNo, String uid, String billDate, String billType, String payType,
                         BigDecimal amount, String comment) {
        this.billNo = billNo;
        this.uid = uid;
        this.billDate = billDate;
        this.billType = billType;
        this.payType = payType;
        this.amount = amount;
        this.comment = comment;
    }

    public BillContentPo(String billNo, String uid, String billDate, String billType, String payType,
                         BigDecimal amount, String comment, Date createTime, Date updateTime) {
        this.billNo = billNo;
        this.uid = uid;
        this.billDate = billDate;
        this.billType = billType;
        this.payType = payType;
        this.amount = amount;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
