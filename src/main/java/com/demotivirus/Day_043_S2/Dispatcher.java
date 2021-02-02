package com.demotivirus.Day_043_S2;

import lombok.Data;

@Data
public class Dispatcher {
    private Distance distance;

    public Dispatcher(){
        distance = new Distance();
    }

    public int getDistance(Airport one, Airport two){
        return distance.getDistance(one, two);
    }
}
