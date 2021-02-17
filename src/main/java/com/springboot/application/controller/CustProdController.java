package com.springboot.application.controller;

import com.springboot.application.dto.CustProdRequestDto;
import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import com.springboot.application.repository.CustomerRepo;
import com.springboot.application.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustProdController {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ProductRepo productRepo;

    @PostMapping("/placeOrder")
    public Customer PlaceOrder(@RequestBody CustProdRequestDto custProdRequestDto) {
        return customerRepo.save(custProdRequestDto.getCustomer());
    }

    @GetMapping("/getList")
    public List<Customer> CustomerList() {
        return (List<Customer>) customerRepo.findAll();
    }

    @GetMapping("/getInfo")
    public List<CustProdResponseDto> getInfo() {
        return customerRepo.joinInfo();
    }
}
