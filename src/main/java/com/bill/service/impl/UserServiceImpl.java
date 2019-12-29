package com.bill.service.impl;

import com.bill.common.ConstantValue;
import com.bill.po.UserPo;
import com.bill.repository.UserMapper;
import com.bill.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.regex.Pattern;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:34 下午
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 不小于5个、不超过20个字母数字的组合。
     */
    public static final String PASSWORD_RULE = "^[a-zA-Z0-9]{5,20}";

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean isValidUser(UserPo userPo) {
        return userPo != null
                && userPo.getUid() != null
                && userPo.getUid().length() <= 13
                && userPo.getUsername() != null
                && userPo.getUsername().length() <= 20
                && userPo.getPassword() != null
                && Pattern.matches(userPo.getPassword(), PASSWORD_RULE)
                && ConstantValue.ACCOUNT_STATUS_NORMAL.equals(userPo.getStatus());
    }

    @Override
    public boolean doLogin(UserPo userPo) {
        if (userPo == null || userPo.getUid() == null || userPo.getPassword() == null) {
            return false;
        }
        UserPo storedUserInfo = userMapper.selectUserByUid(userPo.getUid());
        return storedUserInfo != null
                && storedUserInfo.getPassword() != null
                && storedUserInfo.getPassword().equals(userPo.getPassword())
                && ConstantValue.ACCOUNT_STATUS_NORMAL.equals(userPo.getStatus());
    }

}
