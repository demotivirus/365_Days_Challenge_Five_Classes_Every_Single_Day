package com.demotivirus.Day_020_S2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
}
