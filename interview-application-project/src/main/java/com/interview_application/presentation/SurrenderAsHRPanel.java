package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.service.SearchEmployeeService;
import com.interview_application.service.SearchEmployeeServiceImpl;

public class SurrenderAsHRPanel {
	private static Logger logger = LogManager.getLogger(SearchEmployeeController.class.getName());
	SearchEmployeeService panelService = new SearchEmployeeServiceImpl();
	public PanelMemberDTO searchById(String empID) throws EmployeeNotFoundException {
		logger.info("Finding Panel Member with Employee ID : " + empID);
		PanelMemberDTO panel = null;
		try {
			panel = panelService.searchById(empID);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return panel;
	}
}