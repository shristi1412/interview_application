package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	
	public EmployeeEntity findById(int employeeid) throws EmployeeNotFoundException{
		
		EmployeeEntity employeeEntity=entityManager.find(EmployeeEntity.class, employeeid);
		if (employeeEntity == null) {
			throw new EmployeeNotFoundException("Employee id "+employeeid+"not found");
		}
		employeeEntity.getPanelMemberEntity().setType(null);
		return employeeEntity;
	}
	
   public Boolean updateType(int employeeid) throws EmployeeNotFoundException{
	   
	   EmployeeEntity employeeEntity=entityManager.find(EmployeeEntity.class, employeeid);
	   
		if(employeeEntity.getPanelMemberEntity().getType() == null)
			logger.info("Surrendered successfully "+ employeeEntity);
		else
			throw new EmployeeNotFoundException("Employee id "+employeeid+"not surrendered");
		return true;
	}

}
