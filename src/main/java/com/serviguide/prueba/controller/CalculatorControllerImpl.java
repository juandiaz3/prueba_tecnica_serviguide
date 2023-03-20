package com.serviguide.prueba.controller;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serviguide.prueba.model.OperationType;
import com.serviguide.prueba.service.ICalculatorService;

import io.corp.calculator.TracerImpl;

@RestController
@RequestMapping("/api/v1")
public class CalculatorControllerImpl implements ICalculatorController {
	
	@Autowired
	private ICalculatorService calculatorService;
	
	@Autowired
	private TracerImpl tracer;

	@GetMapping(value = "/operation")
	@Override
	public ResponseEntity<?> calculatorResult(@RequestParam OperationType operationType, @RequestParam BigDecimal param1, @RequestParam BigDecimal param2) {
		
		tracer.trace(StringUtils.join("CalculatorController: calculatorResult(Type: ", operationType.toString(), ", Parameter 1:", param1, ", Parameter 2: ", param2));
		
		BigDecimal result = calculatorService.getOperationResult(operationType, param1, param2);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
