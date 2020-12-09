package com.interview_application.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.exception.CandidateNotFoundException;


import com.interview_application.presentation.InterviewTracking;

public class InterviewTrackingViewTest {
	
	private static InterviewTracking interviewTracking;
	private static Logger logger;
	
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(InterviewTracking.class.getName());
		interviewTracking = new InterviewTracking();
	}
	

	@Test
	public void viewCandidateSuccess() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateSuccess()");
		
		Assert.assertEquals(true,interviewTracking.viewCandidate());
		logger.info("Candidate details viewed successfully!");
		logger.info("[END] viewCandidateSuccess()");
	}
	
	@Test
	public void viewCandidateByPaticularIdSuccess() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateByPaticularIdSuccess()");
		Assert.assertEquals(true,interviewTracking.viewCandidateByParticularId("CAND6547"));
		logger.info("[END] viewCandidateByPaticularIdSuccess()");
	}
	
	@Test(expected = CandidateNotFoundException.class)
	public void viewCandidateByPaticularIdFail() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateByPaticularIdFail()");
		Assert.assertEquals(true,interviewTracking.viewCandidateByParticularId("CAND5434"));
		logger.info("[END] viewCandidateByPaticularIdFail()");
	}
	
	
}
