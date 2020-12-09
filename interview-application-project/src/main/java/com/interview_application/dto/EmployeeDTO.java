package com.interview_application.dto;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class EmployeeDTO {
	private int employeeid;
	private String name;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int employeeID, String name) {
		super();
		this.employeeid = employeeID;
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeid;
	}

	public void setEmployeeID(int employeeID) {
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

	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
