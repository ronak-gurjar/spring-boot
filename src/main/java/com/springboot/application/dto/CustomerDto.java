package com.springboot.application.dto;

import com.springboot.application.entities.Customer;

import java.util.List;

public class CustomerDto {

 private    List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
