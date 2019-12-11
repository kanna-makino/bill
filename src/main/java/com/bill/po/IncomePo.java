package com.bill.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 收入实体类
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/8 2:04 下午
 */
@Data
public class IncomePo {

    // 收入编号
    private String incomeNo;

    // 用户id
    private String uid;

    // 收入日期
    private String incomeDate;

    // 收入类型
    private String incomeType;

    // 收入金额
    private BigDecimal amount;

    // 备注
    private String comment;

    // 记录创建日期
    private Date createTime;

    // 记录更新日期
    private Date updateTime;

    public IncomePo(String incomeNo, String uid, String incomeDate, String incomeType, BigDecimal amount,
                    String comment) {
        this.incomeNo = incomeNo;
        this.uid = uid;
        this.incomeDate = incomeDate;
        this.incomeType = incomeType;
        this.amount = amount;
        this.comment = comment;
    }

    public IncomePo(String incomeNo, String uid, String incomeDate, String incomeType, BigDecimal amount,
                    String comment, Date createTime, Date updateTime) {
        this.incomeNo = incomeNo;
        this.uid = uid;
        this.incomeDate = incomeDate;
        this.incomeType = incomeType;
        this.amount = amount;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
