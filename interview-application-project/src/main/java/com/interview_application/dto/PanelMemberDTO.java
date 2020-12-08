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
	
	private String employeeIDpanel; 
	private InterviewSchedulerEntity emailIDInterview;
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailID, String location, String type, String employeeID,InterviewSchedulerEntity emailIDInterview) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
		this.emailIDInterview = emailIDInterview;
	}

	public PanelMemberDTO(String emailID, String location, String type, String employeeID) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
	}
	
	public InterviewSchedulerEntity getemailIDInterview() {
		return emailIDInterview;
	}

	public void setemailIDInterview(InterviewSchedulerEntity emailIDInterview) {
		this.emailIDInterview = emailIDInterview;
	}

	public String getEmployeeIDpanel() {
		return employeeIDpanel;
	}

	public void setEmployeeIDpanel(String employeeIDpanel) {
		this.employeeIDpanel = employeeIDpanel;
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

	public static void setType(String type) {
		//this.type = type;
	}

	public String getEmployeeID() {
		return employeeIDpanel;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeIDpanel = employeeID;
	}

	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type
				+ ", employeeIDpanel=" + employeeIDpanel + ", emailIDInterview=" + emailIDInterview + "]";
	}


}
