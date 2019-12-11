package com.bill.controller;

import com.alibaba.fastjson.JSONArray;
import com.bill.po.UserPo;
import com.bill.repository.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 请求测试
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:24 下午
 */
@Controller
public class HomeController {

    @Resource
    private UserMapper userMapper;

    /**
     * 主页请求处理
     *
     * @return 跳转到主页
     */
    @RequestMapping(value = {"/", "/home"})
    @ResponseBody
    public String home() {
        return "Welcome 2019";
    }

    @RequestMapping(value = "/getAllUsers.do")
    @ResponseBody
    public String getAllUsers() {
        List<UserPo> userPos = userMapper.getAllUsers();
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(userPos);
        return jsonArray.toJSONString();
    }
}
