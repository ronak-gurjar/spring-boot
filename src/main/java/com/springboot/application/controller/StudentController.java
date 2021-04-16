package com.springboot.application.controller;

import com.springboot.application.entities.Student;

import com.springboot.application.repository.StudentCrudRepo;
import com.springboot.application.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable int id) {
      return studentService.getStudent(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @DeleteMapping("/deleteAll")
    private void DeleteAllRecord(){
        studentService.deleteAllRecord();
    }

}
