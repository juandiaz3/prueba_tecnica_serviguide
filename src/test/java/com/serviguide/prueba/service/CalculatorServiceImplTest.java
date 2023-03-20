package com.serviguide.prueba.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.serviguide.prueba.model.Addition;
import com.serviguide.prueba.model.CalculatorOperationMapper;
import com.serviguide.prueba.model.OperationType;
import com.serviguide.prueba.model.Subtraction;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {
	
	@Mock
	CalculatorOperationMapper calculatorMapper;
	
	@InjectMocks
	ICalculatorService calculatorService = new CalculatorServiceImpl();

	@Test
	void getOperationResultAdditionTest() {
		when(calculatorMapper.getOperation(OperationType.ADDITION)).thenReturn(new Addition());
		
		BigDecimal result = calculatorService.getOperationResult(OperationType.ADDITION, BigDecimal.valueOf(8), BigDecimal.valueOf(5));
		
		assertEquals(BigDecimal.valueOf(13), result);
	}
	
	@Test
	void getOperationResultSubtractionTest() {
		when(calculatorMapper.getOperation(OperationType.SUBTRACTION)).thenReturn(new Subtraction());
		
		BigDecimal result = calculatorService.getOperationResult(OperationType.SUBTRACTION, BigDecimal.valueOf(8), BigDecimal.valueOf(5));
		
		assertEquals(BigDecimal.valueOf(3), result);
	}

}
