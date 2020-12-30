package com.demotivirus.Day_009.main;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Student {
    @Size(min = 4, max = 50)
    @NotNull(message = "Is required")
    private String name;

    @Min(value = 18, message = "must be > 17")
    @Max(value = 79, message = "must be < 80")
    private Integer age;

    @NotNull(message = "Is required")
    private String course;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 digits")
    private String postalCode;
}
