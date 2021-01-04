package com.demotivirus.Day_014.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    @Transactional
    public List<User> getUsers(){
        return userDao.getUsers();
    }
}
