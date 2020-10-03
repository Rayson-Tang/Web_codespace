package com.Rayson.service.impl;

import com.Rayson.dao.UserDao;
import com.Rayson.dao.impl.UserDaoImpl;
import com.Rayson.domain.User;
import com.Rayson.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
