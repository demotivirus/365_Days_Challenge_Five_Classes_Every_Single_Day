package com.demotivirus.Day_045;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString @Getter
public class RockMusic extends Music{
    private final String genre = "rock music";

    public RockMusic(@NonNull String authorName, @NonNull String trackName) {
        super(authorName, trackName);
    }
}
