package com.demotivirus.Day_003;

public class Main {
    public static void main(String[] args) {
        Hero hermes = Hero.builder()
                .name("Hermes")
                .weapon(Weapons.Kaduceus)
                .build();
        System.out.println(hermes.getWeapon().getDescription());
        System.out.println(hermes.getWeapon().getDmg());
        hermes.removeWeapon(Weapons.Kaduceus);
        System.out.println(hermes.getWeapon().getDescription());

        Hero zeus = Hero.builder()
                .name("Zeus")
                .weapon(Weapons.Lightning)
                .helmet(Helmets.Gold)
                .build();
        zeus.printAllAmmunition();
    }
}
