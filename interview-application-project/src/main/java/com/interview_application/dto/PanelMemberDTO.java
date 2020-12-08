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
	private InterviewSchedulerEntity candidateInterview;
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailID, String location, String type, String employeeID,InterviewSchedulerEntity candidateInterview) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
		this.candidateInterview = candidateInterview;
	}

	public PanelMemberDTO(String emailID, String location, String type, String employeeID) {
		super();
		this.emailID = emailID;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
	}
	
	public InterviewSchedulerEntity getCandidateInterview() {
		return candidateInterview;
	}

	public void setCandidateInterview(InterviewSchedulerEntity candidateInterview) {
		this.candidateInterview = candidateInterview;
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
				+ ", employeeIDpanel=" + employeeIDpanel + ", candidateInterview=" + candidateInterview + "]";
	}


}
