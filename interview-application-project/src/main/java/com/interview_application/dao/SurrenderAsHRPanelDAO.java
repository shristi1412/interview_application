package com.interview_application.dao;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SurrenderAsHRPanelDAO {
	EmployeeEntity findById(int employeeid) throws EmployeeNotFoundException;
}
