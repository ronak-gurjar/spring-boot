package com.springboot.application.dto;

import com.springboot.application.entities.Customer;
import com.springboot.application.entities.Product;

public class CustProdRequestDto {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
