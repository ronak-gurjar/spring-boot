package com.springboot.application.repository;

import com.springboot.application.entities.Courses;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface CourseRepo extends CrudRepository<Courses, Integer> {

}
