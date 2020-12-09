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
	private int interviewid;
	private int techrating;
	private int hrrating;
	private String location;
	private String finalstatus;
	private EmployeeEntity employeeIDinter;
	private CandidateEntity candidateIDinter;
	private Set<PanelMemberEntity> panelIDinter;
	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(int interviewid, int techrating, int hrrating, String location, String finalstatus,
			EmployeeEntity employeeIDinter, CandidateEntity candidateIDinter, Set<PanelMemberEntity> panelIDinter) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
		this.employeeIDinter = employeeIDinter;
		this.candidateIDinter = candidateIDinter;
		this.panelIDinter = panelIDinter;
	}
	public int getInterviewid() {
		return interviewid;
	}
	public int getTechrating() {
		return techrating;
	}
	public int getHrrating() {
		return hrrating;
	}
	public String getLocation() {
		return location;
	}
	public String getFinalstatus() {
		return finalstatus;
	}
	public EmployeeEntity getEmployeeIDinter() {
		return employeeIDinter;
	}
	public CandidateEntity getCandidateIDinter() {
		return candidateIDinter;
	}
	public Set<PanelMemberEntity> getPanelIDinter() {
		return panelIDinter;
	}
	public void setInterviewid(int interviewid) {
		this.interviewid = interviewid;
	}
	public void setTechrating(int techrating) {
		this.techrating = techrating;
	}
	public void setHrrating(int hrrating) {
		this.hrrating = hrrating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setFinalstatus(String finalstatus) {
		this.finalstatus = finalstatus;
	}
	public void setEmployeeIDinter(EmployeeEntity employeeIDinter) {
		this.employeeIDinter = employeeIDinter;
	}
	public void setCandidateIDinter(CandidateEntity candidateIDinter) {
		this.candidateIDinter = candidateIDinter;
	}
	public void setPanelIDinter(Set<PanelMemberEntity> panelIDinter) {
		this.panelIDinter = panelIDinter;
	}
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeIDinter="
				+ employeeIDinter + ", candidateIDinter=" + candidateIDinter + ", panelIDinter=" + panelIDinter + "]";
	}
}
