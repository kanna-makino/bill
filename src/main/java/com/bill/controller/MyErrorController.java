package com.bill.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhulongkun20@163.com
 * @since 2020/1/1 12:52 下午
 */
@Controller
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        //获取statusCode:401,404,500
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == 404) {
            return "/404";
        } else if (statusCode == 403) {
            return "/403";
        } else {
            return "/500";
        }
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
