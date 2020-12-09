package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

	private String emailID;
	
	private String location;
	
	private String type;
	
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailID, String location, String type) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		
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


	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type
				+  "]";
	}


}