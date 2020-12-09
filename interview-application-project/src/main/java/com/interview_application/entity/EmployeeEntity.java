package com.interview_application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	@Column(name="employeeid")
	private String employeeID;
	@Column(name="name")
	private String name;
	

	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="emailid")
	private PanelMemberEntity panelMemberEntity;
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String employeeID, String name, PanelMemberEntity panelMemberEntity) {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.panelMemberEntity = panelMemberEntity;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
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
		return "EmployeeEntity [employeeID=" + employeeID + ", name=" + name + "panelMemberEntity ="+ panelMemberEntity+"]";
	}
		

}
