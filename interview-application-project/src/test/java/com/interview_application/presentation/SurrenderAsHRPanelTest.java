package com.interview_application.presentation;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.exception.EmployeeNotFoundException;

public class SurrenderAsHRPanelTest {

	private static SurrenderAsHRPanel surrenderAsHRPanel;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(SurrenderAsHRPanelTest.class.getName());
		surrenderAsHRPanel = new SurrenderAsHRPanel();
	}

	@Test
	public void testPanelMemberSearchSuccess() throws EmployeeNotFoundException {
		logger.info("[START] testPanelMemberSearchSuccess()");
		assertNotNull("Panel Member Found", surrenderAsHRPanel.findEmployeeById("emp11000"));
		logger.info("[END] testPanelMemberSearchSuccess()");
	}
	
	@Test(expected = EmployeeNotFoundException.class)
	public void testPanelMemberSearchFailed() throws EmployeeNotFoundException {
		logger.info("[START] testPanelMemberSearchFailed()");
		surrenderAsHRPanel.findEmployeeById("Ramesh");
		logger.info("[END] testPanelMemberSearchFailed()");
	}
	
	@Test
	public void testPanelMemberSurrenderSuccess() throws EmployeeNotFoundException {
		logger.info("[START] testPanelMemberSurrenderSuccess()");
		//assertEquals("Surrendered successfully",  surrenderAsHRPanel.(PanelMemberDTO.setType(null)));
		logger.info("[END] testPanelMemberSearchSuccess()");
	}

}
