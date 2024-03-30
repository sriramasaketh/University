package com.example.unversity.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.unversity.model.Course;

import com.example.university.model.Student;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

    List<Course> getStudentCourses(int studentId);

}