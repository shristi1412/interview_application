package com.interview_application.dto;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.interview_application.entity.InterviewSchedulerEntity;

public class PanelMemberDTO {

	private int panelid;
	
	private String location;
	
	private String type;
	
	
	public PanelMemberDTO() {
		super();
	}
	
	public PanelMemberDTO(int panelid, String location, String type) {
		super();
		this.panelid = panelid;
		this.location = location;
		this.type = type;
		
	}


	public int getPanelid() {
		return panelid;
	}

	public void setPanelid(int panelid) {
		this.panelid = panelid;
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


	@Override
	public String toString() {
		return "PanelMemberEntity [panelID=" + panelid + ", location=" + location + ", type=" + type
				+  "]";
	}


}