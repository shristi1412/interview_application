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
	@Column(name="employeeid")
	private String employeeid;
	@Column(name="name")
	private String name;
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String employeeID, String name) {
		super();
		this.employeeid = employeeID;
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeid;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeid = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeid + ", name=" + name + "]";
	}

	
	
	
	

}
