package com.bill.util;

import lombok.Data;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/14 2:05 下午
 */
@Data
public class ResponseVO<T> {

    private Integer code;

    private String msg;

    private List<T> data;

}
