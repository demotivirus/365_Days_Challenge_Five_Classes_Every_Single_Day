package com.demotivirus.Day_026;

import lombok.Data;
import lombok.NonNull;

@Data
public class Mob extends Unit{
    public Mob(@NonNull String name, @NonNull int hp, @NonNull int damage) {
        super(name, hp, damage);
    }
}
