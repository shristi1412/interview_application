package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public class AddPanelMemberDAOImpl implements AddPanelMemberDAO{
	
	private static Logger logger = LogManager.getLogger(AddPanelMemberDAOImpl.class.getName());	
	private static EntityManager entityManager;

	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public PanelMemberEntity PMEntity;
	public PanelMemberEntity addPanelMember(int panelid, String location, String type, EmployeeEntity empID) throws EmployeeNotFoundException {
		EmployeeEntity emp = entityManager.find(EmployeeEntity.class, empID.getEmployeeID());
		System.out.println(empID);

		entityManager.getTransaction().begin();
		PMEntity = new PanelMemberEntity(panelid, location, type, empID, null);			
		logger.info("Employee with EMP ID : " + emp + " has been added as a Panel Member");
		entityManager.persist(PMEntity);

		logger.info("Adding Emp : " +PMEntity+" as a Panel member");
		entityManager.getTransaction().commit();
		return PMEntity;
	}
	
}
