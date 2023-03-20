package com.serviguide.prueba.exceptions;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class CalculatorError {
	
	private String path;
	private String message;
	private List<String> errors;
	
	public CalculatorError(String path, String message, List<String> errors) {
		this.path = path;
		this.message = message;
		this.errors = errors;
	}
	
	public CalculatorError(String path, String message, String error) {
		this.path = path;
		this.message = message;
		this.errors = Arrays.asList(error);
	}

}
