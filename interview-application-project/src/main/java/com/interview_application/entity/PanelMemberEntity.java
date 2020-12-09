package com.interview_application.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="panelmember")
public class PanelMemberEntity {
	@Id
//	@GeneratedValue
	@Column(name="panelid")
	private int panelid;
	
	@Column(name="location")
	private String location;
	
	@Column(name="type")
	private String type;
	
	@OneToOne(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER, optional = false)
	@JoinColumn(name="employeeid")
	private EmployeeEntity employeeIDpanel;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="interviewid")
	private InterviewSchedulerEntity panelIDinterview;
	
	public PanelMemberEntity() {
		super();
	}
	
	public PanelMemberEntity(int panelid, String location, String type, EmployeeEntity employeeID,InterviewSchedulerEntity panelIDinterview) {
		super();
		this.panelid = panelid;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
		this.panelIDinterview = panelIDinterview;
	}

	public PanelMemberEntity(int panelid, String location, String type, EmployeeEntity employeeID) {
		super();
		this.panelid = panelid;
		this.location = location;
		this.type = type;
		this.employeeIDpanel = employeeID;
	}
	
	public InterviewSchedulerEntity getemailIDInterview() {
		return panelIDinterview;
	}

	public void setemailIDInterview(InterviewSchedulerEntity candidateInterview) {
		this.panelIDinterview = candidateInterview;
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
				+ ", employeeIDpanel=" + employeeIDpanel + ", panelIDinterview=" + panelIDinterview + "]";
	}


}
