package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SearchEmployeeDAO;
import com.interview_application.dao.SearchEmployeeDAOImpl;
import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.utilities.EmployeeUtils;

public class SearchEmployeeServiceImpl implements SearchEmployeeService{
	private static Logger logger = LogManager.getLogger(SearchEmployeeServiceImpl.class.getName());
	
	SearchEmployeeDAO empDao = new SearchEmployeeDAOImpl();
	//By ID
	public EmployeeDTO searchById(int empID) throws EmployeeNotFoundException{
		EmployeeEntity emp = empDao.searchById(empID);
		logger.info("EmployeeEntity: " + emp);
		return EmployeeUtils.convertItemEntityIntoItem(emp);
	}
	//By Name
	public EmployeeDTO searchByName(String name) throws EmployeeNotFoundException{
		EmployeeEntity emp = empDao.searchByName(name);
		logger.info("EmployeeEntity: " + emp);
		return EmployeeUtils.convertItemEntityIntoItem(emp);
	}
}
