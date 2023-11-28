package com.example.demo.controller;

import com.example.demo.Model.Student;
import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentController {


    @Autowired
    StudentDao studentDao;

    @GetMapping("/name")
    public String getName(){
        Student student = new Student();
        student.setName("hardik");
        student.setMarks("78");
        studentDao.save(student);

        return "hello hardik";
    }
}
