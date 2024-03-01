package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActutorControlller {
	
	@GetMapping("/service1")
	public String service1() {
		return "service 1 is called";
	}
	

	@GetMapping("/service2")
	public String service2() {
		return "service 1 is called";
	}

	@GetMapping("/service3")
	public String service3() {
		return "service 1 is called";
	}
	

}
