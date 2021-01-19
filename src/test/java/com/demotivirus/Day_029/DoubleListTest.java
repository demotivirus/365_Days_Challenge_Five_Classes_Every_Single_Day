package com.demotivirus.Day_029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleListTest {
    private DoubleList<String, String> doubleList;

    @BeforeEach
    public void init(){
        doubleList = new DoubleList<>();
    }

    @Test
    public void addTest(){
        doubleList.add("Hello", "World");
        //System.out.println(doubleList.toString());
        Assertions.assertEquals("DoubleList(first=[Hello], second=[World])", doubleList.toString());
    }
}
