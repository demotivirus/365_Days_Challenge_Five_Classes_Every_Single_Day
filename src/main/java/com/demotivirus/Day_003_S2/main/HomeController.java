package com.demotivirus.Day_003_S2.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showServerTime(Model model){
        model.addAttribute("serverTime", new Date());
        return "index";
    }
}
