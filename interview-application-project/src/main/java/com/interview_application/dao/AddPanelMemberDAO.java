package com.interview_application.dao;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public interface AddPanelMemberDAO {
	PanelMemberEntity addPanelMember(int panelid, String location, String type, EmployeeEntity empID) throws EmployeeNotFoundException;
}
