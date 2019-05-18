package com.mcmillan.utilities;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class UtilitiesClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static ResponseEntity<String> conntectToService(String URL) {
		String respInfo = null;
		ResponseEntity<String> result = null;
		
		 RestTemplate restTemplate = new RestTemplate();
		 
		 try {
			URI uri = new URI(URL);
			
		    result = restTemplate.getForEntity(uri, String.class);
			  
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
}
