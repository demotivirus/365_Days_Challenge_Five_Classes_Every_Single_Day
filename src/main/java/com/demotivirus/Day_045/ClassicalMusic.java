package com.demotivirus.Day_045;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString @Getter
public class ClassicalMusic extends Music{
    private final String genre = "classical music";

    public ClassicalMusic(@NonNull String authorName, @NonNull String trackName) {
        super(authorName, trackName);
    }
}
