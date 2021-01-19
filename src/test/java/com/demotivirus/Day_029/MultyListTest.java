package com.demotivirus.Day_029;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultyListTest {
    private MultyList multyList;

    @BeforeEach
    public void init(){
        multyList = new MultyList();
    }

    @Test
    public void testMultyList(){
        List<String> list = new ArrayList<>(){{
           add("String");
           add("String 2");
           add("String 3");
        }};
        multyList.setList(Collections.singletonList(list));
        System.out.println(multyList);
    }
}
