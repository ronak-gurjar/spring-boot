package com.springboot.application.service;

import com.springboot.application.entities.Student;
import com.springboot.application.repository.StudentCrudRepo;
import com.springboot.application.repository.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentCrudRepo studentCrudRepo;

    @Override
    public Student addStudent(Student student) {
        return studentCrudRepo.save(student);

    }

    @Override
    public void deleteStudent(int id) {
        studentCrudRepo.deleteById(id);
    }

    @Override
    public Optional<Student> getStudent(int id) {
        return studentCrudRepo.findById(id);
    }

    @Override
    public void deleteAllRecord() {
        studentCrudRepo.deleteAll();
    }

}
