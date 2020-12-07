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
	private String employeeIDpanel;
	
	public PanelMemberEntity() {
		super();
	}
	
	public PanelMemberEntity(int emailID, String location, String type, String employeeID) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
	}


	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type + ", employeeID="
				+ employeeIDpanel + "]";
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
		return employeeIDpanel;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeIDpanel = employeeID;
	}

}
