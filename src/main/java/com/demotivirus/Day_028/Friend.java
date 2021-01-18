package com.demotivirus.Day_028;

import lombok.Data;
import lombok.NonNull;

@Data
public class Friend extends Person{
    public Friend(@NonNull String name) {
        super(name);
    }
}
