package com.demotivirus.Day_046.model.dictionary;

import lombok.Data;

@Data
public class City {
    long id;
    String name;
    String code;
    Country country;
}
