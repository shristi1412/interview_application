package com.interview_application.dto;

public class InterviewSchedulerDTO {
	private int interviewid;
	private int techrating;
	private int hrrating;
	private String location;
	private String finalstatus;
	public InterviewSchedulerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InterviewSchedulerDTO(int interviewid, int techrating, int hrrating, String location, String finalstatus) {
		super();
		this.interviewid = interviewid;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
	}
	
	
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + "]";
	}
	public int getInterviewid() {
		return interviewid;
	}
	public int getTechrating() {
		return techrating;
	}
	public int getHrrating() {
		return hrrating;
	}
	public String  getLocation() {
		return location;
	}
	public String  getFinalstatus() {
		return finalstatus;
	}	
	public void setInterviewid(int interviewid) {
		this.interviewid = interviewid;
	}
	public void setTechrating(int techrating) {
		this.techrating = techrating;
	}
	public void setHrrating(int hrrating) {
		this.hrrating = hrrating;
	}
	public void setLocation(String  location) {
		this.location = location;
	}
	public void setFinalstatus(String  finalstatus) {
		this.finalstatus = finalstatus;
	}
}