package com.demotivirus.Day_043_S2;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Distance {
    private Map<String, Integer> distances;

    public Distance(){
        distances = new HashMap<>();
        init();
    }

    public void init(){
        distances.put("MonacoArgentina", 11_582_000);
        distances.put("ArgentinaMonaco", 11_582_000);
    }

    public int getDistance(Airport one, Airport two){
        String concat = one.getCity().concat(two.getCity());
        return distances.get(concat);
    }
}
