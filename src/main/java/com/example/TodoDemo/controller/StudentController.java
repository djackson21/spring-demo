package com.example.TodoDemo.controller;

import com.example.TodoDemo.model.Student;
import com.example.TodoDemo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

//http://localhost:8080/api/v1/students

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentService service = new StudentService();

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

}
