package com.demotivirus.Day_004;

public class Main {
    public static void main(String[] args) {
        Home testHome = new Home();
        People people = new People();
        Animal animal = new Animal();

        testHome.add(people, 20);
        System.out.println(testHome);
        testHome.add(animal, 30);
        System.out.println(testHome);

        testHome.add(people, 21);
        testHome.add(people, 20);
        System.out.println(testHome);

        testHome.out(people);
        System.out.println(testHome);
        testHome.out(people, 9);
        System.out.println(testHome);
    }
}
