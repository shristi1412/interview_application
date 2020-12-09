package com.interview_application.dao;

import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SearchEmployeeDAO {
	EmployeeEntity searchById(int empID) throws EmployeeNotFoundException;
	EmployeeEntity searchByName(String name) throws EmployeeNotFoundException;
}
