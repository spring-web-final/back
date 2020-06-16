package com.dgut.service;

import com.dgut.domain.Sms;

public interface SmsService {

    public Sms findByAccount(String account);
}
