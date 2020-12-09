package com.interview_application.presentation;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.exception.CandidateNotFoundException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ViewCandidateForHRTest {

	private static ViewCandidateForHR viewCandidateForHR;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ViewCandidateForHRTest.class.getName());
		viewCandidateForHR = new ViewCandidateForHR();
	}
	
	@Test
	public void testCandidateSearchSuccess() throws CandidateNotFoundException {
		logger.info("[START] testCandidateSearchSuccess()");
		assertNotNull("Candidate Found", viewCandidateForHR.searchById("CAND1000"));
		logger.info("[END] testCandidateSearchSuccess()");
	}
	
	@Test(expected = CandidateNotFoundException.class)
	public void testCandidateSearchFailed() throws CandidateNotFoundException {
		logger.info("[START] testCandidateSearchFailed()");
		viewCandidateForHR.searchById("CANDIDATE");
		logger.info("[END] testCandidateSearchFailed()");
	}
}
