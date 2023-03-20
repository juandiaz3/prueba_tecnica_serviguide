package com.serviguide.prueba.model;

import java.math.BigDecimal;

public class Addition implements CalculatorOperation {

	@Override
	public BigDecimal calculate(BigDecimal param1, BigDecimal param2) {
		return param1.add(param2);
	}

}
