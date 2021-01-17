package com.demotivirus.Day_027;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person {
    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private byte age;
}
