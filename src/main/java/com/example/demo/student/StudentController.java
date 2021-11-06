package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
API Layer
 */

@RestController
@RequestMapping(path = "api/v1/student") // Endpoint
public class StudentController {

    private final StudentService studentService;

    @Autowired // Dependency Injection (Auto instantiation for StudentService)
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return StudentService.getStudents();
    }

}
