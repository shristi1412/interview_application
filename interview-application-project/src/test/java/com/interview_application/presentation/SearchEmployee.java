package com.interview_application.presentation;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.interview_application.exception.EmployeeNotFoundException;
import com.interview_application.presentation.SearchEmployeeController;

public class SearchEmployee {
	private static SearchEmployeeController searchEmployeeController;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(SearchEmployee.class.getName());
		searchEmployeeController = new SearchEmployeeController();
	}
	@Test
	public void testIDSimple() throws EmployeeNotFoundException{
		logger.info("[START] testIDSimple()");
		assertNotNull("Employee Found", searchEmployeeController.searchById("emp85015"));
		logger.info("[END] testIDSimple()");
	}
	@Test
	public void testIDIncorrect() throws EmployeeNotFoundException{
		logger.info("[START] testIDIncorrect()");
		assertNotNull("Employee Found", searchEmployeeController.searchById("emp00000"));
		logger.info("[END] testIDIncorrect()");
	}
	@Test
	public void testNameSimple() throws EmployeeNotFoundException{
		logger.info("[START] testNameSimple()");
		assertNotNull("Item Found", searchEmployeeController.searchByName("Ramesh"));
		logger.info("[END] testNameSimple()");
	}
	@Test
	public void testNameIncorrect() throws EmployeeNotFoundException{
		logger.info("[START] testNameIncorrect()");
		try {
			assertNotNull("Item Found", searchEmployeeController.searchByName("Atul"));
		}
		catch(EmployeeNotFoundException e) {
			logger.info("Employee Name is incorrect");
		}
		logger.info("[END] testNameIncorrect()");
	}
	@Test
	public void testIDCaseInsensitive() throws EmployeeNotFoundException{
		logger.info("[START] testIDCaseInsensitive()");
		assertNotNull("Item Found", searchEmployeeController.searchById("eMp85015"));
		logger.info("[END] testIDCaseInsensitive()");
	}
	@Test
	public void testInvalidIDFormat() throws EmployeeNotFoundException{
		logger.info("[START] testInvalidIDFormat()");
		assertNotNull("Item Found", searchEmployeeController.searchById("ABC015"));
		logger.info("[END] testInvalidIDFormat()");
	}
}
