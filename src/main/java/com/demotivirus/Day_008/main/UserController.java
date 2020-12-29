package com.demotivirus.Day_008.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

//NOT WORK CORRECTLY
@Controller
public class UserController {

//    @RequestMapping("")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("show-form")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "user-form";
    }

    @RequestMapping("process-from")
    public String processForm(@Valid @ModelAttribute("user") User theUser, BindingResult theBindingResult){
        if(theBindingResult.hasErrors())
            return "user-form";
        else return "user-confirm";
    }
}
