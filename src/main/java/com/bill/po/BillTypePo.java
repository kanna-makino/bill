package com.bill.po;

import lombok.Data;

import java.util.Date;

/**
 * 账单类型实体
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/8 4:40 下午
 */
@Data
public class BillTypePo {

    // 用户id
    private String uid;

    // 类型id
    private String typeId;

    // 类型名
    private String typeName;

    // 备注
    private String comment;

    // 记录创建时间
    private Date createTime;

    // 记录更新时间
    private Date updateTime;

    public BillTypePo(String uid, String typeId, String typeName, String comment) {
        this.uid = uid;
        this.typeId = typeId;
        this.typeName = typeName;
        this.comment = comment;
    }

    public BillTypePo(String uid, String typeId, String typeName, String comment, Date createTime,
                      Date updateTime) {
        this.uid = uid;
        this.typeId = typeId;
        this.typeName = typeName;
        this.comment = comment;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
