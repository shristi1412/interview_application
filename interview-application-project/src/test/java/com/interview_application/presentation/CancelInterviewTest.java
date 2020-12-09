package com.interview_application.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import com.interview_application.exception.InterviewNotFoundException;
import com.interview_application.presentation.CancelInterview;

public class CancelInterviewTest {
	
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
		assertNotNull("Interview Found", updateInterviewSchedule.findItemById(""));
		logger.info("[END] testInterviewSearchSuccess()");
	}
	
	@Test(expected = InterviewNotFoundException.class)
	public void testInterviewSearchFailed() throws InterviewNotFoundException {
		logger.info("[START] testIntervewSearchFailed()");
		updateInterviewSchedule.findItemById("int1");
		logger.info("[END] testCandidateSearchFailed()");
	}

}
