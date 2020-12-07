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
@Table(name="panelmember")
public class PanelMemberEntity {
	@Id
	@GeneratedValue
	@Column(name="emailID")
	private int emailID;
	
	@Column(name="location")
	private String location;
	
	@Column(name="type")
	private String type;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeID")
	private String employeeID;
	
	public PanelMemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PanelMemberEntity(int emailID, String location, String type, String employeeID) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeID = employeeID;
	}


	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type + ", employeeID="
				+ employeeID + "]";
	}

	public int getEmailID() {
		return emailID;
	}

	public void setEmailID(int emailID) {
		this.emailID = emailID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

}
