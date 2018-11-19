package com.example.demo.controllers;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAllStudents(Model model) {
        List<Student> students = studentService.findAllStudents();
        model.addAttribute("students", students);
        return "home";
    }

    @RequestMapping(value = "/import", method = RequestMethod.GET)
    public String importStudents(Model model) {
        return "import";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String submit(@RequestParam("file") MultipartFile file, Model model) {
        studentService.saveStudents(file);
        return "redirect:/" ;
    }
}
