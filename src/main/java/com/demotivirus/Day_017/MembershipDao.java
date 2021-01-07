package com.demotivirus.Day_017;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDao {
    public void addAccount(){
        System.out.println("Add account in " + getClass());
    }

    public String getAccount(){
        return "done";
    }
}
