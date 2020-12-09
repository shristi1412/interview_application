package com.interview_application.service;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;

public interface SurrenderAsTechService {
	EmployeeDTO findById(String employeeID) throws EmployeeNotFoundTechToSurrenderException;


}
