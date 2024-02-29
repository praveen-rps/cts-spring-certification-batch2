package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateControllerDemo {
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/demo")
	public ResponseEntity<Notes> testDemo() {
		String url = "http://localhost:8080/notes";
		Notes note = new Notes(1,"hari","bds","medicine group");
	//	String url = "https://jsonplaceholder.typicode.com/users";
		
		return template.postForEntity(url, note, Notes.class);		//return template.getForObject(url, List.class);
		//return entity.getBody();
	}

}
