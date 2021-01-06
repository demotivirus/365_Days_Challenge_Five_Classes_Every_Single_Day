package com.demotivirus.Day_016;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Money {
    @NonNull
    private double cash;
}
