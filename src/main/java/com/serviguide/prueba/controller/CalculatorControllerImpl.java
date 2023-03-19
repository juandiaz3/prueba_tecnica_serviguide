package com.serviguide.prueba.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviguide.prueba.model.OperationType;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1")
public class CalculatorControllerImpl implements ICalculatorController {

	@GetMapping(value = "/operation")
	@Override
	public ResponseEntity<?> calculatorResult(OperationType operationType, BigDecimal param1, BigDecimal param2) {
		// TODO Auto-generated method stub
		return null;
	}

}
