package com.interview_application.utilities;

import com.interview_application.dto.EmployeeDTO;
import com.interview_application.entity.EmployeeEntity;

public class EmployeeUtils {
	public static EmployeeEntity convertItemIntoItemEntity(EmployeeDTO emp) {
		return new EmployeeEntity(emp.getEmployeeID(), emp.getName());
	}
	public static EmployeeDTO convertItemEntityIntoItem(EmployeeEntity empentity) {
		return new EmployeeDTO(empentity.getEmployeeID(), empentity.getName());
	}
}
