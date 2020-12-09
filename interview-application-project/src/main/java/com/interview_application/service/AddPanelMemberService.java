package com.interview_application.service;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public interface AddPanelMemberService {
	PanelMemberDTO addPanelMember(int panelid, String location, String type, EmployeeEntity empID) throws EmployeeNotFoundException;

}
