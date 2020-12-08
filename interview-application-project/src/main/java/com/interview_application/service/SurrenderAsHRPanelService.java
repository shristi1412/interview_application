package com.interview_application.service;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SurrenderAsHRPanelService {
	
	PanelMemberDTO searchById(String employeeID) throws EmployeeNotFoundException;

}
