package com.bill.po;

import lombok.Data;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:32 下午
 */
@Data
public class UserPo {

    // 13位用户id
    private String uid;

    // 用户名
    private String username;

    // 登录密码
    private String password;

    // 账户状态
    private String status;

    // 记录创建时间
    private Date createTime;

    // 记录更新时间
    private Date updateTime;

    public UserPo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserPo(String uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public UserPo(String uid, String username, String password, String status) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public UserPo(String uid, String username, String password, String status, Date createTime, Date updateTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

}
