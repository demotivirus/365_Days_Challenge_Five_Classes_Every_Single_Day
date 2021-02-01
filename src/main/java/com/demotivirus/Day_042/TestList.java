package com.demotivirus.Day_042;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(22);
        list.add(93);
        list.add(44);

        list.forEach(c -> System.out.println(c));
        list.forEach(System.out::println);
    }
}
