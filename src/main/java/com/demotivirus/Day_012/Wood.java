package com.demotivirus.Day_012;

import lombok.Data;
import lombok.NonNull;

@Data
public class Wood implements Inventoreable{
    @NonNull
    private int numbers;

    @Override
    public void updateNumbers(int numbers) {
        this.numbers -= numbers;
    }

    @Override
    public void addNumbers(int numbers) {
        this.numbers += numbers;
    }
}
