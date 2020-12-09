package com.interview_application.dao;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.CandidateNotFoundException;
import com.interview_application.presentation.GiveTechRating;
import com.interview_application.presentation.ViewInterviewMembers;

public class ViewInterviewMembersTest {
	
	private static ViewInterviewMembersDAOImpl viewInterviewMembers;
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(ViewInterviewMembersTest.class.getName());
		viewInterviewMembers = new ViewInterviewMembersDAOImpl();
		
	}

	@Test
	public void testViewInterviewMembers() throws CandidateNotFoundException{
		logger.info("[START] testViewInterviewMembers()");	
		assertNotNull("Candidate Found", viewInterviewMembers.viewAllUsers());
		
		logger.info("[END] testViewInterviewMembers()");
		
		
	}

}
