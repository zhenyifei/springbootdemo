package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.dep;

import java.util.List;

public interface DepDao {
    public List<dep> selectAll();
    public dep selectById(int id);
    public void insertDep(dep dep);

}
