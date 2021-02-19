package com.springboot.application.controller;

import com.springboot.application.dto.EmployeeDto;
import com.springboot.application.entities.Employee;
import com.springboot.application.entities.EmployeeContact;
import com.springboot.application.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return employeeRepo.getAllEmployee();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody EmployeeDto employee) {
        return employeeRepo.addEmployee(employee.getEmployee());
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody EmployeeDto employee) {
        return employeeRepo.addEmployee(employee.getEmployee());
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeRepo.deleteEmployee(id);
    }
}
