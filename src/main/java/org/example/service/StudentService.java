package org.example.service;

import org.example.model.dto.Student;
import org.example.model.entity.StudentEntity;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    public void add(Student student){
        repository.save(
                new StudentEntity(
                        student.getId(),
                        student.getName(),
                        student.getContactNumber(),
                        student.getEmail(),
                        student.getDate(),
                        student.getAddress()
                )
        );
    }
    public Student getByID(String id){
        Optional<StudentEntity> studentEntity=repository.findById(id);
        Student student= new Student(
                studentEntity.get().getId(),
                studentEntity.get().getName(),
                studentEntity.get().getContactNumber(),
                studentEntity.get().getEmail(),
                studentEntity.get().getDate(),
                studentEntity.get().getAddress()
        );
        return student;
    }
}
