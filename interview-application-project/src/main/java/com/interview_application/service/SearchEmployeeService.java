package com.interview_application.service;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SearchEmployeeService {
	PanelMemberDTO searchById(String empID) throws EmployeeNotFoundException;
}
