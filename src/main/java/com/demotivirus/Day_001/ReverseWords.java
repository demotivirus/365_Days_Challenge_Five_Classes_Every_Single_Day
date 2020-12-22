package com.demotivirus.Day_001;

public class ReverseWords implements Greetings{
    private String greeting;

    public ReverseWords(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayHello() {
        StringBuilder sb = new StringBuilder(greeting);
        System.out.println(sb.reverse());
    }
}
