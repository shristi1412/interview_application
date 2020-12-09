package com.interview_application.exception;

public class EmployeeNotFoundTechToSurrenderException extends Exception {
	
private String message;
	
	public EmployeeNotFoundTechToSurrenderException() {
		this.message = "";
	}
	public EmployeeNotFoundTechToSurrenderException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Employee not found for tech interview [" + message+"]";
	}

}
