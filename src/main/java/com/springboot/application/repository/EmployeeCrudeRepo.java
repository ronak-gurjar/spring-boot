package com.springboot.application.repository;

import com.springboot.application.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCrudeRepo extends CrudRepository<Employee,Integer> {

}
