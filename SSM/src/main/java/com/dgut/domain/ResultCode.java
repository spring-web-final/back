package com.dgut.domain;

import org.springframework.stereotype.Component;


public enum ResultCode {
    FAIL(1,"NO"),
    SUCCESS(0,"OK");



    int resCode;
    String message;

    ResultCode(int resCode,String message){
        this.message = message;
        this.resCode = resCode;
    }

    public int resCode(){
        return resCode;
    }

    public String message(){
        return message;
    }
}
