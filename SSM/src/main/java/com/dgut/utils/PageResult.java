package com.dgut.utils;

import java.util.List;

public class PageResult<T> {

    private int total;
    private List<T> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageResult(int total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", data=" + data +
                '}';
    }
}
