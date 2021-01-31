package com.demotivirus.Day_040;

import com.demotivirus.Day_041.Money;
import com.demotivirus.Day_041.People;
import com.demotivirus.Day_041.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeopleTest {
    @Test
    public void testBrainMemory(){
        People people = new People("Mike");
        people.setPhoneNumber(new People("Erick"), new PhoneNumber("83937202033"));
        people.setPhoneNumber(new People("Erick"), new PhoneNumber("03939330023"));
        String erick = people.getPhoneNumber("Erick").getPhoneNumber();
        Assertions.assertEquals("03939330023", erick);
    }

    @Test
    public void testMoney(){
        People people = new People("Theodor");
        people.setSalary(new Money(1_000));
        Assertions.assertEquals(1000, people.getMoney().getMoneyInt());
        Assertions.assertNotEquals(1001, people.getMoney().getMoneyInt());
    }
}
