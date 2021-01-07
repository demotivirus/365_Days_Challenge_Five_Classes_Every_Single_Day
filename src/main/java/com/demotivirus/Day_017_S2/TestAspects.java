package com.demotivirus.Day_017_S2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestAspects {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserDao userDao = (UserDao) context.getBean("userDao");

        userDao.addUser("Silly");
        userDao.addUser("Mishel");
        System.out.println(userDao.getName());

        User user = new User("Iona", "9dmhd94ng");
        userDao.addUser(user);

        System.out.println("===============================");
        List<User> users = userDao.findAllUsers();
        //System.out.println(users);

        try {
            List<User> testThrowEx = userDao.findAllUsers(true);
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
