package com.bill.db;

import com.bill.po.*;
import com.bill.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
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

    @Resource
    private IncomeMapper incomeMapper;

    @Resource
    private BillContentMapper billContentMapper;

    @Resource
    private BudgetMapper budgetMapper;

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
        BillTypePo billTypePo4 = new BillTypePo(UID, "01",
                "工资", "工资收入。");
        BillTypePo billTypePo5 = new BillTypePo(UID, "02",
                "网店收入", "网店营业收入。");
//        billTypeMapper.insert(billTypePo);
//        billTypeMapper.insert(billTypePo1);
//        billTypeMapper.insert(billTypePo2);
//        billTypeMapper.insert(billTypePo3);
        billTypeMapper.insert(billTypePo4);
        billTypeMapper.insert(billTypePo5);
    }

    @Test
    public void selectAllBillTypeTest() {
        List<BillTypePo> billTypePos = billTypeMapper.selectBillTypeByUid(UID);
        if (CollectionUtils.isEmpty(billTypePos)) {
            billTypePos.forEach(billTypePo -> System.out.println(billTypePo.getComment()));
        }
    }

    @Test
    public void insertIncomeTest() {
        IncomePo incomePo = new IncomePo("P201912310001", UID, "20191230",
                "01", new BigDecimal(1200), "12月份工资");
        IncomePo incomePo1 = new IncomePo("P201912310002", UID, "20191231",
                "02", new BigDecimal(1200), "12月份网店收入");
        incomeMapper.insert(incomePo);
        incomeMapper.insert(incomePo1);
    }

    @Test
    public void insertBillContentTest() {
        BillContentPo billContentPo = new BillContentPo("N201912310001", UID, "20191231",
                "001", "06", new BigDecimal(12), "中午食堂吃饭");
        BillContentPo billContentPo1 = new BillContentPo("N201912310002", UID, "20191230",
                "002", "05", new BigDecimal(4), "早晚坐公交");
        BillContentPo billContentPo2 = new BillContentPo("N201912310003", UID, "20191231",
                "004", "03", new BigDecimal(120), "树莓派配件：无刷电机，电调，桨叶，杜邦线，发光二极管");
        billContentMapper.insert(billContentPo);
        billContentMapper.insert(billContentPo1);
        billContentMapper.insert(billContentPo2);
    }

    @Test
    public void insertBudgetTest() {
        BudgetPo budgetPo = new BudgetPo(UID, "2019", "11",
                new BigDecimal(1800), 0);
        BudgetPo budgetPo1 = new BudgetPo(UID, "2019", "12",
                new BigDecimal(2000), 0);
        budgetMapper.insert(budgetPo);
        budgetMapper.insert(budgetPo1);
    }
}
