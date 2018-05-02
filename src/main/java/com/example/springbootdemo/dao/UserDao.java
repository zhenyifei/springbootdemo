package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User user);
    public List<User> selectAll();
    public User selectById(int id);
}
