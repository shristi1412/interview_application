package com.interview_application.dao;

import static org.junit.Assert.*;
import javax.persistence.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.interview_application.entity.InterviewSchedulerEntity;
import com.interview_application.exception.RatingNotFoundException;
import com.interview_application.presentation.GiveTechRating;

public class GiveTechRatingTest {
	private static GiveTechRatingDAOImpl giveTechRating;
	private static Logger logger;
	private static InterviewSchedulerEntity intsched;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(GiveTechRatingTest.class.getName());
		giveTechRating = new GiveTechRatingDAOImpl();
		intsched=new InterviewSchedulerEntity();
	}
	@Test
	public void testTechRating() throws RatingNotFoundException {
		logger.info("[START] testTechRating()");

		//assertNotNull("Rating Given",givetechrating.giveTechRating(10));
		//assertEquals(5,givetechrating.giveTechRating(intsched ), 0.0);
		assertEquals(5,giveTechRating.giveTechRating(10 ), 0.0);
		logger.info("[END] testTechRating()");

	}

	@Test
	public void testTechRating1() throws RatingNotFoundException {
		logger.info("[START] testTechRating1()");
		assertNotNull("Rating Given",giveTechRating.giveTechRating(10));
		logger.info("[END] testTechRating()");
	}
	}

