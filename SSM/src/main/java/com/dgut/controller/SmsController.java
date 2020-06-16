package com.dgut.controller;

import com.dgut.domain.Login;
import com.dgut.domain.Sms;
import com.dgut.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SmsController {

    @Autowired
    public SmsService smsService;
    @RequestMapping("/getSms")
    @ResponseBody
    public Sms getSms(@RequestBody(required = false)Login log){
        System.out.println(log);
        return smsService.findByAccount(log.getAccount());
    }

}
