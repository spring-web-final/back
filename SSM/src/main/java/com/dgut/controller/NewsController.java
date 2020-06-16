package com.dgut.controller;

import com.dgut.domain.People;
import com.dgut.domain.Result;
import com.dgut.domain.ResultCode;
import com.dgut.service.NewsService;
import com.dgut.service.WorkerService;
import com.dgut.utils.PageResult;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/news",method = {RequestMethod.POST, RequestMethod.GET})
public class NewsController {

    @Autowired
    NewsService newsService;

    @Autowired
    People people;


    @PostMapping("/getList")
    @ResponseBody
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Result getPeoples(){
        List<People> records = newsService.getRecords();
        int total = newsService.getCount();
//        int total = 4;
        PageResult<People> pr = new PageResult<>(total,records);
        return new Result(ResultCode.SUCCESS,pr);
    }

    @GetMapping("/getUser")
    @ResponseBody
    public Result findById(@RequestParam("id")int id){
        people = newsService.findById(id);
        if (people!=null)
            return new Result(ResultCode.SUCCESS,people);
        else
            return new Result(ResultCode.FAIL,people);
    }
}
