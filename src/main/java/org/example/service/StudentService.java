package org.example.service;

import org.example.model.dto.Student;
import org.example.model.entity.StudentEntity;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    ArrayList<Student> all=new ArrayList<>();

    public ArrayList<Student> getAll() {
        for(StudentEntity studentEntity: repository.findAll()){
            Student student= new Student(
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getContactNumber(),
                    studentEntity.getEmail(),
                    studentEntity.getDate(),
                    studentEntity.getAddress()
            );
            all.add(student);
        }
        return all;
    }
}
