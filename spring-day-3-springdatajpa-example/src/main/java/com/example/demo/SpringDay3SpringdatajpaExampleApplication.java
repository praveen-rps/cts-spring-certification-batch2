package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.jpa.model.Notes;
import com.example.demo.jpa.service.NoteService;

@SpringBootApplication
public class SpringDay3SpringdatajpaExampleApplication implements CommandLineRunner{

	@Autowired
	NoteService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDay3SpringdatajpaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Notes note = new Notes(1009,"anil","operating systems","best book for os");
		//service.insertNotes(note);
		//service.getAllNotes().forEach(System.out::println);
	//	service.findByAuthor("praveen").forEach(System.out::println);
		//service.findByPidLessThan(1004).forEach(System.out::println);;
		//System.out.println(service.findFirstByAuthor("praveen"));
		//service.findByAuthorLessThan("mahesh").forEach(System.out::println);
		service.findByAuthorAndTitle("praveen","micro").forEach(System.out::println);
	
	}

}
