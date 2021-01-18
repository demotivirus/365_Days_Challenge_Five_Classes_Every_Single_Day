package com.demotivirus.Day_028;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    private Human jhon;
    private Friend thom;
    private Pet dog;

    @BeforeEach
    public void init(){
        jhon = new Human("Jhon");
        thom = new Friend("Thom");
        dog = new Pet("Hot dog");
    }

    @Test
    public void simpleTest(){
        assertEquals("Jhon", jhon.getName());
    }

    @Test
    public void addFriend(){
        jhon.addFriend(thom);
        assertEquals("Thom", jhon.getFriend("Thom").getName());
    }

    @Test
    public void addPet(){
        jhon.addPet(dog);
        assertEquals("Hot dog", jhon.getPet("Hot dog").getName());
    }

    @Test
    public void addPetFail(){
        jhon.addPet(dog);
        assertNotEquals("Hot dog", jhon.getPet("Hot doggggggggggg").getName());
    }
}
