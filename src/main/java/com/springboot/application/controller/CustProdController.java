package com.springboot.application.controller;


import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import com.springboot.application.repository.CustomerCrudRepo;
import com.springboot.application.repository.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustProdController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/placeOrder")
    public List<Customer> PlaceOrder(@RequestBody List<Customer> customer) {
       return customerService.PlaceOrder(customer);
    }

    @GetMapping("/getInfo")
    public List<CustProdResponseDto> getInfo() {
      return   customerService.getInfo();
    }

    @DeleteMapping("/deleteInfo/{id}")
    public void deleteInfo(@PathVariable int id) {
        customerService.deleteInfo(id);
    }

}