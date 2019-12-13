package com.bill.po;

import lombok.Data;

import java.util.Date;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/8 2:13 下午
 */
@Data
public class CommonPo {

    private String codeId;

    private String value;

    private String codeName;

    private Integer deleteFlag;

    private Date createTime;

    private Date updateTime;

    public CommonPo(String codeId, String value, String codeName, Integer deleteFlag) {
        this.codeId = codeId;
        this.value = value;
        this.codeName = codeName;
        this.deleteFlag = deleteFlag;
    }

    public CommonPo(String codeId, String value, String codeName, Integer deleteFlag,
                    Date createTime, Date updateTime) {
        this.codeId = codeId;
        this.value = value;
        this.codeName = codeName;
        this.deleteFlag = deleteFlag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
