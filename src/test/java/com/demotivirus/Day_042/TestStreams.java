package com.demotivirus.Day_042;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStreams {
    @Test
    public void testStream(){
        List<String> places = Places.init();

        places.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(f -> f.toUpperCase())
                .sorted()
                .forEach(c -> System.out.println(c));


    }
}
