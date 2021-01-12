package com.demotivirus.Day_022;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Room {
    @NonNull
    private int roomNumber;
    private List<Human> humans;

    public void goToRoom(Human human){
        if (humans == null)
            humans = new ArrayList<>();
        humans.add(human);
        System.out.println(human + " in room " + roomNumber);
    }

    public void outToRoom(Human human){
        if (humans == null)
            humans = new ArrayList<>();
        if (humans.isEmpty())
            System.out.println("Room is empty");

        Iterator iterator = humans.iterator();

        while (iterator.hasNext()) {
            Human element = (Human) iterator.next();
            if (human.equals(element)) {
                iterator.remove();
                System.out.println(human + " out of room " + roomNumber);
            }
        }
    }
}
