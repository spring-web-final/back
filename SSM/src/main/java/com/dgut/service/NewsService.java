package com.dgut.service;

import com.dgut.domain.People;

import java.util.List;

public interface NewsService {

    public List<People> getRecords();
    public int getCount();
    public People findById(int id);

}
