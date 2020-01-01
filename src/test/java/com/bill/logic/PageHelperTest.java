package com.bill.logic;

import com.alibaba.fastjson.JSONObject;
import com.bill.util.PageHelper;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试一下分页类逻辑是否正确。
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/31 10:57 下午
 */
@Slf4j
public class PageHelperTest {
    public void testPageHelper() {
        int currentPage = 1;
        int pageSize = 20;
        int totalCount = 198;
        List<String> dataList = new ArrayList<>();
        for (int i = 0; i < totalCount; i++) {
            dataList.add("data no." + i);
        }

        PageHelper<String> pageHelper = new PageHelper<>(currentPage, pageSize, totalCount, dataList);

        String objStr = JSONObject.toJSONString(pageHelper);

//        log.info("currentPage: " + pageHelper.getCurrentPage());
//        log.info("pageSize: " + pageHelper.getPageSize());
//        log.info("totalPage: " + pageHelper.getTotalPage());
//        log.info("totalCount: " + pageHelper.getTotalCount());
//        log.info("dataList: " + pageHelper.getDataList());
//        log.info("isFirstPage: " + pageHelper.isFirstPage());
//        log.info("isLastPage: " + pageHelper.isLastPage());
//        log.info("hasPreviousPage: " + pageHelper.hasPreviousPage());
//        log.info("hasNextPage: " + pageHelper.hasNextPage());

        log.info("currentPage: " + pageHelper.getCurrentPage());
        log.info("pageSize: " + pageHelper.getPageSize());
        log.info("totalPage: " + pageHelper.getTotalPage());
        log.info("totalCount: " + pageHelper.getTotalCount());
        log.info("dataList: " + pageHelper.getDataList());
        log.info("isFirstPage: " + pageHelper.isFirstPage());
        log.info("isLastPage: " + pageHelper.isLastPage());
        log.info("hasPreviousPage: " + pageHelper.isHasPreviousPage());
        log.info("hasNextPage: " + pageHelper.isHasNextPage());
        log.info("json string: " + objStr);
    }

    public static void main(String[] args) {
        new PageHelperTest().testPageHelper();
    }
}
