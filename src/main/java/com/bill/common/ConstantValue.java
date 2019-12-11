package com.bill.common;

import java.util.Arrays;
import java.util.List;

/**
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
}
