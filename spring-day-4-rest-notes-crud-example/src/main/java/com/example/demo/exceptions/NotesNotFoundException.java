package com.example.demo.exceptions;

public class NotesNotFoundException extends RuntimeException{
	
	public NotesNotFoundException() {
		super("Notes with give id is not found");
	}

}
