package com.demotivirus.Day_003_S2.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    private List<Employee> listEmployees;

    @GetMapping("/employees")
    public String listEmployees(Model model){
        model.addAttribute("employees", listEmployees);
        return "employees";
    }

    @PostConstruct
    public void loadData(){
        Employee one = new Employee(1L, "SarahKonnor", "sarah@gmail.com");
        Employee two = new Employee(2L, "Terminator", "astalavista@babe.com");
        Employee three = new Employee(3L, "littleBoy", "iLikeMilks@gmail.com");

        listEmployees = new ArrayList<>(){{
            add(one);
            add(two);
            add(three);
        }};
    }
}
