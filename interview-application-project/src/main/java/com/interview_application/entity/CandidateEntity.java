package com.interview_application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="candidate")
public class CandidateEntity {
	
	@Id
	@GeneratedValue
	@Column(name="candidateid")
	private String candidateid;

	@Column(name="candidatename")
	private String candidatename;
	
	@Column(name="location")
	private String location;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="experience")
	private int experience;
	
	@Column(name="noticeperiod")
	private int noticeperiod;
	
	@Column(name="primaryskill")
	private String primaryskill;
	
	@Column(name="secondaryskill")
	private String secondaryskill;
	

	
	public CandidateEntity(String candidateid,String candidatename,String location,String qualification, int experience, 
			String primaryskill, String secondaryskill,int noticeperiod, String designation) {
		super();
				this.candidateid=candidateid;
				this.candidatename=candidatename;
				this.designation=designation;
				this.location=location;
				this.primaryskill=primaryskill;
				this.secondaryskill=secondaryskill;
				this.experience=experience;
				this.noticeperiod=noticeperiod;
				this.qualification=qualification;
				
	}
	public String getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(String candidateid) {
		this.candidateid = candidateid;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPrimaryskill() {
		return primaryskill;
	}
	public void setPrimaryskill(String primaryskill) {
		this.primaryskill = primaryskill;
	}
	public String getSecondaryskill() {
		return secondaryskill;
	}
	public void setSecondaryskill(String secondaryskill) {
		this.secondaryskill = secondaryskill;
	}
	public int getNoticeperiod() {
		return noticeperiod;
	}
	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
	
	public CandidateEntity(String string, String string2, String string3, String string4, String string5, int i, int j, String string6, String string7, Object object) {
	}
	
	@Override
	public String toString() {
		return "CandidateEntity [candidateID=" + candidateid + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskill
				+ ", secondaryskills=" + secondaryskill ;
	}
	public String getInterviewSchedulerEntity() {
		// TODO Auto-generated method stub
		return null;
	}
	}

