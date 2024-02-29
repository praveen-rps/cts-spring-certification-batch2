package com.example.demo.controllers;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController  // @Controller + @ResponseBody
public class RestDemoController {
	
	
	@GetMapping("/testParams/{name}")
	public String testParams(@PathVariable String name,
			@RequestParam String city, @RequestParam String state,
			@RequestHeader String langauge) {
		return "Hello "+name+" Welcome to "+city+" of "+state+ " state, which has spoken language as "+langauge;
	}
	
	
	@GetMapping("/notes")
	public Notes getNotes() {
		return new Notes(1001,"kishore","spring","best ee framework");
	}
	
	
	// @GetMapping("/store/orders")-->
	// @RequestMapping(path="/store/orders",
	// method=RequestMethod.GET) 

	
	@GetMapping
	//@ResponseStatus(HttpStatus.CREATED)
	//@ResponseBody
	public ResponseEntity<String> getMapping() {
		return new ResponseEntity<>("Get Mapping is called",
				HttpStatus.OK);
	}
	@PostMapping("/notes")
	@ResponseStatus(HttpStatus.CREATED)
	public Notes postMapping(@RequestBody Notes note) {
		note.setAuthor("krishna");
		
		URI location = ServletUriComponentsBuilder
			       .fromCurrentRequestUri()
			       .path("")
			       .buildAndExpand(note)
			       .toUri(); 

			//  return new ResponseEntity(note,HttpStatus.CREATED);
		return note;


	}
	@GetMapping("/demo")
	public String demoMapping() {
		return "demo Mapping is responded from spring-day4";
	}
	@PutMapping
	public String putMapping() {
		return "put Mapping is called";
	}
	

}
