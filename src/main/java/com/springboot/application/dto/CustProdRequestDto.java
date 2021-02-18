package com.springboot.application.dto;

import com.springboot.application.entities.Customer;

import java.util.List;

public class CustProdRequestDto {
    private List<Customer> customer;

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;

    }
}
