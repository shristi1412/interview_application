package com.interview_application.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="interviewscheduler")
public class InterviewSchedulerEntity {
	@Id
	//@GeneratedValue
	@Column(name="interviewid")
	private String interviewid;
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
	
	@JoinColumn(name="candidateid")
	private CandidateEntity candidateIDinter;
	
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

public InterviewSchedulerEntity(String interviewid, int techrating, int hrrating) {
		super();
		this.interviewid= interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
	}

public InterviewSchedulerEntity(String interviewid) {
		super();
		this.interviewid= interviewid;
	}
public InterviewSchedulerEntity(String interviewid, CandidateEntity candidateIDinter,int techrating, int hrrating, String location, String finalstatus)
	 {

		super();
		this.interviewid = interviewid;
		this.candidateIDinter = candidateIDinter;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
	
	}
	public String getInterviewid() {
		return interviewid;
	}

	public CandidateEntity getCandidateIDinter() {
		return candidateIDinter;
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
	

	public void setInterviewid(String interviewid) {
		this.interviewid = interviewid;
	}

	public void setCandidateIDinter(CandidateEntity candidateIDinter) {
		this.candidateIDinter = candidateIDinter;
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
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + " candidateIDinter=" + candidateIDinter +", techrating= " + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus+"]";
			
	}
}
