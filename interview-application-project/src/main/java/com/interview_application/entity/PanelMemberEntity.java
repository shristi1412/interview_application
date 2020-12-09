package com.interview_application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="panelmember")
public class PanelMemberEntity {
	@Id
	@GeneratedValue
	@Column(name="emailid")
<<<<<<< HEAD
	private String emailID;
=======
	private String emailid;
>>>>>>> refs/remotes/origin/main
	
	@Column(name="location")
	private String location;
	
	@Column(name="type")
	private String type;
<<<<<<< HEAD
		
=======
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeid")
	private EmployeeEntity employeeIDpanel;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="interviewid")
	private InterviewSchedulerEntity emailIDInterview;
	
>>>>>>> refs/remotes/origin/main
	public PanelMemberEntity() {
		super();
	}
	
<<<<<<< HEAD
	public PanelMemberEntity(String emailID, String location, String type) {
=======
	public PanelMemberEntity(String emailid, String location, String type, EmployeeEntity employeeID,InterviewSchedulerEntity emailIDInterview) {
>>>>>>> refs/remotes/origin/main
		super();
		this.emailid = emailid;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
		this.emailIDInterview = emailIDInterview;
	}

	public PanelMemberEntity(String emailid, String location, String type, EmployeeEntity employeeID) {
		super();
		this.emailid = emailid;
		this.location = location;
		this.type = type;
	}
	
	public InterviewSchedulerEntity getemailIDInterview() {
		return emailIDInterview;
	}

	public void setemailIDInterview(InterviewSchedulerEntity candidateInterview) {
		this.emailIDInterview = candidateInterview;
	}

<<<<<<< HEAD
	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type + ", employeeID="
				 + "]";
=======
	public EmployeeEntity getEmployeeIDpanel() {
		return employeeIDpanel;
	}

	public void setEmployeeIDpanel(EmployeeEntity employeeIDpanel) {
		this.employeeIDpanel = employeeIDpanel;
>>>>>>> refs/remotes/origin/main
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

	public void setType(String type) {
		this.type = type;
	}

<<<<<<< HEAD
=======
	public EmployeeEntity getEmployeeID() {
		return employeeIDpanel;
	}

	public void setEmployeeID(EmployeeEntity employeeID) {
		this.employeeIDpanel = employeeID;
	}
>>>>>>> refs/remotes/origin/main

	@Override
	public String toString() {
		return "PanelMemberEntity [emailid=" + emailid + ", location=" + location + ", type=" + type
				+ ", employeeIDpanel=" + employeeIDpanel + ", emailIDInterview=" + emailIDInterview + "]";
	}


}
