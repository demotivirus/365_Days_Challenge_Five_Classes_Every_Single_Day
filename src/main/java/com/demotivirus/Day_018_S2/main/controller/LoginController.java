package com.demotivirus.Day_018_S2.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("my-login-page")
    public String myLoginPage(){
        return "login";
    }
}
