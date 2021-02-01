package com.demotivirus.Day_042;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Places {
    private static List<String> places = new ArrayList<>();

    public static List init(){
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }
}
