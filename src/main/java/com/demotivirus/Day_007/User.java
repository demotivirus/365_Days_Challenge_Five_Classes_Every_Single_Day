package com.demotivirus.Day_007;

import lombok.Data;

@Data
public class User extends Admin{
    private Role role;

    private User(String nick, String password, Role role) {
        super(nick, password, role);
    }

    public User(String nick, String password) {
        super(nick, password);
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "nick=" + getNick() +
                ", role=" + role +
                '}';
    }
}
