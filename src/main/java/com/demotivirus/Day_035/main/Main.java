package com.demotivirus.Day_035.main;

public class Main {
    public static void main(String[] args) {
        Roles role = new Roles("AGENT_RECRUIT");
        Users user = new Users("Hikmat");
        User_Roles user_roles = new User_Roles(role, user);
        System.out.println(user_roles.toString());
        System.out.println(user.getName() + " role is " + user_roles.getUserRole(user).getRoleName());
    }
}
