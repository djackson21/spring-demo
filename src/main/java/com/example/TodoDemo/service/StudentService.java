package com.example.TodoDemo.service;

import com.example.TodoDemo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Steve","Jobs", LocalDate.now(),"SteveJobs@apple.com",40),
                new Student("Mark","Burk", LocalDate.now(),"Markburk@facebook.com",28)
        );
    }
}
