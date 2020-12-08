package com.interview_application.exception;

public class EmployeeNotFoundException extends Exception{
	public String Message;
	public EmployeeNotFoundException(){
		this.Message = "";
	}
	public EmployeeNotFoundException(String customMessage) {
		this.Message = customMessage;
	}
	@Override
	public String toString() {
		return "Item not found " + this.Message;
	}
}
