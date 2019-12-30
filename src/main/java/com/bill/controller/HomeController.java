package com.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求测试
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:24 下午
 */
@Controller
public class HomeController {

    /**
     * 主页请求处理
     *
     * @return 跳转到主页
     */
    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "login";
    }

}
