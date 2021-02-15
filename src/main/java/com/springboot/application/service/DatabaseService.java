package com.springboot.application.service;

import com.springboot.application.repository.CourseRepo;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DatabaseService {
    @Autowired
    CourseRepo courseRepo;

    // get all course list
    public List<Courses> getCoursesList() {
        List<Courses> coursesList = new ArrayList<>();
        courseRepo.findAll().forEach(coursesList::add);
        return coursesList;
    }

    // get specific corse
    public Optional<Courses> getSpecificCourse(int id) {
        return courseRepo.findById(id);

    }

    // add course in list
    public void addCourses(Courses courses) {
        courseRepo.save(courses);
    }

    // update course in list
    public void updateCourse(int id, Courses course) {
        courseRepo.save(course);
    }

}

