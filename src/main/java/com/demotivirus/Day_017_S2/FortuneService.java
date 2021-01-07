package com.demotivirus.Day_017_S2;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class FortuneService {
    public String getFortune(){
        Random random = new Random();
        int timeSleep = random.nextInt(6_000);
        try {
            TimeUnit.MILLISECONDS.sleep(timeSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "This service sleep: " + timeSleep;
    }

    public String getFortune(boolean throwException){
        if(throwException)
            throw new RuntimeException("BAD FORTUNE TODAY :(");
        return getFortune();
    }
}
