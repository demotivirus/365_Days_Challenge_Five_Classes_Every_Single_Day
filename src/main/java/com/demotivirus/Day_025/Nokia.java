package com.demotivirus.Day_025;

public class Nokia implements Smartphone{
    @Override
    public void call(String voiceMessage) {
        System.out.println(voiceMessage + " voice from Nokia");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " message from Nokia");
    }
}
