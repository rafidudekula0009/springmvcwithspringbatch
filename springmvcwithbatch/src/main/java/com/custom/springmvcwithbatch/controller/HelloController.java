package com.custom.springmvcwithbatch.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

//import io.micrometer.core.instrument.util.IOUtils;

@Controller
@CrossOrigin(origins = "*")
public class HelloController {

	 RestTemplate rest = new RestTemplate();
	 String REST_URI="http://localhost:90/springmvcwithbatch/hello/sayHello/";
	 String REST_URI_CONTAINER="http://host.docker.internal:90/springmvcwithbatch/hello/sayHello/";
	 
	 // http://localhost:8080/springmvcwithbatch/hello/rafi
	@RequestMapping(value="/hello/{name}", method=RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String getHelloMsg(HttpServletResponse response, @PathVariable("name") String name) throws IOException{
		System.out.println("getHelloMsg invoked!!!!!");
		String resp=rest.getForObject(
	            REST_URI+name,
	            String.class);
		return resp;
	}
	
	@RequestMapping(value="/hello1/{name}", method=RequestMethod.GET, produces="text/plain")
	@ResponseBody
	public String getHelloMsg1(HttpServletResponse response, @PathVariable("name") String name) throws IOException{
		System.out.println("getHelloMsg1 invoked!!!!!");
		String resp=rest.getForObject(
				REST_URI_CONTAINER+name,
	            String.class);
		return resp;
	}
	
}
