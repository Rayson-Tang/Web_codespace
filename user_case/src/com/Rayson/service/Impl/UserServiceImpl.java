package com.Rayson.service.Impl;

import com.Rayson.dao.UserDao;
import com.Rayson.dao.impl.UserDaoImpl;
import com.Rayson.domain.User;
import com.Rayson.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.findAll();
        return users;
    }
}
