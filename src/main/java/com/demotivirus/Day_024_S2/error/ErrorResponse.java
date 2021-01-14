package com.demotivirus.Day_024_S2.error;

import lombok.Data;

@Data
public class ErrorResponse {
    private int status;
    private String message;
    private long timeStamp;
}
