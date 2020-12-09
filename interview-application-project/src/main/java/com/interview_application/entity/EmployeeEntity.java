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
<<<<<<< HEAD
	private String employeeID;
=======
	private String employeeid;
>>>>>>> refs/remotes/origin/main
	@Column(name="name")
	private String name;
<<<<<<< HEAD
	

	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="emailid")
=======
>>>>>>> refs/remotes/origin/main
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
<<<<<<< HEAD
		return employeeID;
=======
		return employeeid;
>>>>>>> refs/remotes/origin/main
	}

	public void setEmployeeID(String employeeID) {
<<<<<<< HEAD
		this.employeeID = employeeID;
=======
		this.employeeid = employeeID;
>>>>>>> refs/remotes/origin/main
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

	public PanelMemberEntity getPanelMemberEntity() {
		return panelMemberEntity;
	}

	public void setPanelMemberEntity(PanelMemberEntity panelMemberEntity) {
		this.panelMemberEntity = panelMemberEntity;
	}
	
	@Override
	public String toString() {
<<<<<<< HEAD
		return "EmployeeEntity [employeeID=" + employeeID + ", name=" + name + "panelMemberEntity ="+ panelMemberEntity+"]";
=======
		return "EmployeeEntity [employeeID=" + employeeid + ", name=" + name + "]";
>>>>>>> refs/remotes/origin/main
	}
<<<<<<< HEAD
		
=======

	
	
	
	
>>>>>>> refs/remotes/origin/main

}
