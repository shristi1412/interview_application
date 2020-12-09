package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;


import com.interview_application.exception.EmployeeNotFoundTechToSurrenderException;


import com.interview_application.presentation.SurrenderAsTech;


public class SurrenderAsTechTest {
	
	private static SurrenderAsTech surrenderAsTech;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(SurrenderAsTechTest.class.getName());
		surrenderAsTech = new SurrenderAsTech();
	}
	//assertEquals("testA", name.getMethodName())
	@Test
	public void testEmployeeSearchSuccess() throws EmployeeNotFoundTechToSurrenderException {
		logger.info("[START] testEmployeeSearchSuccess()");
		assertNotNull("Employee Found", surrenderAsTech.findById("emp10000"));
		logger.info("[END] testEmployeeSearchSuccess()");
	}
	
	/*@Test(expected = EmployeeNotFoundTechToSurrenderException.class)
	public void testEmployeeSearchFailed() throws EmployeeNotFoundTechToSurrenderException {
		logger.info("[START] testItemSearchFailed()");
		surrenderAsTech.findById("1235");
		logger.info("[END] testItemSearchFailed()");
	}*/
		

}
