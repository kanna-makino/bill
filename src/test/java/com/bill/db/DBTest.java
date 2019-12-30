package com.bill.db;

import com.bill.po.BillTypePo;
import com.bill.po.UserPo;
import com.bill.repository.BillTypeMapper;
import com.bill.repository.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2019/12/8 5:11 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DBTest {

    private static final String UID = "U201912300002";
    private static final String USERNAME = "youyou-2608";
    private static final String PASSWORD = "root";

    @Resource
    private UserMapper userMapper;

    @Resource
    private BillTypeMapper billTypeMapper;

    @Test
    public void getAllUsersTest() {
        log.info(userMapper.getAllUsers().toString());
    }

    @Test
    public void selectUserByNameTest() {
        String username = "test1";
        UserPo userPo = userMapper.selectUserByName(username);
        log.info(userPo.toString());
    }

    @Test
    public void insertUserTest() {
        UserPo userPo = new UserPo("U201912300002", "youyou-2608", "root", "0");
//        userMapper.insert(userPo);
    }

    @Test
    public void insertBillTypeTest() {
        BillTypePo billTypePo = new BillTypePo(UID, "001",
                "吃喝", "主要记录吃饭之类的花销。");
        BillTypePo billTypePo1 = new BillTypePo(UID, "002",
                "交通", "主要记录交通出行类的花销。");
        BillTypePo billTypePo2 = new BillTypePo(UID, "003",
                "衣物", "主要记录买衣服方面的花销。");
        BillTypePo billTypePo3 = new BillTypePo(UID, "004",
                "电子产品", "主要记录电子产品相关的花销。");
        billTypeMapper.insert(billTypePo);
        billTypeMapper.insert(billTypePo1);
        billTypeMapper.insert(billTypePo2);
        billTypeMapper.insert(billTypePo3);
    }

    @Test
    public void selectAllBillTypeTest() {
        List<BillTypePo> billTypePos = billTypeMapper.selectBillTypeByUid(UID);
        if (CollectionUtils.isEmpty(billTypePos)) {
            billTypePos.forEach(billTypePo -> System.out.println(billTypePo.getComment()));
        }
    }
}
