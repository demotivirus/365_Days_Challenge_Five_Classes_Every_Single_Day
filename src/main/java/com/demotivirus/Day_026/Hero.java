package com.demotivirus.Day_026;

import lombok.NonNull;

public class Hero extends Unit{

    public Hero(@NonNull String name, @NonNull int hp, @NonNull int damage) {
        super(name, hp, damage);
    }
}
