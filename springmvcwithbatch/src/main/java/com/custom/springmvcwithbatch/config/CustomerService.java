package com.custom.springmvcwithbatch.config;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.custom.springmvcwithbatch.entity.Customer;
 
@Service
@Transactional
public class CustomerService {
    @Autowired CustomerRepository repo;
     
    public void save(Customer customer) {
        repo.save(customer);
    }
     
    public List<Customer> listAll() {
        return (List<Customer>) repo.findAll();
    }
     
    public Customer get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
     
}