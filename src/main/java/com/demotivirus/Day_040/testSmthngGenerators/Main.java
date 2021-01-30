package com.demotivirus.Day_040.testSmthngGenerators;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        generator.generation(100);
        //NOT PARALLEL :(
        generator.checkAndPrintNumbers(3_000);
        generator.generation(1);
        generator.printNumbers();

        System.out.println("================================");

        Human elvis = new Human("Elvis");
        for (int i = 0; i < 10; i++) {
            elvis.playRandomSong();
        }
    }
}
