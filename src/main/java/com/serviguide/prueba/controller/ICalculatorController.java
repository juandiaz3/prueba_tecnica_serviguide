package com.serviguide.prueba.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;

import com.serviguide.prueba.model.OperationType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = {"Calculator Controller"})
public interface ICalculatorController {
	
	@ApiOperation(value = "This method is used to get the results of the calculator operations")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Operation sucessfully done"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 500, message = "Internal Server Error")
	})
	public ResponseEntity<?> calculatorResult(@ApiParam(name = "operationType", value = "Type of operation to be execute") OperationType operationType, 
			@ApiParam(name = "param1", value = "Value of the first parameter", example = "2") BigDecimal param1, 
			@ApiParam(name = "param2", value = "Value of the second parameter", example = "4") BigDecimal param2);

}
