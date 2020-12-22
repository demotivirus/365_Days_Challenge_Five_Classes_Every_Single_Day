package com.demotivirus.Day_001;

public class Main {
    public static void main(String[] args) {
        Greetings greetings;
        greetings = new Hello("Hello world");
        greetings.sayHello();
        greetings = new ReverseWords("Hello reverse world");
        greetings.sayHello();
        greetings = new HelloName("Hello my friend", "Peter");
        greetings.sayHello();
    }
}
