package com.interview_application.service;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface SearchEmployeeService {
<<<<<<< HEAD
	EmployeeDTO searchById(String empID) throws EmployeeNotFoundException;
	EmployeeDTO searchByName(String name) throws EmployeeNotFoundException;
=======
	PanelMemberDTO searchById(String empID) throws EmployeeNotFoundException;
>>>>>>> 023024268aa7d3577e94af6677f363ee585181b6
}
