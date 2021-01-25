package com.demotivirus.Day_035.main;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class User_Roles {
//    List<Users> users;
//    List<Roles> roles;
    Map<Users, Roles> users;

    public User_Roles() {
        checkInit();
    }

    public User_Roles(Users user, Roles role){
        checkInit();
        users.put(user, role);
    }

    public User_Roles(Roles role, Users user){
        checkInit();
        users.put(user, role);
    }

    public Roles getUserRole(Users user){
        return users.get(user);
    }

    private void checkInit(){
        if (users == null)
            users = new HashMap<>();
    }
}
