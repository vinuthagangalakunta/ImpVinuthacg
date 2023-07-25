package com.financialorgratingsystem.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.financialorgratingsystem.exception.NotFoundException;

@ControllerAdvice
public class ExceptionHandlers {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(NotFoundException notFoundException){
		return new ResponseEntity<String>("Id not found, please look into it",HttpStatus.BAD_REQUEST);
	}
}
