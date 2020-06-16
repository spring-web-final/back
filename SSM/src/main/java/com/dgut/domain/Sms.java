package com.dgut.domain;

import org.springframework.stereotype.Component;

@Component
public class Sms {

   private int resCode;
   private Data data;
   private String message;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "resCode=" + resCode +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
