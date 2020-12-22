package com.demotivirus.Day_001;

public class HelloName extends Hello{
    private String name;

    public HelloName(String greeting, String name) {
        super(greeting);
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(super.greeting + " " + name);
    }
}
