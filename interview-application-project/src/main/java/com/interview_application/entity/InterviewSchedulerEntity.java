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
	private int interviewid;
	@Column(name="techrating")
	private int techrating;
	@Column(name="hrrating")
	private int hrrating;
	@Column(name="location")
	private String location;
	@Column(name="finalstatus")
	private String finalstatus;
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeid")
	private EmployeeEntity employeeIDinter;
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="candidateid")
	private CandidateEntity candidateIDinter;
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.LAZY, mappedBy = "panelIDinterview")
	private Set<PanelMemberEntity> panelIDinter;
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerEntity(int interviewid, int techrating, int hrrating, String location, String finalstatus,
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
