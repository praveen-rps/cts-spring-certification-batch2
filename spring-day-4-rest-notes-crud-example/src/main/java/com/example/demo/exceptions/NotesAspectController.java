package com.example.demo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NotesAspectController {


	@ExceptionHandler(NotesNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String getException(NotesNotFoundException e){
		
		return e.getMessage();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
	public Map<String,String> handleErrors(MethodArgumentNotValidException ex){
		Map<String,String> dataErrors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(e->{
			String field = ((FieldError)e).getField();
			String errorMsg = e.getDefaultMessage();
			dataErrors.put(field, errorMsg);
		});
		return dataErrors;
	}
	
}
