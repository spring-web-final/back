package com.dgut.mapper;

import com.dgut.domain.Worker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerMapper {

    public List<Worker> findAllWorker();
    public Worker findByAccount(String account);
    public int addWorker(Worker worker);
    public Worker findById(int id);
    public Worker findByAccountPassword(String account,String password);
    public int updatePassword(String account,String oldPassword,String newPassword);

}
