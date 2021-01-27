package com.demotivirus.Day_037;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Person {
    private String fullName;
    private Hair hair;
    private Headdress headdress;
    private Clothes clothes;
    private Weapon weapon;
}
