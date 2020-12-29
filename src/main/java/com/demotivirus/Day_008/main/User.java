package com.demotivirus.Day_008.main;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class User {
    private String firstName;

    @Size(min = 1)
    @NotNull(message = "is required")
    private String lastName;
}
