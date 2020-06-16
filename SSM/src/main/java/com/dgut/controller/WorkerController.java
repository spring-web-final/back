package com.dgut.controller;

import com.dgut.domain.Worker;
import com.dgut.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/worker")/*具体自己定/worker*/
public class WorkerController {

    @Autowired
    public WorkerService workerService;

    @RequestMapping("/list")/*自己定*/
    @ResponseBody
    public List<Worker>list(){
        return workerService.findAllWorker();
    }


}
