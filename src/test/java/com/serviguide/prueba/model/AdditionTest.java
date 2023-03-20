package com.serviguide.prueba.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdditionTest {
	
	@InjectMocks
	Addition addition;

	@Test
	void calculateTest() {
		BigDecimal result = addition.calculate(BigDecimal.valueOf(7), BigDecimal.valueOf(5));
		assertEquals(BigDecimal.valueOf(12), result);
	}

}
