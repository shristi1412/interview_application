package com.interview_application.dto;

public class Candidate {
	private int candidateID;
	private String candidatename;
	private String location;
	private String designation;
	private String qualification;
	private int experience;
	private int noticeperiod;
	private String primaryskills;
	private String secondaryskills;

	public Candidate(int candidateID, String candidatename, String location, String designation,
			String qualification, int experience, int noticeperiod, String primaryskills, String secondaryskills) {
		super();
		this.candidateID = candidateID;
		this.candidatename = candidatename;
		this.location = location;
		this.designation = designation;
		this.qualification = qualification;
		this.experience = experience;
		this.noticeperiod = noticeperiod;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
	}
	
	@Override
	public String toString() {
		return "CandidateEntity [candidateID=" + candidateID + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskills
				+ ", secondaryskills=" + secondaryskills + "]";
	}
	public int getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
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

	
	
	
}
