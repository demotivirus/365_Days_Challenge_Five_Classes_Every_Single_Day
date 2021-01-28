package com.demotivirus.Day_038;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Dragon")
                .shirtColors(Shirt.GREEN)
                .shirtColors(Clothes.Shirt.BLACK)
                .shirtColors(Shirt.BLUE)
                .build();

        System.out.println(person);
    }
}
