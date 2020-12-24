package com.demotivirus.Day_003_S2.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProcessFormController {

    @RequestMapping("/process-form")
    public String processForm(@RequestParam String userName, Model model){
        model.addAttribute("userName", userName);
        return "processForm";
    }
}
