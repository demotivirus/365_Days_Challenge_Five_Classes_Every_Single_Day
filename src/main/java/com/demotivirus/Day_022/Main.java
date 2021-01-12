package com.demotivirus.Day_022;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Hotel");
        building.setRooms(10);
        System.out.println(building);

        Room room = building.getRoom(1);
        System.out.println(room);
        Room room1 = building.getRoom(1000);
        System.out.println(room1);

        Human joan = new Human("Joan");
        Human kail = new Human("Kail");
        System.out.println(joan);

        room.goToRoom(joan);
        System.out.println(room);
        room.goToRoom(kail);
        System.out.println(room);
        room.outToRoom(kail);
        System.out.println(room);
    }
}