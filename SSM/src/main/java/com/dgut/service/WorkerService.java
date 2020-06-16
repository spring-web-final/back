package com.dgut.service;

import com.dgut.domain.Worker;

import java.util.List;

public interface WorkerService {

    public List<Worker>findAllWorker();
    public Worker findByAccount(String account);
    public int addWorker(String name,String account,String password);
    public Worker findById(int id);
    public Worker findByAccountPassword(String account,String password);
    public int updatePassword(String account,String oldPassword,String newPassword);
}
