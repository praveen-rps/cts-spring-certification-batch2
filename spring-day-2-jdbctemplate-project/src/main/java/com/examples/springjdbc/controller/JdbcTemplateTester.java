package com.examples.springjdbc.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.springjdbc.configs.NotesConfiguration;
import com.examples.springjdbc.model.Notes;
import com.examples.springjdbc.service.NoteServiceImpl;

public class JdbcTemplateTester {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(NotesConfiguration.class);
		
		Notes note = new Notes(1003,"Krishna","Salesforce","This is best rest api tool");
		
		NoteServiceImpl service = context.getBean(NoteServiceImpl.class);
		//service.insertNotes(note);
		//service.getAllNotes().forEach(System.out::println);
		//System.out.println(service.searchNotes(1004));
		//System.out.println(service.deleteNotes(1004));
		//service.insertNotes(note);
		//service.updateNotes(note);
		service.getAllNotes().forEach(System.out::println);
		
	}

}
