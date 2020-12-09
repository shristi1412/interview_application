package com.interview_application.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class EmployeeDTO {
	private String employeeid;
	@Column(name="name")
	private String name;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String employeeID, String name) {
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
