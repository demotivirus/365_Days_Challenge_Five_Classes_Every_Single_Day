package com.demotivirus.Day_046.model.dictionary;

import lombok.Data;

@Data
public class Country {
    long id;
    String name;
    String code;
    byte[] flagImage;
}
