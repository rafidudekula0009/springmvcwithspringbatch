package com.custom.springmvcwithbatch.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.custom.springmvcwithbatch.entity.Customer;

public class CustomFileProcessor implements ItemProcessor<Customer, Customer> {

	public Customer process(Customer item) throws Exception {
		System.out.println("Processor*************");
		return item;
	}

}