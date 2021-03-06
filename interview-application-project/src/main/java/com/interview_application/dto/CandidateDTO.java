package com.interview_application.dto;

import javax.persistence.Column;

public class CandidateDTO {

	private int candidateid;
	private String candidatename;
	private String location;
	private String designation;
	private String qualification;
	private int experience;
	private int noticeperiod;
	private String primaryskills;
	private String secondaryskills;
	
	
	
	public CandidateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateDTO(int candidateid, String candidatename, String location, String designation,
			String qualification, int experience, int noticeperiod, String primaryskills, String secondaryskills) {
		super();
		this.candidateid = candidateid;
		this.candidatename = candidatename;
		this.location = location;
		this.designation = designation;
		this.qualification = qualification;
		this.experience = experience;
		this.noticeperiod = noticeperiod;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
	}
	
	public int getCandidateID() {
		return candidateid;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public String getLocation() {
		return location;
	}
	public String getDesignation() {
		return designation;
	}
	public String getQualification() {
		return qualification;
	}
	public int getExperience() {
		return experience;
	}
	public int getNoticeperiod() {
		return noticeperiod;
	}
	public String getPrimaryskills() {
		return primaryskills;
	}
	public String getSecondaryskills() {
		return secondaryskills;
	}
	public void setCandidateID(int candidateID) {
		this.candidateid = candidateID;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}
	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}
	@Override
	public String toString() {
		return "CandidateEntity [candidateid=" + candidateid + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskills
				+ ", secondaryskills=" + secondaryskills + "]";
	}



}
