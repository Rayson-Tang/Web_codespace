package com.Rayson.dao;

import com.Rayson.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
