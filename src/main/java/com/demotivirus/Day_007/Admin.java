package com.demotivirus.Day_007;

import lombok.Data;
import lombok.NonNull;

@Data
public class Admin{
    @NonNull
    private String nick;

    @NonNull
    private String password;

    @NonNull
    private Role role;

    public Admin(String nick, String password, Role role) {
        this.nick = nick;
        this.password = password;
        this.role = role;
    }

    public Admin(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public void setRole(User user, Role role){
        user.setRole(role);
    }

    //THIS METHOD NOT WORK CORRECTLY
    public void deleteUser(User user){
        System.out.println(nick + " УДАЛИЛ ПОЛЬЗОВАТЕЛЯ " + user);
        user.setNick("null");
        user.setRole(Role.NONE);
    }
}
