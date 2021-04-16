package com.springboot.application.repository;

import com.springboot.application.entities.Student;

import java.util.Optional;

public interface StudentService {

    Student addStudent(Student student);

    void deleteStudent(int id);

    Optional<Student> getStudent(int id);

    void deleteAllRecord();
}

