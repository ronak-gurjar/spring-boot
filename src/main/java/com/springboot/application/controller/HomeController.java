package com.springboot.application.controller;
import com.springboot.application.service.CourseService;
import com.springboot.application.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String sayHello() {
        return "Hello World";
    }

   /* @GetMapping("/courses")
    public List<Courses> getCourses() {
        return courseService.getCoursesList();
    }

    @GetMapping("/courses/{id}")
    public Courses getSpecificCourses(@PathVariable int id) {
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

    @DeleteMapping("/courses/{id}")
    public void deleteCourses(@PathVariable int id) {
        courseService.deleteCourse(id);
    }*/

}
