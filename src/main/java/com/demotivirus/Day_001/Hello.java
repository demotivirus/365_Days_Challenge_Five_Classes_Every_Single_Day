package com.demotivirus.Day_001;

public class Hello implements Greetings{
    protected String greeting;

    public Hello(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayHello() {
        System.out.println(greeting);
    }
}
