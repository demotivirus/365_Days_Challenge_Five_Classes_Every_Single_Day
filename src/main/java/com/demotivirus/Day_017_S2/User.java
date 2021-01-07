package com.demotivirus.Day_017_S2;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
    @NonNull
    private String name;
    @NonNull
    private String password;
}
