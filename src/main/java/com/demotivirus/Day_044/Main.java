package com.demotivirus.Day_044;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new Document(new SerialNumber(new GeneticCode())));
        System.out.println(human);
        System.out.println(human.getGeneticCode());
    }
}
