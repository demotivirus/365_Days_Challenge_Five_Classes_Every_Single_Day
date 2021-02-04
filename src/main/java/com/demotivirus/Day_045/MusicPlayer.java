package com.demotivirus.Day_045;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class MusicPlayer {
    private List<Music> playList = new ArrayList<>();

    public void addMusic(Music music) {
        playList.add(music);
    }

    public void showPlaylist() {
        for (Music m : playList)
            System.out.println("Add new track: " + m.getAuthorName() + "-" + m.getTrackName());
    }

    public void playRandom() {
        Random random = new Random();
        Music music = playList.get(random.nextInt(playList.size()));
        System.out.println("Play track: " + music.getAuthorName() + "-" + music.getTrackName());
    }

    public void playClassicalMusic() {
        for (Music m : playList) {
            if (m.getGenre().equals("classical music"))
                System.out.println("Play classical track: " + m.getAuthorName() + "-" + m.getTrackName());
        }
    }

    public void play(Music music) {
        playList.add(music);
        var track = playList.get(playList.size() - 1);
        System.out.println("Play NEW track: " + track.getAuthorName() + "-" + track.getTrackName());
    }
}
