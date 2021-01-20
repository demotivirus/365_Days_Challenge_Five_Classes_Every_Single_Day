package com.demotivirus.Day_030.main.service;

import com.demotivirus.Day_030.main.soap.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void init(){
        User peter = new User();
        peter.setName("Peter");
        peter.setUserId(1111);
        peter.setSalary(12000);

        User sam = new User();
        sam.setName("Sam");
        sam.setUserId(1112);
        sam.setSalary(32000);

        User ryan = new User();
        ryan.setName("Ryan");
        ryan.setUserId(1113);
        ryan.setSalary(16000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
    }

    public User getUser(String name){
        return users.get(name);
    }
}
