package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

private int panelid;

private String location;

private String type;

private EmployeeEntity employeeIDpanel;
private InterviewSchedulerEntity emailIDInterview;

public PanelMemberDTO() {
	super();
}

public PanelMemberDTO(int panelid, String location, String type, EmployeeEntity employeeID,InterviewSchedulerEntity emailIDInterview) {
	super();
	this.panelid = panelid;
	this.location = location;
	this.type = type;
	this.employeeIDpanel = employeeID;
	this.emailIDInterview = emailIDInterview;
}

public PanelMemberDTO(int panelid, String location, String type, EmployeeEntity employeeID) {
	super();
	this.panelid = panelid;
	this.location = location;
	this.type = type;
	this.employeeIDpanel = employeeID;
}

public InterviewSchedulerEntity getemailIDInterview() {
	return emailIDInterview;
}

public void setemailIDInterview(InterviewSchedulerEntity candidateInterview) {
	this.emailIDInterview = candidateInterview;
}

public EmployeeEntity getEmployeeIDpanel() {
	return employeeIDpanel;
}

public void setEmployeeIDpanel(EmployeeEntity employeeIDpanel) {
	this.employeeIDpanel = employeeIDpanel;
}

public int getPanelID() {
	return panelid;
}

public void setPanelID(int emailID) {
	this.panelid = emailID;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public EmployeeEntity getEmployeeID() {
	return employeeIDpanel;
}

public void setEmployeeID(EmployeeEntity employeeID) {
	this.employeeIDpanel = employeeID;
}

@Override
public String toString() {
	return "PanelMemberEntity [panelid=" + panelid + ", location=" + location + ", type=" + type
			+ ", employeeIDpanel=" + employeeIDpanel + ", emailIDInterview=" + emailIDInterview + "]";
}


}
