package com.springboot.application.controller;

import com.springboot.application.entities.Employee;
import com.springboot.application.entities.EmployeeContact;
import com.springboot.application.repository.EmployeeContactCrudRepo;
import com.springboot.application.repository.EmployeeCrudeRepo;
import com.springboot.application.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeRepo.addEmployee(employee);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return employeeRepo.getAllEmployee();
    }
}
