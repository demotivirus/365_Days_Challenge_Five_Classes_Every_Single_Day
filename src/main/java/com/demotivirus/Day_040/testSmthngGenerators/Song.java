package com.demotivirus.Day_040.testSmthngGenerators;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Song {
    private List<String> songs = new ArrayList<>();

    public Song(){
        initSongs();
    }

    public String getSong(int number){
        if (songs.size() > number){
            return songs.get(number);
        }
        else return songs.get(0);
    }

    public int getSongsSize(){
        return songs.size();
    }

    private void initSongs(){
        songs.add("Blues on my soul");
        songs.add("Pretty woman");
        songs.add("Yeses of tiger");
        songs.add("Blah blah blah");
        songs.add("My troubles is not yous");
    }
}
