package com.interview_application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;


public class SearchEmployeeDAOImpl implements SearchEmployeeDAO{
	private static Logger logger = LogManager.getLogger(SearchEmployeeDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("InterviewTracking");
		entityManager = entityManagerFactory.createEntityManager();
	}
	//by id
	public EmployeeEntity searchById(int empID) throws EmployeeNotFoundException {
		EmployeeEntity empEntity = entityManager.find(EmployeeEntity.class, empID);
		logger.info("Database returned Employee: " + empEntity);
		if(empEntity==null)
			throw new EmployeeNotFoundException("Employee ID: " + empID);
		return empEntity;
	}
	//by name
	public int id;
	public EmployeeEntity searchByName(String name) throws EmployeeNotFoundException {
		Query list = entityManager.createQuery("SELECT e FROM EmployeeEntity e");
		List<EmployeeEntity> emplist = list.getResultList();
		for(EmployeeEntity e : emplist) {
			if(e.getName().equals(name)) {
				id=e.getEmployeeID();
				System.out.println(e.getName()+name);
			}
		}
		EmployeeEntity empEntity = entityManager.find(EmployeeEntity.class, id);
		logger.info("Database returned Employee: " + empEntity);
		if(empEntity==null)
			throw new EmployeeNotFoundException("Employee Name: " + name);
		return empEntity;
	}

	
	
}

