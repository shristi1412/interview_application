package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;

public class SurrenderTechPanelDAOImpl implements SurrenderTechPanelDAO{
	
	private static Logger logger=LogManager.getFormatterLogger(SurrenderTechPanelDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager= entityManagerFactory.createEntityManager();	
	}
	
	public EmployeeEntity findById(String employeeID) throws EmployeeNotFoundTechToSurrenderException{
		
		EmployeeEntity employeeEntity=entityManager.find(EmployeeEntity.class, employeeID);
		employeeEntity.getPanelMemberEntity().setType("null");

		if (employeeEntity == null) {
			throw new EmployeeNotFoundTechToSurrenderException("Employee id "+employeeID+"not found");
		}
		return employeeEntity;
		
	}
}
