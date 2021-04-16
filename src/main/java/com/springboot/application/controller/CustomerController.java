package com.springboot.application.controller;


import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import com.springboot.application.repository.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/placeOrder")
    public List<Customer> PlaceOrder(@RequestBody List<Customer> customer) {
        return customerService.PlaceOrder(customer);
    }

    @GetMapping("getCustomer/{id}")
    public Optional<Customer> getCustomer(@PathVariable int id) {
        return customerService.getCustomer(id);
    }

    @GetMapping("/getJoinInfo")
    public List<CustProdResponseDto> getInfo() {
        return customerService.getInfo();
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteInfo(@PathVariable int id) {
        customerService.delete(id);
    }

}