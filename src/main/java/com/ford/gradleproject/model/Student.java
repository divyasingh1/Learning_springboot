package com.ford.gradleproject.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "students", schema = "test")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;// for primary key alway use Long
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
    public Student(Long id, String email, String dob, int age, String name) {
        this.id = id;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
