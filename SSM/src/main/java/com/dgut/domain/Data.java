package com.dgut.domain;

import org.springframework.stereotype.Component;

@Component
public class Data {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Data{" +
                "code='" + code + '\'' +
                '}';
    }
}
