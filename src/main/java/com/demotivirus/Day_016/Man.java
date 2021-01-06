package com.demotivirus.Day_016;

import lombok.NonNull;

public class Man extends Human{
    public Man(@NonNull String name) {
        super(name);
    }

    public Man(String name, String profession){
        super(name, profession);
    }
}
