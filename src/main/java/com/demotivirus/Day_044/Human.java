package com.demotivirus.Day_044;

import lombok.Data;
import lombok.NonNull;

@Data
public class Human {
    @NonNull
    private Document document;

    public long getGeneticCode(){
        return document.getSerialNumber().getGeneticCode().getCode();
    }
}
