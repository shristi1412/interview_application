package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.service.SearchEmployeeService;
import com.interview_application.service.SearchEmployeeServiceImpl;

public class SearchEmployeeController {
	//BY ID
	private static Logger logger = LogManager.getLogger(SearchEmployeeController.class.getName());
	SearchEmployeeService empService = new SearchEmployeeServiceImpl();
	public EmployeeDTO searchById(String empID) throws EmployeeNotFoundException {
		empID = empID.toLowerCase();
		logger.info("Finding employee with Employee ID : " + empID);
		EmployeeDTO emp = null;
		String regex="^[emp]+[0-9]$";
		if(empID.matches(regex)==false&&empID.length()!=8) {
			logger.error("Employee ID Format is invalid ['empXXXXX' where X is int]: ");
			return null;
		}
		try {
			emp = empService.searchById(empID);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return emp;
		
	}
	//BY Name
	public EmployeeDTO searchByName(String name) throws EmployeeNotFoundException {
		logger.info("Finding employee with Employee ID : " + name);
		EmployeeDTO emp = null;
		try {
			emp = empService.searchByName(name);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return emp;
	}
}
