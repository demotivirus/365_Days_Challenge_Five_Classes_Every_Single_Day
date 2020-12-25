package com.demotivirus.Day_004;

import lombok.Data;

@Data
public class Home {
    private int maxCapacity = 100;
    private int nowCapacity = maxCapacity;

    public void add(Sizable sizable, int nums){
        int capacity = getSizeVar(sizable, nums);
        if (capacity <= maxCapacity && capacity <= nowCapacity)
            nowCapacity -= capacity;
        else println("Too many peoples... Retry");
    }

    public void out(Sizable sizable, int nums){
        nowCapacityOut(sizable, nums);
    }

    public void out(Sizable sizable){
        nowCapacityOut(sizable);
    }

    private int getSizeVar(Sizable sizable, int nums){
        return sizable.getSize() * nums;
    }

    private void nowCapacityOut(Sizable sizable){
        nowCapacity += sizable.getSize();
    }

    private void nowCapacityOut(Sizable sizable, int nums){
        nowCapacity += sizable.getSize() * nums;
    }

    private void println(String str){
        System.out.println(str);
    }
}
