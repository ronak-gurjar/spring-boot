package com.springboot.application.service;

import com.springboot.application.repository.CourseCrudRepo;
import com.springboot.application.entities.Courses;
import com.springboot.application.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseRepo {

    @Autowired
    CourseCrudRepo courseCrudRepo;

    // get all course list
    public List<Courses> getCoursesList() {
        return (List<Courses>) courseCrudRepo.findAll();
    }

    // get specific courses
    public Courses getSpecificCourse(int id) {
        return courseCrudRepo.findById(id);
    }

    // add course in list
    public void addCourses(List<Courses> courses) {
        courseCrudRepo.saveAll(courses);
    }

    // update course in list
    public void updateCourse(Courses course) {
        courseCrudRepo.save(course);
    }

    // delete one course
    public void deleteCourse(int id) {
        courseCrudRepo.deleteById(id);
    }

    // delete all courses
    public void deleteAllCourses() {
        courseCrudRepo.deleteAll();
    }

}

