package com.demotivirus.Day_005.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {
    @RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping("show-form")
    public String showForm(){
        return "show-form";
    }
}
