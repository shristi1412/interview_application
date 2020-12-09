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
	private EmployeeEntity employeeid;
	private CandidateEntity candidateid;
	private Set<PanelMemberEntity> emailIDinter;
	
	
	
	public InterviewSchedulerDTO(String interviewid) {
		super();
		this.interviewid = interviewid;	
	}
	
	public InterviewSchedulerDTO(String interviewid, int techrating, int hrrating) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		
	}
	public InterviewSchedulerDTO(String interviewid, int techrating, int hrrating, int location, int finalstatus,
			EmployeeEntity employeeid, CandidateEntity candidateid, Set<PanelMemberEntity> emailIDinter) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
		this.employeeid = employeeid;
		this.candidateid = candidateid;
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
	public EmployeeEntity getEmployeeid() {
		return employeeid;
	}
	public CandidateEntity getCandidateid() {
		return candidateid;
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
	public void setEmployeeid(EmployeeEntity employeeid) {
		this.employeeid = employeeid;
	}
	public void setCandidateIDinter(CandidateEntity candidateid) {
		this.candidateid = candidateid;
	}
	public void setEmailIDinter(Set<PanelMemberEntity> emailIDinter) {
		this.emailIDinter = emailIDinter;
	}
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeid="
				+ employeeid + ", candidateid=" + candidateid + ", emailIDinter=" + emailIDinter + "]";
	}
	
}
