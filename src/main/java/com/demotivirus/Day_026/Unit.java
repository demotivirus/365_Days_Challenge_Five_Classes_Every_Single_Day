package com.demotivirus.Day_026;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Unit {
    @NonNull
    private String name;

    @NonNull
    private int hp;

    @NonNull
    private int damage;

    public void doDamage(Unit enemy){
        System.out.println(name + " hp: " + hp + " VS " + enemy.getName() + " hp: " + enemy.getHp());
        enemy.setHp(enemy.getHp() - getDamage());
        System.out.println(name + " take damage: " + damage + ". Now " + enemy.getName() + ": " + enemy.getHp());
    }
}
