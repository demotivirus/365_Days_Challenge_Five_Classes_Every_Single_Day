package com.demotivirus.Day_014.main;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void saveUser(User user);
}
