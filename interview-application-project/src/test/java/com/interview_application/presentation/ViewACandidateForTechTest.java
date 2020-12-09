package com.interview_application.presentation;

//import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.exception.CandidateNotFoundTechException;
import com.interview_application.presentation.ViewACandidateForTech;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;

public class ViewACandidateForTechTest {

	private static ViewACandidateForTech viewACandidateForTech;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ViewACandidateForTechTest.class.getName());
		viewACandidateForTech = new ViewACandidateForTech();
	}
	
	@Test
	public void testCandidateSearchSuccess() throws CandidateNotFoundTechException {
		logger.info("[START] testEmployeeSearchSuccess()");
		assertNotNull("Employee Found", viewACandidateForTech.findCandidateById("cand1000"));
		logger.info("[END] testEmployeeSearchSuccess()");
	}
	
	@Test(expected = CandidateNotFoundTechException.class)
	public void testCandidateSearchFailed() throws CandidateNotFoundTechException {
		logger.info("[START] testItemSearchFailed()");
		viewACandidateForTech.findCandidateById("cand0000");
		logger.info("[END] testItemSearchFailed()");
		
	}
	/*
	@Test
	public void testItemSearchSuccess() throws ItemNotFoundException {
		logger.info("[START] testItemSearchSuccess()");
		assertNotNull("Item Found", shoppingAppController.findItemById(1));
		logger.info("[END] testItemSearchSuccess()");
	}
	
	@Test(expected = ItemNotFoundException.class)
	public void testItemSearchFailed() throws ItemNotFoundException {
		logger.info("[START] testItemSearchFailed()");
		shoppingAppController.findItemById(-2);
		logger.info("[END] testItemSearchFailed()");
	}*/
}

