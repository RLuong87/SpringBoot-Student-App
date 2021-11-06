package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    /*
    Service Layer
     */

    public static List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Alice",
                        "alice.long@gmail.com",
                        LocalDate.of(2001, 12, 4),
                        20
                )
        );
    }
}
