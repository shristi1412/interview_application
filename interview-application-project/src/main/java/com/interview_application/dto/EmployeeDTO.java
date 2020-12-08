package com.interview_application.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class EmployeeDTO {
	private int employeeID;
	private String name;
	private InterviewSchedulerEntity employeeInterview;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int employeeID, String name, InterviewSchedulerEntity employeeInterview) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.employeeInterview = employeeInterview;
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

	public InterviewSchedulerEntity getEmployeeInterview() {
		return employeeInterview;
	}

	public void setEmployeeInterview(InterviewSchedulerEntity employeeInterview) {
		this.employeeInterview = employeeInterview;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeID + ", name=" + name + ", employeeInterview="
				+ employeeInterview + "]";
	}

}
