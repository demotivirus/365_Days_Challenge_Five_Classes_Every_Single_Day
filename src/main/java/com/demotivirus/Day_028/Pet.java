package com.demotivirus.Day_028;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Pet {
    @NonNull
    private String name;
}
