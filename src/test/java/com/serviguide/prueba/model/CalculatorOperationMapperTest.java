package com.serviguide.prueba.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorOperationMapperTest {
	
	@InjectMocks
	CalculatorOperationMapper calculatorMapper;

	@Test
	void getOperationAdditionTest() {
		CalculatorOperation operation = calculatorMapper.getOperation(OperationType.ADDITION);
		assertTrue(operation instanceof Addition);
	}
	
	@Test
	void getOperationSubtractionTest() {
		CalculatorOperation operation = calculatorMapper.getOperation(OperationType.SUBTRACTION);
		assertTrue(operation instanceof Subtraction);
	}

}
