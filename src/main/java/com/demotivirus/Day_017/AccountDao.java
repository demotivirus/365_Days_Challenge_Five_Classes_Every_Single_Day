package com.demotivirus.Day_017;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
    public void addAccount(){
        System.out.println(getClass() + ": IN DB ADD ACCOUNT");
    }

    public void addSomething(){
        System.out.println("DONE");
    }

    public void addAccount(Account account){
        System.out.println("ADD ACCOUNT IN DB");
    }

    public void addAccount(Account account, boolean flag){
        System.out.println("ADD ACCOUNT ID DB WITH 2 PARAMETER");
    }
}
