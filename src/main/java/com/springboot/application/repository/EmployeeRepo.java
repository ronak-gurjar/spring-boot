package com.springboot.application.repository;

import com.springboot.application.entities.Employee;

import java.util.List;

public interface EmployeeRepo {
    List<Employee> getAllEmployee();

    Employee addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(Employee employee);

}
