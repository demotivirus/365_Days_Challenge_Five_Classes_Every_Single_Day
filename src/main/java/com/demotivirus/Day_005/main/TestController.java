package com.demotivirus.Day_005.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("show-form")
    public String showForm(){
        return "show-form";
    }

    @RequestMapping("process-form")
    public String processForm(@RequestParam("userName") String name, Model model){
        model.addAttribute("userName", name);
        return "processForm";
    }
}
