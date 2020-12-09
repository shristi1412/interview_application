package com.interview_application.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.entity.PanelMemberEntity;

public class EmployeeDTO {
	private int employeeid;
	private String name;
	private PanelMemberEntity panelMemberEntity;
	
	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int employeeid, String name, PanelMemberEntity panelMemberEntity)
 {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.panelMemberEntity = panelMemberEntity;
	}
	

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
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
		return "EmployeeEntity [employeeid=" + employeeid + ", name=" + name + ", panelMemberEntity="
				+ panelMemberEntity + "]";
	}

}