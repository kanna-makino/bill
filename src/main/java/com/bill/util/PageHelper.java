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
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getTotalPage() {
        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
        return totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public boolean isFirstPage() {
        return currentPage == 1;
    }

    public boolean isLastPage() {
        return currentPage == getTotalPage();
    }

    public boolean hasPreviousPage() {
        return !isFirstPage();
    }

    public boolean hasNextPage() {
        return !isLastPage();
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
