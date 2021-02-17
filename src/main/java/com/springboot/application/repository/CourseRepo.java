package com.springboot.application.repository;

import com.springboot.application.entities.Courses;

import java.util.List;

public interface CourseRepo {
    List<Courses> getCoursesList();

    Courses getSpecificCourse(int id);

    void addCourses(List<Courses> courses);

    void updateCourse(Courses course);

    void deleteCourse(int id);

    void deleteAllCourses();

}
