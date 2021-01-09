package com.demotivirus.Day_019.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartupController {
    @GetMapping("")
    public String index(){
        return "index";
    }
}
