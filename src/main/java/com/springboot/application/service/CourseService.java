package com.springboot.application.service;

import com.springboot.application.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    /*    public List<Courses> coursesList = new ArrayList<>(Arrays.asList(new Courses(10, "SpringBoot", "spring boot tutorial"),
                new Courses(20, "java", "java tutorial"),
                new Courses(30, "python", "python tutorial")));*/
    public List<Courses> coursesList = new ArrayList<>();

    // get all course list
    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public Courses getSpecificCourse(int id) {
        Courses c = null;
        for (Courses courses : coursesList) {
            if (courses.getId() == id) {
                c = courses;
                break;
            }
        }
        return c;
    }

    // add course in list
    public void addCourses(Courses courses) {
        coursesList.add(courses);
    }

    // update course in list
    public void updateCourse(int id, Courses course) {
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getId() == id) {
                coursesList.set(i, course);
                return;
            }
        }
    }

    // delete course from list
    public void deleteCourse(int id) {
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getId() == id) {
                coursesList.remove(i);
                break;
            }
        }
    }
}
