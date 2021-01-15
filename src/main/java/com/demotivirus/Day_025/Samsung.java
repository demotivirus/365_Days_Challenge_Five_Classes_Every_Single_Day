package com.demotivirus.Day_025;

import java.util.Date;

public class Samsung implements Smartphone{
    @Override
    public void call(String voiceMessage) {
        System.out.println(voiceMessage + " log:[voice Samsung " + new Date() + "]");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " log:[message Samsung " + new Date() + "]");
    }
}
