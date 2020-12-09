package com.interview_application.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.entity.PanelMemberEntity;

public class EmployeeDTO {
	private String employeeID;
	private String name;
	private PanelMemberEntity panelMemberEntity;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String employeeID, String name, PanelMemberEntity panelMemberEntity)
 {
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.panelMemberEntity = panelMemberEntity;
	}
	

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PanelMemberEntity getPanelMemberEntity() {
		return panelMemberEntity;
	}

	public void setPanelMemberEntity(PanelMemberEntity panelMemberEntity) {
		this.panelMemberEntity = panelMemberEntity;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeID=" + employeeID + ", name=" + name + ", panelMemberEntity="
				+ panelMemberEntity + "]";
	}

}