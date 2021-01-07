package com.demotivirus.Day_017_S2;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class UserDao {
    private String name;

    public void addUser(String userName){
        this.name = userName;
        System.out.println("Add new user: " + userName);
    }

    public void addUser(User user){
        System.out.println("Add new user: " + user);
    }

    public List<User> findAllUsers(){
        List<User> users = new ArrayList<>(){{
           add(new User("usdfsd", "dsfhsdfs"));
           add(new User("dsfsdfs", "iewber"));
           add(new User("oienbzo", "sdjbbsfz"));
        }};
        return users;
    }

    public List<User> findAllUsers(boolean throwEx){
        if(throwEx){
            throw new RuntimeException("No users here!!!");
        }
        return findAllUsers();
    }
}
