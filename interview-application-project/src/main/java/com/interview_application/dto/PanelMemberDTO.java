package com.interview_application.dto;

import javax.persistence.CascadeType;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class PanelMemberDTO {

	private String emailID;
	private String location;
	private String type;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeID")
	private String employeeIDpanel;
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailID, String location, String type, String employeeID) {
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

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
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
