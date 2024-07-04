package com.custom.springmvcwithbatch.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.custom.springmvcwithbatch.config.CustomerService;
import com.custom.springmvcwithbatch.entity.Customer;

//import io.micrometer.core.instrument.util.IOUtils;

@Controller
public class HomeController {

	 @Autowired
	    private CustomerService customerService;
	 
	//http://localhost:8080/springmvcwithbatch	 
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		customerService.save(new Customer("","",""));
		return new ModelAndView("home");
	}
	
	//http://localhost:8080/springmvcwithbatch/insert_customer/rafi/rafidudekula009@gmail.com/hyderabad
	@RequestMapping(value="insert_customer/{name}/{email}/{address}")
	public ModelAndView insertCustomer(HttpServletResponse response, @PathVariable("name") String name, @PathVariable("email") String email, @PathVariable("address") String address) throws IOException{
		customerService.save(new Customer(name, email, address));
		System.out.println("------insertCustomer invoked!!-------");
	    ModelAndView mav = new ModelAndView("insert_success");
		return new ModelAndView("insert_success");
	}
	
	
	
}
