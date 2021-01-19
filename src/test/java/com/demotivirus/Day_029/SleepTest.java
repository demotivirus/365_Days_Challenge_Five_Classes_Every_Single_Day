package com.demotivirus.Day_029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SleepTest {
    private Sleep sleep;

    @BeforeEach
    public void init(){
        sleep = new Sleep(new Human("Mike"));
    }

    @Test
    public void testSleep(){
        sleep.sleep();
        Assertions.assertEquals("sleep", sleep.getHuman().getStatus());
        sleep.wakeUp();
        Assertions.assertEquals("wake up", sleep.getHuman().getStatus());
    }
}
