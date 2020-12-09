package com.interview_application.dao;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SurrenderHRPanelDAO {
	EmployeeEntity searchById(String empID) throws EmployeeNotFoundException;
}
