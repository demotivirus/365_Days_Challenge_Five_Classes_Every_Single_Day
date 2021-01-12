package com.demotivirus.Day_022;

import lombok.Data;
import lombok.NonNull;

import java.util.Random;

@Data
public class Human {
    @NonNull
    private String firstName;

    private Passport passport;

    public Human(String firstName) {
        Random random = new Random();
        this.firstName = firstName;
        this.passport = new Passport(String.valueOf(random.nextInt(2_000_000_000)));
    }
}
