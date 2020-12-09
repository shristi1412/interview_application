package com.interview_application.presentation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
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
		assertNotNull("Interview Found", updateInterviewSchedule.findItemById(1));
		logger.info("[END] testInterviewSearchSuccess()");
	}
}
