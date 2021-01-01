package com.demotivirus.Day_010.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

//WITH WORKING CSS
@Controller
public class CourseCodeController {

    @RequestMapping("course-code")
    public String getCourseCode(Model model){
        model.addAttribute("course", new Course());
        return "courseCodeHtml";
    }

    @PostMapping("course-code")
    public String postCourseCode(@Valid Course course, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "courseCodeHtml";
        else return "result";
    }
}
