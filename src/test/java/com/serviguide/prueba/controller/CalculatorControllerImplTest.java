package com.serviguide.prueba.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.serviguide.prueba.model.OperationType;
import com.serviguide.prueba.service.CalculatorServiceImpl;
import com.serviguide.prueba.service.ICalculatorService;

import io.corp.calculator.TracerImpl;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerImplTest {
	
	@Mock
	ICalculatorService calculatorService = new CalculatorServiceImpl();
	
	@Mock
	TracerImpl tracer;
	
	@InjectMocks
	CalculatorControllerImpl calculatorController;

	@Test
	void calculatorResultTest() {
		when(calculatorService.getOperationResult(OperationType.ADDITION, BigDecimal.valueOf(3), BigDecimal.valueOf(4))).thenReturn(BigDecimal.valueOf(7));
		
		ResponseEntity<?> result = calculatorController.calculatorResult(OperationType.ADDITION, BigDecimal.valueOf(3), BigDecimal.valueOf(4));
		
		assertEquals(BigDecimal.valueOf(7), result.getBody());
		assertEquals(HttpStatus.OK, result.getStatusCode());
	}

}
