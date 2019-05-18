package com.mcmillan.component;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.mcmillan.utilities.UtilitiesClass;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUtils {

	static Logger log = Logger.getLogger(TestUtils.class);
	
	@Test
	public void testConnection() {
		ResponseEntity<String> res = null;
		
		String URL = "https://api.themoviedb.org/3/search/movie?api_key=88c29ac032cbe7242634c3450e93bdfd&language=en-US&query=the%20lost%20boys&page=1&include_adult=false";
		
		UtilitiesClass utils = new UtilitiesClass();
		
		res = utils.conntectToService(URL);
		
		
		
		
		
		
		
	}
}
