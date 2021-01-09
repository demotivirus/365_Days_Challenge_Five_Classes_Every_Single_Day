package com.demotivirus.Day_019.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
    @GetMapping("")
    public String adminStartPage(){
        return "admin-index";
    }
}
