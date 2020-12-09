package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;
import com.interview_application.service.SurrenderAsTechService;
import com.interview_application.service.SurrenderAsTechServiceImpl;

public class SurrenderAsTech {
	
	private static Logger logger = LogManager.getLogger(SurrenderAsTech.class.getName());
	SurrenderAsTechService surrenderAsTechService = new SurrenderAsTechServiceImpl();
	
	public EmployeeDTO findById(String employeeID) throws EmployeeNotFoundTechToSurrenderException {
		logger.info("Finding employee for id: " + employeeID);
		EmployeeDTO employeeDTO = null;
		try {
			employeeDTO = surrenderAsTechService.findById(employeeID);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundTechToSurrenderException: " + e);
			throw new EmployeeNotFoundTechToSurrenderException(e.getMessage());
		}
		return employeeDTO;
	}


}
