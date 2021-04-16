package com.springboot.application.entities;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    private int sId;
    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private StudentMarks studentMarks;

    public StudentMarks getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(StudentMarks studentMarks) {
            this.studentMarks = studentMarks;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
