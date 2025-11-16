package org.example.controller;

import org.example.model.dto.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/all")
    public ArrayList<Student> getAll() {
        return service.getAll();
    }
}
