package com.springboot.application.controller;

import com.springboot.application.repository.CourseRepo;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepo databaseRepo;

    @GetMapping("/test")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return databaseRepo.getCoursesList();
    }

    @GetMapping("/courses/{id}")
    public Courses getSpecificCourses(@PathVariable int id) {
        return databaseRepo.getSpecificCourse(id);
    }

    @PostMapping("/courses")
    public void addCourses(@RequestBody List<Courses> courses) {
        databaseRepo.addCourses(courses);
    }

    @PutMapping("/courses")
    public void updateCourses(@RequestBody Courses course) {
        databaseRepo.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourses(@PathVariable int id) {
        databaseRepo.deleteCourse(id);
    }

    @DeleteMapping("/courses")
    public void deleteAllCourses() {
        databaseRepo.deleteAllCourses();
    }
}
