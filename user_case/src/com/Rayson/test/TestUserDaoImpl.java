package com.Rayson.test;

import com.Rayson.dao.UserDao;
import com.Rayson.dao.impl.UserDaoImpl;
import com.Rayson.domain.User;
import org.junit.Test;

import java.util.List;
public class TestUserDaoImpl {
    @Test
    public void userDaoImplTest() {
        UserDao dao = new UserDaoImpl();
        List<User> users = dao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
