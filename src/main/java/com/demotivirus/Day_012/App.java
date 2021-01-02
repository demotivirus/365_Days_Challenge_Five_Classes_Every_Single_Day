package com.demotivirus.Day_012;

public class App {
    public static void main(String[] args) {
        Wood wood = new Wood(20);
        Rock rock = new Rock(13);
        Backpack myBackpack = new Backpack();

        myBackpack.add(wood);
        myBackpack.add(rock);

        myBackpack.showAllInventory();

        myBackpack.delete(rock);
        myBackpack.delete(wood, 6);

        myBackpack.add(wood, 18);
        myBackpack.add(new Rock(), 18);
        myBackpack.showAllInventory();
    }
}
