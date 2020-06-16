package com.dgut.controller;

import com.alibaba.fastjson.JSONObject;
import com.dgut.domain.People;
import com.dgut.domain.Result;
import com.dgut.domain.ResultCode;
import com.dgut.service.UsersService;
import com.dgut.utils.PageResult;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/users",method = {RequestMethod.POST, RequestMethod.GET})
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private People user;

    @GetMapping("/getList/name")
    @ResponseBody
    public Result getUsersByName(@RequestParam("name") String name){
        List<People> users = usersService.findByName(name);
        int total = usersService.getCountByName(name);
        PageResult<People> pr = new PageResult<>(total,users);
        System.out.println(name);
        return new Result(ResultCode.SUCCESS,pr);
    }

    @GetMapping("/getList/phone")
    @ResponseBody
    public Result getUserByPhone(@RequestParam("phone")String phone){
        People people = usersService.getUserByPhone(phone);
        return new Result(ResultCode.SUCCESS,people);
    }


    @GetMapping("/getList/time")
    @ResponseBody
    public Result  getUserByTime(@RequestParam("time")String time){
        time = time.replace("-","");
        List<People> users = usersService.getUsersByTime(time);
        int total = usersService.getCountByTime(time);
        PageResult<People> pr = new PageResult<>(total,users);
        System.out.println(time);
        return new Result(ResultCode.SUCCESS,pr);
    }

    @PostMapping("/add")
    @ResponseBody
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Result addUser(@RequestBody People people){
        user = usersService.addUser(people);
        return new Result(ResultCode.SUCCESS,user);
    }


}
