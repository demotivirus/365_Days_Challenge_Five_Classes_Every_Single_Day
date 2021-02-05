package com.demotivirus.Day_046.model;

import com.demotivirus.Day_046.model.dictionary.Place;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Reservation {
    long id;
    Flight flight;
    Place place;
    String clientComment;
    Passenger passenger;
    LocalDateTime reserveDatetime;
    String code;
}
