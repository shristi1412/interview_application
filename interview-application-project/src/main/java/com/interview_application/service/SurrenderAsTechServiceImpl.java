package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SurrenderTechPanelDAO;
import com.interview_application.dao.SurrenderTechPanelDAOImpl;
import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;
import com.interview_application.utils.InterviewTrackingSurrenderTechUtils;
import com.interview_application.service.SurrenderAsTechServiceImpl;


public class SurrenderAsTechServiceImpl implements SurrenderAsTechService{
	
	private static Logger logger = LogManager.getLogger(SurrenderAsTechServiceImpl.class.getName());
	SurrenderTechPanelDAO surrenderTechPanelDAO = new SurrenderTechPanelDAOImpl();
	
	public EmployeeDTO findById(String employeeID) throws  EmployeeNotFoundTechToSurrenderException{
		EmployeeEntity employeeEntity = surrenderTechPanelDAO.findById(employeeID);
		logger.info("EmployeeID: " + employeeEntity.getEmployeeID());
		return InterviewTrackingSurrenderTechUtils.convertEmployeeEntityIntoEmployeeDTO(employeeEntity);
	}

}

