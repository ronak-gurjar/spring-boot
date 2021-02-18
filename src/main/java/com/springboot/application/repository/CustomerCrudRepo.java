package com.springboot.application.repository;

import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerCrudRepo extends CrudRepository<Customer, Integer> {

       @Query(value = "SELECT new com.springboot.application.dto.CustProdResponseDto(c.name,p.proName,c.city) FROM Customer c JOIN c.product p")
       List<CustProdResponseDto> joinInfo();
   /* @Query(value = "select c.name,p.pro_name from customer as c join product as p on c.id= pro_id;", nativeQuery = true)
    List<Object> joinInfo();*/

}