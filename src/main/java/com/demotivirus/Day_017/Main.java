package com.demotivirus.Day_017;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AccountAopConfig.class);
        AccountDao accountDao = (AccountDao) context.getBean("accountDao");
        MembershipDao membershipDao = (MembershipDao) context.getBean("membershipDao");

        accountDao.addAccount();
        accountDao.addAccount();
        accountDao.addSomething();
        membershipDao.addAccount();

        membershipDao.getAccount();

        accountDao.addAccount(new Account());
        accountDao.addAccount(new Account(), false);
        context.close();
    }
}
