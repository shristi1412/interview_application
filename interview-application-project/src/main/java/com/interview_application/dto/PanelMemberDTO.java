package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

<<<<<<< HEAD
=======
import com.interview_application.entity.EmployeeEntity;
>>>>>>> refs/remotes/origin/main
import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

<<<<<<< HEAD
	private String emailID;
	
=======
private String emailid;
	
	@Column(name="location")
>>>>>>> refs/remotes/origin/main
	private String location;
	
<<<<<<< HEAD
=======
	@Column(name="type")
>>>>>>> refs/remotes/origin/main
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
	
	public PanelMemberDTO() {
		super();
	}
	
<<<<<<< HEAD
	public PanelMemberDTO(String emailID, String location, String type) {
=======
	public PanelMemberDTO(String emailid, String location, String type, EmployeeEntity employeeID,InterviewSchedulerEntity emailIDInterview) {
>>>>>>> refs/remotes/origin/main
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
		
	}
	
	public InterviewSchedulerEntity getemailIDInterview() {
		return emailIDInterview;
	}

	public void setemailIDInterview(InterviewSchedulerEntity candidateInterview) {
		this.emailIDInterview = candidateInterview;
	}

<<<<<<< HEAD
=======
	public EmployeeEntity getEmployeeIDpanel() {
		return employeeIDpanel;
	}

	public void setEmployeeIDpanel(EmployeeEntity employeeIDpanel) {
		this.employeeIDpanel = employeeIDpanel;
	}

>>>>>>> refs/remotes/origin/main
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

<<<<<<< HEAD

	@Override
	public String toString() {
		return "PanelMemberEntity [emailID=" + emailID + ", location=" + location + ", type=" + type
				+  "]";
=======
	public EmployeeEntity getEmployeeID() {
		return employeeIDpanel;
>>>>>>> refs/remotes/origin/main
	}

<<<<<<< HEAD
=======
	public void setEmployeeID(EmployeeEntity employeeID) {
		this.employeeIDpanel = employeeID;
	}
>>>>>>> refs/remotes/origin/main

<<<<<<< HEAD
}
=======
	@Override
	public String toString() {
		return "PanelMemberEntity [emailid=" + emailid + ", location=" + location + ", type=" + type
				+ ", employeeIDpanel=" + employeeIDpanel + ", emailIDInterview=" + emailIDInterview + "]";
	}


}
>>>>>>> refs/remotes/origin/main
