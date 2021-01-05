package com.demotivirus.Day_015;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    @NonNull
    private String name;

    @NonNull
    private Money money;

    public void minusCash(double cash){
        money.minusCash(cash);
    }
}
