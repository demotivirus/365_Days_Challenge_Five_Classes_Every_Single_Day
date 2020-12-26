package com.demotivirus.Day_005.main;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> courses;
    private String programLang;

    public Student(){
        courses = new HashMap<>();
        courses.put("Ист","История");
        courses.put("Фил","Философия");
        courses.put("Анг","Английский");
        courses.put("Про","Программирование");
    }
}
