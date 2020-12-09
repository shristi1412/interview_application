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
	@Column(name="emailid")
	private String emailID;
	
	@Column(name="location")
	private String location;
	
	@Column(name="type")
	private String type;
		
	public PanelMemberEntity() {
		super();
	}
	
	public PanelMemberEntity(String emailID, String location, String type) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
	}


	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type + ", employeeID="
				 + "]";
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


}
