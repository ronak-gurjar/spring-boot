package com.springboot.application.controller;

import com.springboot.application.service.DatabaseService;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatabaseController {
    @Autowired
    DatabaseService courseService;

    @GetMapping("/test")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return courseService.getCoursesList();
    }

    @GetMapping("/courses/{id}")
    public Courses getSpecificCourses(@PathVariable int id) {
        return courseService.getSpecificCourse(id);
    }

    @PostMapping("/courses")
    public void addCourses(@RequestBody List<Courses> courses) {
        courseService.addCourses(courses);
    }

    @PutMapping("/courses")
    public void updateCourses(@RequestBody Courses course) {
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourses(@PathVariable int id) {
        courseService.deleteCourse(id);
    }

    @DeleteMapping("/courses")
    public void deleteAllCourses() {
        courseService.deleteAllCourses();
    }
}
