package com.springboot.application.repository;


import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> PlaceOrder(List<Customer> customer);

    Optional<Customer> getCustomer(int id);

    List<CustProdResponseDto> getInfo();

     void delete( int id);
}
