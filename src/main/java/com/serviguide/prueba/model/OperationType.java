package com.serviguide.prueba.model;

public enum OperationType {
	
	ADDITION("Addition"), SUBTRACTION("Subtraction");
	
	private final String type;
	
	private OperationType(String type) {
		this.type = type;
	}

}
