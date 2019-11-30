package com.example.mybatisplus.demo.model;

/**
 * @Author wuwei
 * @Date 2019/11/28 10:52 下午
 */
public class ResultPage<T> {
    private T data;
    private int pageNo;
    private int pageSize;
    private int allPages;

    public ResultPage(T data, int pageNo, int pageSize, int allPages) {
        this.data = data;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.allPages = allPages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getAllPages() {
        return allPages;
    }

    public void setAllPages(int allPages) {
        this.allPages = allPages;
    }
}
