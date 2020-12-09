package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.service.AddPanelMemberService;
import com.interview_application.service.AddPanelMemberServiceImpl;

public class AddPanelMemberController {
	private static Logger logger = LogManager.getLogger(AddPanelMemberController.class.getName());
	AddPanelMemberService PanelMemberService = new AddPanelMemberServiceImpl();
	public PanelMemberDTO addPanelMember(int panelid, String location, String type, EmployeeEntity empID) throws EmployeeNotFoundException {
		logger.info("Adding Employee to the Database, EMP ID : " + empID);
		PanelMemberDTO pan = null;
		if(Integer.toString(panelid).length()!=8) {
			logger.info("Incorrect panel ID : " + panelid);
			return null;
		}
		if(location==""||type==""||panelid==0||empID==null) {
			logger.info("Did not enter a field");
			return null;
		}
		try {
			pan = PanelMemberService.addPanelMember(panelid, location, type, empID);
		}
		catch(Exception e) {
			logger.error("EmployeeNotFoundException: " + e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		return pan;
	}
}
