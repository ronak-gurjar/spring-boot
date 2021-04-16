package com.springboot.application.service;


import com.springboot.application.dto.CustProdResponseDto;
import com.springboot.application.entities.Customer;
import com.springboot.application.repository.CustomerCrudRepo;
import com.springboot.application.repository.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerCrudRepo customerCrudRepo;

    @Override
    public List<Customer> PlaceOrder(List<Customer> customer) {
        return (List<Customer>) customerCrudRepo.saveAll(customer);
    }

    @Override
    public Optional<Customer> getCustomer(int id) {
        return customerCrudRepo.findById(id);
    }

    @Override
    public List<CustProdResponseDto> getInfo() {
        return customerCrudRepo.joinInfo();
    }

    @Override
    public void delete(int id) {
        customerCrudRepo.deleteById(id);
    }
}
