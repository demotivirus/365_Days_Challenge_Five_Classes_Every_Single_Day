package com.demotivirus.Day_003;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Helmets implements Equipment{
    Bronze("Bronze helmet"),
    Silver("Silver helmet"),
    Gold("Gold helmet"),
    Empty("This hero not have a helmet"),

    ;

    @NonNull
    private String description;
}
