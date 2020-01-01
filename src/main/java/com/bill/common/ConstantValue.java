package com.bill.common;

import java.util.Arrays;
import java.util.List;

/**
 * 系统常量。
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/8 4:53 下午
 */
public final class ConstantValue {

    // 未删除
    public static final Integer DELETE_FLAG_DEL = 1;

    // 已被删除
    public static final Integer DELETE_FLAG_NOT_DEL = 0;


    // 数据库名称
    public static final String DB_NAME = "i_bill";

    // 表名称集合
    public static final List<String> DB_TABLES = Arrays
            .asList("user", "income", "common", "budget", "bill_type", "bill_content");


    // 账户状态 = 正常
    public static final String ACCOUNT_STATUS_NORMAL = "0";

    // 账户状态 = 异常
    public static final String ACCOUNT_STATUS_ABNORMAL = "1";


    // 当前登录用户session-key
    public static final String USER_SESSION_KEY = "loginUser";


    // 每一页数据量
    public static final Integer PAGE_SIZE = 10;


    // 支付类型
    public static final String PAY_TYPE_CODE_ID = "0001";


    // 根据所剩余额显示不同颜色的进度条
    public static final String DEFAULT_COLOR = "progress-bar-success";

    public static final String WARNING_COLOR = "progress-bar-warning";

    public static final String DANGET_COLOR = "progress-bar-danger";

}
