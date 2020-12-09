package com.interview_application.dto;

import com.interview_application.entity.CandidateEntity;


public class InterviewSchedulerDTO {
	private String interviewid;
	private int techrating;
	private int hrrating;
	private int location;
	private int finalstatus;
	
	private CandidateEntity candidateIDinter;

	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(String interviewid, int techrating, int hrrating, int location, int finalstatus,
			 CandidateEntity candidateIDinter ) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
		
		this.candidateIDinter = candidateIDinter;
	
	}
	public String getInterviewid() {
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
	public int getFinalstatus() {
		return finalstatus;
	}
	
	public CandidateEntity getCandidateIDinter() {
		return candidateIDinter;
	}
	
	public void setInterviewid(String interviewid) {
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
	public void setFinalstatus(int finalstatus) {
		this.finalstatus = finalstatus;
	}
	
	public void setCandidateIDinter(CandidateEntity candidateIDinter) {
		this.candidateIDinter = candidateIDinter;
	}
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + ", employeeIDinter="
				 + ", candidateIDinter=" + candidateIDinter + ", emailIDinter=" ;
	}
}
