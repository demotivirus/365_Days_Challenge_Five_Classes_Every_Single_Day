package com.demotivirus.Day_041;

import lombok.Data;
import lombok.NonNull;

@Data
public class Money {
    @NonNull
    private int money;

    public int getMoneyInt(){
        return money;
    }
}
