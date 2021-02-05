package com.demotivirus.Day_046.interfaces;

import com.demotivirus.Day_046.model.Reservation;
import com.demotivirus.Day_046.model.dictionary.Airplane;
import com.demotivirus.Day_046.model.dictionary.Place;

public interface Buy {
    Reservation buyTicket(Airplane airplane, Place place, String addInfo);
}
