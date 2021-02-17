package com.springboot.application.repository;

import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
    @Query("SELECT new com.springboot.application.dto.CustProdResponseDto(c.name,p.proName ) FROM Customer c JOIN c.product p")
    List<CustProdResponseDto> joinInfo();

}
