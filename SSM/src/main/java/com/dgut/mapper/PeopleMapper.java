package com.dgut.mapper;

import com.dgut.domain.People;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PeopleMapper {

    public List<People> getRecords();
    public int getCount();
    public People findById(int id);
    public List<People>findByName(String name);
    public int getCountByName(String name);
    public People findByPhone(String phone);
    public List<People>findByTime(String time);
    public int getCountByTime(String Time);
    public int insertUser(People people);

}
