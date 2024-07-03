package com.custom.springmvcwithbatch.config;
 
import org.springframework.data.repository.CrudRepository;

import com.custom.springmvcwithbatch.entity.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
     
}