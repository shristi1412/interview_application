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
	private int location;
	@Column(name="finalstatus")
	private String finalstatus;
	
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

<<<<<<< HEAD
public InterviewSchedulerEntity(int interviewid, int techrating, int hrrating) {
		super();
		this.interviewid= interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
	}

public InterviewSchedulerEntity(int interviewid) {
		super();
		this.interviewid= interviewid;
	}
public InterviewSchedulerEntity(int interviewid, CandidateEntity candidateIDinter,int techrating, int hrrating, String location, String finalstatus)
	 {
=======
>>>>>>> db6fd83cca796b89527462f3d5d32e522f2dbc68

	public InterviewSchedulerEntity(int interviewid, int techrating, int hrrating, int location, String finalstatus) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
	}
<<<<<<< HEAD
=======
	
>>>>>>> db6fd83cca796b89527462f3d5d32e522f2dbc68
	public int getInterviewid() {
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
	public String getFinalstatus() {
		return finalstatus;
	}
	
<<<<<<< HEAD

=======
>>>>>>> db6fd83cca796b89527462f3d5d32e522f2dbc68
	public void setInterviewid(int interviewid) {
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
	public void setFinalstatus(String finalstatus) {
		this.finalstatus = finalstatus;
	}
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + "]";
	}

}