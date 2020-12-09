package com.interview_application.dto;

import java.util.Set;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;

public class InterviewSchedulerDTO {
	private int interviewID;
	private int techrating;
	private int hrrating;
	private int location;
	private int finalstatus;
	private Set<EmployeeEntity> employeeIDinter;
	private Set<CandidateEntity> cadidateIDinter;
	private Set<PanelMemberEntity> emailIDinter;
	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(int interviewID, int techrating, int hrrating, int location, int finalstatus,
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
	
	
	
	
	public InterviewSchedulerDTO(int interviewID) {
		super();
		this.interviewID = interviewID;
	}
	public InterviewSchedulerDTO(int interviewID, int techrating, int hrrating) {
		super();
		this.interviewID = interviewID;
		this.techrating = techrating;
		this.hrrating = hrrating;
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
