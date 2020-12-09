package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public class SurrenderAsHRPanelDAOImpl implements SurrenderAsHRPanelDAO{
	
	private static Logger logger=LogManager.getFormatterLogger(SurrenderAsHRPanelDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager= entityManagerFactory.createEntityManager();	
	}
	
	public EmployeeEntity findById(String employeeID) throws EmployeeNotFoundException{
		
		EmployeeEntity employeeEntity=entityManager.find(EmployeeEntity.class, employeeID);
		if (employeeEntity == null) {
			throw new EmployeeNotFoundException("Employee id "+employeeID+"not found");
		}
		employeeEntity.getPanelMemberEntity().setType(null);
		return employeeEntity;
		
	}

}
