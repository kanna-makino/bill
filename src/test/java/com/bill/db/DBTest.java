package com.bill.db;

import com.bill.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/8 5:11 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DBTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void getAllUsersTest() {
        log.info(userMapper.getAllUsers().toString());
    }
}
