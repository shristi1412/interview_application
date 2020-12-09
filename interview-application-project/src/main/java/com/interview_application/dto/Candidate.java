package com.interview_application.dto;

import com.interview_application.entity.InterviewSchedulerEntity;

public class Candidate {
	private String candidateid;
	private String candidatename;
	private String location;
	private String designation;
	private String qualification;
	private int experience;
	private int noticeperiod;
	private String primaryskills;
	private String secondaryskills;
	private InterviewSchedulerEntity interviewSchedulerEntity;


	public Candidate(String candidateid, String candidatename, String location, String designation,
			String qualification, int experience, int noticeperiod, String primaryskills, String secondaryskills,InterviewSchedulerEntity interviewSchedulerEntity) {
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
		this.interviewSchedulerEntity = interviewSchedulerEntity;
	}
	
	@Override
	public String toString() {
		return "CandidateEntity [candidateID=" + candidateid + ", candidatename=" + candidatename + ", location="
				+ location + ", designation=" + designation + ", qualification=" + qualification + ", experience="
				+ experience + ", noticeperiod=" + noticeperiod + ", primaryskills=" + primaryskills
				+ ", secondaryskills=" + secondaryskills + ", interviewSchedulerEntity=" + interviewSchedulerEntity +"]";
	}
	public String getCandidateID() {
		return candidateid;
	}
	public void setCandidateID(String candidateid) {
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

	public InterviewSchedulerEntity getInterviewSchedulerEntity() {
		return interviewSchedulerEntity;
	}

	public void setInterviewSchedulerEntity(InterviewSchedulerEntity interviewSchedulerEntity) {
		this.interviewSchedulerEntity = interviewSchedulerEntity;
	}
	
	
}
