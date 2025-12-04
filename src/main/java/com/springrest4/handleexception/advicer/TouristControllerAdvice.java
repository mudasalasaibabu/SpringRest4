package com.springrest4.handleexception.advicer;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springrest4.handleexception.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristException(TouristNotFoundException e){
		ErrorDetails errorDetails = new ErrorDetails("404 Not Found",e.getMessage(),LocalDate.now());
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception e){
		ErrorDetails errorDetails = new ErrorDetails("Internal Server Error",e.getMessage(),LocalDate.now());
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
