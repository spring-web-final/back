package com.dgut.service.impl;

import com.dgut.domain.Worker;
import com.dgut.mapper.WorkerMapper;
import com.dgut.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerMapper workerMapper;

    @Autowired
    private Worker worker;

    @Override
    public List<Worker> findAllWorker() {
        return workerMapper.findAllWorker();
    }

    @Override
    public Worker findByAccount(String account) {
        return workerMapper.findByAccount(account);
    }

    @Override
    public int addWorker(String name, String account, String password) {
        worker.setAccount(account);
        worker.setName(name);
        worker.setPassword(password);
        workerMapper.addWorker(worker);
        return worker.getId();
    }

    @Override
    public Worker findById(int id) {
        return workerMapper.findById(id);
    }

    @Override
    public Worker findByAccountPassword(String account, String password) {
        return workerMapper.findByAccountPassword(account,password);
    }

    public int updatePassword(String account,String oldPassword,String newPassword){
        worker = workerMapper.findByAccount(account);
        int temp=0;
        if(worker!=null){
            temp = workerMapper.updatePassword(account,oldPassword,newPassword);
            return temp;
        }else {
            return 0;
        }
    }


}
