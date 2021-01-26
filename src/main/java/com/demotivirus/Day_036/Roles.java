package com.demotivirus.Day_036;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Roles {
    @NonNull
    private String name;
    private List<Users> users = new ArrayList<>();

    public void addUser(Users user){
        users.add(user);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                '}';
    }
}
