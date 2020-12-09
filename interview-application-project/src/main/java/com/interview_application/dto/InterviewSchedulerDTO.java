package com.interview_application.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;

public class InterviewSchedulerDTO {
	private String interviewid;
	private int techrating;
	private int hrrating;
	private int location;
	private int finalstatus;
	private EmployeeEntity employeeIDinter;
	private CandidateEntity candidateIDinter;
	private Set<PanelMemberEntity> emailIDinter;
	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(String interviewid, int techrating, int hrrating, int location, int finalstatus,
			EmployeeEntity employeeIDinter, CandidateEntity candidateIDinter, Set<PanelMemberEntity> emailIDinter) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
		this.employeeIDinter = employeeIDinter;
		this.candidateIDinter = candidateIDinter;
		this.emailIDinter = emailIDinter;
	}
	public String getInterviewid() {
		return interviewid;
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
	public EmployeeEntity getEmployeeIDinter() {
		return employeeIDinter;
	}
	public CandidateEntity getCandidateIDinter() {
		return candidateIDinter;
	}
	public Set<PanelMemberEntity> getEmailIDinter() {
		return emailIDinter;
	}
	public void setInterviewid(String interviewid) {
		this.interviewid = interviewid;
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
	public void setEmployeeIDinter(EmployeeEntity employeeIDinter) {
		this.employeeIDinter = employeeIDinter;
	}
	public void setCandidateIDinter(CandidateEntity candidateIDinter) {
		this.candidateIDinter = candidateIDinter;
	}
	public void setEmailIDinter(Set<PanelMemberEntity> emailIDinter) {
		this.emailIDinter = emailIDinter;
	}
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeIDinter="
				+ employeeIDinter + ", candidateIDinter=" + candidateIDinter + ", emailIDinter=" + emailIDinter + "]";
	}
}
