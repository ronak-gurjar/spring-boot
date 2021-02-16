package com.springboot.application.service;

import com.springboot.application.repository.CourseRepo;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    CourseRepo courseRepo;

    // get all course list
    public List<Courses> getCoursesList() {
        return (List<Courses>) courseRepo.findAll();
    }

    // get specific courses
    public Courses getSpecificCourse(int id) {
        return courseRepo.findById(id);
    }

    // add course in list
    public void addCourses(List<Courses> courses) {
        courseRepo.saveAll(courses);
    }

    // update course in list
    public void updateCourse(Courses course) {
        courseRepo.save(course);
    }

    // delete one course
    public void deleteCourse(int id) {
        courseRepo.deleteById(id);
    }

    // delete all courses
    public void deleteAllCourses() {
        courseRepo.deleteAll();
    }
}

