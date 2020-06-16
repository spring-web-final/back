package com.dgut.domain;


import org.springframework.stereotype.Component;

@Component
public class Login {

    private String account;
    private String module;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "Login{" +
                "account='" + account + '\'' +
                ", module='" + module + '\'' +
                '}';
    }
}
