package com.demotivirus.Day_018.controller;

import com.demotivirus.Day_018.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("email")
public class EmailController {
    @Autowired
    EmailService emailService;

    @GetMapping("list")
    public String getAllEmails(Model model){
        model.addAttribute("emails", emailService.getAllEmails());
        emailService.getAllEmails();
        return "email-list";
    }
}
