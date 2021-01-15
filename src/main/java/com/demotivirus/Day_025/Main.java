package com.demotivirus.Day_025;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneFactory factory = new PhoneFactory();
        var lenovo = factory.createSmartphone("lenovo");
        lenovo.sendMessage("Hello, how are you?");
        var nokia = factory.createSmartphone("nokia");
        nokia.call("Bon jour");

        //var notFound = factory.createPhone("Siemens");

        var nokia2 = factory.createPhone("Nokia");
        nokia2.call("Hi, do you have a money?");

        var samsung = factory.createSmartphone("samsung");
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(r.nextInt(5000));
            samsung.sendMessage("Hello Angela where are you? A im so scary. Go home please");
        }

        NeuroPhone azumaru = factory.createNeuroPhone("Azumaru");
        azumaru.brainCall("I read your mind...");
    }
}
