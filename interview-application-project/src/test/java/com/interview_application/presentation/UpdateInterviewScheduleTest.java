package com.interview_application.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.exception.RatingNotFoundException;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.presentation.UpdateInterviewSchedule;


public class UpdateInterviewScheduleTest {
	
	private static UpdateInterviewSchedule  updateInterviewSchedule ;
	private static Logger logger;
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(UpdateInterviewScheduleTest.class.getName());
		updateInterviewSchedule = new UpdateInterviewSchedule();
	}
	@Test
	public void testInterviewSearchSuccess() throws InterviewNotFoundException {
		logger.info("[START] testInterviewSearchSuccess()");
		assertNotNull("Interview Found", updateInterviewSchedule.findItemById(11));
		logger.info("[END] testInterviewSearchSuccess()");
	}
	
	@Test(expected = InterviewNotFoundException.class)
	public void testInterviewSearchFailed() throws InterviewNotFoundException {
		logger.info("[START] testIntervewSearchFailed()");
		updateInterviewSchedule.findItemById(11);
		logger.info("[END] testCandidateSearchFailed()");
	}
	
	@Test
	public void testRatingSuccess() throws RatingNotFoundException {
		logger.info("[START] testRatingSuccess()");
		assertNotNull("Rating Found", updateInterviewSchedule.findItemById(1,0));
		logger.info("[END] testRatingSuccess()");
	}
	
	@Test(expected = RatingNotFoundException.class)
	public void testRatingFailed() throws RatingNotFoundException {
		logger.info("[START] testIntervewSearchFailed()");
		updateInterviewSchedule.findItemById(1,6);
		logger.info("[END] testCandidateSearchFailed()");
	}
}
