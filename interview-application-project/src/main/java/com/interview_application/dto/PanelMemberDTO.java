package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

private String emailid;
	
	@Column(name="location")
	private String location;
	
	@Column(name="type")
	private String type;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeid")
	private EmployeeEntity employeeIDpanel;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="interviewid")
	private InterviewSchedulerEntity emailIDInterview;
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(String emailid, String location, String type, EmployeeEntity employeeID,InterviewSchedulerEntity emailIDInterview) {
		super();
		this.emailid = emailid;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
		this.emailIDInterview = emailIDInterview;
	}

	public PanelMemberDTO(String emailid, String location, String type, EmployeeEntity employeeID) {
		super();
		this.emailid = emailid;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
	}
	
	public InterviewSchedulerEntity getemailIDInterview() {
		return emailIDInterview;
	}

	public void setemailIDInterview(InterviewSchedulerEntity candidateInterview) {
		this.emailIDInterview = candidateInterview;
	}

	public EmployeeEntity getEmployeeIDpanel() {
		return employeeIDpanel;
	}

	public void setEmployeeIDpanel(EmployeeEntity employeeIDpanel) {
		this.employeeIDpanel = employeeIDpanel;
	}

	public String getEmailID() {
		return emailid;
	}

	public void setEmailID(String emailID) {
		this.emailid = emailID;
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

	public EmployeeEntity getEmployeeID() {
		return employeeIDpanel;
	}

	public void setEmployeeID(EmployeeEntity employeeID) {
		this.employeeIDpanel = employeeID;
	}

	@Override
	public String toString() {
		return "PanelMemberEntity [emailid=" + emailid + ", location=" + location + ", type=" + type
				+ ", employeeIDpanel=" + employeeIDpanel + ", emailIDInterview=" + emailIDInterview + "]";
	}


}
