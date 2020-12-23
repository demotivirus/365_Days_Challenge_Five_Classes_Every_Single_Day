package com.demotivirus.Day_002_S2;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
public class Book {
    @NonNull
    private Author author;

    @NonNull
    private String title;
}
