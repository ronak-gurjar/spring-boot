package com.springboot.application.repository;

import com.springboot.application.entities.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseCrudRepo extends CrudRepository<Courses, Integer> {
    Courses findById(int id);
}
