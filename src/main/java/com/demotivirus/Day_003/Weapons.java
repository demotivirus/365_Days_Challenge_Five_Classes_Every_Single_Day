package com.demotivirus.Day_003;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public enum Weapons implements Weapon {
    Kaduceus("Weapon for traders", 50),
    Lightning("Weapon for shooting from distance", 500),
    Trident("A weapon to cause a storm", 150),
    Empty("This hero is unarmed", 0),

    ;

    @NonNull
    private String description;

    @NonNull
    private int dmg;
}
