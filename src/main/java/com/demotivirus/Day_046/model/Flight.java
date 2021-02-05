package com.demotivirus.Day_046.model;

import com.demotivirus.Day_046.model.dictionary.Airplane;
import com.demotivirus.Day_046.model.dictionary.City;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Flight {
    long id;
    String code;
    LocalDateTime flightDate;
    long flightDuration;
    Airplane airplane;
    City cityFrom;
    City cityTo;
}
