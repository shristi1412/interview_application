package com.interview_application.dto;

public class Candidate {
	
	private int candidateid;
	private String candidatename;
	private String location;
	private String qualification; 
	private String designation;
	private int experience;
	private String primaryskills;
	private String secondaryskills;
	private int noticeperiod;
	
	public Candidate() {
		super();
	}

	public Candidate(int candidateid, String candidatename, String location, String qualification,
			String designation, int experience, String primaryskills, String secondaryskills, int noticeperiod) {
		super();
		this.candidateid = candidateid;
		this.candidatename = candidatename;
		this.location = location;
		this.qualification = qualification;
		this.designation = designation;
		this.experience = experience;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
		this.noticeperiod = noticeperiod;
	}

	public Candidate(String candidatename, String location, String qualification, String designation, int experience,
			String primaryskills, String secondaryskills, int noticeperiod) {
		super();
		this.candidatename = candidatename;
		this.location = location;
		this.qualification = qualification;
		this.designation = designation;
		this.experience = experience;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
		this.noticeperiod = noticeperiod;
	}

	public int getCandidateID() {
		return candidateid;
	}

	public void setCandidateID(int candidateid) {
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

	public int getNoticeperiod() {
		return noticeperiod;
	}

	public void setNoticeperiod(int noticeperiod) {
		this.noticeperiod = noticeperiod;
	}

	@Override
	public String toString() {
		return "AddCandidate [candidateid=" + candidateid + ", candidatename=" + candidatename + ", location="
				+ location + ", qualification=" + qualification + ", designation=" + designation + ", experience="
				+ experience + ", primaryskills=" + primaryskills + ", secondaryskills=" + secondaryskills
				+ ", noticeperiod=" + noticeperiod + "]";
	}
	
	
}
