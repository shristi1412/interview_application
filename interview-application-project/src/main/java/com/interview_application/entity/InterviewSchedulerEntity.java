package com.interview_application.entity;

import java.util.Set;

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
	@Column(name="interviewid")
	private String interviewid;
	@Column(name="techrating")
	private int techrating;
	@Column(name="hrrating")
	private int hrrating;
	@Column(name="location")
	private int location;
	@Column(name="finalstatus")
	private int finalstatus;
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeid")
	private EmployeeEntity employeeIDinter;
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="candidateid")
	private CandidateEntity candidateIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "emailIDInterview")
	private Set<PanelMemberEntity> emailIDinter;
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
<<<<<<< HEAD
	public InterviewSchedulerEntity(String interviewid, int techrating, int hrrating, int location, int finalstatus,
			EmployeeEntity employeeIDinter, CandidateEntity candidateIDinter, Set<PanelMemberEntity> emailIDinter) {
=======
	
	
	
	
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
>>>>>>> 023024268aa7d3577e94af6677f363ee585181b6
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
