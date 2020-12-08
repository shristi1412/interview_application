package com.interview_application.utilities;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;

public class PanelMemberUtils {
	public static PanelMemberEntity convertItemIntoItemEntity(PanelMemberDTO pan) {
		return new PanelMemberEntity(pan.getEmailID(), pan.getLocation(), pan.getType(), pan.getEmployeeID());
	}
	public static PanelMemberDTO convertItemEntityIntoItem(PanelMemberEntity pan) {
		return new PanelMemberDTO(pan.getEmailID(), pan.getLocation(), pan.getType(), pan.getEmployeeID());
	}
}
