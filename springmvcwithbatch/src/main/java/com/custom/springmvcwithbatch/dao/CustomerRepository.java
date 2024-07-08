package com.custom.springmvcwithbatch.dao;
 
import org.springframework.data.repository.CrudRepository;

import com.custom.springmvcwithbatch.entity.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
     
}