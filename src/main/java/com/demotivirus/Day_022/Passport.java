package com.demotivirus.Day_022;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Passport {
    @NonNull
    private String serial;
}
