package com.demotivirus.Day_021;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestRestController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello world";
    }
}
