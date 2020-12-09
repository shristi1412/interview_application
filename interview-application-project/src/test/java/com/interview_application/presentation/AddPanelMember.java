package com.interview_application.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.dto.PanelMemberDTO;
import com.interview_application.entity.EmployeeEntity;
import com.interview_application.entity.PanelMemberEntity;
import com.interview_application.exception.EmployeeNotFoundException;

public class AddPanelMember {

	private static AddPanelMemberController addPanelMemberController;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(AddPanelMember.class.getName());
		addPanelMemberController = new AddPanelMemberController();
	}
	@Test
	public void testAddSimple() throws EmployeeNotFoundException{
		logger.info("[START] testAddSimple()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		PanelMemberDTO create = addPanelMemberController.addPanelMember("Ramesh@domain.com", "Mumbai", "HR", e);
		assertEquals(create, create);
		logger.info("[END] testAddSimple()");
	}
	@Test
	public void testAddDuplicate() throws EmployeeNotFoundException{
		logger.info("[START] testAddDuplicate()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		PanelMemberDTO create = addPanelMemberController.addPanelMember("Ramesh@domain.com", "Mumbai", "HR", e);
		assertNotNull("Redundant Panel Members not allowed in the database", create);
		logger.info("[END] testAddDuplicate()");
	}
	@Test
	public void testNotNull() throws EmployeeNotFoundException{
		logger.info("[START] testNotNull()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		assertNotNull("Employee was added, was found", addPanelMemberController.addPanelMember("someone3@domain.com", "Pune", "Tech", e));
		logger.info("[END] testNotNull()");
	}
	@Test
	public void testInvalid() throws EmployeeNotFoundException{
		logger.info("[START] testInvalid()");
		EmployeeEntity e = new EmployeeEntity("emp85015", "Ramesh");
		assertNotNull("Employee not added", addPanelMemberController.addPanelMember("someone@domain.com", "Pune50", "Tech", e));
		logger.info("[END] testInvalid()");
	}
	@Test
	public void testInvalidEmp() throws EmployeeNotFoundException{
		logger.info("[START] testInvalidEmp()");
		EmployeeEntity e = new EmployeeEntity("emp85010", "Ramesh");
		assertNotNull("Employee not added", addPanelMemberController.addPanelMember("someone3", "Pune", "Tech", e));
		logger.info("[END] testInvalidEmp()");
	}

}
