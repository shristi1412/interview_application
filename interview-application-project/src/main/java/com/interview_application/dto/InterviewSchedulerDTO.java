package com.interview_application.dto;

<<<<<<< HEAD
public class InterviewSchedulerDTO {
	private String interviewID;
	private int techrating;
	private int hrrating;
	private String location;
	private String finalstatus;
	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(String interviewID, int techrating, int hrrating, String location, String finalstatus) {
		super();
		this.interviewID = interviewID;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
	}
	
	
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewID=" + interviewID + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + "]";
	}
	public String getInterviewID() {
		return interviewID;
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
	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
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
}
=======
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
>>>>>>> refs/remotes/origin/main
