package com.springboot.application.entities;

import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;


@Entity
@Table(name = "course")
public class Courses {
    public Courses() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("id")
    private int id;
    @Column("title")
    private String title;
    @Column("description")
    private String description;

    public Courses(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
