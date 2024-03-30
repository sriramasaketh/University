/*package com.example.university.model;

import com.fasterxml.jackson.annotation.json.IgnoreProperties;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "students")
    @JsonIgnoreProperties("students")
    private List<Course> courses = new ArrayList<>();*/

package com.example.university.model;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "name")
    private String studentName;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "students")
    @JsonIgnoreProperties("students")
    private List<Course> courses;

    public Student() {

    }

    public Student(int id, String name, String email, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    public int getStudentId() {
        return id;
    }

    public void setStudentId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return name;

    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
