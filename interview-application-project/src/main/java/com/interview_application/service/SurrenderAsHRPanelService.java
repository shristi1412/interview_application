package com.interview_application.service;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SurrenderAsHRPanelService {
	
	EmployeeDTO searchById(String employeeID) throws EmployeeNotFoundException;

}
