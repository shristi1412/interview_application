package com.interview_application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="interviewscheduler")
public class InterviewSchedulerEntity {
	@Id
	@GeneratedValue
	@Column(name="interviewID")
	private int interviewID;
	@Column(name="techrating")
	private int techrating;
	@Column(name="hrrating")
	private int hrrating;
	@Column(name="location")
	private int location;
	@Column(name="finalstatus")
	private int finalstatus;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "candidateInterview")
	private String employeeIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "employeeInterview")
	private String cadidateIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "emailIDInterview")
	private String emailIDinter;
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerEntity(int interviewID, String candidatename, int techrating, int hrrating, int location,
			int finalstatus, String employeeIDinter, String cadidateIDinter, String emailIDinter) {
		super();
		this.interviewID = interviewID;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
		this.employeeIDinter = employeeIDinter;
		this.cadidateIDinter = cadidateIDinter;
		this.emailIDinter = emailIDinter;
	}
	
	
	public int getInterviewID() {
		return interviewID;
	}
	public void setInterviewID(int interviewID) {
		this.interviewID = interviewID;
	} 
	public int getTechrating() {
		return techrating;
	}
	public void setTechrating(int techrating) {
		this.techrating = techrating;
	}
	public int getHrrating() {
		return hrrating;
	}
	public void setHrrating(int hrrating) {
		this.hrrating = hrrating;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getFinalstatus() {
		return finalstatus;
	}
	public void setFinalstatus(int finalstatus) {
		this.finalstatus = finalstatus;
	}
	public String getEmployeeIDinter() {
		return employeeIDinter;
	}
	public void setEmployeeIDinter(String employeeIDinter) {
		this.employeeIDinter = employeeIDinter;
	}
	public String getCadidateIDinter() {
		return cadidateIDinter;
	}
	public void setCadidateIDinter(String cadidateIDinter) {
		this.cadidateIDinter = cadidateIDinter;
	}
	public String getEmailIDinter() {
		return emailIDinter;
	}
	public void setEmailIDinter(String emailIDinter) {
		this.emailIDinter = emailIDinter;
	}
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewID=" + interviewID + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeIDinter="
				+ employeeIDinter + ", cadidateIDinter=" + cadidateIDinter + ", emailIDinter=" + emailIDinter + "]";
	}
	
	
	
	

}
