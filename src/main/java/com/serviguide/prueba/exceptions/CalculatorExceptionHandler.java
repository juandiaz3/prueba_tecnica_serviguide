package com.serviguide.prueba.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class CalculatorExceptionHandler {
	
	private final String ERROR_DATA_ENTRY = "Error in data entry";
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<CalculatorError> methodArgumentTypeMismatchHandler(MethodArgumentTypeMismatchException exception){
		CalculatorError error = new CalculatorError(exception.getParameter().getParameterName(), ERROR_DATA_ENTRY, exception.getMessage());
		return new ResponseEntity<CalculatorError>(error, HttpStatus.BAD_REQUEST);
	}

}
