package com.demotivirus.Day_003_S2.main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String login;
    private String email;
}
