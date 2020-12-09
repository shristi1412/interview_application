package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public class SurrenderHRPanelDAOImpl implements SurrenderHRPanelDAO {

	private static Logger logger = LogManager.getLogger(SearchEmployeeDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public EmployeeEntity searchById(String empID) throws EmployeeNotFoundException {
		EmployeeEntity empEntity = entityManager.find(EmployeeEntity.class, empID);
		logger.info("Database returned ItemEntity: " + empEntity);
		if(empEntity==null)
			throw new EmployeeNotFoundException("ItemId: " + empID);
		return empEntity;
	}
}