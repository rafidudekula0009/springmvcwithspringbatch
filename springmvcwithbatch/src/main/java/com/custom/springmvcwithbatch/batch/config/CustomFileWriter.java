package com.custom.springmvcwithbatch.batch.config;

import java.util.List;

import org.springframework.batch.core.step.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.custom.springmvcwithbatch.entity.Customer;

public class CustomFileWriter implements ItemWriter<Customer> {
	@Autowired
	HibernateTemplate hibernateTemplate;

//	public void write(List<? extends Customer> items) throws Exception {
//		System.out.println("Writer**********");
//		for (Customer customer : items) {
//			System.out.println("Writer**********"+ customer);
////			Customer CustomerEntity = new Customer();
////			BeanUtils.copyProperties(Customer, CustomerEntity);
////			hibernateTemplate.save(CustomerEntity);
//		}
//	}

//	@Override
//	public void write(Chunk<? extends Customer> chunk) throws Exception {
//		System.out.println("Writer**********");
//		for (Customer customer : chunk) {
//			System.out.println("Writer**********" + customer);
////			Customer CustomerEntity = new Customer();
////			BeanUtils.copyProperties(Customer, CustomerEntity);
////			hibernateTemplate.save(CustomerEntity);
//		}
//
//	}

	@Override
	public void write(List<? extends Customer> items) throws Exception {
		System.out.println("Writer**********");
		for (Customer customer : items) {
			System.out.println("Writer**********" + customer);
//			Customer CustomerEntity = new Customer();
//			BeanUtils.copyProperties(Customer, CustomerEntity);
//			hibernateTemplate.save(CustomerEntity);
		}

	}

}