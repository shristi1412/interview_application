package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SurrenderAsHRPanelDAO;
import com.interview_application.dao.SurrenderAsHRPanelDAOImpl;
import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.utilities.SurrenderAsHRPanelUtils;

public class SurrenderAsHRPanelServiceImpl implements SurrenderAsHRPanelService{
	
	private static Logger logger = LogManager.getLogger(SurrenderAsHRPanelServiceImpl.class.getName());
	SurrenderAsHRPanelDAO surrenderHRPanelDAO = new SurrenderAsHRPanelDAOImpl();
	
	public EmployeeDTO findById(String employeeID) throws EmployeeNotFoundException{
		EmployeeEntity employeeEntity = surrenderHRPanelDAO.findById(employeeID);
		logger.info("EmployeeID: " + employeeID);
		return SurrenderAsHRPanelUtils.convertEmployeeEntityIntoEmployeeDTO(employeeEntity);
	}

}

