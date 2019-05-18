package com.mcmillan.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController()
public class Controllers {
	
	final static Log logger = LogFactory.getLog(Controllers.class);
	
	@GetMapping(value = "/")
	public String healthCheck() {
		
		
		return "success";
	}
	
	//the purpose of the class is to return movie information by ID
	@GetMapping(value = "/GetMovieById/{id}",produces= "MediaType.APPLICATION_JSON_VALUE")
	public String getMovieById(@PathVariable String id) {
		logger.info("ID passes is ==>" + id);
		
		
		return "test";
	}

}
