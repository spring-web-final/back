package com.dgut.domain;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Component;



public class Result {

    private int resCode;
    private String message;
    private Object data;

    public Result(ResultCode code){
        this.message = code.message;
        this.resCode = code.resCode;
    }

    public Result(ResultCode code,Object data){
        this.resCode = code.resCode;
        this.message = code.message;
        this.data = data;
    }

    public Result(int resCode,String message){
        this.resCode = resCode;
        this.message = message;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resCode=" + resCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
