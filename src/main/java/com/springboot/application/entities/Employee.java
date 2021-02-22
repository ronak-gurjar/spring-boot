package com.springboot.application.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "age")
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_key", referencedColumnName = "emp_id")
    private List<EmployeeContact> employeeContact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<EmployeeContact> getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(List<EmployeeContact> employeeContact) {
        this.employeeContact = employeeContact;
    }
}
