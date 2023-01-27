package com.ford.gradleproject.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "students", schema = "test")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    private String dob;
    @Column(name = "age")
    private int age;
    @Column(name = "name")
    private String name;

    public Student() {
    }
//
//    public Student(name, age) {
//        this.name=name;
//        this.age=age;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
