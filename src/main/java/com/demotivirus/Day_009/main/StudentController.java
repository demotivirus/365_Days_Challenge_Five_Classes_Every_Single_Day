package com.demotivirus.Day_009.main;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class StudentController implements WebMvcConfigurer  {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("results").setViewName("results");
    }

    @GetMapping("student")
    public String showStartPage(Student student) {
        return "student-form";
    }

    @PostMapping("student")
    public String showStudent(@Valid Student student, BindingResult bindingResult) {
        System.out.println("Student: " + student);
        System.err.println("BindingResult: " + bindingResult);
        if (bindingResult.hasErrors()) {
            return "student-form";
        }
        return "results";
    }
}