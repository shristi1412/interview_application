package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

	private String emailid;
	
	private String location;
	
	private String type;
	
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailid, String location, String type) {
		super();
		this.emailid = emailid;
		this.location = location;
		this.type = type;
		
	}


	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
		return "PanelMemberEntity [emailID=" + emailid + ", location=" + location + ", type=" + type
				+  "]";
	}


}