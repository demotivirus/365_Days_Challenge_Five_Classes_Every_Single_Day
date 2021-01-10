package com.demotivirus.Day_019.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("my-login-page")
    public String myLoginPage(){
        return "login";
    }

    @GetMapping("access-denied")
    public String accessDenied(){
        return "access-denied";
    }
}
