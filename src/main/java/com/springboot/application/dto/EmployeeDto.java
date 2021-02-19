package com.springboot.application.dto;

import com.springboot.application.entities.Employee;

public class EmployeeDto {
private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
