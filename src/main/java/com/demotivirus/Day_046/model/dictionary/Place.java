package com.demotivirus.Day_046.model.dictionary;

import lombok.Data;

@Data
public class Place {
    long id;
    char line;
    int seat;
    AirplaneClasses airplaneClasses;
}
