package com.demotivirus.Day_036;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Town {
    private String townName;
    private List<Houses> houses = new ArrayList<>();

    public void addHouse(Houses house){
        houses.add(house);
    }

    public int getNumOfPeoples(){
        int count = 0;
        for (Houses h : houses){
            count += h.getUsers().size();
        }
        return count;
    }
}
