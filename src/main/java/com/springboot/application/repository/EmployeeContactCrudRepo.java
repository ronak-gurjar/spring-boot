package com.springboot.application.repository;

import com.springboot.application.entities.EmployeeContact;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeContactCrudRepo extends CrudRepository<EmployeeContact,Integer> {

}
