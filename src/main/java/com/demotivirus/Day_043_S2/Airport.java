package com.demotivirus.Day_043_S2;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Airport {
    @NonNull
    private String city;
    private List<Fly> flies = new ArrayList<>();

    public void addFly(Fly fly){
        flies.add(fly);
    }
}
