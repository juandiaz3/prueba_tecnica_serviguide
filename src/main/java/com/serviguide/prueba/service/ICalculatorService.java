package com.serviguide.prueba.service;

import java.math.BigDecimal;

import com.serviguide.prueba.model.OperationType;

public interface ICalculatorService {
	
	BigDecimal getOperationResult(OperationType operationType, BigDecimal param1, BigDecimal param2);

}
