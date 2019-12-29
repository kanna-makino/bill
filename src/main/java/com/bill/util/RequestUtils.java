package com.bill.util;

import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/14 2:02 下午
 */
public class RequestUtils {

    /**
     * 返回字符串,删除了首尾空格,如果不存在则返回null
     *
     * @param request http request
     * @param key     key
     * @return value when it exists otherwise null
     */
    public static String getString(HttpServletRequest request, String key) {
        String value = request.getParameter(key);
        if (!StringUtils.isEmpty(value)) {
            return StringUtils.trimAllWhitespace(value);
        }
        return value;
    }
}
