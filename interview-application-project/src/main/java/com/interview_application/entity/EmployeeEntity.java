package com.interview_application.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class EmployeeEntity implements Externalizable{
	@Id
//	@GeneratedValue
	@Column(name="employeeid")
	private int employeeid;
	@Column(name="name")
	private String name;
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int employeeID, String name) {
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
