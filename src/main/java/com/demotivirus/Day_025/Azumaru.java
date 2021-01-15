package com.demotivirus.Day_025;

public class Azumaru implements NeuroPhone{
    @Override
    public void brainCall(String message) {
        System.out.println(message + " FROM AZUMARU TELEPATY");
    }

    @Override
    public void call(String voiceMessage) {
        System.out.println(voiceMessage + " SUPER FAST AZUMARU");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " ITS FREE AZUMARU");
    }
}
