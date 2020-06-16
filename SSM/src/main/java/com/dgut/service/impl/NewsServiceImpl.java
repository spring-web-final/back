package com.dgut.service.impl;

import com.dgut.domain.People;
import com.dgut.mapper.PeopleMapper;
import com.dgut.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    PeopleMapper peopleMapper;

    @Override
    public List<People> getRecords() {
        return peopleMapper.getRecords();
    }

    @Override
    public int getCount() {
        return peopleMapper.getCount();
    }

    @Override
    public People findById(int id) {
        return peopleMapper.findById(id);
    }
}
