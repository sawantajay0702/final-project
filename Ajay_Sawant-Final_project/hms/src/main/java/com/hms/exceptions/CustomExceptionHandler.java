package com.hms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hms.ResponseHandler.GlobalResponseHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(EntitySaveException.class)
	public ResponseEntity<Object> entitySaveException(EntitySaveException entitySaveException){
		return GlobalResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, entitySaveException.getMessage());
	}
	
	@ExceptionHandler(GeneratException.class)
	public ResponseEntity<Object> entitySaveException(GeneratException generatException){
		return GlobalResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, generatException.getMessage());
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<Object> entitySaveException(EntityNotFoundException entityNotFoundException){
		return GlobalResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, entityNotFoundException.getMessage());
	}
}
