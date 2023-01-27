package com.ford.gradleproject.controller;

import com.ford.gradleproject.model.Student;
//import com.ford.gradleproject.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //this annotation makes this class to serve end points
public class StudentController {

//    private final StudentService studentService;

    @Autowired
//    public  StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }


//    @GetMapping(value ="/api/v1/student", produces = MediaType.APPLICATION_JSON_VALUE) //in video, he did not give value
//    public  List<Student> getStudents(){
//        return studentService.getStudents();
//    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test(){
        return "TEST";
    }



}
