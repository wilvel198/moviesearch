package com.mcmillan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controllers {
	
	@GetMapping(value = "/")
	public String healthCheck() {
		
		
		return "success";
	}

}
