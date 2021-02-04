package com.demotivirus.Day_045;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Music {
    @NonNull
    private String authorName;

    @NonNull
    private String trackName;

    private String genre;
}
