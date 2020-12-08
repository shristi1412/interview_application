package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.AddPanelMemberDAO;
import com.interview_application.dao.AddPanelMemberDAOImpl;
import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.utilities.PanelMemberUtils;


public class AddPanelMemberServiceImpl {

	private static Logger logger = LogManager.getLogger(AddPanelMemberServiceImpl.class.getName());
	AddPanelMemberDAO panelmemberdao = new AddPanelMemberDAOImpl();
	
	
	public PanelMemberDTO findById(int itemId) throws NullPointerException {
		PanelMemberEntity itemEntity = AddPanelMemberDAO.findById(itemId);
		logger.info("ItemEntity: " + itemEntity);
		return PanelMemberUtils.convertItemEntityIntoItem(itemEntity);
	}

}
