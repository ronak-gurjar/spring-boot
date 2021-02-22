package com.springboot.application.controller;

import com.springboot.application.dto.CustProdRequestDto;
import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import com.springboot.application.repository.CustomerCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustProdController {

    @Autowired
    private CustomerCrudRepo customerCrudRepo;

    @PostMapping("/placeOrder")
    public List<Customer> PlaceOrder(@RequestBody CustProdRequestDto custProdRequestDto) {
        return (List<Customer>) customerCrudRepo.saveAll(custProdRequestDto.getCustomer());
    }

    @GetMapping("/getList")
    public List<Customer> CustomerList() {
        return (List<Customer>) customerCrudRepo.findAll();
    }

    @GetMapping("/getInfo")
    public List<CustProdResponseDto> getInfo() {
        return customerCrudRepo.joinInfo();
    }

    @DeleteMapping("/deleteInfo/{id}")
    public void deleteInfo(@PathVariable int id) {
        customerCrudRepo.deleteById(id);
    }

}