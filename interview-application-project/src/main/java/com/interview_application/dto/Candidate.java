package com.interview_application.dto;

public class Candidate {
	private String candidateid;
private String candidatename;
	private String designation;
	private String primaryskill;
	private String secondaryskills;
	private int experience;
	private int noticeperiod;
	private String qualification;
	private String location;
	
	public Candidate() {
		super();
	}
	
	public Candidate(String candidatename,String location,String qualification, int experience, String primaryskill, String secondaryskills,int noticeperiod, String designation) {
		super();
				this.candidatename=candidatename;
				this.designation=designation;
				this.location=location;
				this.primaryskill=primaryskill;
				this.secondaryskills=secondaryskills;
				this.experience=experience;
				this.noticeperiod=noticeperiod;
				this.qualification=qualification;
				
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
	public String getSecondaryskills() {
		return secondaryskills;
	}
	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}
	public int getNoticeperiod() {
		return noticeperiod;
	}
	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
	public String getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(String candidateid) {
		this.candidateid = candidateid;
	}
	
	@Override
	public String toString() {
		return "CandidateEntity [candidateID=" + candidateid + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskill
				+ ", secondaryskills=" + secondaryskills;
	}


	}