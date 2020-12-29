package com.demotivirus.Day_008.main;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

//NOT WORK CORRECTLY
@Controller
public class PersonController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("results").setViewName("results");
    }

    @RequestMapping("person-form")
    private String showForm(Person person){
        return "person-form";
    }

    @PostMapping(value="person-form")
    public String checkPersonInfo(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult) {
        System.out.println(person.getName() + "|" + person.getAge());
        if (bindingResult.hasErrors()) {
            return "person-form";
        }
        return "results";
    }
}
