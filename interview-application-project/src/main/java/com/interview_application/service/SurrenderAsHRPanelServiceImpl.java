package com.interview_application.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.interview_application.dao.SurrenderHRPanelDAO;
import com.interview_application.dao.SurrenderHRPanelDAOImpl;
import com.interview_application.dto.EmployeeDTO;
import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.utilities.EmployeeUtils;

public class SurrenderAsHRPanelServiceImpl implements SurrenderAsHRPanelService {	

		private static Logger logger = LogManager.getLogger(SearchEmployeeServiceImpl.class.getName());
		SurrenderHRPanelDAO empDao = new SurrenderHRPanelDAOImpl();
		
		public EmployeeDTO searchById(String employeeID) throws EmployeeNotFoundException{
			EmployeeEntity emp = empDao.searchById(employeeID);
			PanelMemberDTO.setType(null);
			return EmployeeUtils.convertItemEntityIntoItem(emp);
		}

}
