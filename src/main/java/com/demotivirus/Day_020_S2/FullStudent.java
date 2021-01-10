package com.demotivirus.Day_020_S2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FullStudent extends Student{
    private Address address;
    private String[] languages;
}
