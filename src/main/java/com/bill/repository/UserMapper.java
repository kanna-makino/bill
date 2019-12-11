package com.bill.repository;

import com.bill.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/7 4:33 下午
 */
@Mapper
public interface UserMapper {

    /**
     * 新增一个用户
     *
     * @param userPo 用户实体
     * @return 新增用户数
     */
    int insert(UserPo userPo);

    /**
     * 更新用户信息
     *
     * @param userPo 新的用户信息
     * @return 更新用户数
     */
    int update(UserPo userPo);

    /**
     * 按用户id获取用户信息
     *
     * @param uid 用户id
     * @return 用户id为uid的用户
     */
    UserPo selectUserByUid(@Param("uid") String uid);

    /**
     * 获取所有用户信息
     *
     * @return 所有用户信息
     */
    List<UserPo> getAllUsers();
}
