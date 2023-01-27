package com.ford.gradleproject.repository;

import com.ford.gradleproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface StudentRepository extends JpaRepository<Student,Integer> {

//    public List<Student> findAll();


}
