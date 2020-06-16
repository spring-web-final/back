package com.dgut.service.impl;

import com.dgut.domain.People;
import com.dgut.mapper.PeopleMapper;
import com.dgut.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Autowired
    private People user;

    @Override
    public List<People> findByName(String name) {
        return peopleMapper.findByName(name);
    }

    public int getCountByName(String name){
        return peopleMapper.getCountByName(name);
    }

    public People getUserByPhone(String phone){
        return peopleMapper.findByPhone(phone);
    }

    @Override
    public List<People> getUsersByTime(String time) {
        return peopleMapper.findByTime(time);
    }

    @Override
    public int getCountByTime(String time) {
        return peopleMapper.getCountByTime(time);
    }

    @Override
    public People addUser(People people) {
        peopleMapper.insertUser(people);
        int id = people.getId();
        user = peopleMapper.findById(id);
        return user;

    }
}
