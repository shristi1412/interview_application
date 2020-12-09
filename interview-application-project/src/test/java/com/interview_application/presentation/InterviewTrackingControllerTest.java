package com.interview_application.presentation;

import static org.junit.Assert.assertNotNull;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;


public class InterviewTrackingControllerTest {
	
	private static InterviewTrackingController interviewTracking;
	private static Logger logger;
	
	
	  
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(InterviewTrackingController.class.getName());
		interviewTracking = new InterviewTrackingController();
	}
	
	
	// Test Case for adding Candidate Details
	@Test
	public void testAddCandidate()throws CandidateNotFoundException
	{
		logger.info("[START] testAddCandidate()");
		
		CandidateEntity candidate = new CandidateEntity(14,"Sheetal Sharma","Bangalore","BE-Information Technology","Python Developer",2,"Python", "Communication skills", 3);
		interviewTracking.addCandidate(candidate);
		int candid =candidate.getCandidateID();
		
		Assert.assertEquals(interviewTracking.findByCandidateID(candid).getCandidateID(),candid);
		logger.info("Candidate details added successfully!");
		logger.info("[END] testAddCandidate()");
	}
	
	
	//Test Case for searching the added Candidate details - Success
	@Test
	public void testAddCandidateSearchSuccess() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchSuccess()");
		assertNotNull("Item Found", interviewTracking.findByCandidateID(11));
		logger.info("[END] testAddCandidateSearchSuccess()");
	}
	
	
	//Test Case for searching the added Candidate details - Fail
	@Test(expected = CandidateNotFoundException.class)
	public void testAddCandidateSearchFailed() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchFailed()");
		interviewTracking.findByCandidateID(-2);
		logger.info("[END] testAddCandidateSearchFailed()");
	}
	
	
	//Test Case for viewing Candidate details
	@Test
	public void viewCandidateSuccess() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateSuccess()");
		
		Assert.assertEquals(true,interviewTracking.viewCandidate());
		logger.info("Candidate details viewed successfully!");
		logger.info("[END] viewCandidateSuccess()");
	}
	
	
	//Test Case for viewing Candidate details by particular Id - Success
	@Test
	public void viewCandidateByPaticularIdSuccess() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateByPaticularIdSuccess()");
		Assert.assertEquals(true,interviewTracking.viewCandidateByParticularId(11));
		logger.info("[END] viewCandidateByPaticularIdSuccess()");
	}
	
	
	//Test Case for viewing Candidate details by particular Id - Fail
	@Test(expected = CandidateNotFoundException.class)
	public void viewCandidateByPaticularIdFail() throws CandidateNotFoundException{
		logger.info("[START] viewCandidateByPaticularIdFail()");
		Assert.assertEquals(true,interviewTracking.viewCandidateByParticularId(-14));
		logger.info("[END] viewCandidateByPaticularIdFail()");
	}
}


