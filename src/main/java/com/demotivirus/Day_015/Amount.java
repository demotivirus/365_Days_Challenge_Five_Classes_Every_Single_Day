package com.demotivirus.Day_015;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Amount {
    @NonNull
    private double money;

    public void plusMoney(double cash){
        money += cash;
    }
}
