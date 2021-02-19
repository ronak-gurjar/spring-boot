package com.springboot.application.service;

import com.springboot.application.dto.EmployeeDto;
import com.springboot.application.entities.Employee;
import com.springboot.application.repository.EmployeeCrudeRepo;
import com.springboot.application.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeRepo {
    @Autowired
    private EmployeeCrudeRepo employeeCrudeRepo;

    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeCrudeRepo.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return employeeCrudeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeCrudeRepo.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeCrudeRepo.save(employee);

    }
}
