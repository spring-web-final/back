package com.dgut.controller;

import com.alibaba.fastjson.JSONObject;
import com.dgut.domain.Result;
import com.dgut.domain.ResultCode;
import com.dgut.domain.Worker;
import com.dgut.service.WorkerService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @Autowired
    WorkerService workerService;
    @Autowired
    Worker worker;

    @PostMapping("/register")
    @ResponseBody
    public Result register(@RequestBody JSONObject jsonObject){
        String name = jsonObject.get("name").toString();
        String account = jsonObject.get("account").toString();
        String password = jsonObject.get("password").toString();
        int temp = workerService.addWorker(name,account,password);
        worker = workerService.findById(temp);
        System.out.println(temp);
        System.out.println(worker);
        if(worker!=null)
            return new Result(ResultCode.SUCCESS,worker);
        else
            return new Result(ResultCode.FAIL,worker);
    }
}
