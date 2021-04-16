package com.springboot.application.repository;

import com.springboot.application.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCrudRepo extends CrudRepository<Student,Integer> {


}
