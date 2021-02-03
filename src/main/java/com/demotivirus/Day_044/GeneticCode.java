package com.demotivirus.Day_044;

import lombok.Data;

import java.util.Random;

@Data
public class GeneticCode {
    private long code;

    public GeneticCode(){
        Random r = new Random();
        code = r.nextLong();
    }
}
