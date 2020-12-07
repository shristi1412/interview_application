package com.interview_application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	@Column(name="employeeID")
	private int employeeID;
	@Column(name="name")
	private String name;
	
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int employeeID, String name) {
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
