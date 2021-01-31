package com.demotivirus.Day_041;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class Brain {
    private Map<People, PhoneNumber> associations;
    private Map<String, PhoneNumber> associations2;

    public Brain(){
        associations = new HashMap<>();
        associations2 = new HashMap<>();
    }

    public PhoneNumber getPhoneNumber(People people){
        return associations.get(people);
    }

    public PhoneNumber getPhoneNumber(String peopleName){
        return associations2.get(peopleName);
    }

    public void setNewPhoneNumber(People people, PhoneNumber phoneNumber){
        associations.put(people, phoneNumber);
        associations2.put(people.getName(), phoneNumber);
    }
}
