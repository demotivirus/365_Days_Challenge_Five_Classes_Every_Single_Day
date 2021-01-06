package com.demotivirus.Day_016;

import lombok.NonNull;

public class Women extends Human{
    //private String name;

    public Women(@NonNull String name) {
        super(name);
    }

    public Women(String name, String profession){
        super(name, profession);
    }
}
