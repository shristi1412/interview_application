
<<<<<<< HEAD
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
=======
	package com.interview_application.entity;
>>>>>>> refs/remotes/origin/main

<<<<<<< HEAD
@Entity
@Table(name="interviewscheduler")
public class InterviewSchedulerEntity {
	@Id
	@GeneratedValue
	@Column(name="interviewid")
	private String interviewID;
	@Column(name="techrating")
	private int techrating;
	@Column(name="hrrating")
	private int hrrating;
	@Column(name="location")
	private String location;
	@Column(name="finalstatus")
	private String finalstatus;
	
	public InterviewSchedulerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public InterviewSchedulerEntity(String interviewID, int techrating, int hrrating, String location, String finalstatus) {
		super();
		this.interviewID = interviewID;
		this.techrating = techrating;
		this.hrrating = hrrating;
		this.location = location;
		this.finalstatus = finalstatus;
	}
	
	public String getInterviewID() {
		return interviewID;
	}
	public int getTechrating() {
		return techrating;
	}
	public int getHrrating() {
		return hrrating;
	}
	public String getLocation() {
		return location;
	}
	public String getFinalstatus() {
		return finalstatus;
	}
	
	public void setInterviewID(String interviewID) {
		this.interviewID = interviewID;
	}
	public void setTechrating(int techrating) {
		this.techrating = techrating;
	}
	public void setHrrating(int hrrating) {
		this.hrrating = hrrating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setFinalstatus(String finalstatus) {
		this.finalstatus = finalstatus;
	}
	
	@Override
	public String toString() {
		return "InterviewSchedulerEntity [interviewID=" + interviewID + ", techrating=" + techrating + ", hrrating="
				+ hrrating + ", location=" + location + ", finalstatus=" + finalstatus + "]";
	}
=======
>>>>>>> refs/remotes/origin/main

<<<<<<< HEAD
}
=======
	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;


	@Entity
	@Table(name="interviewscheduler")
	public class InterviewSchedulerEntity {
		@Id
		@GeneratedValue
		@Column(name="interviewid")
		private String interviewid;
		@Column(name="techrating")
		private int techrating;
		@Column(name="hrrating")
		private int hrrating;
		@Column(name="location")
		private int location;
		@Column(name="finalstatus")
		private int finalstatus;
		@OneToOne(cascade={CascadeType.ALL},
				fetch=FetchType.EAGER, optional = false)
		@JoinColumn(name="employeeid")
		private EmployeeEntity employeeid;
		
		@OneToOne(cascade={CascadeType.ALL},
				fetch=FetchType.EAGER, optional = false)
		@JoinColumn(name="candidateid")
		private CandidateEntity cadidateid;
		public InterviewSchedulerEntity() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public InterviewSchedulerEntity(String interviewid, int techrating, int hrrating) {
			super();
			this.interviewid = interviewid;
			this.techrating = techrating;
			this.hrrating = hrrating;
		}

	public InterviewSchedulerEntity(String interviewid) {
			super();
			this.interviewid = interviewid;
		}
	
		public InterviewSchedulerEntity(String interviewid, int techrating, int hrrating, int location,
				int finalstatus, EmployeeEntity employeeid, CandidateEntity cadidateid) {
			super();
			this.interviewid = interviewid;
			this.techrating = techrating;
			this.hrrating = hrrating;
			this.location = location;
			this.finalstatus = finalstatus;
			this.employeeid = employeeid;
			this.cadidateid = cadidateid;
		}
		@Override
		public String toString() {
			return "InterviewSchedulerEntity [interviewid=" + interviewid + ", techrating=" + techrating + ", hrrating=" + hrrating + ", location=" + location + ", finalstatus="
					+ finalstatus + ", employeeid=" + employeeid + ", cadidateid=" + cadidateid + "]";
		}
		public String getInterviewID() {
			return interviewid;
		}
		public void setInterviewID(String interviewid) {
			this.interviewid = interviewid;
		}
		public int getTechrating() {
			return techrating;
		}
		public void setTechrating(int techrating) {
			this.techrating = techrating;
		}
		public int getHrrating() {
			return hrrating;
		}
		public void setHrrating(int hrrating) {
			this.hrrating = hrrating;
		}
		public int getLocation() {
			return location;
		}
		public void setLocation(int location) {
			this.location = location;
		}
		public int getFinalstatus() {
			return finalstatus;
		}
		public void setFinalstatus(int finalstatus) {
			this.finalstatus = finalstatus;
		}
		public EmployeeEntity getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeIDinter(EmployeeEntity employeeid) {
			this.employeeid = employeeid;
		}
		public CandidateEntity getCadidateID() {
			return cadidateid;
		}
		public void setCadidateID(CandidateEntity cadidateid) {
			this.cadidateid = cadidateid;
		}
	}
		
		


>>>>>>> refs/remotes/origin/main
