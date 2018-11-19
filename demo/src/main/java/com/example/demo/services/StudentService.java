package com.example.demo.services;

import com.example.demo.entities.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();
    List<Student> findByName(String studentName);
    void saveStudents(MultipartFile file);
}
