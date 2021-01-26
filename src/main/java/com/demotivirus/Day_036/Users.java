package com.demotivirus.Day_036;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Users {
    @NonNull
    private String name;
    private List<Roles> roles = new ArrayList<>();

    public void addRole(Roles role){
        roles.add(role);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }
}
