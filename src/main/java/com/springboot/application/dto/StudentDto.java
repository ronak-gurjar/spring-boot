package com.springboot.application.dto;

import com.springboot.application.entities.Student;

public class StudentDto {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
