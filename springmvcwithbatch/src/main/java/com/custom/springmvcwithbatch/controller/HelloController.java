package com.custom.springmvcwithbatch.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

//import io.micrometer.core.instrument.util.IOUtils;

@Controller
public class HelloController {

	 RestTemplate rest = new RestTemplate();
	 
	//http://localhost:8080/springmvcwithbatch	 
	@RequestMapping(value="/hello/{name}", method=RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String getHelloMsg(HttpServletResponse response, @PathVariable("name") String name) throws IOException{
		System.out.println("getHelloMsg invoked!!!!!");
		String resp=rest.getForObject(
	            "http://localhost:90/springmvcwithbatch/hello/sayHello/"+name,
	            String.class);
		return resp;
	}
	
}
