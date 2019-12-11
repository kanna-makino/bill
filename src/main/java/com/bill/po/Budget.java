package com.bill.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 每月预算实体类
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/8 2:15 下午
 */
@Data
public class Budget {

    // 用户id
    private String uid;

    // 年 yyyy
    private String year;

    // 月 mm
    private String month;

    // 预算
    private BigDecimal budget;

    // 删除标识
    private Integer deleteFlag;

    // 记录创建时间
    private Date createTime;

    // 记录更新时间
    private Date updateTime;

    public Budget(String uid, String year, String month, BigDecimal budget, Integer deleteFlag) {
        this.uid = uid;
        this.year = year;
        this.month = month;
        this.budget = budget;
        this.deleteFlag = deleteFlag;
    }

    public Budget(String uid, String year, String month, BigDecimal budget, Integer deleteFlag,
                  Date createTime, Date updateTime) {
        this.uid = uid;
        this.year = year;
        this.month = month;
        this.budget = budget;
        this.deleteFlag = deleteFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
