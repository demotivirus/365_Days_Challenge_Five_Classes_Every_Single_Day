package com.demotivirus.Day_046.interfaces;

import com.demotivirus.Day_046.model.Flight;
import com.demotivirus.Day_046.model.dictionary.City;

import java.time.LocalDateTime;
import java.util.List;

public interface Search {
    List<Flight> findAirplane(LocalDateTime localDateTime, City cityFrom, City cityTo);
}
