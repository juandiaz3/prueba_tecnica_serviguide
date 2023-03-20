package com.serviguide.prueba.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviguide.prueba.model.CalculatorOperationMapper;
import com.serviguide.prueba.model.OperationType;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
	
	@Autowired
	CalculatorOperationMapper operationMapper;

	@Override
	public BigDecimal getOperationResult(OperationType operationType, BigDecimal param1, BigDecimal param2) {
		return operationMapper.getOperation(operationType).calculate(param1, param2);
	}

}
