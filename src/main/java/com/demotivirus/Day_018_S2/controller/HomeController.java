package com.demotivirus.Day_018_S2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping()
    public String indexPage(){
        return "index";
    }
}
