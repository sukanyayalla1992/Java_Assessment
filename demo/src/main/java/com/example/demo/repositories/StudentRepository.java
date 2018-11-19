package com.example.demo.repositories;

import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, String> {

    List<Student> findAll();

    @Query(value = "SELECT * FROM students s where s.name= :studentName", nativeQuery = true)
    List<Student> findByName(@Param("studentName") String studentName);

}
