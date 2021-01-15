package com.demotivirus.Day_025;

public class Lenovo implements Smartphone{
    @Override
    public void call(String voiceMessage) {
        System.out.println(voiceMessage + " Lenovo is best");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Lenovo service for you");
    }
}
