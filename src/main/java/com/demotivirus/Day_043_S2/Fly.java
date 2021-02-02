package com.demotivirus.Day_043_S2;

import lombok.Data;
import lombok.NonNull;

@Data
public class Fly {
    @NonNull
    private long serialNumber;

    public void fly(int distance){
        int speed = 250; // meters per seconds
        int secondsToEnd = (int) ((double) (distance / 900_000) * 3600);
        while (distance > 0){
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            distance -= speed;
            secondsToEnd -= 1;
            System.out.println(secondsToEnd + " sec to end. Distance: " + distance);
            if (secondsToEnd <= 0) break;
        }

        System.out.println("Fly is the end!");
    }
}
