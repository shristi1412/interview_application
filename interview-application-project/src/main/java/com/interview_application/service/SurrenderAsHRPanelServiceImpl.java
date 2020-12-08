package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public class SurrenderAsHRPanelServiceImpl {	

	private static Logger logger = LogManager.getLogger(SurrenderAsHRPanelServiceImpl.class.getName());
	//AddPanelMemberDAO panelMemberDao = new AddPanelMemberDAOImpl();
			
	public void searchById(String employeeID) throws EmployeeNotFoundException {
		
		PanelMemberDTO.setType(null);
		//PanelMemberEntity candidateEntity = panelMemberDao.findById(employeeID);
		//logger.info("CandidateEntity: " + candidateEntity);
		//return ViewCandidateForHRUtils.convertCandidateEntityIntoCadidate(candidateEntity);
	
	}

}




