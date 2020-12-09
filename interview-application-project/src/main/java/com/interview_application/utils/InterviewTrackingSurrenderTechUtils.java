package com.interview_application.utils;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;

public class InterviewTrackingSurrenderTechUtils {
	public static EmployeeEntity convertEmployeeEntityIntoEmployeeDTO(EmployeeDTO employeeDTO) {
		return new EmployeeEntity(employeeDTO.getEmployeeID(), employeeDTO.getName(), employeeDTO.getPanelMemberEntity());
	}
	public static EmployeeDTO convertEmployeeEntityIntoEmployeeDTO(EmployeeEntity employeeEntity) {
		return new EmployeeDTO(employeeEntity.getEmployeeID(), employeeEntity.getName(), employeeEntity.getPanelMemberEntity());
	}


}
