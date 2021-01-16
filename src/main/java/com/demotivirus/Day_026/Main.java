package com.demotivirus.Day_026;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Unit hero = new Hero("Jhon", 100, 12);
        Unit mob = new Mob("Industrial rat", 40, 3);
        Fight fight = new Fight();
        //fight.start(hero, mob);
        //System.out.println(hero);

        Random rNumOfEnemies = new Random();
        Unit[] rats = new Unit[rNumOfEnemies.nextInt(10)];

        Random rHp = rNumOfEnemies;
        Random rDmg = rNumOfEnemies;
        for (int i = 0; i < rats.length; i++) {
            rats[i] = new Mob("Little rat", rHp.nextInt(100), rDmg.nextInt(8));
        }

        fight.start(hero, rats);
        System.out.println(hero);
    }
}
