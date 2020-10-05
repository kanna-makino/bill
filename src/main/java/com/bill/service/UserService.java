package com.bill.service;

import com.bill.po.UserPo;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:34 下午
 */
public interface UserService {

    /**
     * 判断一个用户是否有效
     *
     * @param userPo 用户实体。
     * @return 正常:true  异常:false
     */
    boolean isValidUser(UserPo userPo);

    /**
     * 用户登录处理。
     *
     * @param userPo 用户输入的登录信息。
     * @return 登录成功:true 登录失败:false
     */
    boolean doLogin(UserPo userPo);

    /**
     * 获取所有用户信息
     *
     * @return 所有用户信息的集合
     */
    List<UserPo> getUsersInfo();
}
