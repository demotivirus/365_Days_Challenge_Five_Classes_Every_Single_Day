package com.demotivirus.Day_046.model;

import lombok.Data;

@Data
public class Passenger {
    long id;
    String firstName;
    String middleName;
    String lastName;
    String passportNumber;
    String email;
    String phone;
}
