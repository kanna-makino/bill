package com.bill.util;

import lombok.Data;

import java.util.List;

/**
 * 分页工具类，根据传进来的currentPage, pageSize, totalCount, List<T> dataList
 * 进行分页，获取分页相关数据项。
 *
 * @author zhulongkun20@163.com
 * @since 2019/12/29 4:01 下午
 */
@Data
public class PageHelper<T> {
    // 当前页码
    private int currentPage;
    // 每页数据量
    private int pageSize;
    // 总页数
    private int totalPage;
    // 总数据量
    private int totalCount;
    // 返回数据
    private List<T> dataList;
    // 是否为第一页
    private boolean isFirstPage;
    // 是否是最后一页
    private boolean isLastPage;
    // 是否有前一页
    private boolean hasPreviousPage;
    // 是否有后一页
    private boolean hasNextPage;

    public PageHelper(int page, int pageSize, int totalCount, List<T> dataList) {
        this.currentPage = page;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.dataList = dataList;

        if (totalCount % pageSize == 0) {
            this.totalPage = totalCount / pageSize;
        } else {
            this.totalPage = totalCount / pageSize + 1;
        }

        this.isFirstPage = (currentPage == 1);

        this.isLastPage = (currentPage == totalPage);

        this.hasNextPage = !isLastPage;

        this.hasPreviousPage = !isFirstPage;
    }
}
