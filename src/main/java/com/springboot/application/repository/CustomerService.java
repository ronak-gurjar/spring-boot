package com.springboot.application.repository;


import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {

    List<Customer> PlaceOrder(List<Customer> customer);

    List<CustProdResponseDto> getInfo();

    public void deleteInfo( int id);
}
