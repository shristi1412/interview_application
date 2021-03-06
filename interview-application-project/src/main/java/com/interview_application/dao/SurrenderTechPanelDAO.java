package com.interview_application.dao;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;


public interface SurrenderTechPanelDAO {
	EmployeeEntity findById(String employeeID) throws EmployeeNotFoundTechToSurrenderException;
}
