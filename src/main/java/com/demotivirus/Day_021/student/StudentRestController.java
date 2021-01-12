package com.demotivirus.Day_021.student;

import com.demotivirus.Day_021.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    private void init(){
        students = new ArrayList<>();
        students.add(new Student("Katrin", "Mayer"));
        students.add(new Student("Marko", "Polo"));
        students.add(new Student("Robinzon", "Kruzo"));
    }

    @GetMapping("")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("{studentId}")
    public Student getStudent(@PathVariable int studentId){
        checkErrorResponse(studentId);
        return students.get(studentId);
    }

    private void checkErrorResponse(int studentId){
        if(studentId >= students.size() || studentId < 0)
            throw new NotFoundException("Student id not found - " + studentId);
    }
}
