package com.Rayson.tset;

import com.Rayson.dao.UserDao;
import com.Rayson.dao.impl.UserDaoImpl;
import com.Rayson.domain.User;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void UserDaoImplTest(){
        UserDao userDao = new UserDaoImpl();
        List<User> users = userDao.findAll();
        for (User user:users)
        {
            System.out.println(user);
        }
    }
}
