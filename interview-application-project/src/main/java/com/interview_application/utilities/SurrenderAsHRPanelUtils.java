package com.interview_application.utilities;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;

public class SurrenderAsHRPanelUtils {
	public static EmployeeEntity convertEmployeeEntityIntoEmployeeDTO(EmployeeDTO employeeDTO) {
		return new EmployeeEntity(employeeDTO.getEmployeeid(), employeeDTO.getName(), employeeDTO.getPanelMemberEntity());
	}
	public static EmployeeDTO convertEmployeeEntityIntoEmployeeDTO(EmployeeEntity employeeEntity) {
		return new EmployeeDTO(employeeEntity.getEmployeeid(), employeeEntity.getName(), employeeEntity.getPanelMemberEntity());
	}


}


