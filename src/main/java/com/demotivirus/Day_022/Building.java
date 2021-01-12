package com.demotivirus.Day_022;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Building {
    @NonNull
    private String typeOfBuilding;
    private List<Room> rooms;

    public void setRooms(int numsOfRums) {
        if (rooms == null)
            rooms = new ArrayList<>();
        for (int i = 0; i < numsOfRums; i++) {
            rooms.add(new Room(i));
        }
    }

    public Room getRoom(int roomNumber) {
        if (rooms == null || rooms.isEmpty())
            System.out.println("Rooms not found");
        for (Room r : rooms){
            if (r.getRoomNumber() == roomNumber)
                return r;
        }
        return null;
    }
}
