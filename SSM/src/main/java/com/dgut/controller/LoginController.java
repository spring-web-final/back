package com.dgut.controller;

import com.alibaba.fastjson.JSONObject;
import com.dgut.domain.Result;
import com.dgut.domain.ResultCode;
import com.dgut.domain.Worker;
import com.dgut.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    WorkerService workerService;
    @Autowired
    Worker worker;

    @PostMapping("/login")
    @ResponseBody
    public Result login(@RequestBody JSONObject jsonObject){
        String account = jsonObject.get("account").toString();
        String password = jsonObject.get("password").toString();
        worker = workerService.findByAccountPassword(account,password);
        if(worker!=null)
            return new Result(ResultCode.SUCCESS,worker);
        else
            return new Result(ResultCode.FAIL,worker);
    }

    @PutMapping("/update")
    @ResponseBody
    public Result update(@RequestBody JSONObject jsonObject){
        String account = jsonObject.get("account").toString();
        String old_password = jsonObject.get("old_password").toString();
        String new_password = jsonObject.get("new_password").toString();
        int temp=workerService.updatePassword(account,old_password,new_password);
        worker = workerService.findByAccount(account);
        if(temp==1){
            return new Result(ResultCode.SUCCESS,worker);
        }else {
            return new Result(ResultCode.FAIL,worker);
        }
    }
}
