package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.AddPanelMemberDAO;
import com.interview_application.dao.AddPanelMemberDAOImpl;
import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.utilities.PanelMemberUtils;


public class AddPanelMemberServiceImpl implements AddPanelMemberService{

	private static Logger logger = LogManager.getLogger(AddPanelMemberServiceImpl.class.getName());
	AddPanelMemberDAO panelmemberdao = new AddPanelMemberDAOImpl();
	
	
	public PanelMemberDTO addPanelMember(int panelid, String location, String type, EmployeeEntity empID) throws EmployeeNotFoundException{
		PanelMemberEntity PMEntity = panelmemberdao.addPanelMember(panelid, location, type, empID);
		logger.info("ItemEntity: " + PMEntity);
		return PanelMemberUtils.convertItemEntityIntoItem(PMEntity);
	}

}
