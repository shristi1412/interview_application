package com.interview_application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate")
public class CandidateEntity {
	@Id
	@GeneratedValue
	@Column(name="candidateID")
	private int employeeID;
	@Column(name="candidatename")
	private String candidatename;
	@Column(name="location")
	private String location;
	@Column(name="designation")
	private String designation;
	@Column(name="qualification")
	private String qualification;
	@Column(name="experience")
	private int experience;
	@Column(name="noticeperiod")
	private int noticeperiod;
	@Column(name="primaryskills")
	private String primaryskills;
	@Column(name="secondaryskills")
	private String secondaryskills;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="interviewID")
	private InterviewSchedulerEntity candidateInterview;
	
	public CandidateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateEntity(int employeeID, String candidatename, String location, String designation,
			String qualification, int experience, int noticeperiod, String primaryskills, String secondaryskills, InterviewSchedulerEntity candidateInterview) {
		super();
		this.employeeID = employeeID;
		this.candidatename = candidatename;
		this.location = location;
		this.designation = designation;
		this.qualification = qualification;
		this.experience = experience;
		this.noticeperiod = noticeperiod;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
		this.candidateInterview = candidateInterview;
	}
	public CandidateEntity(int employeeID, String candidatename, String location, String designation,
			String qualification, int experience, int noticeperiod, String primaryskills, String secondaryskills) {
		super();
		this.employeeID = employeeID;
		this.candidatename = candidatename;
		this.location = location;
		this.designation = designation;
		this.qualification = qualification;
		this.experience = experience;
		this.noticeperiod = noticeperiod;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getNoticeperiod() {
		return noticeperiod;
	}
	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
	public String getPrimaryskills() {
		return primaryskills;
	}
	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}
	public String getSecondaryskills() {
		return secondaryskills;
	}
	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}
	public InterviewSchedulerEntity getCandidateInterview() {
		return candidateInterview;
	}
	public void setCandidateInterview(InterviewSchedulerEntity candidateInterview) {
		this.candidateInterview = candidateInterview;
	}
	@Override
	public String toString() {
		return "CandidateEntity [employeeID=" + employeeID + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskills
				+ ", secondaryskills=" + secondaryskills + ", candidateInterview=" + candidateInterview + "]";
	}

	
	
	
}
