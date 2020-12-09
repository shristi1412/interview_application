package com.interview_application.service;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SurrenderAsHRPanelService {
	EmployeeDTO findById(String employeeID) throws EmployeeNotFoundException;


}
