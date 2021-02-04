package com.demotivirus.Day_045;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addMusic(new ClassicalMusic("Samuel Barber", "Adagio for Strings"));
        player.addMusic(new ClassicalMusic("Samuel Barber", "Adagio for Strings 2"));
        player.addMusic(new ClassicalMusic("Samuel Barber", "Adagio for Strings 3"));
        player.addMusic(new RockMusic("Jimi Hendrix", "Purple Haze"));
        player.addMusic(new RockMusic("Jimi Hendrix", "Purple Haze 2"));
        player.addMusic(new RockMusic("Jimi Hendrix", "Purple Haze 3"));
        player.showPlaylist();

        for (int i = 0; i < 5; i++) {
            player.playRandom();
        }
        player.playClassicalMusic();
        player.play(new ClassicalMusic("Samuel Barber", "Adagio for Strings 5!"));
    }
}
