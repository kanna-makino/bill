package com.bill.controller;

import com.bill.common.ConstantValue;
import com.bill.po.UserPo;
import com.bill.service.BillContentService;
import com.bill.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户相关操作API。
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/29 2:20 下午
 */
@Controller
public class CoreController {

    @Resource
    private UserService userService;

    @Resource
    private BillContentService billContentService;

    @RequestMapping(value = "/login.do")
    public ModelAndView doLogin(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserPo userPo = new UserPo(username, password);
        // 登录成功
        if (userService.doLogin(userPo)) {
            request.getSession().setAttribute(ConstantValue.USER_SESSION_KEY, userPo);
            modelAndView.addObject("dataList", billContentService.prepareBillContent(0, 0));
            modelAndView.setViewName("main_bill_content");
        } else {
            // 登录失败
            modelAndView.addObject("errorMsg", "用户名或密码错误。");
            modelAndView.setViewName("failed");
        }
        return modelAndView;
    }
}
