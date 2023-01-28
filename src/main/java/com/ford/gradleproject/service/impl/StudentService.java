package com.ford.gradleproject.service.impl;

import com.ford.gradleproject.model.Student;
import com.ford.gradleproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Student not found");
        }
        studentRepository.deleteById(id);
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        System.out.println(student);
        studentRepository.save(student);
    }

    @Transactional
    public void updateStudent(Long id, String name, String email){
        System.out.println(name);
        System.out.println(email);
        System.out.println(id);
        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new IllegalStateException("student not found"));
        if(name != null && name.length()>0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }
        if(email != null && email.length()>0 && !Objects.equals(student.getEmail(), email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }
}
