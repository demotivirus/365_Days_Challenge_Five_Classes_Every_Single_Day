package com.demotivirus.Day_007;

public class Main {
    public static void main(String[] args) {
        User mike = new User("Mike777", "9929202ssdfs");
        Admin admin = new Admin("Admin", "2bxx8y82b,x2bx977s", Role.ADMIN);
        //mike.setRole(Role.ADMIN);
        System.out.println(mike);
        System.out.println(admin);
        admin.setRole(mike, Role.MODER);
        System.out.println(mike);

        Chat vk = new Chat();
        vk.printComment(mike, "Привет Мир)");

        Admin kaker = new Admin("Kaker", "777", Role.ADMIN);
        kaker.deleteUser(mike);
        System.out.println(mike);
        System.out.println("Your name = " + mike.getNick());
    }

    private static void testUser(){

    }
}
