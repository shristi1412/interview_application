package com.interview_application.service;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SearchEmployeeService {
	EmployeeDTO searchById(String empID) throws EmployeeNotFoundException;
	EmployeeDTO searchByName(String name) throws EmployeeNotFoundException;
}
