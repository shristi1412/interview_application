package com.interview_application.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
			fetch=FetchType.LAZY, mappedBy = "employeeInterview")
	private Set<EmployeeEntity> employeeIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "candidateInterview")
	private Set<CandidateEntity> cadidateIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "emailIDInterview")
	private Set<PanelMemberEntity> emailIDinter;
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public InterviewSchedulerEntity(int interviewID, int techrating, int hrrating) {
		super();
		this.interviewID = interviewID;
		this.techrating = techrating;
		this.hrrating = hrrating;
	}

public InterviewSchedulerEntity(int interviewID) {
		super();
		this.interviewID = interviewID;
	}




	public InterviewSchedulerEntity(int interviewID, int techrating, int hrrating, int location, int finalstatus,
			Set<EmployeeEntity> employeeIDinter, Set<CandidateEntity> cadidateIDinter,
			Set<PanelMemberEntity> emailIDinter) {
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
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewID=" + interviewID + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeIDinter="
				+ employeeIDinter + ", cadidateIDinter=" + cadidateIDinter + ", emailIDinter=" + emailIDinter + "]";
	}
	public int getInterviewID() {
		return interviewID;
	}
	public int getTechrating() {
		return techrating;
	}
	public int getHrrating() {
		return hrrating;
	}
	public int getLocation() {
		return location;
	}
	public int getFinalstatus() {
		return finalstatus;
	}
	public Set<EmployeeEntity> getEmployeeIDinter() {
		return employeeIDinter;
	}
	public Set<CandidateEntity> getCadidateIDinter() {
		return cadidateIDinter;
	}
	public Set<PanelMemberEntity> getEmailIDinter() {
		return emailIDinter;
	}
	public void setInterviewID(int interviewID) {
		this.interviewID = interviewID;
	}
	public void setTechrating(int techrating) {
		this.techrating = techrating;
	}
	public void setHrrating(int hrrating) {
		this.hrrating = hrrating;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public void setFinalstatus(int finalstatus) {
		this.finalstatus = finalstatus;
	}
	public void setEmployeeIDinter(Set<EmployeeEntity> employeeIDinter) {
		this.employeeIDinter = employeeIDinter;
	}
	public void setCadidateIDinter(Set<CandidateEntity> cadidateIDinter) {
		this.cadidateIDinter = cadidateIDinter;
	}
	public void setEmailIDinter(Set<PanelMemberEntity> emailIDinter) {
		this.emailIDinter = emailIDinter;
	}
	
	
	

}
