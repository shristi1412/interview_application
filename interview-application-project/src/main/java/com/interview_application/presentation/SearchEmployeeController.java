package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.service.SearchEmployeeService;
import com.interview_application.service.SearchEmployeeServiceImpl;

public class SearchEmployeeController {
	private static Logger logger = LogManager.getLogger(SearchEmployeeController.class.getName());
	SearchEmployeeService empService = new SearchEmployeeServiceImpl();
	public EmployeeDTO searchById(String empID) throws EmployeeNotFoundException {
		logger.info("Finding employee with Employee ID : " + empID);
		EmployeeDTO emp = null;
		try {
			emp = empService.searchById(empID);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return emp;
	}
}
