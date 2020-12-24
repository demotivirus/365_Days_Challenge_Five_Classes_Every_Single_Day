package com.demotivirus.Day_003;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Locale;

@Data
@Builder
public class Hero {
    @NonNull
    private String name;
    private Weapon weapon;
    private Helmets helmet;

    public void removeWeapon(Weapon weapon){
        if(this.weapon.equals(weapon))
            this.weapon = Weapons.Empty;
    }

    public void printAllAmmunition(){
        System.out.println("============PRINT AMMUNITION============");
        System.out.println(name.toUpperCase());
        System.out.println(weapon.getDescription() + " with " + weapon.getDmg() + " dmg");
        System.out.println(helmet.getDescription());
        System.out.println("========================================");
    }
}
