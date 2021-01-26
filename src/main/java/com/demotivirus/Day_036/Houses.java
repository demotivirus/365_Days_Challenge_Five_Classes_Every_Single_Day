package com.demotivirus.Day_036;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Houses {
    private int houseNumber;
    private List<Users> users = new ArrayList<>();

    public void addUser(Users user){
        users.add(user);
    }
}
