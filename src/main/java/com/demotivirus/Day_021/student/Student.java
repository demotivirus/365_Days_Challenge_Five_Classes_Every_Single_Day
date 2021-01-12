package com.demotivirus.Day_021.student;

import lombok.Data;
import lombok.NonNull;

@Data
public class Student {
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
}
