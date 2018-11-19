package com.example.demo.services;

import com.example.demo.entities.Student;
import com.example.demo.exceptions.StudentIdMissingException;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findByName(String studentName) {
        return studentRepository.findByName(studentName);
    }

    @Override
    public void saveStudents(MultipartFile file) {
        readStudent(file);
    }

    private void readStudent(MultipartFile file){
        BufferedReader buffer = null;
        try{
            InputStream inputStream = file.getInputStream();
            buffer = new BufferedReader(new InputStreamReader(inputStream));

            String studentLine;
            while((studentLine = buffer.readLine()) != null){
                String[] sd = studentLine.split(",");
                Student student = new Student(sd[0], sd[1], sd[2], sd[3], sd[4], sd[5]);
                if(sd[2].equals("")) {
                    //throw exception, id missing exception
                }
                studentRepository.save(student);
            }

        }
        catch(IOException | StudentIdMissingException e){
            e.printStackTrace();
        }
        finally{
            try{
                buffer.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
