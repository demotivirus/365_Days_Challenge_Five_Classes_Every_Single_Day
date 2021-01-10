package com.demotivirus.Day_020_S2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        String path = "..\\.\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\src\\main\\java\\com\\demotivirus\\Day_020_S2\\data\\simple.json";
        String path2 = "..\\.\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\365_Days_Challenge_Five_Classes_Every_Single_Day" +
                "\\src\\main\\java\\com\\demotivirus\\Day_020_S2\\data\\full.json";
        Student student = null;
        FullStudent fullStudent = null;

        try {
            student = objectMapper.readValue(new File(path), Student.class);
            System.out.println("Student id: " + student.getId());
            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());
            System.out.println("Student is active? " + student.isActive());
            System.out.println("==========================");

            fullStudent = objectMapper.readValue(new File((path2)), FullStudent.class);
            System.out.println("Full student id: " + fullStudent.getId());
            System.out.println("Full student address: " + fullStudent.getAddress());
            System.out.println("==========================");

            Address address = fullStudent.getAddress();
            System.out.println("==========================");
            System.out.println(address.getCity());
            for (String lang : fullStudent.getLanguages())
                System.out.println(lang);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
