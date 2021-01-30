package com.demotivirus.Day_040.testSmthngGenerators;

import lombok.Data;
import lombok.NonNull;

@Data
public class Human {
    @NonNull
    private String name;
    private Guitar guitar;

    public Human(String name){
        this.name = name;
        guitar = new Guitar();
    }

    public void playRandomSong(){
        guitar.playRandom();
    }
}
