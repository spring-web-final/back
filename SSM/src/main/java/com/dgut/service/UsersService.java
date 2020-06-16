package com.dgut.service;

import com.dgut.domain.People;
import com.dgut.domain.Worker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UsersService {

    public List<People>findByName(String name);
    public int getCountByName(String name);
    public People getUserByPhone(String phone);
    public List<People> getUsersByTime(String time);
    public int getCountByTime(String time);
    public People addUser(People people);
}
