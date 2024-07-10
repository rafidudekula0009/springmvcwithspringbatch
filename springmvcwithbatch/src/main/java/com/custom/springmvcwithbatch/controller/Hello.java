package com.custom.springmvcwithbatch.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@CrossOrigin(origins = "*")
public class Hello {
	@RequestMapping(value="sayHello/{name}", method=RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String sayHello(HttpServletResponse response, @PathVariable("name") String name){
		System.out.println("parent sayHello invoked!!. name=> "+name);
		return "Hello "+name+", how are you from parent?";
	}
}
