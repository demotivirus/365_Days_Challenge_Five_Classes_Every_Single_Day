package com.demotivirus.Day_037;

public class Main {
    public static void main(String[] args) {
        Person luffy = Person.builder()
                .fullName("Monkey D Luffy")
                .hair(Hair.BLACK)
                .weapon(Weapon.NON)
                .headdress(Headdress.STRAW_HAT)
                .clothes(Clothes.SHIRT)
                .build();

        Person zorro = Person.builder()
                .fullName("Roronoa Zoro")
                .hair(Hair.GREEN)
                .weapon(Weapon.KATANA)
                .weapon(Weapon.MANY)
                .headdress(Headdress.BANDANA)
                .clothes(Clothes.SHIRT)
                .build();

        System.out.println(luffy);
        System.out.println(zorro);
    }
}
