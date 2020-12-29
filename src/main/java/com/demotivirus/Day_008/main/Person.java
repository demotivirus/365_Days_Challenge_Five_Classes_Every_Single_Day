package com.demotivirus.Day_008.main;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Person {
    @Size(min = 2, max = 30)
    private String name;

    @NotNull(message = "Is required")
    @Min(18)
    private Integer age;
}
