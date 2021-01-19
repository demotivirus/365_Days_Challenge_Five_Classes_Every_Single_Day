package com.demotivirus.Day_029;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @NoArgsConstructor
@RequiredArgsConstructor
public class Human {
    @NonNull
    private String name;
    private String status;
}
