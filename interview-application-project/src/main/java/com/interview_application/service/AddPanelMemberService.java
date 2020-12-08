package com.interview_application.service;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public interface AddPanelMemberService {
	PanelMemberDTO addPanelMember(String emailID, String location, String type, String empID) throws EmployeeNotFoundException;


}
