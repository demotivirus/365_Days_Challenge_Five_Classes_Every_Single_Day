package com.demotivirus.Day_029;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class Ship {
    private List<Human> humans = new ArrayList<>();

    public void addHuman(Human human){
        humans.add(human);
    }

    public int getNumOfHumans(){
        return humans.size();
    }

    public Human getHuman(String name){
        for (Human h : humans){
            if (h.getName().equals(name))
                return h;
        }
        return new Human("NOT FOUND");
    }
}
