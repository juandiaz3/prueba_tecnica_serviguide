package com.serviguide.prueba.model;

import org.springframework.stereotype.Component;

@Component
public class CalculatorOperationMapper {
	
	private final String NOT_SUPPORTED_OPERATION = "Operation type not supported";

	public CalculatorOperation getOperation(OperationType operationType) {
		switch (operationType) {
		case ADDITION:
			return new Addition();
		case SUBTRACTION:
			return new Subtraction();
		default:
			throw new IllegalArgumentException(NOT_SUPPORTED_OPERATION);
		}
	}

}
