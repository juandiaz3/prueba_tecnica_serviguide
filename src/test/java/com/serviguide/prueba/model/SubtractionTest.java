package com.serviguide.prueba.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubtractionTest {
	
	@InjectMocks
	Subtraction subtraction;

	@Test
	void calculateTest() {
		BigDecimal result = subtraction.calculate(BigDecimal.valueOf(14), BigDecimal.valueOf(6));
		assertEquals(BigDecimal.valueOf(8), result);
	}

}
