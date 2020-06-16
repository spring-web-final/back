package com.dgut.service.impl;

import com.dgut.domain.Data;
import com.dgut.domain.Sms;
import com.dgut.domain.Worker;
import com.dgut.mapper.WorkerMapper;
import com.dgut.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private WorkerMapper workerMapper;

    @Autowired
    private Worker worker;

    @Autowired
    private Sms sms;

    @Autowired
    private Data data;

    public int getCode(){
        int code = (int)((Math.random()*9+1)*10000);
        return code;
    }

    @Override
    public Sms findByAccount(String account) {
        worker = workerMapper.findByAccount(account);
//        data = new Data();
//        sms = new Sms();
//        int temp = getCode();
        if(worker!=null){
            data.setCode(getCode());
            sms.setResCode(0);
            sms.setMessage("OK");
            sms.setData(data);
        }else{
            data.setCode(getCode());
            sms.setResCode(1);
            sms.setMessage("OK");
            sms.setData(data);
        }
        return sms;
    }
}
