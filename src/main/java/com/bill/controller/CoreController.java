package com.bill.controller;

import com.alibaba.fastjson.JSONObject;
import com.bill.common.ConstantValue;
import com.bill.po.BillContentPo;
import com.bill.po.UserPo;
import com.bill.service.BillContentService;
import com.bill.service.UserService;
import com.bill.util.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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
    public RedirectView doLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserPo userPo = new UserPo(username, password);
        RedirectView redirectView = new RedirectView();
        // 登录成功
        if (userService.doLogin(userPo)) {
            request.getSession().setAttribute(ConstantValue.USER_SESSION_KEY, userPo);
            request.getSession().setAttribute("username", userPo.getUsername());
            redirectView.setContextRelative(true);
            redirectView.setUrl("billContent.do");
        } else {
            // 登录失败
            redirectView.addStaticAttribute("errorMsg", "用户名或密码错误。");
            redirectView.setUrl("returnToLogin.do");
        }
        return redirectView;
    }

    @RequestMapping(value = "returnToLogin.do")
    public ModelAndView toLogin(RedirectView redirectView) {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> attributesMap = redirectView.getAttributesMap();
        String errorMsg = (String) attributesMap.get("errorMsg");
        modelAndView.addObject("errorMsg", errorMsg);
        modelAndView.addObject("failedFlg", "1");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "billContent.do")
    public ModelAndView getBillConent(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        String pageParam = request.getParameter("page");
        String sizeParam = request.getParameter("size");
        int page = StringUtils.isEmpty(pageParam) ? 1 : Integer.parseInt(pageParam);
        int size = StringUtils.isEmpty(sizeParam) ? ConstantValue.PAGE_SIZE : Integer.parseInt(sizeParam);
        PageHelper<BillContentPo> pageHelper = billContentService.prepareBillContent(page, size);
        modelAndView.addObject("username", request.getSession().getAttribute("username"));
        modelAndView.addObject("pageHelper", pageHelper);
        modelAndView.setViewName("main_bill_content");
        return modelAndView;
    }

    @RequestMapping(value = "budget.do")
    public ModelAndView getBillType(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main_budget");
        return modelAndView;
    }
}
