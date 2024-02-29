package com.example.demo.exceptions;

public class InvalidNotesDataException extends RuntimeException{
	
	public InvalidNotesDataException() {
		super("Notes data is invalid");
	}

}
