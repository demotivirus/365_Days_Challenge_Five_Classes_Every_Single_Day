package com.demotivirus.Day_031.soap;

import com.demotivirus.Day_031.model.Goods;

public class GreetingImpl implements Greeting{
    @Override
    public String sayHello(String name) {
        return "Hello, you name is " + name;
    }

    @Override
    public Goods getGoods() {
        return new Goods(1, "Hello world from SOAP");
    }
}
