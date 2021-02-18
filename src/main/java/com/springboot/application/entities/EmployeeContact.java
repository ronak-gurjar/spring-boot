package com.springboot.application.entities;

import javax.persistence.*;

@Entity
@Table(name = "emp_contact")
public class EmployeeContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "number")
    public long number;
    @Column(name = "type")
    private String type;

    public int getId() {
        return id;
    }

    @OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
    private Employee employee;

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
