package com.interview_application.dto;


public class EmployeeDTO {
	private int employeeID;
	private String name;
	
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeID + ", name=" + name + "]";
	}
}
