package com.demotivirus.Day_024_S2.error;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
