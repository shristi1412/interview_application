package com.interview_application.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SurrenderAsHRPanelDAOImpl;
import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.service.SurrenderAsHRPanelService;
import com.interview_application.service.SurrenderAsHRPanelServiceImpl;

public class SurrenderAsHRPanel {
	
	private static Logger logger = LogManager.getLogger(SurrenderAsHRPanel.class.getName());
	SurrenderAsHRPanelService surrenderAsHRService = new SurrenderAsHRPanelServiceImpl();
	
	public EmployeeDTO findEmployeeById(int employeeid) throws EmployeeNotFoundException {
		logger.info("Finding employee for id: " + employeeid);
		EmployeeDTO employeeDTO = null;
		try {
			employeeDTO = surrenderAsHRService.findById(employeeid);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundTechToSurrenderException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return employeeDTO;
	}
	
	
}
