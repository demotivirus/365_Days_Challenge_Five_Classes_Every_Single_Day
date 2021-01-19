package com.demotivirus.Day_029;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShipTest {
    private Ship ship;

    @BeforeEach
    public void init(){
        ship = new Ship();
    }

    @Test
    public void addHumanTest(){
        ship.addHuman(new Human("Andre"));
        Assertions.assertEquals("Andre", ship.getHuman("Andre").getName());
    }

    @Test
    public void printHumanTest(){
        System.out.println(ship.getNumOfHumans());
    }
}
