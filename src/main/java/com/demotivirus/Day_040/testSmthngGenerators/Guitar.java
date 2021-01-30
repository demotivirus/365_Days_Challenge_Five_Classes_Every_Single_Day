package com.demotivirus.Day_040.testSmthngGenerators;

import lombok.Data;

import java.util.Random;

@Data
public class Guitar {
    private Song song;

    public Guitar(){
        song = new Song();
    }

    public void playRandom(){
        Random r = new Random();
        String songText = song.getSong(r.nextInt(this.song.getSongsSize()));
        System.out.println(songText);
    }
}
