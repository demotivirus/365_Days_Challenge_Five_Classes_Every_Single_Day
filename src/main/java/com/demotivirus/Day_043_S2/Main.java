package com.demotivirus.Day_043_S2;

public class Main {
    public static void main(String[] args) {
        Airport monaco = new Airport("Monaco");
        Airport argentina = new Airport("Argentina");
        Fly fly = new Fly(923423883L);

        Dispatcher dispatcher = new Dispatcher();
        System.out.println(dispatcher.getDistance(monaco, argentina));
        fly.fly(dispatcher.getDistance(monaco, argentina));
    }
}
