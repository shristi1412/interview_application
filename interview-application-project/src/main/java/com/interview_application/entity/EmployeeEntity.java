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
	private PanelMemberEntity panelMemberEntity;
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String employeeID, String name, PanelMemberEntity panelMemberEntity) {
		super();
		this.employeeid = employeeID;
		this.name = name;
		this.panelMemberEntity = panelMemberEntity;
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

	public PanelMemberEntity getPanelMemberEntity() {
		return panelMemberEntity;
	}

	public void setPanelMemberEntity(PanelMemberEntity panelMemberEntity) {
		this.panelMemberEntity = panelMemberEntity;
	}
	
	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeid + ", name=" + name + "]";
	}

	
	
	
	

}
