package com.demotivirus.Day_014.main;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void saveUser(User user);
    User getUser(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
}
