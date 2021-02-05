package com.demotivirus.Day_046.model.dictionary;

import lombok.Data;

import java.util.List;

@Data
public class Airplane {
    long id;
    String airplaneModel;
    List<Place> places;
    Company company;
    String descr;
}
