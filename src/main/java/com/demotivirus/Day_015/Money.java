package com.demotivirus.Day_015;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Money {
    @NonNull
    private double cash;

    public Money(){
        cash = 0d;
    }

    public void minusCash(double cash){
        if (cash <= this.cash)
            this.cash -= cash;
    }

    public void plusCash(double cash){
        this.cash += cash;
    }
}
