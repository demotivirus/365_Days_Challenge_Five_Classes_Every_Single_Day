package com.demotivirus.Day_028;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {
    @Test
    public void firstTest(){
        boolean res = true;
        System.out.println("Hello JUnit");
        assertTrue(res);
    }

    @Test
    public void testMessage(){
        Message message = new Message("Hello JUnit");
        assertEquals("Hello JUnit", message.getText());
    }
}
