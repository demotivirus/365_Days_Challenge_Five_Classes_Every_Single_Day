package com.demotivirus.Day_005.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
    @RequestMapping("show-form")
    public String showForm(Model model){
        //Student theStudent = new Student();
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("process-form")
    public String processForm(@ModelAttribute Student theStudent, Model model){
        model.addAttribute("student", theStudent);
        return "student-processForm";
    }
}
