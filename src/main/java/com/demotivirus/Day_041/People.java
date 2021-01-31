package com.demotivirus.Day_041;

import lombok.Data;
import lombok.NonNull;

@Data
public class People {
    @NonNull
    private String name;
    private Brain brain;
    private Wallet wallet;

    public People(){
        brain = new Brain();
        wallet = new Wallet();
    }

    public People(String name){
        this.name = name;
        brain = new Brain();
        wallet = new Wallet();
    }

    public PhoneNumber getPhoneNumber(People people){
        return brain.getPhoneNumber(people);
    }

    public PhoneNumber getPhoneNumber(String peopleName){
        return brain.getPhoneNumber(peopleName);
    }

    public void setPhoneNumber(People people, PhoneNumber phoneNumber){
        brain.setNewPhoneNumber(people, phoneNumber);
    }

    public void setSalary(Money money){
        wallet.setMoney(money);
    }

    public Money getMoney(){
        return wallet.getMoney();
    }
}
