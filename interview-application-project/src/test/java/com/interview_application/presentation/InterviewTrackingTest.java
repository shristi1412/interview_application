package com.interview_application.presentation;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



import com.interview_application.entity.CandidateEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.exception.NullValueFoundException;
import com.interview_application.presentation.InterviewTracking;



public class InterviewTrackingTest {
	
	private static InterviewTracking interviewTracking;
	private static Logger logger;
	
	
	  
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(InterviewTracking.class.getName());
		interviewTracking = new InterviewTracking();
	}
	
	
	@Test
	public void testAddCandidate()throws CandidateNotFoundException
	{
		logger.info("[START] testAddCandidate()");
		
	CandidateEntity candidate = new CandidateEntity("CAND5872","Kriti Patil","Hyderabad","BE Computer Science","Web Developer",3,"PHP", "Presentation skills", 3);
		interviewTracking.addCandidate(candidate);
		String candid =candidate.getCandidateID();
		
		Assert.assertEquals(interviewTracking.findByCandidateID(candid).getCandidateID(),candid);
		logger.info("Candidate details added successfully!");
		logger.info("[END] testAddCandidate()");
	}
	
	
	
	@Test
	public void testAddCandidateSearchSuccess() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchSuccess()");
		assertNotNull("Item Found", interviewTracking.findByCandidateID("CAND6547"));
		logger.info("[END] testAddCandidateSearchSuccess()");
	}
	
	@Test(expected = CandidateNotFoundException.class)
	public void testAddCandidateSearchFailed() throws CandidateNotFoundException {
		logger.info("[START] testAddCandidateSearchFailed()");
		interviewTracking.findByCandidateID("CAND5434");
		logger.info("[END] testAddCandidateSearchFailed()");
	}
}


