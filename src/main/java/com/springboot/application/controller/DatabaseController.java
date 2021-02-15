package com.springboot.application.controller;

import com.springboot.application.service.DatabaseService;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Courses> getSpecificCourses(@PathVariable int id) {
        return courseService.getSpecificCourse(id);
    }

    @PostMapping("/courses")
    public void addCourses(@RequestBody Courses courses) {
        courseService.addCourses(courses);
    }

    @PutMapping("/courses/{id}")
    public void updateCourses(@PathVariable int id, @RequestBody Courses course) {
        courseService.updateCourse(id, course);
    }

}
